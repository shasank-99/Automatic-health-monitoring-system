/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
//package catalog_hackathon_1;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] reports = new String[10];  
        int reportCount = 0;

        while (true) {
            System.out.println("\n1. Add Health Report");
            System.out.println("2. View Health Reports");
            System.out.println("3. Exit");
            int choice = scanner.nextInt();

            if (choice == 1) {
                scanner.nextLine(); 
                System.out.println("Enter Patient's Name:");
                String name = scanner.nextLine();
                
                System.out.println("Enter Patient's Age:");
                int age = scanner.nextInt();

                System.out.println("Enter Temperature (°C):");
                double temp = scanner.nextDouble();

                System.out.println("Enter Blood Pressure (mmHg):");
                int bp = scanner.nextInt();

                System.out.println("Enter Heart Rate (bpm):");
                int hr = scanner.nextInt();

                reports[reportCount] = "Patient: " + name + ", Temperature: " + temp + "°C, Blood Pressure: " + bp 
                                        + " mmHg, Heart Rate: " + hr + " bpm";
                reportCount++;
                System.out.println("Health Report added successfully.");

            } else if (choice == 2) {
                System.out.println("Health Reports:");
                for (int i = 0; i < reportCount; i++) {
                    System.out.println(reports[i]);
                }

            } else if (choice == 3) {
                System.out.println("Exiting...");
                scanner.close();
                break;

            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}