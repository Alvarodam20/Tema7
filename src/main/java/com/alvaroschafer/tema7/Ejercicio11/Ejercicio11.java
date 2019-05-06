<<<<<<< HEAD
//TODO Acabar ejercicio!!
package com.alvaroschafer.tema7.Ejercicio11;

import com.alvaroschafer.tema7.Main;

public class Ejercicio11 {
    public Ejercicio11() {
        String nombre;
        String primerApellido;
        String segundoApellido;
        System.out.println("Introduce tu nombre: ");
        nombre = Main.lector.nextLine();
        System.out.println("Introduce tu primer apellido: ");
        primerApellido = Main.lector.nextLine();
        System.out.println("Introduce tu segundo apellido: ");
        segundoApellido = Main.lector.nextLine();
        nombreApellidos(nombre, primerApellido, segundoApellido);
    }

    public static void nombreApellidos(String n, String a1, String a2) {
        String nombreCompleto = n+" "+a1+" "+a2;
        System.out.println(nombreCompleto);
    }
}
=======
package com.alvaroschafer.tema7.Ejercicio11;

public class Ejercicio11 {
    public Ejercicio11() {

    }
}
>>>>>>> master
