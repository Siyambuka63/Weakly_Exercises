
package week2;

import java.util.*;

public class Exercise2 {

    public Exercise2() {
    }

    public void Calc() {
        double[] arraylist = {3.35, 7.8, 23.567, 45.5, 7.9, 0, 0, 0};
        double sum = 0;
        double average = 0;
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 5; i < arraylist.length; i++) {
            arraylist[i] = scanner.nextDouble();
        }// Populate arraylist[5] to arraylist[7]. NB: Use "," instead of "." when populating
        
        for (int i = 0; i < arraylist.length; i++) {
            sum += arraylist[i];
        }
        
        average = sum / arraylist.length;
        System.out.println("The sum is " + sum);
        System.out.println("The average is " + average);
    }

    
    
}
