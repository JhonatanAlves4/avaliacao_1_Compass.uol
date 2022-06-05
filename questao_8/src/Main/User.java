package Main;

public class User {
    private String name;
    private double salary;
    private double bonus;
    private double discount;
    private double totalSalary;

    public User(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String display(){
        return "Nome: " + name +
                ", salário: " + salary +
                ", bônus: " + bonus +
                ", desconto: " + discount +
                ", salário líquido: " + totalSalary;
    }

    public void totalBonus(double bonus) {
        this.totalSalary = salary + bonus;
    }

    public void totalDiscount(double discount) {
        this.totalSalary = salary - discount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotalSalary() {
        return totalSalary;
    }

    public void setTotalSalary(double totalSalary) {
        this.totalSalary = totalSalary;
    }
}
