package main.java.br.unidades.volume;

public class ConversorDeVolume {

	public static double converterVolume(int unidadeEntrada, int unidadeSaida, double valorEntrada) {
		double valorEmLitros = 0;

		// Converte a unidade de entrada para litros (L)
		switch (unidadeEntrada) {
		case 0:
			valorEmLitros = valorEntrada;
			break;
		case 1:
			valorEmLitros = valorEntrada / 1000;
			break;
		case 2:
			valorEmLitros = valorEntrada * 3.78541;
			break;
		case 3:
			valorEmLitros = valorEntrada * 28.3168;
			break;
		default:
			throw new IllegalArgumentException("Unidade de entrada inválida!");
		}

		// Converte de litros para a unidade de saída
		switch (unidadeSaida) {
		case 0:
			return valorEmLitros;
		case 1:
			return valorEmLitros * 1000;
		case 2:
			return valorEmLitros / 3.78541;
		case 3:
			return valorEmLitros / 28.3168;
		default:
			throw new IllegalArgumentException("Unidade de saída inválida!");
		}
	}
}
