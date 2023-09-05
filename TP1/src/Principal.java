
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author estudiante
 */
public class Principal {
    public static void main(String[] args) {
        int entero=1;
        float real=2.5f;
        double doble=99999999;
        String cadena="Hola mundo";
        // muestro por pantalla
        System.out.println("entero: " + entero);
        System.out.println("real: " + real);
        System.out.println("doble: " + doble);
        System.out.println("String: " + cadena);
        /*4. En el método main() declarar un ArrayList que
contenga datos de tipo float. Inicializar*/
        ArrayList<Float> lista= new ArrayList<>();
        // añado elementos al array ( lista)
    lista.add(3.4f);
    lista.add(4.4f);
    lista.add(9.4f);
                int contador=0;
            float suma=0;

    // hago un for mejorado para mostrar la lista
        for (Float a : lista) {
            System.out.println(a);
            suma=suma+a;
            contador++;
        }
    // declaro la variable promedios
    float promedio=suma/contador;
    // muestro el promedio
        System.out.println("Promedio: "+ promedio);
    }
}
