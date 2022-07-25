Feature: Homepage feature

  @Homepage
  Scenario Outline:User able to select the different links on the category page by clicking on the shop menu and verify the broken images existence
    Given user navigates to Home page
    When Verify by clicking on links from the shop category
    Then User should navigate to each respective links based on the link selection <Linknumber>
    And Verify the Broken images which are displayed on the page
    Examples:
      | Linkname             | Linknumber |
      | Hair Care            | 1          |
      | Lifestyle Diseases   | 2          |
      | Men's - Care         | 3          |
      | Sexual Wellness      | 4          |
      | Skin   care          | 5          |
      | Weight Loss          | 6          |
      | Women's Care         | 7          |
      | Digestion            | 8          |
      | Daily Diet           | 9          |
      | Immunity             | 10         |
      | Diabetes             | 11         |
      | Blood Pressure       | 12         |
      | Aloe Vera            | 13         |
      | Amla                 | 14         |
      | Ashwagandha          | 15         |
      | Brahmi               | 16         |
      | Garcinia             | 17         |
      | Giloy                | 18         |
      | Moringa              | 19         |
      | Noni                 | 20         |
      | Rose                 | 21         |
      | Shilajeet            | 22         |
      | Spirulina            | 23         |
      | Tulsi                | 24         |
      | Turmeric             | 25         |
      | Wheatgrass           | 26         |
      | Plant Protein        | 27         |
      | Juices               | 28         |
      | Slim Shakes          | 29         |
      | Capsules             | 30         |
      | Tea                  | 31         |
      | Breakfast Mix        | 32         |
      | Effervescent Powders | 33         |
      | Gummies              | 34         |
      | Ghee                 | 35         |
      | Combos               | 36         |
      | Vegan Protein        | 37         |


  @Homepage
  Scenario: User able to select the product from the addcart button and able to proceed with the payment
    Given user navigates to Home page
    And Click on Addcartbutton to add products in add cart
    And click on cartButton to proceed for payment
    When User click on Checkout button
    Then User navigate to payment section

#  @Homepage
#  Scenario: User able to track by using tracking button on the Homepage with valid tracking number
#    Given user navigates to Home page
#    And Click on TrackingIcon next to the searchbox
#    When  Enter the valid  trackingId "861891"
#    Then Click on trackButton
#    And User check "https://shiprocket.co/tracking/143254213424233" text in the msg Displayed
#
#  @Homepage
#  Scenario: User should get error message using track order icon with invalid tracking number
#    Given user navigates to Home page
#    And Click on TrackingIcon next to the searchbox
#    When  Enter the valid  trackingId "8618918"
#    Then Click on trackButton
#    And User check "Order details not found. Kindly enter the correct order ID or wait for 48 hours for tracking details." text in the msg Displayed




