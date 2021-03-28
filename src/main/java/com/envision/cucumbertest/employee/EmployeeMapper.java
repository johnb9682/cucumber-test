package com.envision.cucumbertest.employee;

import org.mapstruct.Mapper;
import org.springframework.stereotype.Service;

/**
 * @author john.bi
 */
@Mapper(componentModel = "spring")
public interface EmployeeMapper {

  EmployeeEntity toEmployeeEntity(Employee employee);

  Employee toEmployee(EmployeeEntity employeeEntity);

  PhoneEntity toPhoneEntity(Phone phone);

  Phone toPhone(PhoneEntity phoneEntity);
}
