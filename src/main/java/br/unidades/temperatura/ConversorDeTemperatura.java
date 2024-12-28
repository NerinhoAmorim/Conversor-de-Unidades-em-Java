package main.java.br.unidades.temperatura;

public class ConversorDeTemperatura {

	public static double converterTemperatura(int unidadeEntrada, int unidadeSaida, double valorEntrada) {
		double valorEmCelsius = 0;

		// Converte a unidade de entrada para Celsius (°C)
		switch (unidadeEntrada) {
		case 0:
			valorEmCelsius = valorEntrada;
			break;
		case 1:
			valorEmCelsius = (valorEntrada - 32) * 5 / 9;
			break;
		case 2:
			valorEmCelsius = valorEntrada - 273.15;
			break;
		default:
			throw new IllegalArgumentException("Unidade de entrada inválida!");
		}

		// Converte de Celsius para a unidade de saída
		switch (unidadeSaida) {
		case 0:
			return valorEmCelsius;
		case 1:
			return (valorEmCelsius * 9 / 5) + 32;
		case 2:
			return valorEmCelsius + 273.15;
		default:
			throw new IllegalArgumentException("Unidade de saída inválida!");
		}
	}
}
