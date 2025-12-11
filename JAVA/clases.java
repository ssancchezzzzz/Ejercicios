
// Crea una clase Coche con marca, modelo y velocidad.
// Implementa métodos para acelerar y frenar.
// Completa lo que falta.
//

public class Coche {

    private String marca;
    private String modelo;
    private int velocidad;

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidad = 0;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void acelerar() {
        setVelocidad(getVelocidad() + 10);
    }

    public void frenar() {
        setVelocidad(getVelocidad() - 10);
        if (this.velocidad < 0) {
            this.velocidad = 0;
        }
    }

    public void muestraDatos() {
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Velocidad: " + this.velocidad + " Km/h");
    }
}




// Un Alumno tiene nombre y una lista de notas (ArrayList<Integer>)
// Implementa: añadirNota, calcularMedia, mostrarInfo.
// Deja todo lo necesario para que el alumno complete.
//


import java.util.ArrayList;

class Alumno {
    private String nombre;
    private ArrayList<Integer> notas;

    // Constructor COMPLETAR
   

    // Método añadirNota COMPLETAR
   

    // Método calcularMedia COMPLETAR
    

    // Método mostrarInfo COMPLETAR
    
}




// La CuentaBancaria debe tener titular, saldo y métodos
// ingresar(), retirar() y mostrarSaldo().
// Añade control para no permitir saldo negativo.
//


class CuentaBancaria {

    // atributos COMPLETAR
    

    // constructor COMPLETAR
    

    // método ingresar COMPLETAR
   

    // método retirar COMPLETAR
   

    // método mostrarSaldo COMPLETAR
    
}




// Clase Libro: titulo, autor, disponible.
// Clase Biblioteca: ArrayList<Libro>, métodos añadirLibro,
// prestarLibro(titulo), devolverLibro(titulo).
// Deja huecos para que lo desarrollen.
//


class Libro {

    // atributos COMPLETAR
    
    
    // constructor COMPLETAR
   

    // método mostrarInfo COMPLETAR
    
}



class Biblioteca {

    // lista de libros COMPLETAR
    

    // añadirLibro COMPLETAR
    

    // prestarLibro COMPLETAR
    

    // devolverLibro COMPLETAR
    
}




// Producto: nombre, precio.
// Carrito: lista de productos, añadirProducto(), calcularTotal().
//


class Producto {

    // atributos COMPLETAR
   

    // constructor COMPLETAR
    

    // getters opcionales COMPLETAR
    
}



class Carrito {

    // lista de productos COMPLETAR
    

    // añadirProducto COMPLETAR
    

    // calcularTotal COMPLETAR
    

}




// El main está vacío para que cada alumno pruebe los ejercicios
// que quiera. Pueden crear objetos y llamar métodos.
//

public class Main {
    public static void main(String[] args) {

        // EJERCICIO 1: Coche
        // Enunciado:
        //   - Crear un coche con marca y modelo.
        //   - Llamar varias veces a acelerar() y frenar().
        //   - Mostrar los datos finales del coche.

        // EJERCICIO 2: Alumno y notas
        // Enunciado:
        //   - Crear un alumno con su nombre.
        //   - Añadir varias notas con añadirNota().
        //   - Mostrar la información completa.
        //   - Calcular y mostrar la media.

        // EJERCICIO 3: Cuenta Bancaria
        // Enunciado:
        //   - Crear una cuenta bancaria con titular y saldo inicial.
        //   - Ingresar una cantidad.
        //   - Retirar otra cantidad.
        //   - Intentar retirar más de lo disponible (debe impedirse).
        //   - Mostrar el saldo final.

        // EJERCICIO 4: Biblioteca y Libros
        // Enunciado:
        //   - Crear varios libros.
        //   - Añadirlos a una biblioteca.
        //   - Prestar un libro por título.
        //   - Devolver un libro.
        //   - Mostrar si realmente cambia su disponibilidad.
  
        // EJERCICIO 5: Producto y Carrito
        // Enunciado:
        //   - Crear 3 productos con nombre y precio.
        //   - Añadirlos al carrito.
        //   - Calcular el total del carrito.

    }
}

