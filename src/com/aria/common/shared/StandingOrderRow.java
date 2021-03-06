package com.aria.common.shared;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "standing_order_row", propOrder = {
    "clientSku",
    "units",
    "amount",
    "unitDiscountAmount",
    "lineComments"
    })
public class StandingOrderRow {

    @XmlElement(name = "client_sku")
    protected String clientSku;
    @XmlElement(name = "units")
    protected Double units;
    @XmlElement(name = "amount")
    protected String amount;
    @XmlElement(name = "unit_discount_amount")
    protected String unitDiscountAmount;
    @XmlElement(name = "line_comments")
    protected String lineComments;
    public String getClientSku() {
        return clientSku;
    }

    public void setClientSku(String value) {
        this.clientSku = value;
    }

    public Double getUnits() {
        return units;
    }

    public void setUnits(Double value) {
        this.units = value;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String value) {
        this.amount = value;
    }

    public String getUnitDiscountAmount() {
        return unitDiscountAmount;
    }

    public void setUnitDiscountAmount(String value) {
        this.unitDiscountAmount = value;
    }

    public String getLineComments() {
        return lineComments;
    }

    public void setLineComments(String value) {
        this.lineComments = value;
    }

    
}
