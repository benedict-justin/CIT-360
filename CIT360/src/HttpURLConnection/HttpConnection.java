/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HttpURLConnection;

/**
 *
 * @author Justin
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;


public class HttpConnection {
    
	public static void main (String[] args) {
		
		String output = getUrlContents("http://byui.edu/");

		System.out.println(output);
	}
	
	private static String getUrlContents(String theUrl) {
		
		StringBuilder content = new StringBuilder();
		
		try {
			URL url = new URL(theUrl);
			URLConnection urlConnection = url.openConnection();

                    try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()))) {
                        String line;
                        
                        while((line = bufferedReader.readLine()) != null) {
                            content.append(line).append("\n");
                        }
                    }
		} catch(IOException e)
		{
		}
		return content.toString();
	}
}