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
//Create a RealInternetAccess class that will implement OfficeInternetAccess interface for granting the permission to the specific employee.

public class RealInternetAccess implements OfficeInternetAccess{

    private String employeeName;  
    
    @Override
    public void grantInternetAccess() {
      System.out.println("Internet Access granted for employee: "+ employeeName);
    }

    public RealInternetAccess(String empName ) {
        this.employeeName=empName;
    }
    
}
