package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderFlowPages {
	
	
	
	@FindBy(xpath = "//*[@id=\"block_top_menu\"]/ul/li[3]/a")
	public WebElement Tshirts;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]")
	public WebElement AddtoCart;
	
	@FindBy(xpath = "//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")
	public WebElement checkout;
	
	@FindBy(xpath = "//*[@id=\"center_column\"]/p[2]/a[1]")
	public WebElement proceedToCheckout;
	
	@FindBy(name = "processAddress")
	public WebElement proceedAddress;
	
	@FindBy(id = "uniform-cgv")
	public WebElement agreeTerms;
	
	@FindBy(name = "processCarrier")
	public WebElement processShip;
	
	@FindBy(xpath = "//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")
	public WebElement payment;
	
	public void Tshirts() {
		Tshirts.click();
	}
	
	public void AddToCart() {
		AddtoCart.click();
	}
	public void Checkout() {
		checkout.click();
	}
	public void ProceedtoCheckout() {
		proceedToCheckout.click();
	}
	public void ProceedAdd() {
		proceedAddress.click();
	}
	public void agree() {
		agreeTerms.click();
	}
	
	public void processShipment() {
		processShip.click();
	}
	
	public void payment() {
		payment.click();
	}
}
