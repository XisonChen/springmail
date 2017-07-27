package com.xison.service;

import com.xison.model.MailModel;

public interface EmailService {

    void emailManage();

    /**
     * 发送邮件
     * @param mail
     */
    void sendEmail(MailModel mail);
}
