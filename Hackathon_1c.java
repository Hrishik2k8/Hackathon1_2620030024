import java.util.*;
public class Hackathon_1c {
    public static int calculateTotal(int morningUsage, int eveningUsage) {
        return morningUsage + eveningUsage;
    }
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the water consumed in the morning: ");
        int morningWater = input.nextInt();
        System.out.println("Enter the water consumed in the evening: ");
        int eveningWater = input.nextInt();
        int totalWater = calculateTotal(morningWater, eveningWater);
        System.out.println("The total water consumed is: " + totalWater + " liters");
        input.close();
    }
} 

