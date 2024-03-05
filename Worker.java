package Package2;

import java.util.Scanner;


public class Worker extends Student {
    private int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public static void inputInfo(Scanner scanner) {
        Worker worker = new Worker();
        System.out.println("Введите имя работника: ");
        worker.setName(scanner.nextLine());
        System.out.println("Введите возраст работника: ");
        worker.setAge(scanner.nextInt());
        System.out.println("Введите зарплату работника: ");
        worker.setSalary(scanner.nextInt());

        DBhandler.saveString(worker);
    }
}