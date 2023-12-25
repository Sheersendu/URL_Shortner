package com.shortifyMe.shortifyMe.model;

import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(collection = "users")
@Setter
public class User {
    @Id
    private int userId;
    private String name;
    private String email;

    @CreatedDate
    private Date createdDate;

//    public void setUsername(String name) {
//        this.name = name;
//    }
}
