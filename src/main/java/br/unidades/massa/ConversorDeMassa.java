package main.java.br.unidades.massa;

public class ConversorDeMassa {

	public static double converterMassa(int unidadeEntrada, int unidadeSaida, double valorEntrada) {
		double valorEmKg = 0;

		// Converte a unidade de entrada para kg usando switch
		switch (unidadeEntrada) {
		case 0:
			valorEmKg = valorEntrada;
			break;
		case 1:
			valorEmKg = valorEntrada / 1000;
			break;
		case 2:
			valorEmKg = valorEntrada / 1000000;
			break;
		case 3:
			valorEmKg = valorEntrada * 1000;
			break;
		case 4:
			valorEmKg = valorEntrada / 2.20462;
			break;
		case 5:
			valorEmKg = valorEntrada / 35.274;
			break;
		default:
			throw new IllegalArgumentException("Unidade de entrada inválida!");
		}
		// Converte de kg para a unidade de saída usando switch
		switch (unidadeSaida) {
		case 0:
			return valorEmKg;
		case 1:
			return valorEmKg * 1000;
		case 2:
			return valorEmKg * 1000000;
		case 3:
			return valorEmKg / 1000;
		case 4:
			return valorEmKg * 2.20462;
		case 5:
			return valorEmKg * 35.274;
		default:
			throw new IllegalArgumentException("Unidade de saída inválida!");
		}
	}
}
