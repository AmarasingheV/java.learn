
import java.util.Scanner;

public class Greeting {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);


        System.out.println("What's you name? ");//Ask for the name
        String name = scanner.nextLine();

        System.out.println("Hello " +name+", Welcome to this new world of java");
        
        scanner.close();


        
    }
}
