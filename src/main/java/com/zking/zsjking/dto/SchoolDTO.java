package com.zking.zsjking.dto;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;

@Getter
@Setter
public class SchoolDTO {
    @Length(min = 2 , message = "应该超过两个字符串")
    private String name;
}
