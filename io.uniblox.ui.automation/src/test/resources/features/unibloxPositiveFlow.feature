Feature: Uniblox Positive Flow Test
  Scenario: Successful registration of a user
    Given User is on Welcome page
    Then Check for Insure Logo
    Then Check that Need help link is present
    Then Check that the Welcome text is present
    Then Check that the Welcome info is present
    And Click on Get Started button
    And Choose the applicant type as Employee and click Next
    And Choose the product as Supplemental Life and click Next
    And Give firstName, lastName and click Next
    And Give email and click Next
    And Move the slider to 250000 and click Next
    And Give DOB and click Next
    And Choose the gender as Male and click Next
    And Add phone number and click Next
    And Click on I can't find my address link
    And add address, aptUnit, city, state and zipcode
    And Select both I Agree checkboxes and click Next
    And add height, weight and click Next
    And Click on None Of the Above option
    And Choose No for medical examination
    And Choose No for medications
    And Choose No for Signature
    And add first name, last name and click Sign your application
    Then assert acknowledgement text and download pdf button

