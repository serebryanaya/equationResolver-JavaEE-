package ru.sbrf.equation;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class main {
    public static void main(String[] args) throws InterruptedException {
        Double varA;
        Double varB;
        Double varC;

        while (1 == 1) {
            TimeUnit.SECONDS.sleep(1);

            Scanner in = new Scanner(System.in);
            System.out.println("Введите 3 коэффициента для квадратного уравнения");

            try {
                System.out.print("a: ");
                varA = in.nextDouble();
                System.out.print("b: ");
                varB = in.nextDouble();
                System.out.print("c: ");
                varC = in.nextDouble();
            } catch (Exception e) {
                System.err.println("Коэффициент введен неверно. Попробуйте еще!\n");
                continue;
            }

//            QuadraticEquation model = new QuadraticEquation(varA, varB, varC);
//            QuardaticEquationResolveService service = new QuardaticEquationResolveService(model);
//            model.setRoots(service.getEquationRoot());
        }
    }
}
