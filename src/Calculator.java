import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		double i,dval;
		Scanner sc = new Scanner (System.in);
		System.out.println ("ȭ�� �µ��� �Է��Ͻÿ�.");
		dval = sc.nextDouble ();
		i = (dval - 32) * 5 / 9;
		System.out.println ("�����µ� = " + i);
				
	}
}
