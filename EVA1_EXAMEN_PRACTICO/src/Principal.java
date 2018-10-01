
import Alumno.AluInf;
import java.util.Scanner;
//Importe de scanner y del objeto de la clase AluInf
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Team Nougats
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Inpt = new Scanner(System.in);//Scanner para captura de datos
    AluInf data = new AluInf();//Objeto para llamar a los métodos de la otra clase y modificar las variables privadas de dicha clase
    System.out.println("¡Bienvenido!");
        System.out.println("Introduce los datos que se te pidan, lee cuidadosamente cada instrucción.");
        
        System.out.println("Introduce tu nombre/s: ");
        data.setNombre(Inpt.nextLine());
        System.out.println("Intruduce tus apellidos: ");
        data.setApellido(Inpt.nextLine());
        System.out.println("Introduce tu género; ");
        data.setGender(Inpt.nextLine());
        System.out.println("Introduce tu dirección: ");
        data.setDireccion(Inpt.nextLine());
        System.out.println("Introduce tu E-mail: ");
        data.setEmail(Inpt.nextLine());
        System.out.println("¿Qué carrera estudias? ");
        data.setCarrera(Inpt.nextLine());
        System.out.println("¿En qué semestre de tu carrera vas? Usa carácteres alfabéticos por favor. ");
        data.setSemestre(Inpt.nextLine());
        System.out.println("Introduce el número de tu día de nacimiento: ");
        data.setDiaNa(Inpt.nextInt());
        System.out.println("Introduce el número de tu mes de nacimiento: ");
        data.setMesNa(Inpt.nextInt());
        System.out.println("Introduce el año de nacimiento: ");
        data.setAñoNa(Inpt.nextInt());
        System.out.println("¿Cuál es tu número de control?");
        data.setNCont(Inpt.nextInt());
        System.out.println("Introduce el número de tu casa: ");
        data.setNCasa(Inpt.nextInt()); 
        //A lo largo de esas líneas de código se utilizan los métodos set
        //De cada variable para así asignarles el valor capturado por 
        //El scanner
        
        System.out.println("Tu nombre completo es: " + data.getNombre() + " " + data.getApellido());
        System.out.println("Eres " + data.getGender());
        System.out.println("Tu dirección es " + data.getNCasa() + " " + data.getDireccion());
        System.out.println("Tu E-mail es " + data.getEmail());
        System.out.println("Tu fecha de nacimiento es " + data.getDiaNa() + " de " + data.getMesNa() + " del " + data.getAñoNa());
        System.out.println("Carrera: " + data.getCarrera());
        System.out.println("Semestre: " + data.getSemestre());
        System.out.println("Número de control: " + data.getNCont());
        //En esas líneas de código se llama al método get, p´racticamente sólo
        // devuelve el valor obtenido con el método set
        
    }
    
}
