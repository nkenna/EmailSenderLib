/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testemaillibrary;

import com.sender.steinacoz.EmailSender;

/**
 *
 * @author STEINACOZ-PC
 */
public class TestEmailLibrary {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
  EmailSender es = new EmailSender();
         es.setIds("nkennannadi@gmail.com", "nnadiug@rocketmail.com");
         es.setLoginCredentials("nnadiug@rocketmail.com", "adaeze");
         es.setSubject("testing email sender library");
         es.setMessage("it worked");
         es.useDefaultProps();
    }
    
}
