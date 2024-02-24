package stepDefination;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.BasketPage;

public class BasketPageSteps {

	
     BasketPage basket = new BasketPage();
     
     @When("user click on add to cart button product1")
     public void user_click_on_add_to_cart_button_product1() {
    	 basket.user_click_on_add_to_cart_button_product1();
    	 
     }
     
     @When("user click on add to cart button product2")
     public void user_click_on_add_to_cart_button_product2() {
    	 basket.user_click_on_add_to_cart_button_product2();
     }
     
    
     
     }
     
	


