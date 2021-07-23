
package paquete1;

public class Estudiante {
    // 1.  Declarar
    // se declaran datos o atributos con visibilidad protegido
    // # nombresEstudiante: Cadena
    protected String nombresEstudiante;
    // # apellidosEstudiante: Cadena
    protected String apellidosEstudiante;
    // # identificacionEstudiante: Cadena
    protected String identificacionEstudiante;
    // # edadEstudiante: Entero
    protected int edadEstudiante;
    
    public void establecerNombresEstudiante(String m){
        nombresEstudiante = m;
    }
  
    
    public void establecerApellidoEstudiante(String a){
        apellidosEstudiante = a;
    }
    
    
    public void establecerIdentificacionEstudiante(String i){
        identificacionEstudiante = i;
    }

    
    public void establecerEdadEstudiante(int e){
        edadEstudiante = e;
    }
    
    
    public String obtenerNombresEstudiante(){
        return nombresEstudiante;  
    }
 
   
    public String obtenerApellidoEstudiante(){
        return apellidosEstudiante; 
    }

    
    public String obtenerIdentificacionEstudiante(){
        return identificacionEstudiante; 
    }

   
    public int obtenerEdadEstudiante(){
        return edadEstudiante;
    }


}
