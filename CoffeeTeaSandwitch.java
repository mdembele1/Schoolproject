import java.util.ArrayList;
import java.util.Scanner;

public class CoffeeTeaSandwitch {

	public static void main(String[] args) {
	    ArrayList<Integer> order = new ArrayList<Integer>();
        Scanner in = new Scanner(System.in);
        int c = 0, t = 0, s = 0, userInput = 0;
        do {
            System.out.println("Select one of the following:");
            System.out.println("1- Coffee");
            System.out.println("2- Tea");
            System.out.println("3- Sandwich");
            System.out.println("4- exit");
            userInput = in.nextInt();
            switch (userInput) {
            case 1:
               order.add(1);
                System.out.println("coffee added");
                break;
            case 2:
                order.add(2);
                System.out.println("tea added");
                break;
            case 3:
                order.add(3);
                System.out.println("Sandwich added");
                break;
            default:
                System.out.println("Order complete");
                break;
                }
        } while (userInput < 4);
        
        
        for (int i : order) {
            switch (i) {
            case 1:
                c++;
                break;
            case 2:
                t++;
                break;
            case 3:
                s++;
                break;
            }
        }
        
        System.out.println("coffee qty= " + c + " | tea qty= " + t + " | sandwich qty= " + s);
        System.out.println("Total = $" + ((c * 2) + (t * 1) + (s * 3)));
    }

}
