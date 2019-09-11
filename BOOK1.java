/**
 * 
 */

/**
 * @author Andish
 *
 */
public class BOOK1 {
	/*attributes*/
	private String isbn;
	private String title;
	private int noPages;
	private boolean isElectronic;
	private double price;
	private double discount;
	
	public BOOK1() {
		this.isbn = "";
		this.title = "";
		this.noPages = 0;
		this.isElectronic = false;
		this.price = 0.0;
		this.discount = 0;
		
	}
	
	public BOOK1(String isbn, String title, int noPages, boolean isElectronic, double price, double discount) {
		this.isbn = isbn;
		this.title = title;
		this.noPages = noPages;
		this.isElectronic = isElectronic;
		this.price = price;
		this.discount = discount;
	}

	/**
	 * @return the isbn
	 */
	public String getIsbn() {
		return isbn;
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @return the noPages
	 */
	public int getNoPages() {
		return noPages;
	}

	/**
	 * @return the isElectronic
	 */
	public boolean isElectronic() {
		return isElectronic;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @return the discount
	 */
	public double getDiscount() {
		return discount;
	}

	/**
	 * @param isbn the isbn to set
	 */
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @param noPages the noPages to set
	 */
	public void setNoPages(int noPages) {
		this.noPages = noPages;
	}

	/**
	 * @param isElectronic the isElectronic to set
	 */
	public void setElectronic(boolean isElectronic) {
		this.isElectronic = isElectronic;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
	
	public double calculateDiscount(double price, double discount) {
		return(price-((price*discount)/100));
	}
	
	@Override
	public String toString() {
		return "BOOK1 [isbn=" + isbn + ", title=" + title + ", noPages=" + noPages + ", isElectronic=" + isElectronic
				+ ", price=" + price + ", discount=" + discount + "]";
	}
}
