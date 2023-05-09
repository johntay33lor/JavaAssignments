package Loops;
import java.util.Scanner;
public class CountToEleven {
    public static void main(String[] args) {
        int num;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number less than 11: ");

        num = Integer.valueOf(input.nextLine());

        for (int i = num; i <= 11; i++) {
            System.out.println(i);
        }
    }
}
