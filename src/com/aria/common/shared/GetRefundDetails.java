package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "includeVoided",    "ariaEventNo"})
@XmlRootElement(name = "get_refund_details")
public class GetRefundDetails {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "include_voided")
    protected String includeVoided;
        @XmlElement(name = "aria_event_no")
    protected Long ariaEventNo;
    
    public long getClientNo() {
        return clientNo;
    }

    public void setClientNo(Long value) {
        this.clientNo = value;
    }

    public String getAuthKey() {
        return authKey;
    }

    public void setAuthKey(String value) {
        this.authKey = value;
    }

    public Long getAcctNo() {
        return acctNo;
    }

    public void setAcctNo(Long value) {
        this.acctNo = value;
    }
            public String getIncludeVoided() {
        return includeVoided;
    }

    public void setIncludeVoided(String value) {
        this.includeVoided = value;
    }
            public Long getAriaEventNo() {
        return ariaEventNo;
    }

    public void setAriaEventNo(Long value) {
        this.ariaEventNo = value;
    }
            
}
