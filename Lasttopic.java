/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lasttopic;

/**
 *
 * @author CORESIS_CPE113
 */
public class Lasttopic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Recursiion 
        countdown(9);
    }

    static void countdown(int N3) {
        
        long factorial = 1;
        int count3 = 1;

        // do-while guarantees at least one execution pass to compute multiplication product N!
        if (N3 == 0) {
            System.out.println("Factorial = 1");
        } else {
            do {
                factorial *= count3;
                count3++;
            } while (count3 <= N3);
            System.out.println("Factorial = " + factorial);
    }
    }
}
