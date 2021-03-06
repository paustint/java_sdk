package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "statementNo",    "doEncoding"})
@XmlRootElement(name = "get_statement_content_size")
public class GetStatementContentSize {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "statement_no")
    protected Long statementNo;
        @XmlElement(name = "do_encoding")
    protected String doEncoding;
    
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
            public Long getStatementNo() {
        return statementNo;
    }

    public void setStatementNo(Long value) {
        this.statementNo = value;
    }
            public String getDoEncoding() {
        return doEncoding;
    }

    public void setDoEncoding(String value) {
        this.doEncoding = value;
    }
            
}
