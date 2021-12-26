package automationproject;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.OrderFlowPages;

public class OrderCheckoutFlowTest{
	private WebDriver driver;
	LoginPage login = new LoginPage(driver);
	OrderFlowPages ord = new OrderFlowPages();
	
	
	@Test
	public void Process() {
		ord.Tshirts();
		ord.AddToCart();
		ord.Checkout();
		ord.ProceedtoCheckout();
		ord.ProceedAdd();
		ord.agree();
		ord.processShipment();
		ord.payment();
	}
	
	
}
