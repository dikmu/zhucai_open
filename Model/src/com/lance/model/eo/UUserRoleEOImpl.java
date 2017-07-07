package com.lance.model.eo;

import com.lance.core.open.BaseEntityImpl;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.server.EntityDefImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jul 05 16:32:54 CST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class UUserRoleEOImpl extends BaseEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        UUserId,
        URoleId,
        CreatedBy,
        CreatedOn,
        UpdatedBy,
        UpdatedOn,
        Version;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }
    public static final int UUSERID = AttributesEnum.UUserId.index();
    public static final int UROLEID = AttributesEnum.URoleId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDON = AttributesEnum.CreatedOn.index();
    public static final int UPDATEDBY = AttributesEnum.UpdatedBy.index();
    public static final int UPDATEDON = AttributesEnum.UpdatedOn.index();
    public static final int VERSION = AttributesEnum.Version.index();

    /**
     * This is the default constructor (do not remove).
     */
    public UUserRoleEOImpl() {
    }

    /**
     * Gets the attribute value for UUserId, using the alias name UUserId.
     * @return the value of UUserId
     */
    public BigDecimal getUUserId() {
        return (BigDecimal) getAttributeInternal(UUSERID);
    }

    /**
     * Sets <code>value</code> as the attribute value for UUserId.
     * @param value value to set the UUserId
     */
    public void setUUserId(BigDecimal value) {
        setAttributeInternal(UUSERID, value);
    }

    /**
     * Gets the attribute value for URoleId, using the alias name URoleId.
     * @return the value of URoleId
     */
    public Integer getURoleId() {
        return (Integer) getAttributeInternal(UROLEID);
    }

    /**
     * Sets <code>value</code> as the attribute value for URoleId.
     * @param value value to set the URoleId
     */
    public void setURoleId(Integer value) {
        setAttributeInternal(UROLEID, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public BigDecimal getCreatedBy() {
        return (BigDecimal) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(BigDecimal value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreatedOn, using the alias name CreatedOn.
     * @return the value of CreatedOn
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) getAttributeInternal(CREATEDON);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedOn.
     * @param value value to set the CreatedOn
     */
    public void setCreatedOn(Timestamp value) {
        setAttributeInternal(CREATEDON, value);
    }

    /**
     * Gets the attribute value for UpdatedBy, using the alias name UpdatedBy.
     * @return the value of UpdatedBy
     */
    public BigDecimal getUpdatedBy() {
        return (BigDecimal) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedBy.
     * @param value value to set the UpdatedBy
     */
    public void setUpdatedBy(BigDecimal value) {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * Gets the attribute value for UpdatedOn, using the alias name UpdatedOn.
     * @return the value of UpdatedOn
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) getAttributeInternal(UPDATEDON);
    }

    /**
     * Sets <code>value</code> as the attribute value for UpdatedOn.
     * @param value value to set the UpdatedOn
     */
    public void setUpdatedOn(Timestamp value) {
        setAttributeInternal(UPDATEDON, value);
    }

    /**
     * Gets the attribute value for Version, using the alias name Version.
     * @return the value of Version
     */
    public Integer getVersion() {
        return (Integer) getAttributeInternal(VERSION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Version.
     * @param value value to set the Version
     */
    public void setVersion(Integer value) {
        setAttributeInternal(VERSION, value);
    }

    /**
     * @param uUserId key constituent
     * @param uRoleId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(BigDecimal uUserId, Integer uRoleId) {
        return new Key(new Object[] { uUserId, uRoleId });
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("com.lance.model.eo.UUserRoleEO");
    }
}
