
import java.util.Scanner;

import Controller.Operations;
import Model.ComNum;



public class View {

    ComNum z1 = new ComNum();
    ComNum z2 = new ComNum();   
    Operations op = new Operations();
 
    
    public void start(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите реальную компоненту Х первого комплексного числа a");
        z1.setX(scanner.nextDouble());
        System.out.println("Введите мнимую компоненту Y первого комплексного числа a");
        z1.setY(scanner.nextDouble());

        System.out.println(z1.toString());
        System.out.println();

        System.out.println("Введите реальную компоненту Х второго комплексного числа b");
        z2.setX(scanner.nextDouble());
        System.out.println("Введите мнимую компоненту Y второго комплексного числа b");
        z2.setY(scanner.nextDouble());

        System.out.println(z2.toString());
        System.out.println();

        this.menu();

    }

    private void menu(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println();
            System.out.println("Выберите из списка операцию над комплексными числами:");
            System.out.println("1 - сложение (a + b)");
            System.out.println("2 - вычитание (a - b)");
            System.out.println("3 - умножение (a * b)");
            System.out.println("4 - выход");

            switch (scanner.nextInt()) {
                case 1 -> op.addition(this.z1, this.z2);
                case 2 -> op.abstraction(this.z1, this.z2);
                case 3 -> op.multiplication(this.z1, this.z2);
                case 4 -> System.exit(0);// выход из приложения

                default -> System.out.println("Операция не поддерживается");
            }
        }
        
    }

    

}
