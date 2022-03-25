package com.zking.zsjking.dto;


import lombok.*;

@Getter
@Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class PersonDTO {
    private String name;
    @NonNull
    private Integer age;
}
