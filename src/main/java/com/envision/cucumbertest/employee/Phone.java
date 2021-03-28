package com.envision.cucumbertest.employee;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class Phone {

    @NotNull
    private Long id;

    @NotEmpty
    private String type;

    @NotEmpty
    private String isdCode;

    @NotEmpty
    private String phoneNumber;

    private String extension;
}
