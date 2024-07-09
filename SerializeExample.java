package Abacus;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeExample {

	public static void main(String[] args) {
		 try{    
			  //Creating the object    
			  Student1 s1 =new Student1(1,"Ravi",90);  
			  s1.percentage=90;
			  //Creating stream and writing the object    
			  FileOutputStream fout=new FileOutputStream("C:\\Eclipse Java\\src\\Test\\data.txt");    
			  ObjectOutputStream out=new ObjectOutputStream(fout);    
			  out.writeObject(s1);    
			  out.flush();    
			  //closing the stream    
			  out.close();    
			  System.out.println("success");    
			 }catch(Exception e){
				  System.out.println(e);
			  }
		 
		}    

	}


