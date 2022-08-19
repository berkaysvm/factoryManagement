package com.vbt.factoryManagement.mapper;//package com.vbt.factoryManagement.mapper;

import com.vbt.factoryManagement.dto.CustomerDTO;
import com.vbt.factoryManagement.dto.ProductOrderListDTO;
import com.vbt.factoryManagement.entities.Customer;
import com.vbt.factoryManagement.entities.ProductOrderList;
import org.springframework.stereotype.Component;

import java.util.Set;
import java.util.stream.Collectors;

@Component
public class CustomerMapper {

    ProductOrderListMapper productOrderListMapper = new  ProductOrderListMapper();

    public CustomerDTO map (Customer customer)
    {
        Set<ProductOrderList> customers = customer.getProductOrderLists();
        Set<ProductOrderListDTO> orderListDTOS = customers.stream().map(ProductOrderListMapper::map).collect(Collectors.toSet());
        return CustomerDTO.Builder.CustomDTOBuilderWith()
                .id(customer.getId())
                .customerNo(customer.getCustomerNo())
                .companyName(customer.getCompanyName())
                .productOrderLists(orderListDTOS)
                .firstname(customer.getFirstname())
                .lastname(customer.getLastname())
                .adress(customer.getAdress())
                .eMail(customer.getEMail())
                .phoneNumber(customer.getPhoneNumber())
                .build();
    }
    public Customer convertEntity ( CustomerDTO customerDTO)
    {
        Set<ProductOrderListDTO> customers = customerDTO.getProductOrderLists();
        Customer customer = new Customer();
        customer.setCustomerNo(customerDTO.getCustomerNo());
        customer.setLastname(customerDTO.getLastname());
        return customer;
    }
}
