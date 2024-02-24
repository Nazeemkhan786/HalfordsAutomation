package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import helper.Base;

public class BasketPage extends Base {

	public void user_click_on_add_to_cart_button_product1() {
		WebElement product1Btn = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		clickOnElement(product1Btn, 10);
		
	}
	
	public void user_click_on_add_to_cart_button_product2()  {
		WebElement product2Btn = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		clickOnElement(product2Btn, 10);
	}
	
	public void validate_cart_count_is(String cartCountNum) {
		WebElement cartCount=driver.findElement(By.cssSelector("span.shopping_cart_badge"));
		validatetext(cartCount, cartCountNum);

	}
}