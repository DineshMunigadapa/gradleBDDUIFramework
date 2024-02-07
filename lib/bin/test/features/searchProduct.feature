Feature: Search and Place the order for Products

  #Scenario: Search Experience for product search in both home and offers page
    #Given User is on GreenCart Landing page
    #When user searched with Shortname "Tom" and extracted actual name of product
    #Then user searched for "Tom" shortname in offers page to check if product exist with same name
@searchproduct
  Scenario Outline: Search Experience for product search in both home and offers page using Scenario outline
    Given User is on GreenCart Landing page
    When user searched with Shortname <Name> and extracted actual name of product
    Then user searched for <Name> shortname in offers page to check if product exist with same name

    Examples: 
      | Name |
      | Tom  |
      | str |
      |Beet|
