import java.util.*;
public class Hackathon_1c {
    public static int calculateTotal(int morningWater, int eveningWater) {
        return morningWater + eveningWater;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the water consumed in the morning (in liters): ");
        int morningWater = input.nextInt();
        System.out.println("Enter the water consumed in the evening (in liters): ");
        int eveningWater = input.nextInt();
        int totalWater = calculateTotal(morningWater, eveningWater);
        System.out.println("The total water consumed is: " + totalWater + " liters");
        input.close();
    }
} 

