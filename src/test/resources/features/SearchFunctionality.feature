Feature: Website Search Feature


Scenario: 1.User searches for specific shirt item

Given Not a validated user
When User browse to website
Then Homepage should display
When User click searchLink button
Then Search in put Box display 
When User enters searchword as "shirt"
And User click search button
Then Search results title page should display
And All items should contain shirt in the product title