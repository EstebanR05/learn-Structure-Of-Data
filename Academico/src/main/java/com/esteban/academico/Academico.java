package com.esteban.academico;

import java.util.Scanner;
import java.util.Vector;

public class Academico {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Vector<Estudiante> vector = new Vector<>();
        Scanner scan = new Scanner(System.in);
        Integer opcion = 0;

        do {
            System.out.println("-------------------MENU-------------------");
            System.out.println("1. crear estudiantes");
            System.out.println("1. actualizar estudiantes");
            System.out.println("1. mostrar estudiantes");
            System.out.println("4. salir\n");

            System.out.println("Ingrese el valor a seleccionar");
            opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    crearEstudiantes(vector);
                    break;
                case 2:
                    editarEstudiante(vector);
                    break;
                case 3:
                    mostrarEstudiantes(vector);
                    break;
                case 4:
                    System.out.println("Gracias por utilizar nuestro programa");
                    break;
                default:
                    throw new AssertionError();
            }

        } while (opcion != 4);
    }

    public static void crearEstudiantes(Vector<Estudiante> vector) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese cuantos estudiantes desea ingresar");
        Integer cuantosEstudiantes = scan.nextInt();

        for (int i = 0; i < cuantosEstudiantes; i++) {
            Estudiante estudiante = new Estudiante();
            llenarEstudiante(estudiante);
            vector.add(estudiante);
        }
    }

    public static void editarEstudiante(Vector<Estudiante> vector) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el indice del estudiante a editar");
        Integer index = scan.nextInt();

        Estudiante estudiante = new Estudiante();
        llenarEstudiante(estudiante);
        vector.set(index, estudiante);
    }

    public static void mostrarEstudiantes(Vector<Estudiante> vector) {
        for (int i = 0; i < vector.size(); i++) {
            System.out.println("el estudiante en indice: " + i + " es -> " + vector.get(i));
        }
    }

    public static void llenarEstudiante(Estudiante estudiante) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingrese el codigo del estudiante");
        estudiante.setCodigo(scan.nextInt());
        scan.nextLine();
        
        System.out.println("Ingrese el nombre del estudiante");
        estudiante.setNombre(scan.nextLine());

        System.out.println("Ingrese el apellido del estudiante");
        estudiante.setApellidos(scan.nextLine());

        System.out.println("Ingrese el semestre del estudiante");
        estudiante.setSemestres(scan.nextLine());

        System.out.println("Ingrese el programa del estudiante");
        estudiante.setProgramas(scan.nextLine());
    }
}
