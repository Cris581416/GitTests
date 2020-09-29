import java.util.Scanner;

public class Square{
    //will actually print a rectangle (quite fun :D)
    public static void main(String[] args){
        System.out.print("Enter a square side length: ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.close();
        for(int i = 0; i < input; i++){
            for(int j = 0; j < input; j++){
                System.out.print("|_|");
            }
            System.out.println("");
        }
    }
}
