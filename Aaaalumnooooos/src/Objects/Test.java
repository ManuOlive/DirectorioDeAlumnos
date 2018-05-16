/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

import excepciones.AdiosEscuelaException;
import excepciones.AlumnoExistenteException;
import excepciones.MateriaNoEncontradaException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class Test {
    public static void main(String[] args) throws AlumnoExistenteException, IOException {
        Scanner teclado = new Scanner(System.in);
        
        try {
            Reticula reticula = new Reticula();
            //Clave/ Nombre Materia / Smestre / Creditos / Profesor / Status     
            Matera m1 = new Matera("AA", "Programacion", 1, 10, "Karim", Status.CURSANDO);
            Matera m2 = new Matera("BB", "Matematicas", 1, 8, "mora", Status.CURSANDO);
            Matera m3 = new Matera("CC", "Analisis de circuitos", 1, 10, "Pedro", Status.CURSANDO);
            Matera m4 = new Matera("DD", "Circuitos Logicos", 1, 10, "Victor", Status.CURSANDO);

            Matera m5 = new Matera("DD", "Circuitos Logicos", 1, 10, "Victor", Status.REPROBADA);

            reticula.agregarMateria(m1);
            reticula.agregarMateria(m2);
            reticula.agregarMateria(m3);
            reticula.agregarMateria(m4);
            reticula.agregarMateria(m5);
            Alumno manu = new Alumno("MANU", "Manuel Olive", Carrera.Electronica, new Fecha(28,5,1998));
            manu.setReticula(reticula);
            
            Alumno palma = new Alumno("PALMA", "Juan Palma", Carrera.Electronica, new Fecha(28,5,1998));
            System.out.println("Carrera de palma : "+palma.getCarrera());
            Controlador controlador = new Controlador();
            controlador.insertarAlumno(manu);//Inserta a los alumnos
            
            controlador.insertarAlumno(palma);//Inserta a los alumnos
            controlador.ListarAlumnos();//Lista a los alumnos creados
            
            controlador.guardar();
            
            
            
            
            /*Matera mteclado = new Matera(matri,nombre,semes,cred,nombmate,status.CURSANDO);
            System.out.println("Ingresa la matricula: ");
            String matri = teclado.nextLine();
            System.out.println("Ingresa el nombre de la materia: ");
            String nombre = teclado.nextLine();
            System.out.println("Ingresa el semestre en el que se cursa: ");
            Integer semes = teclado.nextInt();
            System.out.println("Ingresa los creditos: ");
            Integer cred = teclado.nextInt();
            System.out.println("Ingresa el nombre del maestro: ");
            String nombmate = teclado.nextLine();
            System.out.println("Ingresa el Status: (CURSANDO, APROBADA REPROBADA)");
            String status = teclado.nextLine();
            if(status=="CURSANDO"){
                
            }*/
            
            Matera m = reticula.buscarMateriaCursando("AA");
            m.setStatus(Status.REPROBADA);//Patra cambiar el 
            m.setNombre("Alberto");
            
            reticula.Listar();
            
            Matera m7 = new Matera("DD", "Circuitos Logicos", 1, 10, "Victor", Status.CURSANDO);
            
            reticula.agregarMateria(m7);
            
            
            
            
        } catch (MateriaNoEncontradaException ex) {
            System.out.println("Materia no encontrada");
        } catch (AdiosEscuelaException ex) {
            System.out.println("No se puede ingresar la materia");
        }
    }

}

