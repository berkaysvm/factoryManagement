package com.vbt.factoryManagement.dto;

import lombok.Getter;

import javax.persistence.*;
import java.util.Set;

@Getter
@MappedSuperclass
public class CustomerDTO{

    private long id;
    private long customerNo;
    private String companyName;
    private Set<ProductOrderListDTO> productOrderLists;

    public CustomerDTO(){}

    public CustomerDTO(Builder builder)
    {
        this.id = builder.id;
        this.customerNo = builder.customerNo;
        this.companyName = builder.companyName;
        this.productOrderLists = builder.productOrderLists;
    }


    public static class Builder
    {
        private long id;
        private long customerNo;
        private String companyName;
        private Set<ProductOrderListDTO> productOrderLists;

        public Builder(){}

        public Builder CustomDTOBuilderWith()
        {
            return new Builder();
        }

        public Builder id(Long id){this.id = id; return this;}
        public Builder customerNo(Long customerNo){this.customerNo = customerNo; return this;}
        public Builder companyName(String companyName){this.companyName = companyName; return  this;}
        public Builder productOrderLists(Set<ProductOrderListDTO> productOrderLists){this.productOrderLists = productOrderLists; return this;}

        public CustomerDTO build()
        {
            return new CustomerDTO(this);
        }


    }
}
