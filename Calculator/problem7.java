import java.util.Scanner;
public class Proble {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
        String expression = input.next();
        char[] charArray = expression.toCharArray();
        char charOperator = 0;
        int num1 = 0,num2=0;
        for(int i = 0 ; i<charArray.length ; i++) {
        	if(charArray[i]=='+' || charArray[i]=='-' || charArray[i]=='*' || charArray[i]=='/') {
        		charOperator = charArray[i];
        		String a = expression.substring(0, i);
        		num1 = Integer.parseInt(a);
        		String b = expression.substring((i+1));
        		num2 = Integer.parseInt(b);
        	}
        }
        switch (charOperator) {
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
        }
	}
}
