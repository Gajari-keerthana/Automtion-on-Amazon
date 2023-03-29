Feature: Sign in

Scenario: Successful login with valid credentials
	Given User launch firefox browser
	When User opens url "https://www.amazon.com/ap/signin?openid.pape.max_auth_age=900&openid.return_to=https%3A%2F%2Fwww.amazon.com%3F&openid.assoc_handle=usflex&openid.mode=checkid_setup&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0"
	And User enters Email or phone number as :"gajarikeerthana14@gmail.com" 
	And click on Continue
	And User enters password as : "Keerthi@7894" 
	And click on Sign in
	Then page Title should be "Amazon.com. Spend less. Smile more." 
  And User on Accounts&Lists
  When user click on Sign Out 
#	Then Page Title should be "Sign in page"
#	And close the browser
	
	
	
	
