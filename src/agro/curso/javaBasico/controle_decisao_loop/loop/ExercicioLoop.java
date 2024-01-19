package agro.curso.javaBasico.controle_decisao_loop.loop;

import java.util.Scanner;

public class ExercicioLoop {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        vigesimoQuinto();
    }

    public static void primeiro() {
        int nota = 0;
        boolean flag = false;
        do {
            System.out.println("Digite uma nota entre 0 e 10: ");
            nota = scan.nextInt();
            if (nota < 0 || nota > 10) {
                flag = true;
                System.out.println("valor inválido");
            }
        } while (flag);

    }

    public static void segundo() {
        boolean flag = false;
        do {
            System.out.println("Digite seu nome de usuário: ");
            String nomeUsuario = scan.next();
            System.out.println("Digite sua senha de usuário: ");
            String senhaUsuario = scan.next();
            if (nomeUsuario.equals(senhaUsuario)) {
                flag = true;
                System.out.println("Operação invalida");
            } else {
                break;
            }
        } while (flag);
    }

    public static void terceiro() {
        int i = 0, contadorMax = 5;
        while (i < contadorMax) {

            System.out.println("Digite seu nome de usuário (maior que 3 digitos): ");
            String nomeUsuario = scan.next();
            if (!(nomeUsuario.length() < 3)) {
                i++;
            } else {
                System.out.println("Nome invalido");
                i = 0;
            }

            System.out.println("Digite sua idade (0 até 150) : ");
            int idade = scan.nextInt();
            if (idade >= 0 && idade <= 150) {
                i++;
            } else {
                System.out.println("Idade invalido");
                i = 0;
            }

            System.out.println("Digite seu salario (acima de 0): ");
            int salario = scan.nextInt();
            if (salario > 0) {
                i++;
            } else {
                System.out.println("Salario invalido");
                i = 0;
            }

            System.out.println("Digite seu sexo (F ou M): ");
            String sexo = scan.next();
            if (sexo.equalsIgnoreCase("f") || sexo.equalsIgnoreCase("m")) {
                i++;
            } else {
                System.out.println("Sexo invalido");
                i = 0;
            }

            System.out.println("Digite seu estado civil \n S- solteiro(a) \n C - casado(a) \n V- viuvo(a) \n D- divorciado(a) : ");
            String estadoCivil = scan.next();
            if (estadoCivil.equalsIgnoreCase("s") || estadoCivil.equalsIgnoreCase("c") || estadoCivil.equalsIgnoreCase("v")
                            || estadoCivil.equalsIgnoreCase("d")) {
                i++;
            } else {
                System.out.println("Estado civil invalido");
                i = 0;
            }

            System.out.println("Nome: " + nomeUsuario);
            System.out.println("Idade: " + idade);
            System.out.println("salario: " + salario);
            System.out.println("sexo: " + sexo);
            System.out.println("Estado civil: " + estadoCivil);
        }

    }

    public static void quarto() {
        double habitantesPaisA = 80000, taxaAnualCrescimentoPaisA = 3, habitantesPaisB = 200000, taxaAnualCrescimentoPaisB = 1.5;
        int ano;
        for (ano = 0; habitantesPaisA <= habitantesPaisB; ano++) {
            habitantesPaisA += (habitantesPaisA / 100) * taxaAnualCrescimentoPaisA;
            habitantesPaisB += (habitantesPaisB / 100) * taxaAnualCrescimentoPaisB;

        }
        System.out.println("Habitantes pais A: " + habitantesPaisA);
        System.out.println("Habitantes pais B: " + habitantesPaisB);
        System.out.println("A quantidade de anos é :" + ano);

    }

    public static void quinto() {
        int ano = 0;
        boolean flag;
        double habitantesPaisA = 0, taxaAnualCrescimentoPaisA = 0, habitantesPaisB = 0, taxaAnualCrescimentoPaisB = 0;
        do {
            flag = false;
            System.out.println("Digite a população do país A: ");
            habitantesPaisA = scan.nextDouble();
            if (habitantesPaisA < 0) {
                flag = true;
            }
        } while (flag);

        do {
            flag = false;
            System.out.println("Digite a taxa anual de Crescimento do País A: ");
            taxaAnualCrescimentoPaisA = scan.nextDouble();
            if (taxaAnualCrescimentoPaisA < 0) {
                flag = true;
            }
        } while (flag);

        do {
            flag = false;
            System.out.println("Digite a população do país B:");
            habitantesPaisB = scan.nextDouble();
            if (habitantesPaisB < 0) {
                flag = true;
            }
        } while (flag);

        do {
            flag = false;
            System.out.println("Digite a taxa anual de Crescimento do País B: ");
            taxaAnualCrescimentoPaisB = scan.nextDouble();
            if (taxaAnualCrescimentoPaisB < 0) {
                flag = true;
            }
        } while (flag);

        while (habitantesPaisA < habitantesPaisB) {
            habitantesPaisA += (habitantesPaisA / 100) * taxaAnualCrescimentoPaisA;
            habitantesPaisB += (habitantesPaisB / 100) * taxaAnualCrescimentoPaisB;
            ano++;
        }
        System.out.println("Habitantes pais A: " + habitantesPaisA);
        System.out.println("Habitantes pais B: " + habitantesPaisB);
        System.out.println("A quantidade de anos é :" + ano);

    }

    public static void sexto() {
        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }
        for (int i = 1; i <= 20; i++) {
            System.out.print(i);
        }
    }

    public static void setimo() {
        int maior = 0;
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            int numero = scan.nextInt();
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println(maior);
    }

    public static void oitavo() {
        int soma = 0;
        int media = 0;
        int quantidadeNumeros = 5;
        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.println("Digite um número: ");
            int numero = scan.nextInt();
            soma += numero;
            media = soma / quantidadeNumeros;
        }

        System.out.println(soma);
        System.out.println(media);

    }

    public static void nono() {
        for (int i = 1; i < 50; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void decimo() {
        System.out.println("Digite um número: ");
        int menorNumero = scan.nextInt();
        System.out.println("Digite um número: ");
        int maiorNumero = scan.nextInt();

        if (menorNumero > maiorNumero) {
            int auxiliar = menorNumero;
            menorNumero = maiorNumero;
            maiorNumero = auxiliar;
        }

        do {

            System.out.println(menorNumero);
            ++menorNumero;
        } while (menorNumero < maiorNumero);

    }

    public static void decimoPrimeiro() {
        int soma = 0;
        System.out.println("Digite um número: ");
        int menorNumero = scan.nextInt();
        System.out.println("Digite um número: ");
        int maiorNumero = scan.nextInt();

        if (menorNumero > maiorNumero) {
            int auxiliar = menorNumero;
            menorNumero = maiorNumero;
            maiorNumero = auxiliar;
        }

        do {
            menorNumero++;
            soma += menorNumero;
        } while (menorNumero < maiorNumero);
        System.out.println(soma);

    }

    public static void decimoSegundo() {
        boolean flag = true;
        int tabuadaMax = 10, tabuada;
        do {
            flag = false;
            System.out.println("Digite a tabuada desejada entre 1 e 10");
            tabuada = scan.nextInt();
            if (tabuada < 1 || tabuada > 10) {
                flag = true;
                System.out.println("tabuada invalida digite novamente");
            }
        } while (flag);
        System.out.println("Tabuada do " + tabuada);
        for (int i = 1; i <= tabuadaMax; i++) {
            int resultado = i * tabuada;
            System.out.println(tabuada + " x " + i + " = " + resultado);
        }

    }

    public static void decimoTerceiro() {

        System.out.println("Digite a base: ");
        int base = scan.nextInt();
        System.out.println("Digite o expoente: ");
        int expoente = scan.nextInt();
        int resultado = base;
        if (expoente == 0) {
            resultado = 1;
        }
        for (int i = 1; i < expoente; i++) {
            resultado *= base;
            System.out.println(resultado);
        }
        System.out.println(base);
        System.out.println(expoente);
        System.out.println(resultado);
    }

    public static void decimoQuarto() {
    }

    public static void decimoQuinto() {
    }

    public static void decimoSexto() {
    }

    public static void decimoSetimo() {
    }

    public static void decimoOitavo() {
        int soma = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        System.out.println("Digite uma quantidade de números: ");
        int quantidadeNumeros = scan.nextInt();

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.println("Digite um número: ");
            int numeros = scan.nextInt();
            soma += numeros;
            if (numeros > maior) {
                maior = numeros;
            }
            if (numeros < menor) {
                menor = numeros;
            }
        }

        System.out.println("Soma" + soma);
        System.out.println("Menor " + menor);
        System.out.println("Maior " + maior);
    }

    public static void decimoNono() {
        int soma = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE, quantidadeNumeros = 0;
        boolean flag = true;
        do {
            flag = false;
            System.out.println("Digite uma quantidade de números: ");
            quantidadeNumeros = scan.nextInt();
            if (quantidadeNumeros < 0 || quantidadeNumeros > 1000) {
                flag = true;
                System.out.println("Digite um número válido");
            }
        } while (flag);

        for (int i = 0; i < quantidadeNumeros; i++) {
            System.out.println("Digite um número: ");
            int numeros = scan.nextInt();
            soma += numeros;
            if (numeros > maior) {
                maior = numeros;
            }
            if (numeros < menor) {
                menor = numeros;
            }
        }

        System.out.println("Soma " + soma);
        System.out.println("Menor " + menor);
        System.out.println("Maior " + maior);
    }

    public static void vigesimo() {
    }

    public static void vigesimoPrimeiro() {
    }

    public static void vigesimoSegundo() {
    }

    public static void vigesimoTerceiro() {
    }

    public static void vigesimoQuarto() {
        System.out.println("Digite a quantidade de notas desejadas: ");
        int quantidadeDeNotas = scan.nextInt();
        int notas = 0;
        int somaNotas = 0;
        for (int i = 0; i < quantidadeDeNotas; i++) {
            System.out.println("Digite a quantidade de notas desejadas: ");
            notas = scan.nextInt();
            somaNotas += notas;
        }
        int media = somaNotas / quantidadeDeNotas;
        System.out.println("Média: " + media);
    }

    public static void vigesimoQuinto() {
        System.out.println("Digite a quantidade de pessoas: ");
        int quantidadePessoas = scan.nextInt();
        int idadePessoas, somaIdade = 0;
        for (int i = 0; i < quantidadePessoas; i++) {
            System.out.println("Digite a idade de cada pessoa: ");
            idadePessoas = scan.nextInt();
            somaIdade += idadePessoas;
        }
        int media = somaIdade / quantidadePessoas;
        if (media < 26) {
            System.out.println("A média da turma é " + media + " está turma é jovem");
        } else if (media >= 26 && media <= 60) {
            System.out.println("A média da turma é " + media + " está turma é adulta");
        } else {
            System.out.println("A média da turma é " + media + " está turma é idosa");
        }
    }

}
