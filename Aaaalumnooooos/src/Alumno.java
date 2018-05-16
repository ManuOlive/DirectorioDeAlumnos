
import excepciones.AdiosEscuelaException;
import java.io.Serializable;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arturo
 */
public class Alumno implements Serializable{
    private String matricula;
    private String nombre;
    private Carrera carrera;
    private Fecha fechanacimiento;
    private Fecha fechaingreso;
    private Reticula reticula;

     public Alumno(String matricula, String nombre, Carrera carrera, Fecha fechaNacimiento){
        this.matricula = matricula;
        this.nombre = nombre;
        this.carrera = carrera;
        this.fechanacimiento = fechaNacimiento;
        //this.fechaIngreso = fecha actual;
        this.reticula = new Reticula();
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Fecha getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Fecha fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public Fecha getFechaingreso() {
        return fechaingreso;
    }

    public void setFechaingreso(Fecha fechaingreso) {
        this.fechaingreso = fechaingreso;
    }

    public Reticula getReticula() {
        return reticula;
    }

    public void setReticula(Reticula reticula) {
        this.reticula = reticula;
    }
    public void asignarMateria(Matera materia) throws AdiosEscuelaException{
        reticula.agregarMateria(materia);
    }
    public String toString(){
        return getMatricula()+" "+getNombre();
    }
    
}
