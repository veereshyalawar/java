
public class uc_1 {

	public static void main(String[] args) {
		import java.util.*;

	    Scanner.Sc = new Scanner(System.in);
		
		System.out.println("enter x1");
		int x1 = Sc.nextInt();
		
		System.out.println("enter y1");
		int y1 = Sc.nextInt();
		
		System.out.println("enter x2");
		int x2 = Sc.nextInt();
		
		System.out.println("enter y2");
		int y2 = Sc.nextInt();
		
		int val1=(int) Math.pow((x2-x1),2);
		int val2=(int) Math.pow((y2-y1),2);
		int result=(int) Math.sqrt(val1+val2);
	
		System.out.println("length of line:"+result);
	
	    scanner.close();
	
	
	
	
	}

}
