package main.java.br.unidades.tempo;

public class ConversorDeTempo {

	public static double converterTempo(int unidadeEntrada, int unidadeSaida, double valorEntrada) {
		double valorEmSegundos = 0;

		// Converte a unidade de entrada para segundos (s)
		switch (unidadeEntrada) {
		case 0:
			valorEmSegundos = valorEntrada;
			break;
		case 1:
			valorEmSegundos = valorEntrada * 60;
			break;
		case 2:
			valorEmSegundos = valorEntrada * 3600;
			break;
		case 3:
			valorEmSegundos = valorEntrada * 86400;
			break;
		default:
			throw new IllegalArgumentException("Unidade de entrada inválida!");
		}

		// Converte de segundos para a unidade de saída
		switch (unidadeSaida) {
		case 0:
			return valorEmSegundos;
		case 1:
			return valorEmSegundos / 60;
		case 2:
			return valorEmSegundos / 3600;
		case 3:
			return valorEmSegundos / 86400;
		default:
			throw new IllegalArgumentException("Unidade de saída inválida!");
		}
	}
}
