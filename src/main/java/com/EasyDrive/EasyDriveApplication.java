package com.EasyDrive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

// 异步调用，上传大文件转码
@EnableAsync
//
@SpringBootApplication(scanBasePackages = {"com.EasyDrive"})
// 事务生效
@EnableTransactionManagement
// 定时任务
@EnableScheduling
public class EasyDriveApplication {
    public static void main(String[] args) {
        SpringApplication.run(EasyDriveApplication.class, args);
    }
}
