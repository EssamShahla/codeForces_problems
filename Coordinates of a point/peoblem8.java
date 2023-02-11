import java.util.Scanner;
public class Proble {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        if(num1 > 0 && num2 >0)
        	System.out.println("Q1");
        else if(num1 < 0 && num2 > 0)
        	System.out.println("Q2");
        else if(num1 < 0 && num2 < 0)
        	System.out.println("Q3");
        else if(num1 > 0 && num2 < 0)
        	System.out.println("Q4");
        else if(num1 == 0 && num2!=0)
        	System.out.println("Eixo Y");
        else if(num1 != 0 && num2==0)
        	System.out.println("Eixo X");
        else
        	System.out.println("Origem");
	}
}
