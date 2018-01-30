/*
 * Created on Jan 29, 2018
 */
package asd.booking.mail;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

import asd.booking.domain.User;

public class SendEmailUtils {

    private static SendEmailUtils INSTNANCE;

    private SendEmailUtils() {

    }

    public static SendEmailUtils getInstance() {
        if (INSTNANCE == null)
            INSTNANCE = new SendEmailUtils();
        return INSTNANCE;
    }

    /**
     * 
     * @param user
     */
    public void sendEmail(User user) {
        final String username = "chav.vecteur@gmail.com"; //user send
        final String password = "012249021"; //password

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try {

            Message message = new MimeMessage(session);
//            message.setFrom(new InternetAddress("booking@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse("kimtey.chav@gmail.com"));
            message.setSubject("Testing Subject");
            message.setText("Testing body test");

            Transport.send(message);

            System.out.println("Done");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

}
