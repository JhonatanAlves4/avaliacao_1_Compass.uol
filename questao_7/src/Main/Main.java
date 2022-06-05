package Main;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Objects;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        DateTimeFormatter h = DateTimeFormatter.ofPattern("HH");
        int hour = Integer.parseInt(h.format(LocalDateTime.now()));

        System.out.println("Faça seu cadastro no sistema\n");

        User user = new User();
        System.out.println("Cadastre seu nome de usuário: ");
        String registerUser = scanner.next();
        user.setUser(registerUser);

        System.out.println("Cadastre sua senha: ");
        String registerPassword = scanner.next();
        user.setPassword(registerPassword);

        System.out.println("\nFaça login no sistema\n");

        System.out.println("Insira seu usuário cadastrado: ");
        String userLogin = scanner.next();

        System.out.println("Insira sua senha cadastrada: ");
        String passwordLogin = scanner.next();

        boolean login = Objects.equals(userLogin, user.getUser()) &&
                Objects.equals(passwordLogin, user.getPassword());

        if (login) {
            if (hour < 6) {
                System.out.println("\nBoa madrugada, você se logou ao nosso sistema.");
            } else if(hour >= 6 && hour < 12) {
                System.out.println("\nBom dia, você se logou ao nosso sistema.");
            } else if(hour >= 12 && hour < 18) {
                System.out.println("\nBoa tarde, você se logou ao nosso sistema.");
            } else if(hour >= 18 && hour < 24) {
                System.out.println("\nBoa noite, você se logou ao nosso sistema.");
            }
        }else {
            System.out.println("\nUsuário e/ou senha incorretos.");
        }

    }
}
