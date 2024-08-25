package org.example.producer.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;
import java.util.List;

@Setter
@Getter
@Accessors(chain = true)
public class RootDto {
    private EmployeeDto employee;
    private List<TaskDto> tasks;
}
