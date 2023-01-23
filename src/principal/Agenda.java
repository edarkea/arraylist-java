package principal;

import java.util.ArrayList;

/**
 *
 * @author Edinson Steeven Ayui Cobos
 */
public class Agenda {

    private ArrayList<Persona> personas;
    
    public Agenda() {
        personas = new ArrayList<>();
    }

    public void eliminarPersona(int codigo){
        for (int i = 0; i < personas.size(); i++) {
            if(codigo == personas.get(i).getCodigo()){
                personas.remove(i);
            }
        }
    }
    
    public void buscarPersona(int codigo){
        for (int i = 0; i < personas.size(); i++) {
            if (codigo == personas.get(i).getCodigo()) {
                System.out.println(personas.get(i).getNombre());
            }
        }
    }
    
    public void agregarPersona(int codigo,String nombre){
        Persona nuevo = new Persona(codigo,nombre);
        personas.add(nuevo);
    }
    
    public void visualizarPersona(){
        for(int i = 0 ;i<personas.size();i++){
            System.out.println(personas.get(i).getNombre());
        }
    }
    
}
