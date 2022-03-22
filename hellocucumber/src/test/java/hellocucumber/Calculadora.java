package hellocucumber;

public class Calculadora {

	public double suma(double a, double b) {
		double s = a + b;
		return s;
	}

	public double resta(double a, double b) {
		double r = a - b;
		return r;
	}

	public double mult(double a, double b) {
		double m = a * b;
		return m;
	}

	public double divide(double a, double b) {
		
		if (b == 0) throw new RuntimeException();
		
		double d = a / b;
		return d;
	}

	public int fact(int n) {
		int f = 1;
		
		if (n < 0) throw new RuntimeException(); 
		
		if (n == 0) {
			f = 1;
		}
		
		else {
			while (n != 0) {
				f = f * n;
				n--;
			}

		}
		return f;
	}

	public boolean esPrimo(int n) {
		int contador = 2;
		boolean primo = true;
		while ((primo) && (contador != n)) {
			if (n % contador == 0)
				primo = false;
			contador++;
		}
		return primo;
	}
}
