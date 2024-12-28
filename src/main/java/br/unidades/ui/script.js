const unidades = {
    comprimento: ["metros", "centímetros", "quilômetros"],
    massa: ["gramas", "quilogramas", "toneladas", "libras"],
    temperatura: ["Celsius", "Fahrenheit", "Kelvin"],
    potencia: ["watts", "kilowatts", "megawatts"],
    tempo: ["segundos", "minutos", "horas", "dias"],
    velocidade: ["metros por segundo", "quilômetros por hora", "milhas por hora"],
    volume: ["litros", "mililitros", "metros cúbicos"],
    area: ["metros quadrados", "centímetros quadrados", "quilômetros quadrados"]
};

function updateUnits() {
    const categoria = document.getElementById("categoria").value;
    const unidadeEntrada = document.getElementById("unidadeEntrada");
    const unidadeSaida = document.getElementById("unidadeSaida");

    // Atualiza as unidades de entrada e saída conforme a categoria selecionada
    unidadeEntrada.innerHTML = '';
    unidadeSaida.innerHTML = '';

    unidades[categoria].forEach(unidade => {
        const optionEntrada = document.createElement("option");
        optionEntrada.value = unidade;
        optionEntrada.textContent = unidade;
        unidadeEntrada.appendChild(optionEntrada);

        const optionSaida = document.createElement("option");
        optionSaida.value = unidade;
        optionSaida.textContent = unidade;
        unidadeSaida.appendChild(optionSaida);
    });
}

function converter() {
    const categoria = document.getElementById("categoria").value;
    const unidadeEntrada = document.getElementById("unidadeEntrada").value;
    const unidadeSaida = document.getElementById("unidadeSaida").value;
    const valor = parseFloat(document.getElementById("valor").value);
    const resultado = document.getElementById("resultado");

    if (isNaN(valor)) {
        resultado.textContent = 'Por favor, insira um valor válido.';
        return;
    }

    let resultadoConversao = 0;
    let fatorConversao = 1;

    // Conversões para comprimento
    if (categoria === "comprimento") {
        if (unidadeEntrada === "metros" && unidadeSaida === "centímetros") {
            fatorConversao = 100;
        } else if (unidadeEntrada === "metros" && unidadeSaida === "quilômetros") {
            fatorConversao = 0.001;
        } else if (unidadeEntrada === "centímetros" && unidadeSaida === "metros") {
            fatorConversao = 0.01;
        } else if (unidadeEntrada === "centímetros" && unidadeSaida === "quilômetros") {
            fatorConversao = 0.00001;
        } else if (unidadeEntrada === "quilômetros" && unidadeSaida === "metros") {
            fatorConversao = 1000;
        } else if (unidadeEntrada === "quilômetros" && unidadeSaida === "centímetros") {
            fatorConversao = 100000;
        }
    }

    // Conversões para massa
    if (categoria === "massa") {
        if (unidadeEntrada === "gramas" && unidadeSaida === "quilogramas") {
            fatorConversao = 0.001;
        } else if (unidadeEntrada === "gramas" && unidadeSaida === "toneladas") {
            fatorConversao = 0.000001;
        } else if (unidadeEntrada === "gramas" && unidadeSaida === "libras") {
            fatorConversao = 0.00220462;
        } else if (unidadeEntrada === "quilogramas" && unidadeSaida === "gramas") {
            fatorConversao = 1000;
        } else if (unidadeEntrada === "quilogramas" && unidadeSaida === "toneladas") {
            fatorConversao = 0.001;
        } else if (unidadeEntrada === "quilogramas" && unidadeSaida === "libras") {
            fatorConversao = 2.20462;
        } else if (unidadeEntrada === "toneladas" && unidadeSaida === "gramas") {
            fatorConversao = 1000000;
        } else if (unidadeEntrada === "toneladas" && unidadeSaida === "quilogramas") {
            fatorConversao = 1000;
        } else if (unidadeEntrada === "toneladas" && unidadeSaida === "libras") {
            fatorConversao = 2204.62;
        } else if (unidadeEntrada === "libras" && unidadeSaida === "gramas") {
            fatorConversao = 453.592;
        } else if (unidadeEntrada === "libras" && unidadeSaida === "quilogramas") {
            fatorConversao = 0.453592;
        } else if (unidadeEntrada === "libras" && unidadeSaida === "toneladas") {
            fatorConversao = 0.000453592;
        }
    }

    // Conversões para temperatura
    if (categoria === "temperatura") {
        if (unidadeEntrada === "Celsius" && unidadeSaida === "Fahrenheit") {
            resultadoConversao = (valor * 9/5) + 32;
        } else if (unidadeEntrada === "Celsius" && unidadeSaida === "Kelvin") {
            resultadoConversao = valor + 273.15;
        } else if (unidadeEntrada === "Fahrenheit" && unidadeSaida === "Celsius") {
            resultadoConversao = (valor - 32) * 5/9;
        } else if (unidadeEntrada === "Fahrenheit" && unidadeSaida === "Kelvin") {
            resultadoConversao = (valor - 32) * 5/9 + 273.15;
        } else if (unidadeEntrada === "Kelvin" && unidadeSaida === "Celsius") {
            resultadoConversao = valor - 273.15;
        } else if (unidadeEntrada === "Kelvin" && unidadeSaida === "Fahrenheit") {
            resultadoConversao = (valor - 273.15) * 9/5 + 32;
        }
    }

    // Conversões para potência
    if (categoria === "potencia") {
        if (unidadeEntrada === "watts" && unidadeSaida === "kilowatts") {
            fatorConversao = 0.001;
        } else if (unidadeEntrada === "watts" && unidadeSaida === "megawatts") {
            fatorConversao = 0.000001;
        } else if (unidadeEntrada === "kilowatts" && unidadeSaida === "watts") {
            fatorConversao = 1000;
        } else if (unidadeEntrada === "kilowatts" && unidadeSaida === "megawatts") {
            fatorConversao = 0.001;
        } else if (unidadeEntrada === "megawatts" && unidadeSaida === "watts") {
            fatorConversao = 1000000;
        } else if (unidadeEntrada === "megawatts" && unidadeSaida === "kilowatts") {
            fatorConversao = 1000;
        }
    }

    // Conversões para tempo
    if (categoria === "tempo") {
        if (unidadeEntrada === "segundos" && unidadeSaida === "minutos") {
            fatorConversao = 1 / 60;
        } else if (unidadeEntrada === "segundos" && unidadeSaida === "horas") {
            fatorConversao = 1 / 3600;
        } else if (unidadeEntrada === "segundos" && unidadeSaida === "dias") {
            fatorConversao = 1 / 86400;
        } else if (unidadeEntrada === "minutos" && unidadeSaida === "segundos") {
            fatorConversao = 60;
        } else if (unidadeEntrada === "minutos" && unidadeSaida === "horas") {
            fatorConversao = 1 / 60;
        } else if (unidadeEntrada === "minutos" && unidadeSaida === "dias") {
            fatorConversao = 1 / 1440;
        } else if (unidadeEntrada === "horas" && unidadeSaida === "segundos") {
            fatorConversao = 3600;
        } else if (unidadeEntrada === "horas" && unidadeSaida === "minutos") {
            fatorConversao = 60;
        } else if (unidadeEntrada === "horas" && unidadeSaida === "dias") {
            fatorConversao = 1 / 24;
        } else if (unidadeEntrada === "dias" && unidadeSaida === "segundos") {
            fatorConversao = 86400;
        } else if (unidadeEntrada === "dias" && unidadeSaida === "minutos") {
            fatorConversao = 1440;
        } else if (unidadeEntrada === "dias" && unidadeSaida === "horas") {
            fatorConversao = 24;
        }
    }

    // Conversões para velocidade
    if (categoria === "velocidade") {
        if (unidadeEntrada === "metros por segundo" && unidadeSaida === "quilômetros por hora") {
            fatorConversao = 3.6;
        } else if (unidadeEntrada === "metros por segundo" && unidadeSaida === "milhas por hora") {
            fatorConversao = 2.23694;
        } else if (unidadeEntrada === "quilômetros por hora" && unidadeSaida === "metros por segundo") {
            fatorConversao = 1 / 3.6;
        } else if (unidadeEntrada === "quilômetros por hora" && unidadeSaida === "milhas por hora") {
            fatorConversao = 0.621371;
        } else if (unidadeEntrada === "milhas por hora" && unidadeSaida === "metros por segundo") {
            fatorConversao = 0.44704;
        } else if (unidadeEntrada === "milhas por hora" && unidadeSaida === "quilômetros por hora") {
            fatorConversao = 1.60934;
        }
    }

    // Conversões para volume
    if (categoria === "volume") {
        if (unidadeEntrada === "litros" && unidadeSaida === "mililitros") {
            fatorConversao = 1000;
        } else if (unidadeEntrada === "litros" && unidadeSaida === "metros cúbicos") {
            fatorConversao = 0.001;
        } else if (unidadeEntrada === "mililitros" && unidadeSaida === "litros") {
            fatorConversao = 0.001;
        } else if (unidadeEntrada === "mililitros" && unidadeSaida === "metros cúbicos") {
            fatorConversao = 1e-6;
        } else if (unidadeEntrada === "metros cúbicos" && unidadeSaida === "litros") {
            fatorConversao = 1000;
        } else if (unidadeEntrada === "metros cúbicos" && unidadeSaida === "mililitros") {
            fatorConversao = 1000000;
        }
    }

    // Conversões para área
    if (categoria === "area") {
        if (unidadeEntrada === "metros quadrados" && unidadeSaida === "centímetros quadrados") {
            fatorConversao = 10000;
        } else if (unidadeEntrada === "metros quadrados" && unidadeSaida === "quilômetros quadrados") {
            fatorConversao = 1e-6;
        } else if (unidadeEntrada === "centímetros quadrados" && unidadeSaida === "metros quadrados") {
            fatorConversao = 0.0001;
        } else if (unidadeEntrada === "centímetros quadrados" && unidadeSaida === "quilômetros quadrados") {
            fatorConversao = 1e-8;
        } else if (unidadeEntrada === "quilômetros quadrados" && unidadeSaida === "metros quadrados") {
            fatorConversao = 1e6;
        } else if (unidadeEntrada === "quilômetros quadrados" && unidadeSaida === "centímetros quadrados") {
            fatorConversao = 1e8;
        }
    }

    // Exibe o resultado
    if (categoria === "temperatura") {
        resultado.textContent = `${valor} ${unidadeEntrada} = ${resultadoConversao.toFixed(2)} ${unidadeSaida}`;
    } else {
        resultado.textContent = `${valor} ${unidadeEntrada} = ${(valor * fatorConversao).toFixed(2)} ${unidadeSaida}`;
    }
}

// Chama a função para preencher as unidades inicialmente
updateUnits();
