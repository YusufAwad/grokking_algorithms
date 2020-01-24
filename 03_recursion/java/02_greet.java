import java.util.*;
import java.lang.*;
import java.io.*;

class grokkingAlgorithms
{	
	public static void greet2(String name){
		System.out.println("how are you, " + name + "?");
	}
	
	public static void bye(){
		System.out.println("ok bye!");
	}
	
	public static void greet(String name){
		System.out.println("hello, " + name + "!");
		greet2(name);
		System.out.println("getting ready to say bye...");
		bye();		
	}
	
	
	public static void main (String[] args) throws java.lang.Exception
	{
		greet("adit");
	}
}