package org.listaalgoritmos.template;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class RespostaListaExercicio {

	/*
	 * Utilize apenas o método main para testar a implementação dos métodos. Não se
	 * faz necessário implementar dentro do escopo do método.
	 */
	public static void main(String[] args) {
		System.out.println(calcularImc(78f, 1.84f));
		System.out.println(calcularAreaTrapezio(15f, 10f, 30f));
		System.out.println(maiorEntreDoisInteiros(20,90));
		System.out.println(verificarParImpar(50));
		float[] notas = { 20, 15, 13 };
		System.out.println(calcularMediaNotas(notas));
		imprimirArrayInverso(new int[] { 3, 4, 5, 6 });
		imprimirElementosPrimos(new int[] { 1, 2, 3, 4 });
		imprimirElementosImpares(new int[] { 1, 2, 3, 4, 5 });
		imprimirElementosPares(new int[] { 1, 2, 3, 4 });
		imprimirMaiorMenorElemento(new int[] { 1, 2 });
		System.out.println(calcularMediaAritmetica(new int[] { 1, 2, 3 }));
	}

	/**
	 * Método deve calcular o IMC utilizando peso e altura. Como resultado o método
	 * deve retornar uma variável resultado do tipo float.
	 * 
	 * @param peso
	 * @param altura
	 * @return resultado
	 */
	public static float calcularImc(float peso, float altura) {
		float resultado = peso / (altura * altura);
		return resultado;
	}

	/**
	 * Método deve calcular a área do trapézio independente da unidade de medida.
	 * Como resultado, o método deve retornar a área calculada.
	 * 
	 * @param baseMaior
	 * @param baseMenor
	 * @param altura
	 * @return areaTrapezio
	 */
	public static float calcularAreaTrapezio(float baseMaior, float baseMenor, float altura) {
		float areaTrapezio = (baseMaior + baseMenor) * altura / 2;
		return areaTrapezio;
	}

	/**
	 * O método deve calcular o maior entre dois inteiros, que são fornecidos como
	 * argumento do método. O retorno deve ser o maior valor dado como entrada,
	 * sendo do tipo inteiro.
	 * 
	 * @param a
	 * @param b
	 * @return maiorValor
	 */
	public static int maiorEntreDoisInteiros(int a, int b) {
		int maiorValor;
		if (a > b) {
			maiorValor = a;
		} else {
			maiorValor = b;
		}
		return maiorValor;
	}

	/**
	 * Método verifica se o número apresentado como argumento é ímpar ou par. caso
	 * seja par, o retorno do método deve ser verdadeiro. Caso contrário, o valor
	 * retornado deve ser falso.
	 * 
	 * @param numero
	 * @return condicao
	 */
	public static boolean verificarParImpar(int numero) {
		boolean condicao;
		if (numero % 2 == 0) {
			condicao = true;
		} else {
			condicao = false;
		}
		return condicao;
	}

	/**
	 * Método calcula a média aritmetica dos elementos float a partir de um array. O
	 * retorno deve ser o resultado do cálculo da média.
	 * 
	 * @param notas
	 * @return media
	 */
	public static float calcularMediaNotas(float[] notas) {
		float soma = 0;
		for (int i = 0; i < notas.length; i++) {
			soma += notas[i];
		}
		float media = soma / notas.length;
		return media;
	}

	/**
	 * Método imprime array de inteiros no sentido inverso, separando os elementos
	 * por vírgula. O último elemento impresso não deve preceder vírgula. Use o
	 * System.out.print() para imprimir os valores. Os elementos devem ser impresso
	 * numa única linha.
	 * 
	 * @param array
	 */
	public static void imprimirArrayInverso(int[] array) {
		for (int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i]);
			if (i > 0) {
				System.out.print(",");
			}
		}
		System.out.println();
	}

	/**
	 * Método deve imprimir os elementos primos de um array de inteiros. O formato
	 * da impressão deve ser feito numa única linha, utilizando espaço em branco ("
	 * ") entre os elementos e após o último elemento. Utilize System.out.print()
	 * 
	 * @param array
	 */
	public static void imprimirElementosPrimos(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 2) {
				System.out.print(array[i] + " ");
			} else if (array[i] > 2) {
				boolean isarray = true;
				for (int j = 2; j < array[i]; j++) {
					if (array[i] % j == 0) {
						isarray = false;
						break;
					}
				}
				if (isarray) {
					System.out.print(array[i] + " ");
				}
			}
		}
		System.out.println();
	}

	/**
	 * Método deve imprimir os elementos ímpares de um array de inteiros. O formato
	 * da impressão deve ser feito numa única linha, utilizando espaço em branco ("
	 * ") entre os elementos e após o último elemento. Utilize System.out.print()
	 * 
	 * @param array
	 */
	public static void imprimirElementosImpares(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();
	}

	/**
	 * Método deve imprimir os elementos pares de um array de inteiros. O formato da
	 * impressão deve ser feito numa única linha, utilizando espaço em branco (" ")
	 * entre os elementos e após o último elemento. Utilize System.out.print()
	 * 
	 * @param array
	 */
	public static void imprimirElementosPares(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i] + " ");
			}
		}
		System.out.println();
	}

	/**
	 * Método deve imprimir o maior e o menor elemento de um array de inteiros. O
	 * formato da impressão deve ser feito numa única linha, utilizando espaço em
	 * branco (" ") entre os elementos e após o último elemento. Utilize
	 * System.out.print()
	 * 
	 * @param array
	 */
	public static void imprimirMaiorMenorElemento(int[] array) {
		int maior = array[0];
		int menor = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > maior) {
				maior = array[i];
			}
			if (array[i] < menor) {
				menor = array[i];
			}
		}
		System.out.print(maior + " " + menor + " ");
		System.out.println();
	}

	/**
	 * O método calcula a média aritmética dos elementos de um array de inteiros.
	 * Como resultado, o valor da média deve ser retornado no método.
	 * 
	 * @param array
	 * @return media
	 */
	public static float calcularMediaAritmetica(int[] array) {
		int soma = 0;
		for (int i = 0; i < array.length; i++) {
			soma += array[i];
		}
		float media = (float) soma / array.length;
		return media;
	}

}