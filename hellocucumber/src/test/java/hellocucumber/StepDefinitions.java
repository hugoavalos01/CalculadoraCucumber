package hellocucumber;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Assertions.*;

public class StepDefinitions {
	private double r;
	private String sol = "false";
	private int result;
	
	private Calculadora c;
	
	@Given("Inicializamos la calculadora")
	public void init() {
		c = new Calculadora();
	}
	
	//Suma
	@When("Sumo {double} y {double}")
	public void suma(double a, double b) {
		r = c.suma(a, b);
	}
	
	@Then("El resultado de la suma es {double}")
	public void resultadoSuma(double s) {
		assertEquals(s, r);
	}
	
	//Resta
	@When("Resto {double} y {double}")
	public void resta(double a, double b) {
		r = c.resta(a, b);
	}
	
	@Then("El resultado de la resta es {double}")
	public void resultadoResta(double s) {
		assertEquals(s, r);
	}
	
	//Multiplicacion
	@When("Multiplico {double} y {double}")
	public void mult(double a, double b) {
		r = c.mult(a, b);
	}
	
	@Then("El resultado de la multiplicacion es {double}")
	public void resultadoMult(double s) {
		assertEquals(s, r);
	}
	
	//Division
	@When("Divido {double} entre {double}")
	public void div(double a, double b) {
		r = c.divide(a, b);
	}
	
	@Then("El resultado de la division es {double}")
	public void resultadoDiv(double s) {
		assertEquals(s, r);
	}
	
	@When("Denominador es 0")
	public void div0() {
		
	}
	
	@Then("Lanza una excepcion")
	public void Excepcion() {
		Assertions.assertThrows(RuntimeException.class, () -> {c.divide(2, 0);});
	}
	
	//Factorial
	@When("Calculo el factorial de {int}")
	public void fact(int a) {
		result = c.fact(a);
	}
	@Then("El factorial es {int}")
	public void resultadoFact(int s) {
		assertEquals(s, result);
	}
	
	//Es primo
	@When("Veo si {int} es primo")
	public void esPrimo(int a) {
		if(c.esPrimo(a)) {
			sol = "true";
		}
	}
	
	@Then("El resultado es {string}")
	public void resultadoPrimo(String s) {
		assertEquals(s, sol);
	}
	
	
}
