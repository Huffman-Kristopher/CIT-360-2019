/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cit360.view;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/*
 @author Kristopher Huffman
 */
public class HttpConnectionExample {
    
    private final String USER_AGENT = "Mozilla/5.0";
    
    // HTTP GET request
    public void sendGet() throws Exception {

	String url = "https://krishuffman.com";

	URL obj = new URL(url);
	HttpURLConnection con = (HttpURLConnection) obj.openConnection();

	// optional default is GET
	con.setRequestMethod("GET");

	//add request header
	con.setRequestProperty("User-Agent", USER_AGENT);

	int responseCode = con.getResponseCode();
	System.out.println("\nSending 'GET' request to URL : " + url);
	System.out.println("Response: " + responseCode);

	BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
	String inputLine;
	StringBuffer response = new StringBuffer();

	while ((inputLine = in.readLine()) != null) {
		response.append(inputLine);
	}
	in.close();

	//print result
	System.out.println(response.toString());

    }
	try{    
	URL url=new URL("http://krishuffman.com");    
		HttpURLConnection huc=(HttpURLConnection)url.openConnection();  
			for(int i=1;i<=8;i++){  
		System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));  
}  
		huc.disconnect();   
}	catch(Exception e){System.out.println(e);} 
    }
}
