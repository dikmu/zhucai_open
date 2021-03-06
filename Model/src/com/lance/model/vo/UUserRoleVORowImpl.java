package com.lance.model.vo;

import com.lance.core.open.BaseEntityImpl;
import com.lance.core.open.BaseViewRowImpl;

import java.math.BigDecimal;

import java.sql.Timestamp;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jul 05 16:32:35 CST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class UUserRoleVORowImpl extends BaseViewRowImpl {
    public static final int ENTITY_UUSERROLEEO = 0;

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
    public UUserRoleVORowImpl() {
    }

    /**
     * Gets UUserRoleEO entity object.
     * @return the UUserRoleEO
     */
    public BaseEntityImpl getUUserRoleEO() {
        return (BaseEntityImpl) getEntity(ENTITY_UUSERROLEEO);
    }

    /**
     * Gets the attribute value for U_USER_ID using the alias name UUserId.
     * @return the U_USER_ID
     */
    public BigDecimal getUUserId() {
        return (BigDecimal) getAttributeInternal(UUSERID);
    }

    /**
     * Sets <code>value</code> as attribute value for U_USER_ID using the alias name UUserId.
     * @param value value to set the U_USER_ID
     */
    public void setUUserId(BigDecimal value) {
        setAttributeInternal(UUSERID, value);
    }

    /**
     * Gets the attribute value for U_ROLE_ID using the alias name URoleId.
     * @return the U_ROLE_ID
     */
    public Integer getURoleId() {
        return (Integer) getAttributeInternal(UROLEID);
    }

    /**
     * Sets <code>value</code> as attribute value for U_ROLE_ID using the alias name URoleId.
     * @param value value to set the U_ROLE_ID
     */
    public void setURoleId(Integer value) {
        setAttributeInternal(UROLEID, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public BigDecimal getCreatedBy() {
        return (BigDecimal) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(BigDecimal value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATED_ON using the alias name CreatedOn.
     * @return the CREATED_ON
     */
    public Timestamp getCreatedOn() {
        return (Timestamp) getAttributeInternal(CREATEDON);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_ON using the alias name CreatedOn.
     * @param value value to set the CREATED_ON
     */
    public void setCreatedOn(Timestamp value) {
        setAttributeInternal(CREATEDON, value);
    }

    /**
     * Gets the attribute value for UPDATED_BY using the alias name UpdatedBy.
     * @return the UPDATED_BY
     */
    public BigDecimal getUpdatedBy() {
        return (BigDecimal) getAttributeInternal(UPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for UPDATED_BY using the alias name UpdatedBy.
     * @param value value to set the UPDATED_BY
     */
    public void setUpdatedBy(BigDecimal value) {
        setAttributeInternal(UPDATEDBY, value);
    }

    /**
     * Gets the attribute value for UPDATED_ON using the alias name UpdatedOn.
     * @return the UPDATED_ON
     */
    public Timestamp getUpdatedOn() {
        return (Timestamp) getAttributeInternal(UPDATEDON);
    }

    /**
     * Sets <code>value</code> as attribute value for UPDATED_ON using the alias name UpdatedOn.
     * @param value value to set the UPDATED_ON
     */
    public void setUpdatedOn(Timestamp value) {
        setAttributeInternal(UPDATEDON, value);
    }

    /**
     * Gets the attribute value for VERSION using the alias name Version.
     * @return the VERSION
     */
    public Integer getVersion() {
        return (Integer) getAttributeInternal(VERSION);
    }

    /**
     * Sets <code>value</code> as attribute value for VERSION using the alias name Version.
     * @param value value to set the VERSION
     */
    public void setVersion(Integer value) {
        setAttributeInternal(VERSION, value);
    }
}

