Feature: User Register 

@register
Scenario: Create New Account 
	Given User go to website  
	When user click on register botton  
	And user enter email and User firstname and User lastname and password and Company name  
	Then select country 
	Then select email newsletters
	And Click the register buttom
	Then the user verify on the dasboard page 