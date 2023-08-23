package com.wusdragon.pojo;

import lombok.Data;

import java.time.LocalDate;

/**
 * @author: Wusdragon
 * @date: 2023/8/16 15:22
 * @desc:
 */
@Data
public class User {
    private Long id;
    private String username;
    private Integer age;
    private String phoneNum;
    private LocalDate birthday;

}
