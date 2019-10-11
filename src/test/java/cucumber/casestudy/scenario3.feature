Feature: Search engine user TestMeApp
@validSearch
Scenario: valid search
Given user should be in search page
When user search for the product by entering "head",add to cart and process to payment 
Then user gets user confirmation

@invalidsearch
Scenario: Invalid Search 
Given user should be in search page
When user searches for invalid product
Then user gets notification about the invalid product

@NoPurchase
Scenario: No Purchase
Given user is already registered in TestMeApp
When user searches for the product by entering "head" but did not add to cart
Then user tries to display the cart and finds no item in cart 
