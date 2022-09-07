package com.vbt.factoryManagement.mapper;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;
import com.vbt.factoryManagement.dto.RequestDTO;
import com.vbt.factoryManagement.entities.Request;
import com.vbt.factoryManagement.service.EmployeeService;
import com.vbt.factoryManagement.service.EmployeeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class RequestMapper {
    EmployeeServiceImpl employeeService;

    @Autowired
    public RequestMapper(EmployeeServiceImpl employeeService)
    {
        this.employeeService = employeeService;
    }
    EmployeeMapper employeeMapper = new EmployeeMapper();

    public RequestMapper() {

    }

    public RequestDTO map(Request request)
    {
        return RequestDTO.Builder.RequestDTOBuilderWith()
                .id(request.getId())
                .acceptance(request.isAcceptance())
                .date(request.getDate())
                .explanation(request.getExplanation())
                .subject(request.getSubject())
                .requestid(request.getRequestid())
                //.employeeDTO(employeeMapper.map(request.getEmployee()))
                .build();
    }
    public RequestDTO map2(Request request)
    {
        return RequestDTO.Builder.RequestDTOBuilderWith()
                .id(request.getId())
                .acceptance(request.isAcceptance())
                .date(request.getDate())
                .explanation(request.getExplanation())
                .subject(request.getSubject())
                .build();
    }
    public Request convertEntity(RequestDTO requestDTO)
    {
        EmployeeMapper employeeMapper = new EmployeeMapper();

        Request request = new Request();
        request.setRequestid(requestDTO.getRequestid());
        request.setEmployee(employeeMapper.convertEntity(employeeService.getById(requestDTO.getEmployeeDTO().getId())));
       //request.setEmployee( employeeMapper.convertEntity(employeeService.getById(requestDTO.getEmployeeDTO().getId())));
        request.setSubject(requestDTO.getSubject());
        LocalDate localDate = LocalDate.now();
        ZoneId zoneId =ZoneId.systemDefault();
        ZonedDateTime time = localDate.atStartOfDay(zoneId);
        Date date = Date.from(time.toInstant());
        request.setDate(date);
        request.setExplanation(requestDTO.getExplanation());
        request.setAcceptance(requestDTO.isAcceptance());
         return request;
    }
}
