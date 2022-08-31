package com.vbt.factoryManagement.mapper;

import com.vbt.factoryManagement.dto.RequestDTO;
import com.vbt.factoryManagement.entities.Request;
import org.springframework.stereotype.Component;

@Component
public class RequestMapper {

    EmployeeMapper employeeMapper = new EmployeeMapper();
    public RequestDTO map(Request request)
    {
        return RequestDTO.Builder.RequestDTOBuilderWith()
                .id(request.getId())
                .acceptance(request.isAcceptance())
                .date(request.getDate())
                .explanation(request.getExplanation())
                .subject(request.getSubject())
                .requestid(request.getRequestid())
                .employeeDTO(employeeMapper.map(request.getEmployee())).build();
    }
    public Request convertEntity(RequestDTO requestDTO)
    {
        Request request = new Request();
        request.setRequestid(requestDTO.getRequestid());
        request.setEmployee(request.getEmployee());
        request.setSubject(requestDTO.getSubject());
        request.setDate(requestDTO.getDate());
        request.setExplanation(requestDTO.getExplanation());
        request.setAcceptance(requestDTO.isAcceptance());
        return request;
    }
}
