package com.empleados;

public class Empleados {

    int age;
    String lastName, name;

    public void PrintName(String name, String lastName) {
        name = this.name;
        lastName = this.lastName;
        System.out.println("Estamos procesando los datos de : " + name + " " + lastName);
    }

    public int EdadEmpleado(int age) {
        age = this.age;
        return age;
    }

    public void PrintResult(String name, String lastName, int age) {
        name = this.name;
        lastName = this.lastName;
        age = this.age;

        if(age < 30) {
             System.out.println("La edad de " + name + " " + lastName + " es " + age);
        System.out.println("Se ha registrado correctamente.");
        } else {
            System.out.println("No pudimos avanzar con el registro por el empleado tiene mas de 30 años");
        }

       
    }
}
