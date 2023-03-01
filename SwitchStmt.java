package controlstmt;

public class SwitchStmt {

	public static void main(String[] args) {
		int value=1;
		
		switch (value) {
		case 1: {
			System.out.println("add product");
			
		}
		case 2: {
			System.out.println("delete product");
			
		}
		default:
			System.out.println("no products");
		}

	}

}
