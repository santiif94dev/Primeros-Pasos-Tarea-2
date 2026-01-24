package com.dam.ad.app;
import com.dam.ad.dao.LibroDao;
import com.dam.ad.model.Libro;

public class Main {
    public static void main(String[] args) {
        var dao = new LibroDao();
        System.out.println("=== LIBROS ===");
        for (Libro libro : dao.findAll()) {
            System.out.println(libro);
        }
    }
}
