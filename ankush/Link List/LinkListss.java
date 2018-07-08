import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.LinkedList;; 
 
public class LinkListss {
 
    public static void main(String args[]){
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
		
        LinkedList<String> arrl = new   LinkedList<String>();
        
        arrl.add("First");
        arrl.add("Second");
        arrl.add("Third");
        arrl.add("Random");
        System.out.println("Actual ArrayList:"+arrl);
        LinkedList<String> list = new LinkedList<String>();
        list.add("one");
        list.add("two");
		list.add("two");
        arrl.addAll(list);
		System.out.println("Before Arry List add time is:-" +formatter.format(date));	
        System.out.println("After Copy ArrayList: "+arrl);
		
		arrl.set(6,"Replace");
		System.out.println("Index searching and replace Time:-" +formatter.format(date));
		System.out.println("After Replace ArrayList : "+arrl);
		arrl.remove("Third");
		System.out.println("After Remove ArrayList : "+arrl);
		
		boolean isFound = arrl.contains("Random");
		if(isFound == false)
			System.out.println("Element is not found in the list");
		else
			System.out.println("Element is found in the list");
		System.out.println("Search by string time is :-" +formatter.format(date));
		System.out.println("Index of 'Random': "+arrl.indexOf("Random"));
		 
         System.out.println("Search by Index time is :-" +formatter.format(date));		
		System.out.println("time is': "+ System.currentTimeMillis());
    }
}