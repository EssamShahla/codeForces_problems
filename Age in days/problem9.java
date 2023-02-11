import java.util.Scanner;
public class Proble {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter");
        long ageInDays = input.nextInt();
        long years = ageInDays/365;
        long newAgeInDays1 =ageInDays - (years*365) ;
        long months = newAgeInDays1/30;
        long newAgeInDays2 =newAgeInDays1 - (months*30) ;
        long days = newAgeInDays2;
        System.out.println(years + " years");
        System.out.println(months + " months");
        System.out.println(days + " days");
	}
}
