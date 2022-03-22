Feature: Comprobamos la division


  Scenario Outline: Division de dos numeros
    Given Inicializamos la calculadora
    When Divido <a> entre <b>
    Then El resultado de la division es <c>

    Examples: 
      | a | b | c |
      | 1 | 1 | 1 |
      | 45| 5 | 9 |
      |-14|-2 | 7 |
      
	Scenario: No se puede dividir entre 0
		Given Inicializamos la calculadora
		When Denominador es 0
		Then Lanza una excepcion