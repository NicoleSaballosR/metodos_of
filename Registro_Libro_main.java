package main;

import java.util.Scanner;

public class Registro_Libro_main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de libros a registrar: ");
        int cantidadLibros = scan.nextInt();
        scan.nextLine();

        Libro[] libros = new Libro[cantidadLibros];

        for (int i = 0; i < cantidadLibros; i++) {
            System.out.println("Ingrese los datos del libro " + (i + 1) + ":");
            System.out.print("Nombre: ");
            String nombre = scan.nextLine();
            System.out.print("Autor: ");
            String autor = scan.nextLine();
            System.out.print("Editorial: ");
            String editorial = scan.nextLine();
            System.out.print("Año: ");
            int anio = scan.nextInt();
            scan.nextLine();

            libros[i] = new Libro(nombre, autor, editorial, anio);
        }


        System.out.println("Los libros registrados son:");
        System.out.println("--------------------------------------------------------");
        System.out.println("|   Nombre   |    Autor    |  Editorial  |    Año    |");
        System.out.println("--------------------------------------------------------");

        for (Libro libro : libros) {
            System.out.printf("| %-10s | %-10s | %-10s | %-10d |\n", libro.getName(), libro.getAutor(),
                    libro.getEditorial(), libro.getYear());
        }

        System.out.println("--------------------------------------------------------");

        scan.close();

	}

}
