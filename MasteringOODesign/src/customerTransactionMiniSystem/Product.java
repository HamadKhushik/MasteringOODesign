package customerTransactionMiniSystem;

/**
 * @author Hammad: 17-Feb-2022
 */
public class Product {

	private int productId;
	private String productName;

	public Product(int id, String name) {
		this.productId = id;
		this.productName = name;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

}
