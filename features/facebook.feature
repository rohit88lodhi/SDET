Feature: To check Facebook login

  Background: Facebook Login page
    Given user is on facbook page

  @smoke @ibmdemo
  Scenario Outline: Login facebook page
    When user enters "<username>" and user enters "<password>"
    And user clicks on login button
    Then user will not be able to log in

    Examples: 
      | username | password |
      | Rohit	   | Lodhi	  |

  @Smoke
  Scenario Outline: Login facebook page
    When user enters "<username>" and user enters "<password>"
    And user clicks on login button
    Then user will not be able to log in
		
		 Examples: 
      | username | password |
      | Rohit1   | Lodhi2   |