package com.scm.forms;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User_Form {

    private String name;
    private String email;
    private String password;
    private String phoneNumber;
    private String about;

}
