import java.util.Scanner;

public class Exercice20 {

    public static void main(String[] args) {
        int year;

        Scanner inpuptValue;
        inpuptValue = new Scanner(System.in);
        System.out.println("Enter a year: ");
        year = inpuptValue.nextInt();

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Year is lead year");
        } else {
            System.out.println("Year isn't lead year.");
        }
    }
}
