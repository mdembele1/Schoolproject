import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Arrayliscoffee {

	public static void main(String[] args) {
		 Scanner scan = new Scanner(System.in);
		 List<Integer> quantity= new ArrayList<Integer>();
		 List<Integer> cof= new ArrayList<Integer>();
		 List<Integer> T= new ArrayList<Integer>();
		 List<Integer> sand= new ArrayList<Integer>();
		 
	        int input = 0, coffee = 0, tea = 0, sandwitch = 0,sumcof=0,sumtea=0,sumsand=0;
	        while (input != 4) {
	            System.out.println("Select one of below options:");
	            System.out.println("1- Add Coffee");
	            System.out.println("2- Add Tea");
	            System.out.println("3- Add Sandwich");
	            System.out.println("4- Exit");
	            input = scan.nextInt();
	            
	            
	            if (input == 1) {
	            	System.out.println("Coffee Qty:  ");
	            	cof.add(scan.nextInt());
	            	System.out.println("Coffee added!");
	            	
	            } else if (input == 2) {
	            	System.out.println("Tea Qty: ");
	            	T.add(scan.nextInt());
	            	System.out.println("Tea added!");
	                
	                
	            } else if (input == 3) {
	            	System.out.println("Sandwitch Qtity:  ");
	            	sand.add(scan.nextInt());
	            	System.out.println("Sandwitch added!");
	                
	                
	            } else if (input == 4) {
	            	System.out.println("-----------------------");
	            
	            	for(int c:cof) {
	    				sum
	    			}
	            	
	            	for(int te:T) {
	    				sumtea+=te;
	    			}
	            	
	            	
	            	for(int s:sand) {
	    				sumsand+=s;
	    			}
	                System.out.println("You Ordered: ");
	                System.out.println("Quantity of coffee: " + cof);
	                System.out.println("Quatity of Tea: "+ T);
	                System.out.println("Quantity of Sandwich: "+sand);
	                System.out.println("-----------");
	                System.out.println(sumcof + " Coffee(s)");
	                System.out.println(sumtea + " Tea(s)");
	                System.out.println(sumsand + " Sandwich(s)");
	                System.out.println("Thank you!");
	                
	            }
	        }
	}

}
