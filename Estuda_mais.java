package simples;

import java.util.Scanner;

public class Estuda_mais {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		if (simOuNao()) {
			System.out.println(simOuNao());
			int a[] = arrayzin();
			int maior = 0;
			for (int i = 0; i < a.length; i++) {
				if (a[i] > maior) {
					maior = a[i];
				}
			}

			System.out.println("O maior = " + maior);
		}

	}

	public static int[] arrayzin() {
		int a[] = new int[9];
		for (int i = 0; i < a.length; i++) {
			a[i] = i;
		}
		return a;
	}

	public static boolean simOuNao() {
		boolean s = true;
		boolean n = false;
		int a;
		int b;
		System.out.println("informe 2 numeros");
		a = sc.nextInt();
		b = sc.nextInt();

		if ((a + b) % 2 == 0) {
			return s;
		} else {
			return n;
		}
	}

}

// cai array
// boolean
// if else
// percorrer array
// par e impa ou algo dotipo