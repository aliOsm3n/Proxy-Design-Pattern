/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proxy_pattern;

/**
 *
 * @author Ali Othman
 */
public class Proxy_pattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Ashwani Rajput
        OfficeInternetAccess access = new ProxyInternetAccess("Ali Hassan");  
        access.grantInternetAccess();  
    }
    
}
