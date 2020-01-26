import java.util.*;
import java.lang.*;
import java.io.*;


class grokkingAlgorithms
{	

	public static void main (String[] args) throws java.lang.Exception
	{
        HashMap<String, Double> book = new HashMap<String, Double>();
        book.put("apple", 0.67);
        book.put("milk", 1.49);
        book.put("avocado", 1.49);

        Set set = book.entrySet();
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
            Map.Entry mentry = (Map.Entry)iterator.next();
            System.out.print(mentry.getKey() + " ");
            System.out.println(mentry.getValue());
         }
	}
}