/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primoclient;

import java.io.IOException;
import java.net.Socket;
import java.util.logging.Logger;

/**
 *
 * @author pc15
 */
public class PrimoClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try{
            Socket s=new Socket ("169.254.236.85", 2400);
            
            s.getOutputStream().write(80);
            s.close();
            
        } catch (IOException ex){
            Logger.getLogger(string)
        }
    }
    
}
