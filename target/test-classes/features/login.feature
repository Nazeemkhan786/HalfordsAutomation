Feature: Login Functionality

@Reg
Scenario: Login with valid credentials
   When user enter "standard_user" and "secret_sauce"
   And user click on login button
   Then Validate user logged in successfully
   
 @Reg  
Scenario: Login with invalid credentials
   When user enter "fghdcf" and "sdfgcv"   
   And user click on login button
   Then Validate login error message
   
  
 @Reg  
Scenario: Login with invalid and valid password
   When user enter "fghdcf" and "secret_sauce"   
   And user click on login button
   Then Validate login error message

@Reg  
Scenario: Login with valid and invalid password
   When user enter "standard_user" and "sfgdfc"   
   And user click on login button
   Then Validate login error message 