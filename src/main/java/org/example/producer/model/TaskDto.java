package org.example.producer.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Setter
@Getter
@Accessors(chain = true)
public class TaskDto {
    private Integer taskId;
    private String description;
    private String status;
    private String dueDate;
}
