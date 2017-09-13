import java.util.Scanner;

public class Rating {

	public static void main(String[] args) {
		double TD;
		double Yards;
		double INT;
		double Completion;
		double Attempts;
		double a;
		double b;
		double c;
		double d;
		double Passer;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Total Touchdowns:");
		TD = input.nextDouble();
		
		System.out.print("Total Yards:");
		Yards = input.nextDouble();
		
		System.out.print("Total Interceptions:");
		INT = input.nextDouble();
		
		System.out.print("Total Completions:");
		Completion = input.nextDouble();
		
		System.out.print("Total Attempts:");		
		Attempts = input.nextDouble();
		
		System.out.println("\n");
		
		a = (Completion/Attempts-0.3)*5;
		
		if (a >= 2.375)
			a = 2.375;
		else
			a = a;
		
		b = (Yards/Attempts-3)*.25;
		
		if (b >= 2.375)
			b = 2.375;
		else
			b = b;		
		
		c = (TD/Attempts)*20;
		
		if (c >= 2.375)
			c = 2.375;
		else
			c = c;		
		
		d = 2.375-(INT/Attempts*25);
		
		if (d >= 2.375)
			d = 2.375;
		else
			d = d;
		
		Passer = ((a+b+c+d)/6)*100;
		 
		System.out.printf("QBR %.1f", Passer);
		
	}

}