package URLConnection;
import java.net.*;
import java.io.*;
import java.util.*;
import java.lang.*;



/**
 * URLDemo
 */
public class URLDemo {

    public static void main(String[] args) {
        int c;
        try {
          URL url = new URL("https://www.kaggle.com/ruslankl/eeg-data-analysis/data");  
          URLConnection conn = url.openConnection();
          long d = conn.getDate();

          if (d == 0) {
              System.out.println("null");
          } else { 
              System.out.println("Date : " + new Date(d));
          }

          System.out.println("Containt Type : " +conn.getContentType());
           int length = conn.getContentLength();

           if (length == -1) {  
               System.out.println("Containt Length Not Found");
           } else { 
               System.out.println("Containt Length : "+length);
           }
           
    

        } catch (Exception e) {
            //TODO: handle exception
        }
        
    }
    
}