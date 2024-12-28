package main.java.br.unidades.velocidade;

	public class ConversorDeVelocidade {

	    public static double converterVelocidade(int unidadeEntrada, int unidadeSaida, double valorEntrada) {
	        double valorEmMetroPorSegundo = 0;

	        // Converte a unidade de entrada para metros por segundo (m/s) 
	        switch (unidadeEntrada) {
	            case 0: 
	                valorEmMetroPorSegundo = valorEntrada;
	                break;
	            case 1: 
	                valorEmMetroPorSegundo = valorEntrada / 3.6;
	                break;
	            case 2: 
	                valorEmMetroPorSegundo = valorEntrada * 0.44704;
	                break;
	            case 3: 
	                valorEmMetroPorSegundo = valorEntrada * 0.514444;
	                break;
	            default:
	                throw new IllegalArgumentException("Unidade de entrada inválida!");
	        }

	        // Converte de metros por segundo para a unidade de saída u
	        switch (unidadeSaida) {
	            case 0: 
	                return valorEmMetroPorSegundo;
	            case 1: 
	                return valorEmMetroPorSegundo * 3.6;
	            case 2: 
	                return valorEmMetroPorSegundo / 0.44704;
	            case 3: 
	                return valorEmMetroPorSegundo / 0.514444;
	            default:
	                throw new IllegalArgumentException("Unidade de saída inválida!");
	        }
	    }
	}
