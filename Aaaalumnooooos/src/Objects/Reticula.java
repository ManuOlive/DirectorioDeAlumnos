/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;


import excepciones.AdiosEscuelaException;
import excepciones.MateriaNoEncontradaException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Arturo
 */
public class Reticula implements Serializable{

    private ArrayList<Matera> materias;

    public Reticula() {
        materias = new ArrayList<>();
    }
    
    public Object[] buscarMateriaHistorial(String clave){
        ArrayList<Matera> resultado = new ArrayList<>();
        int i = 0;
        while (i < materias.size()){
            Matera m = materias.get(i);
            if (m.getStatus() != Status.CURSANDO){
                if (m.getClave().compareTo(clave) == 0){
                    resultado.add(m);
                }         
            }
            i++;
        }
        return resultado.toArray();
    
    }
    public void Listar() {
        for (Matera materia : materias) {
            System.out.println(materia);
        }
    }

    public void agregarMateria(Matera materia) throws AdiosEscuelaException{
        Object[] objects = this.buscarMateriaHistorial(materia.getClave());
        if (objects.length > 2){
            throw new AdiosEscuelaException();
        }else{
            materias.add(materia);            
        }
    }

    public Matera buscarMateriaCursando(String clave) throws MateriaNoEncontradaException {
        int i = 0;
        while (i < materias.size()) {
            Matera m = materias.get(i);
            if (m.getStatus() == Status.CURSANDO) {
                if (m.getClave().compareTo(clave) == 0) {
                    return m;
                }
            }
            i++;
        }
        throw new MateriaNoEncontradaException(String.format("La materia con clave: %s no fue encontrada", clave));
    }
}
