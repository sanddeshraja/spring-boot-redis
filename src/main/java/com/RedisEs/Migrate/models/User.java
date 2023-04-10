package com.RedisEs.Migrate.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
@NoArgsConstructor
@Data
@AllArgsConstructor
public class User implements Serializable {
    private Long id;
    private String firstName;
    private String lastName;
    private String emailId;
    private Integer age;
}
