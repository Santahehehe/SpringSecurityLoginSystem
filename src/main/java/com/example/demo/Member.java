package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

import java.util.List;
import java.util.ArrayList;

@Data
@Document(collection = "member")
public class Member {

    @Id
    private String id;
    private String username;
    private String password;
    private List<MemberAuthority> authorities = new ArrayList<>();

    // getter, setter ...
}