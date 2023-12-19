import java.util.Scanner;
class HelloWorld {
    public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

        // Asking user to enter a string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        String reversedStr = "";

        for (int i = 0;i<inputString.length();i++) {
            //picking characters from input string and adding it to the beggining of the reversed string
            reversedStr = inputString.charAt(i)+reversedStr;
        }

        System.out.println("Reversed string: "+ reversedStr);
    }
}