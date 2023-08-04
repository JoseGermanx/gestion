package com.empleados;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreInput;
        int edadInput;
        String lastNameInput;

        System.out.println("Ingresa el nombre del empleado: ");
        nombreInput = sc.nextLine();
        System.out.println("Ingresa el apellido del empleado: ");
        lastNameInput = sc.nextLine();
        System.out.println("Ingresa la edad del empleado: ");
        edadInput = sc.nextInt();
        Empleados newEmpleado = new Empleados();
        newEmpleado.age = edadInput;
        newEmpleado.lastName = lastNameInput;
        newEmpleado.name = nombreInput;
        newEmpleado.PrintName(nombreInput, lastNameInput);
        newEmpleado.PrintResult(nombreInput, lastNameInput, edadInput);

    }
}