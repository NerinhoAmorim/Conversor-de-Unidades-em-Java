package main.java.br.unidades.area;

public class ConversorDeArea {

	// Método para converter área
	public static double converterArea(int unidadeEntrada, int unidadeSaida, double valor) {
		double valorEmMetrosQuadrados = 0;
		switch (unidadeEntrada) {
		case 1:
			valorEmMetrosQuadrados = valor;
			break;
		case 2:
			valorEmMetrosQuadrados = valor * 10000;
			break;
		case 3:
			valorEmMetrosQuadrados = valor * 1_000_000;
			break;
		case 4:
			valorEmMetrosQuadrados = valor * 0.092903;
			break;
		case 5:
			valorEmMetrosQuadrados = valor * 4046.86;
			break;
		default:
			throw new IllegalArgumentException("Unidade de entrada inválida!");
		}
		// Converter de metros quadrados para a unidade de saída
		switch (unidadeSaida) {
		case 1:
			return valorEmMetrosQuadrados;
		case 2:
			return valorEmMetrosQuadrados / 10000;
		case 3:
			return valorEmMetrosQuadrados / 1_000_000;
		case 4:
			return valorEmMetrosQuadrados / 0.092903;
		case 5:
			return valorEmMetrosQuadrados / 4046.86;
		default:
			throw new IllegalArgumentException("Unidade de saída inválida!");
		}
	}
}
