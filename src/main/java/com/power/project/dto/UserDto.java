package com.power.project.dto;

import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {

    private long id;

    private String email;

    private String password;

    private String firstName;

    private String lastName;

    private String profilePhotoUrl;

    private String country;

    private String occupation;

    private Date dateOfBirth;

    private String gender;

    private String role;

    public UserDto(String email, String password, String firstName, String lastName) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
