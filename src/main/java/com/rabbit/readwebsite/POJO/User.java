package com.rabbit.readwebsite.POJO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int user_id;
    private String user_name;
    private String  user_passwd;
    private byte user_authority;
    private Date user_createdate;
}
