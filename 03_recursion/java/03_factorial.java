import java.util.*;
import java.lang.*;
import java.io.*;

class grokkingAlgorithms
{	
	public static int fact(int num){
		if(num == 1)
			return num;
		else
			return num * fact(num-1);
	}

	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(fact(5));
	}
}