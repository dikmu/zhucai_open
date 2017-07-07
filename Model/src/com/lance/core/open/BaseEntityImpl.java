package com.lance.core.open;

import com.lance.core.open.exception.CoreRuntimeException;
import com.lance.model.util.ConstantUtils;

import java.math.BigDecimal;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.InitialContext;

import javax.sql.DataSource;

import oracle.jbo.AttributeList;
import oracle.jbo.server.EntityImpl;

public class BaseEntityImpl extends EntityImpl {
    private static final String GET_NEXTID_SQL="SELECT MAX(NID) FROM ";
    
    public BaseEntityImpl() {
        super();
    }

    @Override
    protected void create(AttributeList attributeList) {
        String[] attrs = this.getAttributeNames();
        for (String attr : attrs) {
            if ("Nid".equals(attr)) {
                try {
                    this.setAttribute("Nid", nextId());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                break;
            }
        }
        super.create(attributeList);
    }
    
    /**
     * 反推数据库中，EO对应的表名
     * @return
     */
    public String getTableName(){
        String eoImpl = this.getClass().getSimpleName(); //UUserEOImpl
        int index = eoImpl.lastIndexOf(ConstantUtils.EO_IMPL);
        String eo = eoImpl.substring(0, index); //UUser
        StringBuffer tmp = new StringBuffer(eo.substring(0, 1));
        for (int i = 1; i < eo.length(); i++) {
            if (eo.charAt(i) >= 'A' && eo.charAt(i) <= 'Z') {
                tmp.append("_");
            }
            tmp.append(eo.charAt(i));
        }
        return tmp.toString().toUpperCase();
    }

    public BigDecimal nextId() throws Exception {
        String tableName =this.getTableName();
        BigDecimal seq = null;
        InitialContext ctx = new InitialContext();
        DataSource ds = (DataSource) ctx.lookup(ConstantUtils.JDBC_LANCE_DS);
        try(        
            Connection con = ds.getConnection();
            Statement stat = con.createStatement();
            ResultSet rs = stat.executeQuery(GET_NEXTID_SQL + tableName);
        ){
            if (rs.first()) {
                 seq = rs.getBigDecimal(1).add(new BigDecimal(1));
            }else{
                assert true;
                throw new CoreRuntimeException("Sorry，系统异常了！请重试或联系管理员",CoreRuntimeException.ERROR_CODE_1,"BaseEntityImpl.nextId()找不到表"+tableName);
            }
        }
        return seq;
    }

}
