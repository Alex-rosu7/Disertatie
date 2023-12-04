package com.Model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Data
@Document(collation = "Teacher")
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Teacher extends Employee {

    private List<Subject> subjects;

}
