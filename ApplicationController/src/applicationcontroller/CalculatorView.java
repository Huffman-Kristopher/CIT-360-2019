/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontroller;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author Kristopher Huffman
 */
public class CalculatorView {
    
    public void CalculatorView() {
        
    }
    
    public void doMathInput() throws IOException {
        ApplicationController handle = new ApplicationController();
        int number1;
        int number2;
        String operator;
        
        try {
            Scanner in = new Scanner(System.in);

            System.out.println("Enter your first number: ");
            number1 = Integer.parseInt(in.nextLine());
            System.out.println("Enter a math operator (+, -, *, /, ^): ");
            operator = in.nextLine();
            System.out.println("Enter your second number: ");
            number2 = Integer.parseInt(in.nextLine());

            System.out.print("\n" + number1 + " " + operator + " " + number2 + " = ");
            handle.handleMathCommands(operator, number1, number2);
            
        }catch (Exception e) {
            e.printStackTrace();
        }
}
}
