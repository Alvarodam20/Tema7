package com.alvaroschafer.tema7.Ejercicio10;

import com.alvaroschafer.tema7.Main;

public class Ejercicio10 {
    public Ejercicio10() {
        String palabra;
        System.out.println("Introduce una palabra: ");
        palabra = Main.lector.nextLine();
        palabraPalindrom(palabra);
    }

    public static boolean palabraPalindrom(String palabra) {
<<<<<<< HEAD
        int i = 0;
        int j = palabra.length() - 1;
        while(i < j) {
            //Con estos whiles evito que los indices de i y j recorran toda la palabra y así optimizarlo.
            while(j >= i) {
                if (palabra.charAt(i) != palabra.charAt(j)) {
                    return false;
                }
                j--;
            }
            i++;
=======
        if (palabra.charAt()) {

>>>>>>> master
        }
        return true;
    }
}
