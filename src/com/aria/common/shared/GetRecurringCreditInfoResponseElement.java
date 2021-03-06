package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"errorCode", "errorMsg", "recurringCreditInfo"})
@XmlRootElement(name = "get_recurring_credit_infoResponseElement")
public class GetRecurringCreditInfoResponseElement {

    @XmlElement(name = "error_code")
    protected Long errorCode;
    @XmlElement(name = "error_msg")
    protected String errorMsg;
    @XmlElement(name = "recurring_credit_info")
    protected List<RecurringCreditInfoReturnElement> recurringCreditInfo;
    
    public Long getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Long value) {
        this.errorCode = value;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String value) {
        this.errorMsg = value;
    }

    public List<RecurringCreditInfoReturnElement> getRecurringCreditInfo() {
        if (this.recurringCreditInfo == null) {
            this.recurringCreditInfo = new ArrayList<RecurringCreditInfoReturnElement>();
        }
        return this.recurringCreditInfo;
    }
}
