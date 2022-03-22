Feature: Comprobamos la multiplicacion


  Scenario Outline: Multiplicacion de dos numeros
    Given Inicializamos la calculadora
    When Multiplico <a> y <b>
    Then El resultado de la multiplicacion es <c>

    Examples: 
      | a | b | c |
      | 1 |-2 |-2 |
      | 4 | 5 |20 |
      | -2| 4 |-8 |