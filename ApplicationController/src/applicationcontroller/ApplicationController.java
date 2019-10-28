/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applicationcontroller;
import java.util.HashMap;
/**
 *
 * @author Kristopher Huffman
 */
public class ApplicationController {

   public static HashMap<String, Calculation> mathCommands = new HashMap<String, Calculation>();
    
    public void ApplicationController() {
        
    }
    
    public static void handleMathCommands(String operator, int number1, int number2) {
        
        mathCommands.put("+", new MathAddition());
        mathCommands.put("-", new MathSubtraction());
        mathCommands.put("*", new MathMultiplication());
        mathCommands.put("/", new MathDivision());
        mathCommands.put("^", new MathPower());
        
        Calculation mathCalc = mathCommands.get(operator);
        
        mathCalc.execute(number1, number2);
}
    
}
