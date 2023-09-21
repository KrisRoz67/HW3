import java.util.Scanner;
public class Main {
   public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter first number: ");
        int firstInput = scanner.nextInt();
        System.out.println("Enter second number: ");
        int secondInput = scanner.nextInt();
        System.out.println("The absolute value of difference is =" +getAbsoluteValue(firstInput,secondInput));
        System.out.println("--------------------------------------");
        System.out.println("Please enter your string to find first char of it :");
        System.out.println("First char is : '" + getFirstCharOfString(scanner.next()) + "'");
        System.out.println("--------------------------------------");
        System.out.println("Please enter your string to find last char of it :");
        System.out.println("Last char is : '" + getLastCharOfString(scanner.next()) + "'");
        System.out.println("--------------------------------------");
        System.out.println("Please enter your string to change order of chars :");
        System.out.println("New string is: '" + changeOrderOfFirstChar(scanner.next()) + "'");
    }
    public static int getAbsoluteValue(int firstInput, int secondInput){
        return Math.abs(firstInput-secondInput);
    }
    public static char getAskedCharOfString(String userString,int orderOfChar){
        return userString.charAt(orderOfChar);
    }
    public static char getFirstCharOfString(String userString){
        return getAskedCharOfString(userString,0);
    }
    public static char getLastCharOfString(String userString){
        return getAskedCharOfString(userString,userString.length()-1);
    }
    public static String changeOrderOfFirstChar(String userString){
        String newString = userString.substring(1,userString.length()-1);
        return getLastCharOfString(userString)+
                newString+getFirstCharOfString(userString);
    }
}