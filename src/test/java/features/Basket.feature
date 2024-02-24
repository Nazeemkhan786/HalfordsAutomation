Feature: Login Functionality

@Reg2
Scenario: Add to cart from PLP for single product
   When user enter "standard_user" and "secret_sauce"
   And user click on login button
   And user click on add to cart button product1
   Then validate cart count is "1"
   
   
Scenario: Add to cart from PLP for multipleProduct
   When user enter "standard_user" and "secret_sauce"
   And user click on login button
   And user click on add to cart button product1
   And user click on add to cart button product2
   Then validate cart count is "2"
