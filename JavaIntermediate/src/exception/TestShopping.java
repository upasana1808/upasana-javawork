package exception;

public class TestShopping {

	public static void main(String[] args) {
		Shopping sh=new Shopping();
		sh.addToCart();
		try {
			sh.makePayment();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
