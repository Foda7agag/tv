
package javaapplication1;


public class JavaApplication1 {

   
    public static void main(String[] args) 
	{
       
        Account ac=new Account();
        ac.setID(662);
        ac.setbalance(600);
        ac.setannualinterestrate(.2);
        ac.Withdraw(200);
        ac.deposit(6000);
        ac.printall();
    }
    
}
