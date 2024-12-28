package main.java.br.unidades.dados;

public class ConversorDeDados {

	public static double converterDados(int unidadeEntrada, int unidadeSaida, double valorEntrada) {
		// Converte a unidade de entrada para bits como base
		double valorEmBits = 0;
		switch (unidadeEntrada) {
		case 1:
			valorEmBits = valorEntrada;
			break;
		case 2:
			valorEmBits = valorEntrada * 8;
			break;
		case 3:
			valorEmBits = valorEntrada * 8 * 1024;
			break;
		case 4:
			valorEmBits = valorEntrada * 8 * 1024 * 1024;
			break;
		case 5:
			valorEmBits = valorEntrada * 8 * 1024 * 1024 * 1024;
			break;
		case 6:
			valorEmBits = valorEntrada * 8 * 1024 * 1024 * 1024 * 1024;
			break;
		default:
			throw new IllegalArgumentException("Unidade de entrada inválida!");
		}
		// Converte de bits para a unidade de saída
		switch (unidadeSaida) {
		case 1:
			return valorEmBits;
		case 2:
			return valorEmBits / 8;
		case 3:
			return valorEmBits / (8 * 1024);
		case 4:
			return valorEmBits / (8 * 1024 * 1024);
		case 5:
			return valorEmBits / (8 * 1024 * 1024 * 1024);
		case 6:
			return valorEmBits / (8 * 1024 * 1024 * 1024 * 1024);
		default:
			throw new IllegalArgumentException("Unidade de saída inválida!");
		}
	}

}
