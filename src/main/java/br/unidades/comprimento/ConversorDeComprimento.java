package main.java.br.unidades.comprimento;

public class ConversorDeComprimento {

	public static double converterComprimento(int unidadeEntrada, int unidadeSaida, double valorEntrada) {
		// Converte a unidade de entrada para metros como base
		double valorEmMetros = 0;
		switch (unidadeEntrada) {
		case 1:
			valorEmMetros = valorEntrada;
			break;
		case 2:
			valorEmMetros = valorEntrada * 1000;
			break;
		case 3:
			valorEmMetros = valorEntrada * 1609.34;
			break;
		case 4:
			valorEmMetros = valorEntrada * 0.9144;
			break;
		case 5:
			valorEmMetros = valorEntrada * 0.3048;
			break;
		default:
			throw new IllegalArgumentException("Unidade de entrada inválida!");
		}
		// Converte de metros para a unidade de saída
		switch (unidadeSaida) {
		case 1:
			return valorEmMetros;
		case 2:
			return valorEmMetros / 1000;
		case 3:
			return valorEmMetros / 1609.34;
		case 4:
			return valorEmMetros / 0.9144;
		case 5:
			return valorEmMetros / 0.3048;
		default:
			throw new IllegalArgumentException("Unidade de saída inválida!");
		}
	}

}
