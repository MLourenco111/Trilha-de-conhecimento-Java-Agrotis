package agro.curso.javaBasico.controle_decisao_loop.controleDecisao;

import java.util.Scanner;

public class ExerciciosAulaTresIfElse {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        vigesimoTerceiro();
    }

    public static void primeiro() {
        System.out.println("Digite um número:");
        int primeiroNumero = scan.nextInt();
        System.out.println("Digite um número:");
        int segundoNumero = scan.nextInt();

        if (primeiroNumero > segundoNumero) {
            System.out.println("O " + primeiroNumero + " é maior que " + segundoNumero);
        } else if (segundoNumero > primeiroNumero) {
            System.out.println("O " + segundoNumero + " é maior que " + primeiroNumero);

        } else {
            System.out.println("Os números são iguais.");
        }
    }

    public static void segundo() {
        System.out.println("Digite um número:");
        int numero = scan.nextInt();
        if (numero < 0) {
            System.out.println("Número negativo.");
        } else {
            System.out.println("Número positivo.");
        }
    }

    public static void terceiro() {
        System.out.println("Digite o seu sexo (F ou M): ");
        String sexo = scan.next();
        if (sexo.equalsIgnoreCase("m")) {
            System.out.println("Sexo masculino.");
        } else if (sexo.equalsIgnoreCase("f")) {
            System.out.println("Sexo feminino.");
        } else {
            System.out.println("sexo inválido.");
        }
    }

    public static void quarto() {
        System.out.println("Digite uma letra: ");
        String letra = scan.next();
        if (letra.length() > 1) {
            System.out.println("Não é uma letra");
        } else {
            switch (letra) {
                case "a":
                case "A":
                case "e":
                case "E":
                case "i":
                case "I":
                case "o":
                case "O":
                case "u":
                case "U":
                    System.out.println("A letra é uma vogal");
                    break;
                default:
                    System.out.println("A letra é uma consoante.");
            }

            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i")
                            || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
                System.out.println("vogal");
            } else {
                System.out.println("consoante");
            }
        }
    }

    public static void quinto() throws Exception {
        System.out.println("Digite a primeira nota:");
        double primeiraNota = scan.nextDouble();
        System.out.println("Digite a segunda nota:");
        double segundaNota = scan.nextDouble();

        if (primeiraNota < 0 || primeiraNota > 10 || segundaNota < 0 || segundaNota > 10) {
            throw new Exception("Nota inválida");
        }

        double media = (primeiraNota + segundaNota) / 2;
        System.out.println("Sua média foi " + media);
        if (media < 7) {
            System.out.println("Reprovado");
        } else if (media == 10) {
            System.out.println("Aprovado com Distinção");
        } else {
            System.out.println("Aprovado");
        }
    }

    public static void sexto() {
        System.out.println("Digite o primeiro número:m número");
        int primeiroNumero = scan.nextInt();
        System.out.println("Digite o segundo número:");
        int segundoNumero = scan.nextInt();
        System.out.println("Digite o terceiro número:");
        int terceiroNumero = scan.nextInt();

        if (primeiroNumero >= segundoNumero && primeiroNumero >= terceiroNumero) {
            System.out.println("O primeiro número é o maior: " + primeiroNumero);
        } else if (segundoNumero >= primeiroNumero && segundoNumero >= terceiroNumero) {
            System.out.println("O  segundo número é o maior: " + segundoNumero);
        } else if (terceiroNumero >= primeiroNumero && terceiroNumero >= segundoNumero) {
            System.out.println("O terceiro número é o maior: " + terceiroNumero);
        }

    }

    public static void setimo() {
        System.out.println("Digite o primeiro número:");
        int primeiroNumero = scan.nextInt();
        System.out.println("Digite o segundo número:");
        int segundoNumero = scan.nextInt();
        System.out.println("Digite o terceiro número:");
        int terceiroNumero = scan.nextInt();

        if (primeiroNumero >= segundoNumero && primeiroNumero >= terceiroNumero) {
            System.out.println("O primeiro número é o maior: " + primeiroNumero);
        } else if (segundoNumero >= primeiroNumero && segundoNumero >= terceiroNumero) {
            System.out.println("O  segundo número é o maior: " + segundoNumero);
        } else if (terceiroNumero >= primeiroNumero && terceiroNumero >= segundoNumero) {
            System.out.println("O terceiro número é o maior: " + terceiroNumero);
        }
        if (primeiroNumero <= segundoNumero && primeiroNumero <= terceiroNumero) {
            System.out.println("O primeiro número é o menor: " + primeiroNumero);
        } else if (segundoNumero <= primeiroNumero && segundoNumero <= terceiroNumero) {
            System.out.println("O  segundo número é o menor: " + segundoNumero);
        } else if (terceiroNumero <= primeiroNumero && terceiroNumero <= segundoNumero) {
            System.out.println("O terceiro número é o menor: " + terceiroNumero);
        }

    }

    public static void oitavo() {
        System.out.println("Digite o primeiro valor:");
        double primeiroValor = scan.nextDouble();
        System.out.println("Digite o segundo valor:");
        double segundoValor = scan.nextDouble();
        System.out.println("Digite o terceiro valor:");
        double terceiroValor = scan.nextDouble();

        if (primeiroValor < segundoValor && primeiroValor < segundoValor) {
            System.out.println("Você deve comprar o primeiro produto");
        } else if (segundoValor < primeiroValor && segundoValor < terceiroValor) {
            System.out.println("Você deve comprar o segundo produto");
        } else if (terceiroValor < primeiroValor && terceiroValor < segundoValor) {
            System.out.println("Você deve comprar o terceiro produto");
        } else {
            System.out.println("Se o valor dos produm númerotos for igual, vá conforme seu gosto pessoal.");
        }
    }

    public static void nono() {
        System.out.println("Digite o primeiro número:");
        int primeiroNumero = scan.nextInt();
        System.out.println("Digite o segundo número:");
        int segundoNumero = scan.nextInt();
        System.out.println("Digite o terceiro número:");
        int terceiroNumero = scan.nextInt();
        int auxiliar;
        if (primeiroNumero <= segundoNumero) {
            auxiliar = segundoNumero;
            segundoNumero = primeiroNumero;
            primeiroNumero = auxiliar;
        }
        if (segundoNumero <= terceiroNumero) {
            auxiliar = terceiroNumero;
            terceiroNumero = segundoNumero;
            segundoNumero = auxiliar;
        }
        if (segundoNumero >= primeiroNumero) {
            auxiliar = segundoNumero;
            segundoNumero = primeiroNumero;
            primeiroNumero = auxiliar;
        }

        System.out.println(primeiroNumero);
        System.out.println(segundoNumero);
        System.out.println(terceiroNumero);
    }

    public static void decimo() {
        System.out.println("M - matutino / V- vespertino / N - Noturno");
        System.out.println("Digite o turno que você estuda: ");
        String turno = scan.next();

        if (turno.length() > 1) {
            System.out.println("Turno inválido");
        } else {
            if (turno.equalsIgnoreCase("m")) {
                System.out.println("Matutino");
            } else if (turno.equalsIgnoreCase("v")) {
                System.out.println("Vespertino");
            } else if (turno.equalsIgnoreCase("n")) {
                System.out.println("Noturno");
            } else {
                System.out.println("Truno Inválido.");
            }
        }

    }

    public static void decimoPrimeiro() {
        double salarioAtual = 0, salarioNovo = 0, aumento = 0, totalAumento = 0;

        System.out.println("Digite o seu salário:");
        salarioAtual = scan.nextDouble();

        if (salarioAtual < 280) {
            aumento = 0.2;
        } else if (salarioAtual >= 280 && salarioAtual < 700) {
            aumento = 0.15;
        } else if (salarioAtual >= 700 && salarioAtual < 1500) {
            aumento = 0.10;
        } else {
            aumento = 0.05;
        }

        totalAumento = salarioAtual * aumento;
        salarioNovo = salarioAtual + totalAumento;

        System.out.println("Salário antes do ajuste: " + salarioAtual);
        System.out.println("A % do reajuste: " + aumento);
        System.out.println("O valor total do aumento: " + totalAumento);
        System.out.println("Salário pós reajuste: " + salarioNovo);
    }

    public static void decimoSegundo() throws Exception {
        int PORCENTAGEM_DESCONTO_INSS = 10, PORCENTAGEM_DESCONTO_FGTS = 11, DIVISAO = 100;
        double valorHora, salarioBruto = 0, valorDescontoFGTS, valorDescontoINSS, valorDescontoIR, totalDescontos, salarioLiquido,
                        porcentagemDescontoIR = 0;
        int horasTrabalhadas;
        System.out.println("Qual o valor você ganha por hora: ");
        valorHora = scan.nextDouble();
        System.out.println("Quantas horas você trabalhou este mês: ");
        horasTrabalhadas = scan.nextInt();

        salarioBruto = valorHora * horasTrabalhadas;

        if (salarioBruto < 0) {
            throw new Exception("Salário inválido");
        }

        if (salarioBruto <= 900) {
            porcentagemDescontoIR = 0;
        } else if (salarioBruto > 900 && salarioBruto <= 1500) {
            porcentagemDescontoIR = 5;
        } else if (salarioBruto <= 2500) {
            porcentagemDescontoIR = 10;
        } else {
            porcentagemDescontoIR = 20;
        }

        valorDescontoFGTS = (salarioBruto / DIVISAO) * PORCENTAGEM_DESCONTO_FGTS;
        valorDescontoIR = (salarioBruto / DIVISAO) * porcentagemDescontoIR;
        valorDescontoINSS = (salarioBruto / DIVISAO) * PORCENTAGEM_DESCONTO_INSS;
        totalDescontos = valorDescontoIR + valorDescontoINSS;
        salarioLiquido = salarioBruto - totalDescontos;

        System.out.println("Salário Bruto: ( " + valorHora + " * " + horasTrabalhadas + " ) : R$" + salarioBruto);
        System.out.println("(-) IR ( " + porcentagemDescontoIR + "% )               : R$ " + valorDescontoIR);
        System.out.println("(-) INSS ( " + PORCENTAGEM_DESCONTO_INSS + "% )      : R$ " + valorDescontoINSS);
        System.out.println("FGTS  ( " + PORCENTAGEM_DESCONTO_FGTS + "% )      : R$ " + valorDescontoFGTS);
        System.out.println("Total de desconto : R$" + totalDescontos);
        System.out.println("Salário Liquido : R$" + salarioLiquido);

    }

    public static void decimoTerceiro() {
        System.out.println("Digite um dia da semana (1-7): ");
        int diaSeamana = scan.nextInt();

        switch (diaSeamana) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Não é um dia da semana válido");
        }
    }

    public static void decimoQuarto() throws Exception {
        String conceito;
        System.out.println("Digite a primeira nota:");
        double primeiraNota = scan.nextDouble();
        System.out.println("Digite a segunda nota:");
        double segundaNota = scan.nextDouble();

        if (primeiraNota < 0 || primeiraNota > 10 || segundaNota < 0 || segundaNota > 10) {
            throw new Exception("Nota inválida");
        }

        double media = (primeiraNota + segundaNota) / 2;

        if (media <= 4) {
            conceito = "E";
        } else if (media > 4 && media <= 6) {
            conceito = "D";
        } else if (media > 6 && media <= 7.5) {
            conceito = "C";
        } else if (media > 7.5 && media < 9) {
            conceito = "B";
        } else {
            conceito = "A";
        }

        if (media < 7) {
            System.out.println("Reprovado");
        } else {
            System.out.println("Aprovado");
        }

        System.out.println("Sua primeira nota é: " + primeiraNota);
        System.out.println("Sua segunda nota é: " + segundaNota);
        System.out.println("Seu conceito é : " + conceito);
    }

    public static void decimoQuinto() {
        System.out.println("Digite o primeiro lado do triângulo:");
        int primeiroNumero = scan.nextInt();
        System.out.println("Digite o segundo lado do triângulo:");
        int segundoNumero = scan.nextInt();
        System.out.println("Digite o terceiro lado do triângulo:");
        int terceiroNumero = scan.nextInt();

        if (((primeiroNumero + segundoNumero) < terceiroNumero) || ((primeiroNumero + terceiroNumero) < segundoNumero)
                        || ((terceiroNumero + segundoNumero) < primeiroNumero)) {
            System.out.println("Não é um triângulo");
        } else {

            if (primeiroNumero == segundoNumero && segundoNumero == terceiroNumero) {
                System.out.println("Triangulo Equilátero");
            } else if (primeiroNumero != segundoNumero && primeiroNumero != terceiroNumero && segundoNumero != terceiroNumero) {
                System.out.println("Trinângulo Escaleno");
            } else if (primeiroNumero == segundoNumero || primeiroNumero == terceiroNumero || segundoNumero == terceiroNumero) {
                System.out.println("Triângulo Isósceles");
            }
        }
    }

    public static void decimoSexto() throws Exception {
        System.out.println("Digite o valor de A:");
        int numeroA = scan.nextInt();

        if (numeroA == 0) {
            throw new Exception("Digite outro número");
        }

        System.out.println("Digite o valor de B:");
        int numeroB = scan.nextInt();
        System.out.println("Digite o valor de C:");
        int numeroC = scan.nextInt();

        double delta = Math.pow(numeroB, 2) - (4 * numeroA * numeroC);
        if (delta < 0) {
            System.out.println("Delta negativo");
        } else {
            System.out.println("Delta: " + delta);
            double x1 = (-numeroB + Math.sqrt(delta)) / 2 * numeroA;

            double x2 = (-numeroB - Math.sqrt(delta)) / 2 * numeroA;

            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }

    }

    public static void decimoSetimo() {
        System.out.println("Informe um ano:");
        int ano = scan.nextInt();

        if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
            System.out.println("Ano bissexto");
        } else {
            System.out.println("Não é ano bissexto");
        }
    }

    public static void decimoOitavo() {
        System.out.println("Informe um número:");
        int numero = scan.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Núemro é par");
        } else {
            System.out.println("Número é ímpar");
        }
    }

    public static void decimoNono() {
        System.out.println("Informe o primeiro número:");
        int primeiroNumero = scan.nextInt();
        System.out.println("Informe o segundo número:");
        int segundoNumero = scan.nextInt();
        System.out.println("Digite a operação( + - / *):  ");
        String operacao = scan.next();
        boolean flagValido = true;
        int resultado = 0;
        switch (operacao) {
            case "+":
                resultado = primeiroNumero + segundoNumero;
                break;
            case "-":
                resultado = primeiroNumero - segundoNumero;
                break;
            case "/":
                resultado = primeiroNumero / segundoNumero;
                break;
            case "*":
                resultado = primeiroNumero * segundoNumero;
                break;
            default:
                System.out.println("Operação inválida");
                flagValido = false;

        }
        if (flagValido) {
            System.out.println("O resultado foi: " + resultado);

            if (resultado < 0) {
                System.out.println("Número negativo");
            } else {
                System.out.println("Número positivo");
            }

            if (resultado % 2 == 0) {
                System.out.println("par");
            } else {
                System.out.println("ímpar");
            }
        }
    }

    public static void vigesimo() {
        int contador = 0;
        System.out.println("Telefonou para a vítima? S ou N ");
        String perguntaUm = scan.next();
        if (perguntaUm.equalsIgnoreCase("S")) {
            contador++;
        }
        System.out.println("Esteve no local do crime? S ou N ");
        String perguntaDois = scan.next();
        if (perguntaDois.equalsIgnoreCase("S")) {
            contador++;
        }
        System.out.println("Mora perto da vítima? S ou N ");
        String perguntaTres = scan.next();
        if (perguntaTres.equalsIgnoreCase("S")) {
            contador++;
        }
        System.out.println("Devia para a vítima? S ou N  ");
        String perguntaQuatro = scan.next();
        if (perguntaQuatro.equalsIgnoreCase("S")) {
            contador++;
        }
        System.out.println("Já trabalhou com a vítima? S ou N  ");
        String perguntaCinco = scan.next();
        if (perguntaCinco.equalsIgnoreCase("S")) {
            contador++;
        }

        switch (contador) {
            case 2:
                System.out.println("Suspeita");
                break;
            case 3:
            case 4:
                System.out.println("Cúmplice");
                break;
            case 5:
                System.out.println("Assassino");
                break;
            default:
                System.out.println("Inocente");
        }

    }

    public static void vigesimoPrimeiro() {
        double VALOR_LITRO_GASOLINA = 2.50, VALOR_LITRO_ALCOOL = 1.90;
        int litros, porcentagemDesconto;
        double valorDesconto = 0, valorTotalSemDesconto = 0, valorTotalComDesconto;
        String combustivel;

        System.out.println("Informe o tipo do combustível: A - Álcool ou G - Gasolina ");
        combustivel = scan.next();
        System.out.println("Informe a quantidade de litros: ");
        litros = scan.nextInt();

        if (combustivel.equalsIgnoreCase("a")) {
            if (litros > 20) {
                porcentagemDesconto = 5;
            } else {
                porcentagemDesconto = 3;
            }

            valorTotalSemDesconto = litros * VALOR_LITRO_ALCOOL;
            valorDesconto = (valorTotalSemDesconto / 100) * porcentagemDesconto;
        } else if (combustivel.equalsIgnoreCase("b")) {
            if (litros > 20) {
                porcentagemDesconto = 6;
            } else {
                porcentagemDesconto = 4;
            }

            valorTotalSemDesconto = litros * VALOR_LITRO_GASOLINA;
            valorDesconto = (valorTotalSemDesconto / 100) * porcentagemDesconto;
        }

        valorTotalComDesconto = valorTotalSemDesconto - valorDesconto;
        System.out.println("O valor total a pagar é R$ " + valorTotalComDesconto);
    }

    public static void vigesimoSegundo() {

        System.out.println("Informe o peso em KG de maça : ");
        int pesoMaca = scan.nextInt();
        System.out.println("Informe o peso em KG de morango: ");
        int pesoMorango = scan.nextInt();
        double valorKGMaca = 0, valorKGMorango = 0, valorTotalMorango = 0, valorTotalMaca = 0, valorTotal = 0, pesoTotal = 0,
                        valorTotalSemDesconto = 0;

        if (pesoMaca <= 5) {
            valorKGMaca = 1.80;
        } else {
            valorKGMaca = 1.50;
        }

        if (pesoMorango <= 5) {
            valorKGMorango = 2.50;
        } else {
            valorKGMorango = 2.20;
        }
        pesoTotal = pesoMorango + pesoMaca;
        valorTotalMaca = pesoMaca * valorKGMaca;
        valorTotalMorango = pesoMorango * valorKGMorango;
        valorTotalSemDesconto = valorTotalMaca + valorTotalMorango;
        valorTotal = valorTotalSemDesconto;
        if (pesoTotal > 8 || valorTotalSemDesconto > 25) {
            valorTotal = valorTotalSemDesconto - (valorTotalSemDesconto / 100) * 10;
        }
        System.out.println("Preço total é R$ " + valorTotal);
    }

    public static void vigesimoTerceiro() {
        System.out.println("Digite qual carne deseja: \n FL - File Duplo \n A - Alcatra \n P - Picanha");
        String tipoCarne = scan.next();
        System.out.println("Digite a quantidade em KG: ");
        int peso = scan.nextInt();
        System.out.println(
                        "Qual a forma de pagamento? \n D - dinheiro \n CC- cartao credito \n CD - Cartao Debito \n CT - Cartao Tabajara ");
        String tipoPagamento = scan.next();
        double precoCarne = 0, valorTotalSemDesconto = 0, valorTotal = 0, valorDesconto = 0;

        if (tipoCarne.equalsIgnoreCase("fl")) {
            if (peso < 5) {
                precoCarne = 4.90;

            } else {
                precoCarne = 5.80;
            }

        } else if (tipoCarne.equalsIgnoreCase("a")) {
            if (peso < 5) {
                precoCarne = 5.90;

            } else {
                precoCarne = 6.80;
            }
        } else if (tipoCarne.equalsIgnoreCase("p")) {
            if (peso < 5) {
                precoCarne = 6.90;

            } else {
                precoCarne = 7.80;
            }
        }

        valorTotalSemDesconto = precoCarne * peso;
        valorTotal = valorTotalSemDesconto;
        if (tipoPagamento.equalsIgnoreCase("ct")) {
            valorDesconto = valorTotalSemDesconto - (valorTotalSemDesconto / 100) * 10;
            valorTotal = valorTotalSemDesconto - valorDesconto;
        }

        System.out.println("TIPO DA CARNE: " + tipoCarne);
        System.out.println("QUANTIDADE: " + peso);
        System.out.println("PREÇO TOTAL: " + valorTotalSemDesconto);
        System.out.println("TIPO DE PAGAMENTO: " + tipoPagamento);
        System.out.println("VALOR TOTAL DESCONTO: " + valorDesconto);
        System.out.println("VALOR A PAGAR: " + valorTotal);
    }
}
