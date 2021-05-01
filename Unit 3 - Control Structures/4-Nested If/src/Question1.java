import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		double topping,total;
		String delivery,size;
		System.out.println("Enter ‘d’ for delivery:");
		delivery = input.nextLine();
		if (delivery.equals("d")) {
			System.out.println("Delivery is selected");
			System.out.println("Enter the size of the pizza:");
			size = input.nextLine();
			if (size.equals("s")){
				System.out.println("Enter the number of toppings on the pizza:");
				topping = input.nextInt();
				if (topping==1) {
					total = (5+(0.75*1)+2);
					System.out.println("The total price for a s pizza with " + topping +" toppings is " + total);
					}
				else if (topping==2) {
					total = (5+(0.70*2)+2);
					System.out.println("The total price for a s pizza with " + topping +" toppings is " + total);
				    }
				else if (topping>=3) {
					total = (5+(0.65*topping)+2);
					System.out.println("The total price for a s pizza with " + topping + " toppings is " + total);
				    }
			 }
		     if (size.equals("m")) {
		    	 System.out.println("Enter the number of toppings on the pizza:");
		    	 topping = input.nextDouble();
		    	 if (topping==1) {
		    		 total = (6+(1*1)+2);
		    		 System.out.println("The total price for a m pizza with " + topping + " toppings is " + total);
		    		}
		    	 else if (topping==2) {
		    		 total = (6+(0.90*2)+2);
		    		 System.out.println("The total price for a m pizza with " + topping + " toppings is " + total);
		    	    }
		    	 else if (topping>=3) {
		    		 total = (6+(0.80*topping)+2);
		    		 System.out.println("The total price for a m pizza with " + topping + " toppings is " + total);
		    		}
		    }
		     if (size.equals("l")) {
		    	 System.out.println("Enter the number of toppings on the pizza:");
		    	 topping = input.nextDouble();
		    	 if (topping==1) {
		    		 total = (7+(1.25*1)+2);
		    		 System.out.println("The total price for a m pizza with " + topping + " toppings is " + total);
		    	 }
		    	 else if (topping==2) {
		    		 total = (7+(1.15*2)+2);
		    		 System.out.println("The total price for a m pizza with " + topping + " toppings is " + total);
		    	 }
		    	 else if (topping>=3) {
		        	  total = (7+(1*topping)+2);
		        	  System.out.println("The total price for a m pizza with " + topping + " toppings is " + total);
		          }
		     }
		 }
		else if(delivery.equals("s")){
			System.out.println("Pick up is selected");
			System.out.println("Enter the size of the pizza:");
			size = input.nextLine();
			if (size.equals("s")){
				System.out.println("Enter the number of toppings on the pizza:");
				topping = input.nextInt();
				if (topping==1) {
					total = (5+(0.75*1));
					System.out.println("The total price for a s pizza with " + topping +" toppings is " + total);
					}
				else if (topping==2) {
					total = (5+(0.70*2));
					System.out.println("The total price for a s pizza with " + topping +" toppings is " + total);
				    }
				else if (topping>=3) {
					total = (5+(0.65*topping));
					System.out.println("The total price for a s pizza with " + topping + " toppings is " + total);
				    }
			 }
		     if (size.equals("m")) {
		    	 System.out.println("Enter the number of toppings on the pizza:");
		    	 topping = input.nextDouble();
		    	 if (topping==1) {
		    		 total = (6+(1*1));
		    		 System.out.println("The total price for a m pizza with " + topping + " toppings is " + total);
		    		}
		    	 else if (topping==2) {
		    		 total = (6+(0.90*2));
		    		 System.out.println("The total price for a m pizza with " + topping + " toppings is " + total);
		    	    }
		    	 else if (topping>=3) {
		    		 total = (6+(0.80*topping));
		    		 System.out.println("The total price for a m pizza with " + topping + " toppings is " + total);
		    		}
		    }
		     if (size.equals("l")) {
		    	 System.out.println("Enter the number of toppings on the pizza:");
		    	 topping = input.nextDouble();
		    	 if (topping==1) {
		    		 total = (7+(1.25*1));
		    		 System.out.println("The total price for a m pizza with " + topping + " toppings is " + total);
		    	 }
		    	 else if (topping==2) {
		    		 total = (7+(1.15*2));
		    		 System.out.println("The total price for a m pizza with " + topping + " toppings is " + total);
		    	 }
		    	 else if (topping>=3) {
		        	  total = (7+(1*topping));
		        	  System.out.println("The total price for a m pizza with " + topping + " toppings is " + total);
		          }
		}
		     
		     }
		else {
			System.out.println("Error, invalid order");
		}    
		     
		     
		
		
		
		
		
		
			
			
			
			
	}}
			
		
			
		
		
		

	


