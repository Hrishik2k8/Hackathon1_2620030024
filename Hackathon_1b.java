import java.util.Scanner;
public class Hackathon_1b {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the water consumption in liters: ");
        int water = input.nextInt();
        int bill =0;
        if(water <= 500){
            bill = 100;
        }
        else if(water > 500){
            bill = 200;
        }
        System.out.println("The water bill is: " + bill);
        input.close();
    }
}
