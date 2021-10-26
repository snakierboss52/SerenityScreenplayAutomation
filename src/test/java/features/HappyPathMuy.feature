Feature: create different orders
  As an user I want to create different orders in RobinFood restaurant


  Scenario Outline: User create order with muy <sugerido>
    Given Store employee login into application with <storeEmail> and <password> and skip the welcome video
    When User login into application with <numberPhone> and select his <orderMode>, the <brand>, his <sugerido> with <size>
    Then User create the order
    Examples:
      |storeEmail          |password|numberPhone|orderMode  |brand |sugerido                  |size       |
      |muy83-ag1@muy.com.co|muy83-ag|3005302178 |Para llevar|Pecado|Ensalada con pollo crispy |Gran Pecado|
      |muy83-ag1@muy.com.co|muy83-ag|3005302178 |Para llevar|Muy   |Paisa                     |Muy Muy    |
      |muy83-ag1@muy.com.co|muy83-ag|3005302178 |Comer Aqui |Muy   |Fresco                    |Muy        |
      |muy83-ag1@muy.com.co|muy83-ag|3005302178 |Comer Aqui |Muy   |Fricasé de pollo          |Muy Muy    |

