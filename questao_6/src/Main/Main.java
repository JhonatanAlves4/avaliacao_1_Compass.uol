package Main;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite seu nome: ");
            String nome = scanner.next();
            User user = new User(nome);

            //Questões
            String[] questions = new String[]{
                    "Quem inventou o Java?",
                    "Em que ano o Java foi criado?",
                    "Qual destes NÃO faz parte dos pilares da POO?",
                    "Qual o principal framework Java para desenvolvimento e injeção de dependências?",
                    "Qual destes se trata de um banco de dados relacional?"
            };

            //Opções de respostas
            String[][] options = new String[][]{
                    {"[1] - Yukihiro Matsumoto", "[2] - Dennis Ritchie", "[3] - James Gosling", "[4] - Brendan Eich"},
                    {"[1] - 1991", "[2] - 1992", "[3] - 1993", "[4] - 1994"},
                    {"[1] - Polimorfismo", "[2] - Encapsulamento", "[3] - Abstração", "[4] - Paralelismo"},
                    {"[1] - Thymeleaf", "[2] - Spring", "[3] - Maven", "[4] - Hibernate"},
                    {"[1] - Apache Cassandra", "[2] - MongoDB", "[3] - PostgreSQL", "[4] - Redis"}
            };

            //Gabarito
            int[] correctAnswer = new int[]{3, 1, 4, 2, 3};

            for(int q = 0; q < questions.length; ++q) {
                System.out.println("Pergunta " + (q+1) + "/" + questions.length);
                System.out.println(questions[q]);

                int answer;
                for(answer = 0; answer < options[q].length; ++answer) {
                    System.out.println(options[q][answer]);
                }

                System.out.println("Digite sua resposta (1, 2, 3 ou 4).");
                answer = scanner.nextInt();
                if (answer == correctAnswer[q]) {
                    System.out.println("Parabéns, você acertou!\n");
                    user.hitQuestion(1);
                } else {
                    System.out.println("Errado, a resposta certa era " + correctAnswer[q] + "\n");
                    user.wrongQuestion(1);
                }
            }

            System.out.println(user.getName() + ", você acertou " + user.getHits() + " questões e errou " + user.getErrors() +" .");
        }
    }


