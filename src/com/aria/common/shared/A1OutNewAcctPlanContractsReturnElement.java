package com.aria.common.shared;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "a1_out_new_acct_plan_contracts_ReturnElement", propOrder = {"a1OutContractNo", "a1OutContractPlanNo", "a1OutClientContractPlanId"})
public class A1OutNewAcctPlanContractsReturnElement {

    @XmlElement(name = "a1_out_contract_no")
    protected Long a1OutContractNo;
    @XmlElement(name = "a1_out_contract_plan_no")
    protected Long a1OutContractPlanNo;
    @XmlElement(name = "a1_out_client_contract_plan_id")
    protected String a1OutClientContractPlanId;
    
    public Long getA1OutContractNo() {
        return a1OutContractNo;
    }

    public void setA1OutContractNo(Long value) {
        this.a1OutContractNo = value;
    }

    public Long getA1OutContractPlanNo() {
        return a1OutContractPlanNo;
    }

    public void setA1OutContractPlanNo(Long value) {
        this.a1OutContractPlanNo = value;
    }

    public String getA1OutClientContractPlanId() {
        return a1OutClientContractPlanId;
    }

    public void setA1OutClientContractPlanId(String value) {
        this.a1OutClientContractPlanId = value;
    }

    
}
