import java.util.Scanner;

/**
 * 
 */

/**
 * @author Andish
 *
 */
public class testBOOK1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard = new Scanner(System.in);
		
		double discount1;
		
		System.out.println("Enter the price please: ");
		double price = keyboard.nextDouble();
		
		System.out.println("Enter the discount please: ");
		int discount = keyboard.nextInt();
		
		BOOK1 B1 = new BOOK1();
		B1.setPrice(price);
		B1.setDiscount(discount);
		
		discount1 = B1.calculateDiscount(B1.getPrice(), B1.getDiscount());
		System.out.println("Discount Price Rs" + discount1);

	}

}
