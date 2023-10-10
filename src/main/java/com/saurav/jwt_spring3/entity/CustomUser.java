package com.saurav.jwt_spring3.entity;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CustomUser {
    private String userId;
    private String userName;
    private String userEmail;
}
