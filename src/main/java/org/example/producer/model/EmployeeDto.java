package org.example.producer.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(chain = true)
public class EmployeeDto {
    private Integer id;
    private String name;
    private String department;
    private String position;
    private Integer salary;
    private String hireDate;
}
