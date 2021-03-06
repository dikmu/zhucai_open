package com.lance.model.eo.common;

import java.io.Serializable;

import oracle.jbo.JboException;
import oracle.jbo.Transaction;
import oracle.jbo.domain.DomainInterface;
import oracle.jbo.domain.DomainOwnerInterface;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jul 05 15:52:38 CST 2017
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class Text implements DomainInterface, Serializable {
    public Text(String val) {
        mData = new String(val);
        validate();
    }
    private String mData;

    protected Text() {
        mData = "";
    }

    public Object getData() {
        return mData;
    }

    /**
     * <b>Internal:</b> <em>Applications should not use this method.</em>
     */
    public void setContext(DomainOwnerInterface owner, Transaction trans, Object obj) {
    }

    /**
     * Implements domain validation logic and throws a JboException on error.
     */
    protected void validate() {
        //  ### Implement custom domain validation logic here. ###
    }

    public String toString() {
        if (mData != null) {
            return mData.toString();
        }
        return "<null>";
    }

    public boolean equals(Object obj) {
        if (obj instanceof DomainInterface) {
            if (mData != null) {
                return mData.equals(((DomainInterface) obj).getData());
            }
            return ((DomainInterface) obj).getData() == null;
        }
        return false;
    }
}

