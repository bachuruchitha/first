package mypro2;
import java.io.*;  
public class Fileread {  
    public static void main(String args[])throws Exception{        
          BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); 
          BufferedReader fr=new BufferedReader(new FileReader("C:\\Users\\bachu\\Desktop\\java files\\addition.java")); 
          do {
          System.out.print((char)fr.read());
          }while(fr.read()!=-1);
          int i;    
          while((i=br.read())!=-1){  
          System.out.print((char)i);  
          }  
          br.close(); 
          fr.close();
    }    
}    
