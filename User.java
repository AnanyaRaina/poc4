package com.javaspring.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private long id;
    private String firstName;
    private String lastName;
    private long mobileNumber;
}
