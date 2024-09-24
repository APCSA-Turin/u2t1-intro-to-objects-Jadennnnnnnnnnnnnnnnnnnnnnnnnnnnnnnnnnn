import java.text.DecimalFormat;
import java.util.Scanner;

public class ChatBotRunner {
    public static void main(String[] args) {
        ChatBot ryan = new ChatBot("Ryan", 14);
        Scanner scan = new Scanner(System.in);
        int num;
        boolean quit = false;
        DecimalFormat df = new DecimalFormat(".00");
        
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        ryan.greeting(name);
        
        while (quit == false) {
            System.out.print("Enter a number between 1 and 10, -1 to quit: ");
            num = scan.nextInt();
            scan.nextLine();
                
            switch (num) {
                case 1 -> ryan.weather();
                case 2 -> {
                    System.out.print("Enter an amount of feet: ");
                    int feet = scan.nextInt();
                    scan.nextLine();
                    System.out.println(feet + " feet is " + df.format(ryan.convertFeetToMeters(feet)) + " meters");
                }
                case 3 -> {
                    System.out.print("Enter your favorite number: ");
                    int favNum = scan.nextInt();
                    scan.nextLine();
                    ryan.favoriteNumber(favNum);
                }
                case 4 -> System.out.println("Did you know, 1 + 2 + 3 is " + ryan.addNumbers(1, 2, 3));
                case 5 -> System.out.println(ryan.catJoke());
                case 6 -> {
                    System.out.print("Enter an amount of meters: ");
                    int meters = scan.nextInt();
                    scan.nextLine();
                    System.out.println(meters + " meters is " + df.format(ryan.convertMetersToFeet(meters)) + " feet");
                }
                case 7 -> {
                    System.out.print("Enter the temperature: ");
                    String temp = scan.nextLine();
                    ryan.temperature(temp);
                }
                case 8 -> {
                    System.out.print("Enter an integer greater than 0: ");
                    int num1 = scan.nextInt();
                    scan.nextLine();
                    String binary = ryan.binary(num1);
                    System.out.println(num1 + " is " + binary + " in binary");
                }
                case 9 -> {
                    System.out.print("Enter a name: ");
                    String randomName = scan.nextLine();
                    ryan.nameRater(randomName);
                }
                case 10 -> {
                    System.out.print("Enter the year of your birth: ");
                    int birthYear = scan.nextInt();
                    scan.nextLine();
                    int age = ryan.age(birthYear);
                    System.out.println("You should be around " + age + " years old");
                }
                case -1 -> quit = true;
                }
            }
        System.out.println(ryan.goodbye());
        scan.close();
    }
}


