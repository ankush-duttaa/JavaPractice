import java.math.BigDecimal;

public class Calculator {
	public static void main (String[] args) {
	   String s1 = args[0];
	   String s2 = args[1];
	   String operation = args[2]; // 0 :addition, 1: substractions
	   int n1 = Integer.parseInt(s1);
	   int n2 = Integer.parseInt(s2);
	   int op = Integer.parseInt(operation);
	   BigDecimal bg;
	   
	   int addition= 999999999;
	   
	   if(op == 0) {
		  addition = n1 + n2; 
	   }else if(op == 1) {
		  addition = n1 - n2; 
	   }
	   
	   System.out.println("Addition result:" + addition);
	}
}