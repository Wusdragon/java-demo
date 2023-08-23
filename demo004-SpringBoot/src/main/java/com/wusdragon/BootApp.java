package com.wusdragon;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author: Wusdragon
 * @date: 2023/8/16 15:17
 * @desc:
 */

@Slf4j
@MapperScan("com.wusdragon.mapper")
@SpringBootApplication
public class BootApp {
    public static void main(String[] args) {
        SpringApplication.run(BootApp.class, args);
        log.info("启动完毕！！！");
    }
}
