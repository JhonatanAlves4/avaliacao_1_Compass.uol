package Main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a quantidade de funcionários:");
        int qnt = scanner.nextInt();

        User[] user = new User[qnt];

        for(int q = 0; q < qnt; q++) {
            System.out.println("Digite o nome do funcionário");
            String name = scanner.next();
            System.out.println("Digite o salário do funcionário");
            double salary = scanner.nextDouble();
            user[q] = new User(name, salary);

            if(user[q].getSalary() <= 1000.00) {
                double bonus = (user[q].getSalary() / 5);
                user[q].setBonus(bonus);
                user[q].totalBonus(bonus);
            }else if (user[q].getSalary() > 1000 && user[q].getSalary() <= 2000) {
                double bonus = (user[q].getSalary() / 10);
                user[q].setBonus(bonus);
                user[q].totalBonus(bonus);
            }else if(user[q].getSalary() > 2000){
                double discount = (user[q].getSalary() / 10);
                user[q].setDiscount(discount);
                user[q].totalDiscount(discount);
            }

        }
        for(int t = 0; t < qnt; t++){
            System.out.println(user[t].display());
        }

    }
}
