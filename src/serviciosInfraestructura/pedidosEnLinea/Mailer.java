
package serviciosInfraestructura.pedidosEnLinea;

import java.io.UnsupportedEncodingException;
import java.net.PasswordAuthentication;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * Cliente de Correo del Sistema
 * @author Focus Development
 */
public class Mailer {
    private StringBuilder texto;
    private String para;
    private String titulo;
    
    private final String user="focus.desarrollo@gmail.com";
    private final String pswd="focus@66";
    
    private Session sesion;
    
    /**
     * Inicializa el servicio de Correo con los datos del mensaje a enviar
     * @param texto Cuerpo del Mensaje
     * @param para  Destinatario
     * @param titulo Titulo del Mensaje
     */
    public Mailer(StringBuilder texto, String para, String titulo) {
        this.texto = texto;
        this.para = para;
        this.titulo = titulo;
        iniciaServicio();
    }
    
    /**
     * Envia el Correo al recipiente
     * @return Resultado de la operacion
     */
    public boolean enviaCorreo(){
        if (sesion==null)
            return false;
        try{
            Message message =new MimeMessage(sesion);
            message.setFrom(new InternetAddress(user,"Sistema de Pedidos SIDEP"));
            message.setRecipient(Message.RecipientType.TO,
                    new InternetAddress(para));
            message.setSubject(titulo);
            message.setText(texto.toString());
            Transport t =sesion.getTransport("smtp");
            t.connect(user, pswd);
            t.sendMessage(message,message.getAllRecipients());
            System.out.println("Enviado");
            t.close();
            return true;
        }catch(MessagingException e){
            System.out.println(e.getMessage());
            return false;
        }catch(UnsupportedEncodingException uee){
            return false;
        }
    }
    
    /**
     * Inicializa el servicio del cliente de correo
     */
    private void iniciaServicio(){
        Properties props=new Properties();
        props.put("mail.smtp.host","smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port","465");
        props.put("mail.smtp.socketFactory.class","javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth","true");
        props.put("mail.smtp.port","465");
        Authenticator auth=new Authenticator(){
            protected PasswordAuthentication getPasswordAuth(){
                return new PasswordAuthentication (user, pswd.toCharArray());
            }
        };
        sesion = Session.getDefaultInstance(props, auth);
    }
    
}
