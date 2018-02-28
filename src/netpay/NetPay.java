/*
 * Aisik Pilote
 * NetPay
 * find the net pay of the employee
 */

package netpay;

/**
 *
 * @author aipil3692
 */
public class NetPay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   //h represents hours worked
   double h = 40;
   //w represents the wage of the worker
   double w = 5;
   //i represents the isurance cost
   double i = 2;
   //t represents tax amout
   double t = 0.22;
   //formula to calculate net pay
   double netPay =(h*w-i)-t*(h*w-i);
   System.out.println("The net pay for an employee is "+netPay);
    }
    
}
