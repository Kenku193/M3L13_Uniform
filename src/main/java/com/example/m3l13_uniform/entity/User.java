package com.example.m3l13_uniform.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {

   private Integer id;

   private String login;

   private String password;

}
