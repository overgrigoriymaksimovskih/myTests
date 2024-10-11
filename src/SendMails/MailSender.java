package SendMails;

import javax.mail.*;
import javax.mail.internet.*;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;

public class MailSender {
    public static void main(String[] args) throws IOException, MessagingException {
        //Объект properties хранит параметры соединения.
        //Для каждого почтового сервера они разные.
        //Если не знаете нужные - обратитесь к администратору почтового сервера.
        //Ну или гуглите;=)
        //Конкретно для Yandex параметры соединения можно подсмотреть тут:
        //https://yandex.ru/support/mail/mail-clients.html (раздел "Исходящая почта")

        String propertiesFilePath = "D:\\projects\\0000\\My Tests On GitHUB\\MyTestsOnGitHUB\\src\\SendMails\\Mail.properties";
        Properties properties = new Properties();

        try (FileInputStream fileInputStream = new FileInputStream(propertiesFilePath)) {
            properties.load(fileInputStream);
        }

//        //Хост или IP-адрес почтового сервера
//        properties.put("mail.smtp.host", "smtp.yandex.ru");
//        //Требуется ли аутентификация для отправки сообщения
//        properties.put("mail.smtp.auth", "true");
//        //Порт для установки соединения
//        properties.put("mail.smtp.socketFactory.port", "465");
//        //Фабрика сокетов, так как при отправке сообщения Yandex требует SSL-соединения
//        properties.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        //Создаем соединение для отправки почтового сообщения
        Session session = Session.getDefaultInstance(properties,
                //Аутентификатор - объект, который передает логин и пароль
                new Authenticator() {
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication() {
                        return new PasswordAuthentication(properties.getProperty("login"), properties.getProperty("password"));
                    }
                });

        //Создаем новое почтовое сообщение
        Message message = new MimeMessage(session);
        message.setFrom(new InternetAddress(properties.getProperty("login") + "@yandex.ru")); // от кого
        message.setSubject("test");
        message.setText("test text");
        message.setRecipient(Message.RecipientType.TO, new InternetAddress("master-2m@yandex.ru"));//кому
        message.setSentDate(new Date());
        //Поехали!!!
        Transport.send(message);
    }
}
