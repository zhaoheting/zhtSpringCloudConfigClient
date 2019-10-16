package com.example.zhtSpringCloudConfigClient.services;

import com.example.zhtSpringCloudConfigClient.model.MailDto;
import com.example.zhtSpringCloudConfigClient.services.interfaces.IMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class IMaiServiceImpl implements IMailService {

    @Autowired
    JavaMailSender javaMailSender;

    @Autowired
    TemplateEngine templateEngine;

    @Value("${email.from}")
    private String fromEmail;

    @Override
    public void sendTemplateMail(MailDto mailDto) {
        MimeMessage mimeMessage = javaMailSender.createMimeMessage();
        try {
            MimeMessageHelper mimeMessageHelper = new MimeMessageHelper(mimeMessage, true);
            //Email of the sender.
            mimeMessageHelper.setFrom(fromEmail);
            //Email of the receiver.
            mimeMessageHelper.setTo(mailDto.getEmail());
            mimeMessageHelper.setSubject(mailDto.getTitle());
            //thymeleaf template.
            Context context = new Context();
            //Define the data used in the template.
            context.setVariables(mailDto.getAttachment());
            String emailContent = templateEngine.process("mail/mailTemplate", context);
            mimeMessageHelper.setText(emailContent,true);
            javaMailSender.send(mimeMessage);
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }
}
