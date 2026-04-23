# Conversor de Medidas

![Java](https://img.shields.io/badge/Java-17+-orange.svg)
![IDE](https://img.shields.io/badge/IDE-IntelliJ%20IDEA-purple.svg)
![License](https://img.shields.io/badge/License-MIT-blue.svg)
![Status](https://img.shields.io/badge/Status-Study%20Project-green.svg)

Aplicação Java de console para conversões e cálculos diversos, desenvolvida como projeto de estudos da Carreira JAVA da Alura. Oferece funcionalidades de conversão de moedas, cálculo de áreas geométricas, tabuada, conversão de temperaturas e cálculos de preços de produtos e serviços.

## Sobre o Projeto

Este é um projeto educacional criado durante a formação Java da Alura, com o objetivo de praticar conceitos fundamentais da linguagem Java, incluindo:

- Uso de interfaces para abstração e polimorfismo
- Implementação de padrões de projeto básicos
- Manipulação de entrada/saída via console
- Cálculos matemáticos e financeiros com precisão
- Estruturação de código em pacotes (models, services, interfaces)

## Funcionalidades

- **Conversor de Moedas**: Conversão entre Dólar e Real com cotação configurável
- **Cálculo de Áreas**: Cálculo de área e perímetro para retângulo, quadrado, triângulo e círculo
- **Tabuada**: Geração de tabuada de multiplicação para qualquer número
- **Conversor de Temperaturas**: Conversão entre Celsius e Fahrenheit
- **Cálculo de Preço Final**: Cálculo de preço final para livros (com desconto) e produtos físicos (com taxa de envio e imposto)
- **Cálculo de Preço com Venda**: Cálculo de preço total para produtos e serviços, com suporte a descontos

## Tech Stack

- **Linguagem**: Java
- **IDE**: IntelliJ IDEA
- **Build Tool**: N/A (projeto compilado diretamente via IDE)
- **Precisão Numérica**: `BigDecimal` para cálculos financeiros, `double` para cálculos geométricos

## Pré-requisitos

- Java 17 ou superior (recomendado)
- IntelliJ IDEA ou outra IDE compatível com Java
- Terminal ou prompt de comando para execução

## Estrutura do Projeto

```
conversor/
├── src/
│   ├── Main.java              # Ponto de entrada da aplicação
│   ├── interfaces/            # Interfaces para abstração
│   │   ├── Calculavel.java
│   │   ├── CalculoArea.java
│   │   ├── ConversorFinanceiro.java
│   │   ├── ConversorTemperatura.java
│   │   ├── Tabuada.java
│   │   └── Vendavel.java
│   ├── models/                # Classes de modelo
│   │   ├── Livro.java
│   │   ├── Produto.java
│   │   ├── ProdutoFisico.java
│   │   └── Servico.java
│   └── services/              # Implementações das interfaces
│       ├── CalcularCirculo.java
│       ├── CalcularQuadrado.java
│       ├── CalcularRetangulo.java
│       ├── CalcularTriangulo.java
│       ├── ConversorMoedaService.java
│       ├── ConversorTemperaturaPadrao.java
│       └── TabuadaMultiplicacao.java
├── .gitignore
├── conversor.iml
└── README.md
```

## Arquitetura

### Interfaces

O projeto utiliza interfaces para definir contratos e permitir polimorfismo:

- **Calculavel**: Define contrato para cálculo de preço final (implementado por `Livro` e `ProdutoFisico`)
- **CalculoArea**: Define contrato para cálculo de área e perímetro (implementado por formas geométricas)
- **ConversorFinanceiro**: Define contrato para conversão de moedas (implementado por `ConversorMoedaService`)
- **ConversorTemperatura**: Define contrato para conversão de temperaturas (implementado por `ConversorTemperaturaPadrao`)
- **Tabuada**: Define contrato para geração de tabuada (implementado por `TabuadaMultiplicacao`)
- **Vendavel**: Define contrato para cálculo de preço total com desconto (implementado por `Produto` e `Servico`)

### Models

Classes que representam entidades do domínio:

- **Livro**: Representa um livro com título, autor, preço e desconto
- **Produto**: Representa um produto genérico com nome, preço e desconto aplicável
- **ProdutoFisico**: Representa um produto físico com taxa de envio e imposto
- **Servico**: Representa um serviço com descrição, preço por hora e duração

### Services

Classes que implementam a lógica de negócio:

- **ConversorMoedaService**: Realiza conversões entre Dólar e Real usando `BigDecimal` para precisão
- **ConversorTemperaturaPadrao**: Realiza conversões entre Celsius e Fahrenheit
- **CalcularRetangulo/Quadrado/Triangulo/Circulo**: Calculam área e perímetro de formas geométricas
- **TabuadaMultiplicacao**: Gera tabuada de multiplicação para um número

## Como Executar

### Via IntelliJ IDEA

1. Abra o projeto no IntelliJ IDEA
2. Navegue até `src/Main.java`
3. Clique com o botão direito no arquivo e selecione "Run 'Main'"

### Via Terminal

Compile e execute o projeto usando `javac`:

```bash
# Navegue até o diretório src
cd src

# Compile o projeto
javac Main.java interfaces/*.java models/*.java services/*.java

# Execute a aplicação
java Main
```

## Uso

Ao executar a aplicação, você verá um menu com as seguintes opções:

```
=== CALCULADORA DE MEDIDAS ===
1 - Conversor de Moedas
2 - Calculo de Áreas
3 - Tabuada
4 - Conversor de Temperaturas
5 - Cálculo de Preço Final
6 - Cálculo de Preço com Venda
Escolha uma opção:
```

### 1. Conversor de Moedas

- Opção 1: Converter Dólar para Real
- Opção 2: Converter Real para Dólar
- Cotação padrão: USD 1.00 = R$ 4.97 (configurável no código)

### 2. Cálculo de Áreas

- **Retângulo**: Informe base e altura
- **Quadrado**: Informe o lado
- **Triângulo**: Informe base e altura
- **Círculo**: Informe o raio

Retorna área e perímetro/circunferência.

### 3. Tabuada

Informe um número para ver sua tabuada de multiplicação (1 a 10).

### 4. Conversor de Temperaturas

- Opção 1: Celsius para Fahrenheit
- Opção 2: Fahrenheit para Celsius

### 5. Cálculo de Preço Final

- **Livro**: Informe título, autor, preço e desconto (%)
- **Produto Físico**: Informe nome, preço, taxa de envio e imposto (%)

### 6. Cálculo de Preço com Venda

- **Produto**: Informe nome, preço e quantidade. Opção de aplicar desconto.
- **Serviço**: Informe descrição, preço por hora, horas trabalhadas e quantidade. Opção de aplicar desconto (máximo 50%).

## Detalhes de Implementação

### Precisão Financeira

O projeto utiliza `BigDecimal` para operações financeiras (conversão de moedas) para evitar erros de precisão de ponto flutuante. Cálculos geométricos utilizam `double` por simplicidade.

### Validações

- Descontos são validados para estar entre 0% e 100%
- Serviços têm limite máximo de desconto de 50%
- Entradas inválidas lançam `IllegalArgumentException`

### Cotação de Câmbio

A cotação do dólar está hardcoded no `Main.java` como `4.97`. Para alterar, modifique a linha:

```java
BigDecimal cotacao = new BigDecimal("4.97");
```

## Desenvolvimento

### Adicionar Nova Funcionalidade

1. Crie uma interface em `interfaces/` se necessário
2. Implemente a interface em uma classe em `services/` ou `models/`
3. Adicione o caso no `switch` do `Main.java`
4. Adicione a opção no menu inicial

### Exemplo: Adicionar Conversor de Peso

```java
// 1. Interface
package interfaces;
public interface ConversorPeso {
    double quilosParaLibras(double quilos);
    double librasParaQuilos(double libras);
}

// 2. Implementação
package services;
public class ConversorPesoPadrao implements ConversorPeso {
    @Override
    public double quilosParaLibras(double quilos) {
        return quilos * 2.20462;
    }
    
    @Override
    public double librasParaQuilos(double libras) {
        return libras / 2.20462;
    }
}

// 3. Adicionar no Main.java
import services.ConversorPesoPadrao;
import interfaces.ConversorPeso;

// No menu: System.out.println("7 - Conversor de Peso");
// No switch: case 7 -> { ... }
```

## Contribuindo

Este é um projeto de estudos. Sugestões de melhorias:

- Adicionar mais conversores (peso, comprimento, volume)
- Implementar persistência de dados
- Adicionar interface gráfica (JavaFX, Swing)
- Criar testes unitários
- Adicionar arquivo de configuração para cotações
- Implementar logging
- Adicionar internacionalização (i18n)

## Licença

Este projeto foi desenvolvido para fins educacionais como parte da Carreira JAVA da Alura.

## Créditos

Desenvolvido como parte do curso de Java da Alura.
