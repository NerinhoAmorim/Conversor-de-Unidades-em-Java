package main.java.br.unidades.potencia;

public class ConversorDePotencia {

    public static double converterPotencia(int unidadeEntrada, int unidadeSaida, double valorEntrada) {
        double valorEmWatts = 0;

        // Converte a unidade de entrada para watts (W) 
        switch (unidadeEntrada) {
            case 0: 
                valorEmWatts = valorEntrada;
                break;
            case 1: 
                valorEmWatts = valorEntrada * 1000;
                break;
            case 2: 
                valorEmWatts = valorEntrada * 1000000;
                break;
            case 3: 
                valorEmWatts = valorEntrada * 735.49875;
                break;
            default:
                throw new IllegalArgumentException("Unidade de entrada inválida!");
        }
        // Converte de watts para a unidade de saída usando switch
        switch (unidadeSaida) {
            case 0: 
                return valorEmWatts;
            case 1:
                return valorEmWatts / 1000;
            case 2: 
                return valorEmWatts / 1000000;
            case 3: 
                return valorEmWatts / 735.49875;
            default:
                throw new IllegalArgumentException("Unidade de saída inválida!");
        }
    }
}

