/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week1;
import java.util.*;

public class Exercise1 {
    public Exercise1(){};

    public void Palidrome() {
        Scanner scanner = new Scanner(System.in);
        
        String Input = scanner.nextLine();
        String Palidrome = "";
        
        String NewInput = Input.replaceAll("\\s+","");  //remove spaces for palidromes like nurses run
        NewInput = NewInput.toLowerCase(); // prevent words such as MAdam from resulting in false
        
        for (int i = NewInput.length()-1; i >= 0; i--) {
        Palidrome = Palidrome + NewInput.charAt(i);
        }
        if (NewInput.equals(Palidrome)) {
            System.out.println(Input + " is a palidrome.");
        } else {
            System.out.println(Input + " is NOT a palidrome.");
        }
    }
}
