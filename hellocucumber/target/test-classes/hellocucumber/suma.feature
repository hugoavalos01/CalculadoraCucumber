Feature: Comprobamos la suma


  Scenario Outline: Suma de dos numeros
    Given Inicializamos la calculadora
    When Sumo <a> y <b>
    Then El resultado de la suma es <c>

    Examples: 
      | a | b | c |
      | 1 |-2 |-1 |
      | 4 | 5 | 9 |
      | -2| 4 | 2 |
