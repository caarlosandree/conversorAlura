import services.CalcularQuadrado;
import services.CalcularRetangulo;
import services.CalcularTriangulo;
import services.CalcularCirculo;
import services.ConversorMoedaService;
import services.ConversorTemperaturaPadrao;
import services.TabuadaMultiplicacao;
import interfaces.CalculoArea;
import interfaces.ConversorFinanceiro;
import interfaces.ConversorTemperatura;
import interfaces.Tabuada;
import interfaces.Calculavel;
import interfaces.Vendavel;
import models.Livro;
import models.ProdutoFisico;
import models.Produto;
import models.Servico;
import java.math.BigDecimal;
import java.util.Scanner;

void main() {
    Scanner scanner = new Scanner(System.in);

    BigDecimal cotacao = new BigDecimal("4.97");

    ConversorFinanceiro conversor = new ConversorMoedaService(cotacao);

    System.out.println("\n=== CALCULADORA DE MEDIDAS ===");
    System.out.println("1 - Conversor de Moedas");
    System.out.println("2 - Calculo de Áreas");
    System.out.println("3 - Tabuada");
    System.out.println("4 - Conversor de Temperaturas");
    System.out.println("5 - Cálculo de Preço Final");
    System.out.println("6 - Cálculo de Preço com Venda");
    System.out.println("Escolha uma opção: ");

    int opcao = scanner.nextInt();
    scanner.nextLine(); // limpar buffer

    switch (opcao) {
        case 1 -> {
            System.out.println("Conversor de Moedas");

            ConversorFinanceiro conversorMoeda = new ConversorMoedaService(cotacao);

            System.out.println("\n1 - Converter Dólar para Real\n2 - Converter Real para Dólar\nEscolha uma opção: ");
            int tipoConversao = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o valor: ");
            BigDecimal valor = new BigDecimal(scanner.nextLine().replace(",", "."));
            BigDecimal resultado;

            if (tipoConversao == 1) {
                resultado = conversor.converterDolarParaReal(valor);
                System.out.printf("$%.2f = R$%.2f%n", valor, resultado);
            } else {
                resultado = conversor.converterRealParaDolar(valor);
                System.out.printf("R$%.2f = $%.2f%n", valor, resultado);
            }
        }
        case 2 -> {
            System.out.println("Cálculo de Áreas");
            System.out.println("1 - Retângulo");
            System.out.println("2 - Quadrado");
            System.out.println("3 - Triângulo");
            System.out.println("4 - Círculo");
            System.out.println("Escolha uma opção: ");

            int tipoForma = scanner.nextInt();
            scanner.nextLine();

            CalculoArea calculo = null;

            switch (tipoForma) {
                case 1 -> {
                    calculo = new CalcularRetangulo();
                    System.out.println("Digite a base: ");
                    double base = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Digite a altura: ");
                    double altura = scanner.nextDouble();
                    scanner.nextLine();

                    double area = calculo.calcularArea(base, altura);
                    double perimetro = calculo.calcularPerimetro(base, altura);

                    System.out.printf("Área: %.2f%n", area);
                    System.out.printf("Perímetro: %.2f%n", perimetro);
                }
                case 2 -> {
                    calculo = new CalcularQuadrado();
                    System.out.println("Digite o lado: ");
                    double lado = scanner.nextDouble();
                    scanner.nextLine();

                    double area = calculo.calcularArea(lado, 0);
                    double perimetro = calculo.calcularPerimetro(lado, 0);

                    System.out.printf("Área: %.2f%n", area);
                    System.out.printf("Perímetro: %.2f%n", perimetro);
                }
                case 3 -> {
                    calculo = new CalcularTriangulo();
                    System.out.println("Digite a base: ");
                    double base = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println("Digite a altura: ");
                    double altura = scanner.nextDouble();
                    scanner.nextLine();

                    double area = calculo.calcularArea(base, altura);
                    double perimetro = calculo.calcularPerimetro(base, altura);

                    System.out.printf("Área: %.2f%n", area);
                    System.out.printf("Perímetro: %.2f%n", perimetro);
                }
                case 4 -> {
                    calculo = new CalcularCirculo();
                    System.out.println("Digite o raio: ");
                    double raio = scanner.nextDouble();
                    scanner.nextLine();

                    double area = calculo.calcularArea(raio, 0);
                    double perimetro = calculo.calcularPerimetro(raio, 0);

                    System.out.printf("Área: %.2f%n", area);
                    System.out.printf("Circunferência: %.2f%n", perimetro);
                }
                default -> {
                    System.out.println("Opção inválida");
                }
            }

        }
        case 3 -> {
            System.out.println("Tabuada");
            System.out.println("Digite o número para ver a tabuada: ");
            int numero = scanner.nextInt();
            scanner.nextLine();

            Tabuada tabuada = new TabuadaMultiplicacao(numero);
            tabuada.mostrarTabuada();

        }
        case 4 -> {
            System.out.println("Conversor de Temperaturas");
            System.out.println("1 - Celsius para Fahrenheit\n2 - Fahrenheit para Celsius\nEscolha uma opção: ");
            int tipoConversao = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Digite o valor: ");
            double valor = scanner.nextDouble();
            scanner.nextLine();

            ConversorTemperatura conversorTemp = new ConversorTemperaturaPadrao();

            if (tipoConversao == 1) {
                conversorTemp.celsiusParaFahrenheit(valor);
            } else {
                conversorTemp.fahrenheitParaCelsius(valor);
            }
        }
        case 5 -> {
            System.out.println("Cálculo de Preço Final");
            System.out.println("1 - Livro");
            System.out.println("2 - Produto Físico");
            System.out.println("Escolha uma opção: ");
            int tipoProduto = scanner.nextInt();
            scanner.nextLine();

            Calculavel calculavel;

            if (tipoProduto == 1) {
                System.out.println("Digite o título do livro: ");
                String titulo = scanner.nextLine();
                System.out.println("Digite o autor do livro: ");
                String autor = scanner.nextLine();
                System.out.println("Digite o preço do livro: ");
                double preco = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Digite o desconto (%): ");
                double desconto = scanner.nextDouble();
                scanner.nextLine();

                calculavel = new Livro(titulo, autor, preco, desconto);
                double precoFinal = calculavel.calcularPrecoFinal();
                System.out.printf("Livro: %s - Autor: %s%n", titulo, autor);
                System.out.printf("Preço original: R$%.2f%n", preco);
                System.out.printf("Desconto: %.2f%%%n", desconto);
                System.out.printf("Preço final: R$%.2f%n", precoFinal);
            } else if (tipoProduto == 2) {
                System.out.println("Digite o nome do produto: ");
                String nome = scanner.nextLine();
                System.out.println("Digite o preço do produto: ");
                double preco = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Digite a taxa de envio: ");
                double taxaEnvio = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Digite o imposto (%): ");
                double imposto = scanner.nextDouble();
                scanner.nextLine();

                calculavel = new ProdutoFisico(nome, preco, taxaEnvio, imposto);
                double precoFinal = calculavel.calcularPrecoFinal();
                System.out.printf("Produto: %s%n", nome);
                System.out.printf("Preço base: R$%.2f%n", preco);
                System.out.printf("Taxa de envio: R$%.2f%n", taxaEnvio);
                System.out.printf("Imposto: %.2f%%%n", imposto);
                System.out.printf("Preço final: R$%.2f%n", precoFinal);
            } else {
                System.out.println("Opção inválida");
            }
        }
        case 6 -> {
            System.out.println("Cálculo de Preço com Venda");
            System.out.println("1 - Produto");
            System.out.println("2 - Serviço");
            System.out.println("Escolha uma opção: ");
            int tipoVenda = scanner.nextInt();
            scanner.nextLine();

            Vendavel vendavel;

            if (tipoVenda == 1) {
                System.out.println("Digite o nome do produto: ");
                String nome = scanner.nextLine();
                System.out.println("Digite o preço do produto: ");
                double preco = scanner.nextDouble();
                scanner.nextLine();

                vendavel = new Produto(nome, preco);
                System.out.println("Digite a quantidade: ");
                int quantidade = scanner.nextInt();
                scanner.nextLine();

                double precoTotal = vendavel.calcularPrecoTotal(quantidade);
                System.out.printf("Produto: %s%n", nome);
                System.out.printf("Preço unitário: R$%.2f%n", preco);
                System.out.printf("Quantidade: %d%n", quantidade);
                System.out.printf("Preço total: R$%.2f%n", precoTotal);

                System.out.println("Deseja aplicar desconto? (s/n): ");
                String resposta = scanner.nextLine();
                if (resposta.equalsIgnoreCase("s")) {
                    System.out.println("Digite o percentual de desconto: ");
                    double percentual = scanner.nextDouble();
                    scanner.nextLine();
                    vendavel.aplicarDesconto(percentual);
                    precoTotal = vendavel.calcularPrecoTotal(quantidade);
                    System.out.printf("Preço total com desconto: R$%.2f%n", precoTotal);
                }
            } else if (tipoVenda == 2) {
                System.out.println("Digite a descrição do serviço: ");
                String descricao = scanner.nextLine();
                System.out.println("Digite o preço por hora: ");
                double precoHora = scanner.nextDouble();
                scanner.nextLine();
                System.out.println("Digite a quantidade de horas: ");
                int horas = scanner.nextInt();
                scanner.nextLine();

                vendavel = new Servico(descricao, precoHora, horas);
                System.out.println("Digite a quantidade de serviços: ");
                int quantidade = scanner.nextInt();
                scanner.nextLine();

                double precoTotal = vendavel.calcularPrecoTotal(quantidade);
                System.out.printf("Serviço: %s%n", descricao);
                System.out.printf("Preço por hora: R$%.2f%n", precoHora);
                System.out.printf("Horas: %d%n", horas);
                System.out.printf("Quantidade: %d%n", quantidade);
                System.out.printf("Preço total: R$%.2f%n", precoTotal);

                System.out.println("Deseja aplicar desconto? (s/n): ");
                String resposta = scanner.nextLine();
                if (resposta.equalsIgnoreCase("s")) {
                    System.out.println("Digite o percentual de desconto (máx 50%): ");
                    double percentual = scanner.nextDouble();
                    scanner.nextLine();
                    vendavel.aplicarDesconto(percentual);
                    precoTotal = vendavel.calcularPrecoTotal(quantidade);
                    System.out.printf("Preço total com desconto: R$%.2f%n", precoTotal);
                }
            } else {
                System.out.println("Opção inválida");
            }
        }
        default -> {
            System.out.println("Opção inválida");
        }
    }
    scanner.close();
}