import java.util.*;
import java.lang.*;
import java.io.*;

class grokkingAlgorithms
{	
	public static int countdown(int num){
		if(num > 0)
			System.out.println(num);
		if(num <= 0)
			return num;
		else
			return countdown(num-1);
	}

	public static void main (String[] args) throws java.lang.Exception
	{
		System.out.println(countdown(5));
	}
}