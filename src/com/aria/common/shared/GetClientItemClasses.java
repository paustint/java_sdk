package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "clientNo",
    "authKey",    "filterItemNo",    "filterClientItemId"})
@XmlRootElement(name = "get_client_item_classes")
public class GetClientItemClasses {

    @XmlElement(name = "client_no")
    protected Long clientNo;
    @XmlElement(name = "auth_key")
    protected String authKey;
        @XmlElement(name = "filter_item_no")
    protected Long filterItemNo;
        @XmlElement(name = "filter_client_item_id")
    protected String filterClientItemId;
    
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

    public Long getFilterItemNo() {
        return filterItemNo;
    }

    public void setFilterItemNo(Long value) {
        this.filterItemNo = value;
    }
            public String getFilterClientItemId() {
        return filterClientItemId;
    }

    public void setFilterClientItemId(String value) {
        this.filterClientItemId = value;
    }
            
}
