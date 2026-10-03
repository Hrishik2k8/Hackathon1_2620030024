import java.util.*;
public class Hackathon_1a{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Number of family members: ");
        int n = input.nextInt();
        System.out.println("Enter the water consumed in litres: ");
        float water = input.nextFloat();
        System.out.println("Enter the house number: ");
        int house = input.nextInt();
        System.out.println("Enter the usage type: ");
        char usage = input.next().charAt(0);
        System.out.println("The number of family members is: " + n);
        System.out.println("The water consumed is: " + water);
        System.out.println("The house number is: " + house);
        System.out.println("The usage type is: " + usage);
        input.close();
    }
}