import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number: ");
        double enteredNumber = scanner.nextDouble();

        if (enteredNumber > 7) {
            System.out.println("Hello");
        }

        System.out.print("Enter name: ");
        scanner.nextLine(); // Чтобы считать новую строку после ввода числа
        String enteredName = scanner.nextLine();

        if (enteredName.equals("John")) {
            System.out.println("Hello, John");
        } else {
            System.out.println("There is no such name");
        }

        System.out.print("Enter elements of array via spaces: ");
        String input = scanner.nextLine();
        String[] inputArray = input.split(" ");

        System.out.print("Elements of array multiple 3: ");

        for (String number : inputArray) {
            int num = Integer.parseInt(number);
            if (num % 3 == 0) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
