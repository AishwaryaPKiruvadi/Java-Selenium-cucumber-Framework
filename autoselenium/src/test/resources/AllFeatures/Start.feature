Feature: Order an item
@smoke
Scenario Outline: Successfullorder for an item

Given user in browser
When user enetr url
#Parameterization passing paramneters 
Then user is in login page enters <usernname> and passsword <password> clicks on login 
And user adds to cart
And User go to cart and enter deatils 
And user makes payment
Then user get sucessful order message
#Then user quits browser

#Data driven testing
Examples:
|usernname|password|                      
|standard_user|secret_sauce|
|visual_user|secret_sauce|



