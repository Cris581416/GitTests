import java.util.Scanner;

public class rectangleExample {
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the height of the rectangle: ");
		int height = input.nextInt();
		
		if (height < 0) {
			throw new IllegalArgumentException("Cannot make rectangle of height " + height);
			}
		
		Scanner Input = new Scanner(System.in);
		System.out.print("Enter the width of the rectangle: ");
		int width = Input.nextInt();
		
		if (width < 0) {
			throw new IllegalArgumentException("Cannot make rectangle of width " + width);
			}
		
		for (int i = 0; i < height; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("#");
				}
			System.out.println();
			}
		}
	}