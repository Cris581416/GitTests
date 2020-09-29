import java.util.Scanner;

public class diamondExample {
	public static void main(String []args) {
		int n = 1;
		int i = 1;
		int j = 1;
		int space = 1;
		
        System.out.print("Enter the number of rows in your diamond: "); //user input
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        space = n - 1; //there will be 1 less row that has spaces than total rows
       
        for (j = 1; j <= n; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
                } //prints spaces for formatting
            
            space--;
            
            for (i = 1; i <= 2 * j - 1; i++) {
                System.out.print("#");                
            	} //prints diamond parts
            
            System.out.println("");
       		} //prints first half of diamond
        
        space = 1;
        
        for (j = 1; j <= n - 1; j++) {
            for (i = 1; i <= space; i++) {
                System.out.print(" ");
            	} //prints spaces for formatting
            	
            space++;
            
            for (i = 1; i <= 2 * (n - j) - 1; i++) {
                System.out.print("#");
            	} //prints diamond parts
            
            System.out.println("");
       		} //prints second half of diamond
		}
	}