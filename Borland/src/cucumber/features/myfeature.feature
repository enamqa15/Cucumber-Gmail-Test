Feature: Gmail Demo Site
Scenario: Successful run borland demo site
    Given User is on Home Page
    When User click the SignIn button
    And User enter the userName and Password
    Then User click the Submit button
	Then System display Login Successfully
	And User click the LogOut button
	Then System display LogOut Successfully
	But User click on the cross symbol to close the browser
	
