import java.util.Scanner;
public class OddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an integer:");
        int number = sc.nextInt();
        if(number % 2 == 0) {
            System.out.println(number + "It's a Even");
        }   else {
            System.out.println(number + "It's a Odd");
        }
    }
}
