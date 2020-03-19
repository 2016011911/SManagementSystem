import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		double i,dval;
		Scanner sc = new Scanner (System.in);
		System.out.println ("È­¾¾ ¿Âµµ¸¦ ÀÔ·ÂÇÏ½Ã¿À.");
		dval = sc.nextDouble ();
		i = (dval - 32) * 5 / 9;
		System.out.println ("¼·¾¾¿Âµµ = " + i);
				
	}
}
