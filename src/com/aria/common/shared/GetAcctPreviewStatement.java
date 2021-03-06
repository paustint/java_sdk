package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "acctNo",    "altStmtTemplateNo",    "autoSkipToNextBillDate"})
@XmlRootElement(name = "get_acct_preview_statement")
public class GetAcctPreviewStatement {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "acct_no")
    protected Long acctNo;
        @XmlElement(name = "alt_stmt_template_no")
    protected Double altStmtTemplateNo;
        @XmlElement(name = "auto_skip_to_next_bill_date")
    protected Long autoSkipToNextBillDate;
    
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
            public Double getAltStmtTemplateNo() {
        return altStmtTemplateNo;
    }

    public void setAltStmtTemplateNo(Double value) {
        this.altStmtTemplateNo = value;
    }
            public Long getAutoSkipToNextBillDate() {
        return autoSkipToNextBillDate;
    }

    public void setAutoSkipToNextBillDate(Long value) {
        this.autoSkipToNextBillDate = value;
    }
            
}
