Feature: Comprobamos el factorial


  Scenario Outline: Factorial de un numero
    Given Inicializamos la calculadora
    When Calculo el factorial de <a>
    Then El factorial es <b>

    Examples: 
      | a | b |
      | 0 | 1 |
      | 3 | 6 |
      | 5 |120|