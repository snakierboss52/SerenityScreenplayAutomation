Feature: create different orders
  As an user I want to create different orders in RobinFood restaurant


  Scenario Outline: User create order with menu personalizado
    Given Store employee login into application with <storeEmail> and <password> and skip the welcome video
    When User login into application with <numberPhone> and select his <orderMode>, the <brand>, his personalizado with <size>
    Then User create the order
    Examples:
      | storeEmail           | password | numberPhone | orderMode   | brand  | size        |
      | muy83-ag1@muy.com.co | muy83-ag | 3005302178  | Para llevar | Pecado | Gran Pecado |
      | muy83-ag1@muy.com.co | muy83-ag | 3005302178  | Comer Aqui  | Muy    | Muy Muy     |


 Scenario Outline: User non-registered order with menu <sugerido>
   Given Store employee login into application with <storeEmail> and <password> and skip the welcome video
   When User login into application with <numberPhone>
   And Complete the form with his <name> and his <lastName>
   And Select his <orderMode>, the <brand>, his sugerido with <size>
   Then The user registered and create an order
   Examples:
     | storeEmail           | password | numberPhone | name  | lastName | orderMode   | brand | size    | sugerido |
     | muy83-ag1@muy.com.co | muy83-ag | 3005302178  | Bruce | Wayne    | Para llevar | Muy   | Muy Muy | Fresco   |