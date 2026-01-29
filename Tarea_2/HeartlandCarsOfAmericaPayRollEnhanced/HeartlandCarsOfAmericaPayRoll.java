package Tarea_2.HeartlandCarsOfAmericaPayRollEnhanced;

import Tarea_2.HeartlandCarsOfAmericaClassesEnhanced.*;
import java.util.Scanner;

public class HeartlandCarsOfAmericaPayRoll {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Employee Type (F, P, S): ");
        String type = sc.nextLine().toUpperCase();
        
        System.out.print("Enter First Name: ");
        String firstName = sc.nextLine();
        
        System.out.print("Enter Last Name: ");
        String lastName = sc.nextLine();
        
        if (type.equals("S")) {
            System.out.print("Enter Base Salary: ");
            double salary = sc.nextDouble();
            System.out.print("Enter Total Sales: ");
            double sales = sc.nextDouble();
            
            SalesEmployee seller = new SalesEmployee(firstName, lastName, salary, sales);
            System.out.println("\n" + seller.createPayStub());
            
        } else if (type.equals("F")) {
            System.out.print("Enter Base Salary: ");
            double salary = sc.nextDouble();
            // Asumimos 40 horas para Full Time según el diagrama
            FullTimeEmployee ft = new FullTimeEmployee(firstName, lastName, salary, 40);
            System.out.println("\n" + ft.createPayStub());
        }
        
        sc.close();
    }
}