/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jsonexample;
import java.io.IOException;
import java.io.StringWriter;
import org.json.simple.JSONObject;
/**
 *
 * @author Kristopher Huffman
 */

/** encoder */
class JsonExample {

   public static void main(String[] args) throws IOException{
	
      JSONObject obj = new JSONObject();

      obj.put("phone",new Integer(555555555));
      obj.put("name","Kristopher Huffman");
      obj.put("grade",new Double(3.21));
      obj.put("is_student",new Boolean(true));

      StringWriter out = new StringWriter();
      obj.writeJSONString(out);
      
      String jsonText = out.toString();
      System.out.print(jsonText);
   }
}
