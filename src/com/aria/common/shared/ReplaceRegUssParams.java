package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "sessionId",    "inRegUssParams"})
@XmlRootElement(name = "replace_reg_uss_params")
public class ReplaceRegUssParams {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "session_id")
    protected String sessionId;
        @XmlElement(name = "in_reg_uss_params")
    protected InRegUssParamsArray inRegUssParams;
    
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

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String value) {
        this.sessionId = value;
    }
            public InRegUssParamsArray getInRegUssParams() {
        return inRegUssParams;
    }

    public void setInRegUssParams(InRegUssParamsArray value) {
        this.inRegUssParams = value;
    }
            
}
