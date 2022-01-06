//9. Write a java program to convert first letter of every word to uppercase from the given statement 

import java.util.Scanner;

class upper
 {

    public static void main(String[] args) 
     {
        System.out.println("Enter the sentence to capitalize the first letter : ");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        Scanner stringScanner = new Scanner(string);
        String resultString = "";
        while (stringScanner.hasNext())
          {
            String str = stringScanner.next();
            resultString = resultString + str.substring(0, 1).toUpperCase() + str.substring(1) + " ";
          }
        System.out.println("After capitalizing the first letter in each word..the result is : " + resultString);
     }
}
