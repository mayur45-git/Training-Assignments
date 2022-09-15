package com.yash.exception.Task_3;

import java.io.FileOutputStream;

public class TrywithResorces {
	
	public static void main(String args[]){      
        
try(FileOutputStream fileOutputStream =new FileOutputStream("C:/Users/mayur.gangreddiwar/Desktop/Training/rings.txt"))
{      
String msg = "Try with Resources..";  

byte byteArray[] = msg.getBytes();  

fileOutputStream.write(byteArray); 

System.out.println("Message written to file successfuly!");      
}
catch(Exception e)
{  
       System.out.println(e);  
}      
}

}
