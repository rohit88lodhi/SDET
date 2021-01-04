Feature: To check the Name field

  Background: User is on OLA Corporate page
    Given user is on OLA Corporate page

  @SC01
  Scenario Outline: Write String in Name Textbox
    When User Clicks on Contact US
    When User Enters "<Name>" in Name TexbBox
    And User clicks on submit button

    Examples: 
      | Name  |
      | Rohit |

  @SC02
  Scenario Outline: Write String in Email Address Textbox
    When User Clicks on Contact US
    When User Enters "<Email>" in Name Email Address Textbox
    And User clicks on submit button

    Examples: 
      | Email           |
      | Rohit@email.com |

  @SC03
  Scenario Outline: Write String in Company Name Textbox
    When User Clicks on Contact US
    When User Enters "<CompanyName>" in Name Company Name Textbox
    And User clicks on submit button

    Examples: 
      | CompanyName |
      | XYZ         |

  @SC04
  Scenario Outline: Write Number in Phone Number Textbox
    When User Clicks on Contact US
    When User Enters "<Phone>" in Name Phone Number Textbox
    And User clicks on submit button

    Examples: 
      | Phone      |
      | 0123456789 |

  @SC05
  Scenario Outline: Write Number in Comments Textbox
    When User Clicks on Contact US
    When User Enters "<Comments>" in Name Comments Textbox
    And User clicks on submit button

    Examples: 
      | Comments      |
      | Scenario number 5 |
      