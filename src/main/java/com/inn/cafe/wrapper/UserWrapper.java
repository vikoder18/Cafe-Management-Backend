package com.inn.cafe.wrapper;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserWrapper {
    private String name;
    private String email;
    private String contactNumber;
    private String status;
    private Integer id;

    public UserWrapper(String name, String email, String contactNumber, String status, Integer id) {
        this.name = name;
        this.email = email;
        this.contactNumber = contactNumber;
        this.status = status;
        this.id = id;
    }
}
