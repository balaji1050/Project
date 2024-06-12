/**
 * <p>Title: EmailSender</p>
 * <p>Description:</p>
 * @author Bradley Gude
 * @version 1.0
 */

package com.telepacific.merrt.config;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Date;
import java.util.Properties;

public class EmailSender {

        public EmailSender() {
        }

        public static void sendMail(String emailTo, String emailSubject,
                             String emailContent) {
            String emailFrom = "udash@telepacific.com";
            String emailBcc = "udash@telepacific.com";
            String emailHost = "mail.smtp.host";
            String emailServer = "mail.telepacific.com";
            
            try {


                Properties props = System.getProperties();
                // -- Attaching to default Session, or we could start a new one --

                //props.put("mail.smtp.host", "la2003mail2.telepacific.com");
                //props.put("mail.smtp.host", "mail.telepacific.com");
                props.put(emailHost, emailServer);
                Session session = Session.getDefaultInstance(props, null);

                // -- Create a new message --

                javax.mail.Message msg = new MimeMessage(session);
                msg.setFrom(new InternetAddress(emailFrom));
                msg.setRecipient(javax.mail.Message.RecipientType.TO,
                        new InternetAddress(emailTo));
                msg.setRecipient(javax.mail.Message.RecipientType.BCC,
                        new InternetAddress(emailBcc));
                msg.setSubject(emailSubject);
                msg.setSentDate(new Date());
                msg.setContent(emailContent, "text/html");
                Transport.send(msg);


            }
            catch (Exception e) {
                ////e.printStackTrace();
                System.err.println("sendMail: Unable to process email.Check email for Account " + emailSubject);
                //sendMail(emailFrom, "Email Failure : " + emailSubject, e.toString());
            }

        }



}
