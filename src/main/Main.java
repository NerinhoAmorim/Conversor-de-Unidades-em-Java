package main;

import java.util.Scanner;

import main.java.br.unidades.area.ConversorDeArea;
import main.java.br.unidades.comprimento.ConversorDeComprimento;
import main.java.br.unidades.dados.ConversorDeDados;
import main.java.br.unidades.massa.ConversorDeMassa;
import main.java.br.unidades.potencia.ConversorDePotencia;
import main.java.br.unidades.temperatura.ConversorDeTemperatura;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int opcao;
		do {
			System.out.println("\n==== Bem vindo(a) ao Sistema de Conversão de Medidas ====");
			System.out.println("Escolha uma opção:");
			System.out.println("1. Conversor de Área");
			System.out.println("2. Conversor de Comprimento");
			System.out.println("3. Conversor de Dados");
			System.out.println("4. Conversor de Massa");
			System.out.println("5. Conversor de Potência");
			System.out.println("6. Conversor de Temperatura");
			System.out.println("7. Conversor de Tempo");
			System.out.println("8. Conversor de Velocidade");
			System.out.println("9. Conversor de Volume");
			System.out.println("0. Sair");
			opcao = scanner.nextInt();
			switch (opcao) {
			case 1:
				chamarConversorDeArea(scanner);
				break;
			case 2:
				chamarConversorDeComprimento(scanner);
				break;
			case 3:
				chamarConversorDeDados(scanner);
				break;
			case 4:
				chamarConversorDeMassa(scanner);
				break;
			case 5:
				chamarConversorDePotencia(scanner);
				break;
			case 6:
				chamarConversorDeTemperatura(scanner);
				break;
			case 7:
				chamarConversorDeTempo(scanner);
				break;
			case 8:
				chamarConversorDeVelocidade(scanner);
				break;
			case 9:
				chamarConversorDeVolume(scanner);
				break;
			case 0:
				System.out.println("Saindo...");
				break;
			default:
				System.out.println("Opção inválida. Tente novamente.");
			}
		} while (opcao != 0);
	}

	// Conversor de área
	private static void chamarConversorDeArea(Scanner scanner) {
		System.out.println("=== Conversor de Área ===");
		System.out.println("Escolha a unidade de entrada:");
		System.out.println("1. Metros quadrados (m²)");
		System.out.println("2. Hectares (ha)");
		System.out.println("3. Quilômetros quadrados (km²)");
		System.out.println("4. Pés quadrados (ft²)");
		System.out.println("5. Acres (ac)");
		int unidadeEntrada = scanner.nextInt();
		System.out.print("Digite o valor da área: ");
		double valorEntrada = scanner.nextDouble();
		System.out.println("Escolha a unidade de saída:");
		System.out.println("1. Metros quadrados (m²)");
		System.out.println("2. Hectares (ha)");
		System.out.println("3. Quilômetros quadrados (km²)");
		System.out.println("4. Pés quadrados (ft²)");
		System.out.println("5. Acres (ac)");
		int unidadeSaida = scanner.nextInt();
		try {
			double valorConvertido = ConversorDeArea.converterArea(unidadeEntrada, unidadeSaida, valorEntrada);
			System.out.printf("Resultado: %.2f%n", valorConvertido);
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	// Conversor de comprimento
	private static void chamarConversorDeComprimento(Scanner scanner) {
		System.out.println("=== Conversor de Comprimento ===");
		System.out.println("Escolha a unidade de entrada:");
		System.out.println("1. Metros (m)");
		System.out.println("2. Quilômetros (km)");
		System.out.println("3. Milhas (mi)");
		System.out.println("4. Jardas (yd)");
		System.out.println("5. Pés (ft)");
		int unidadeEntrada = scanner.nextInt();
		System.out.print("Digite o valor: ");
		double valorEntrada = scanner.nextDouble();
		System.out.println("Escolha a unidade de saída:");
		System.out.println("1. Metros (m)");
		System.out.println("2. Quilômetros (km)");
		System.out.println("3. Milhas (mi)");
		System.out.println("4. Jardas (yd)");
		System.out.println("5. Pés (ft)");
		int unidadeSaida = scanner.nextInt();
		try {
			double resultado = ConversorDeComprimento.converterComprimento(unidadeEntrada, unidadeSaida, valorEntrada);
			System.out.printf("Resultado: %.2f%n", resultado);
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	// Conversor de dados
	private static void chamarConversorDeDados(Scanner scanner) {
		System.out.println("=== Conversor de Dados ===");
		System.out.println("Escolha a unidade de entrada:");
		System.out.println("1. Bits");
		System.out.println("2. Bytes");
		System.out.println("3. Kilobytes (KB)");
		System.out.println("4. Megabytes (MB)");
		System.out.println("5. Gigabytes (GB)");
		int unidadeEntrada = scanner.nextInt();
		System.out.print("Digite o valor: ");
		double valorEntrada = scanner.nextDouble();
		System.out.println("Escolha a unidade de saída:");
		System.out.println("1. Bits");
		System.out.println("2. Bytes");
		System.out.println("3. Kilobytes (KB)");
		System.out.println("4. Megabytes (MB)");
		System.out.println("5. Gigabytes (GB)");
		int unidadeSaida = scanner.nextInt();
		try {
			double resultado = ConversorDeDados.converterDados(unidadeEntrada, unidadeSaida, valorEntrada);
			System.out.printf("Resultado: %.2f%n", resultado);
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	// Conversor de Massa
	private static void chamarConversorDeMassa(Scanner scanner) {
		System.out.println("=== Conversor de Massa ===");
		System.out.println("Escolha a unidade de entrada:");
		System.out.println("1. Gramas (g)");
		System.out.println("2. Quilogramas (kg)");
		System.out.println("3. Toneladas (t)");
		System.out.println("4. Libras (lb)");
		System.out.println("5. Onças (oz)");
		int unidadeEntrada = scanner.nextInt();
		System.out.print("Digite o valor: ");
		double valorEntrada = scanner.nextDouble();
		System.out.println("Escolha a unidade de saída:");
		System.out.println("1. Gramas (g)");
		System.out.println("2. Quilogramas (kg)");
		System.out.println("3. Toneladas (t)");
		System.out.println("4. Libras (lb)");
		System.out.println("5. Onças (oz)");
		int unidadeSaida = scanner.nextInt();
		try {
			double resultado = ConversorDeMassa.converterMassa(unidadeEntrada, unidadeSaida, valorEntrada);
			System.out.printf("Resultado: %.2f%n", resultado);
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	// Conversor de Potência
	private static void chamarConversorDePotencia(Scanner scanner) {
		System.out.println("=== Conversor de Potência ===");
		System.out.println("Escolha a unidade de entrada:");
		System.out.println("1. Watts (W)");
		System.out.println("2. Quilowatts (kW)");
		System.out.println("3. Cavalos de potência (HP)");
		int unidadeEntrada = scanner.nextInt();
		System.out.print("Digite o valor: ");
		double valorEntrada = scanner.nextDouble();
		System.out.println("Escolha a unidade de saída:");
		System.out.println("1. Watts (W)");
		System.out.println("2. Quilowatts (kW)");
		System.out.println("3. Cavalos de potência (HP)");
		int unidadeSaida = scanner.nextInt();
		try {
			double resultado = ConversorDePotencia.converterPotencia(unidadeEntrada, unidadeSaida, valorEntrada);
			System.out.printf("Resultado: %.2f%n", resultado);
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
	//Conversor de Temperatura
	private static void chamarConversorDeTemperatura(Scanner scanner) {
		System.out.println("=== Conversor de Temperatura ===");
		System.out.println("Escolha a unidade de entrada:");
		System.out.println("1. Celsius (°C)");
		System.out.println("2. Fahrenheit (°F)");
		System.out.println("3. Kelvin (K)");
		int unidadeEntrada = scanner.nextInt();
		System.out.print("Digite o valor: ");
		double valorEntrada = scanner.nextDouble();
		System.out.println("Escolha a unidade de saída:");
		System.out.println("1. Celsius (°C)");
		System.out.println("2. Fahrenheit (°F)");
		System.out.println("3. Kelvin (K)");
		int unidadeSaida = scanner.nextInt();
		try {
			double resultado = ConversorDeTemperatura.converterTemperatura(unidadeEntrada, unidadeSaida, valorEntrada);
			System.out.printf("Resultado: %.2f%n", resultado);
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	private static void chamarConversorDeTempo(Scanner scanner) {
		System.out.println("=== Conversor de Tempo ===");
		System.out.println("Escolha a unidade de entrada:");
		System.out.println("1. Segundos");
		System.out.println("2. Minutos");
		System.out.println("3. Horas");
		System.out.println("4. Dias");

		int unidadeEntrada = scanner.nextInt();

		System.out.print("Digite o valor: ");
		double valorEntrada = scanner.nextDouble();

		System.out.println("Escolha a unidade de saída:");
		System.out.println("1. Segundos");
		System.out.println("2. Minutos");
		System.out.println("3. Horas");
		System.out.println("4. Dias");

		int unidadeSaida = scanner.nextInt();

		try {
			double resultado = ConversorDeTempo.converterTempo(unidadeEntrada, unidadeSaida, valorEntrada);
			System.out.printf("Resultado: %.2f%n", resultado);
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	private static void chamarConversorDeVelocidade(Scanner scanner) {
		System.out.println("=== Conversor de Velocidade ===");
		System.out.println("Escolha a unidade de entrada:");
		System.out.println("1. Metros por segundo (m/s)");
		System.out.println("2. Quilômetros por hora (km/h)");
		System.out.println("3. Milhas por hora (mph)");

		int unidadeEntrada = scanner.nextInt();

		System.out.print("Digite o valor: ");
		double valorEntrada = scanner.nextDouble();

		System.out.println("Escolha a unidade de saída:");
		System.out.println("1. Metros por segundo (m/s)");
		System.out.println("2. Quilômetros por hora (km/h)");
		System.out.println("3. Milhas por hora (mph)");

		int unidadeSaida = scanner.nextInt();

		try {
			double resultado = ConversorDeVelocidade.converterVelocidade(unidadeEntrada, unidadeSaida, valorEntrada);
			System.out.printf("Resultado: %.2f%n", resultado);
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

	private static void chamarConversorDeVolume(Scanner scanner) {
		System.out.println("=== Conversor de Volume ===");
		System.out.println("Escolha a unidade de entrada:");
		System.out.println("1. Litros (L)");
		System.out.println("2. Mililitros (mL)");
		System.out.println("3. Metros cúbicos (m³)");
		System.out.println("4. Galões (gal)");

		int unidadeEntrada = scanner.nextInt();

		System.out.print("Digite o valor: ");
		double valorEntrada = scanner.nextDouble();

		System.out.println("Escolha a unidade de saída:");
		System.out.println("1. Litros (L)");
		System.out.println("2. Mililitros (mL)");
		System.out.println("3. Metros cúbicos (m³)");
		System.out.println("4. Galões (gal)");

		int unidadeSaida = scanner.nextInt();

		try {
			double resultado = ConversorDeVolume.converterVolume(unidadeEntrada, unidadeSaida, valorEntrada);
			System.out.printf("Resultado: %.2f%n", resultado);
		} catch (IllegalArgumentException e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}

}
