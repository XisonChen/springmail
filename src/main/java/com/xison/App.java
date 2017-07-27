package com.xison;

import com.xison.service.EmailService;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("spring/spring.xml");

        EmailService emailService = (EmailService)context.getBean("emailService");
        emailService.emailManage();

        context.close();
    }
}
