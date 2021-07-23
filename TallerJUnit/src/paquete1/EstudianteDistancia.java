
package paquete1;

import java.util.ArrayList;

public class EstudianteDistancia extends Estudiante{
       
    private ArrayList<Nota> notas;
    private double mejorNota;
    private double peorNota;
    private double promedio;
    
    public void establecerNotas(ArrayList<Nota> ns){
        notas = ns;
    
    }
    
    public void obtenerNotas(ArrayList<Nota> ns){
        notas = ns;
    
    }
    public void establecerMejorNota(){
        mejorNota = 0;
        double notaAlta = notas.get(0).obtenerValor();
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i).obtenerValor() >= notaAlta) {
                notaAlta = notas.get(i).obtenerValor();
            }
        }
        mejorNota = notaAlta;
    }
    public void establecerPeorNota(){
        peorNota = 0;
        double notaBaja = notas.get(0).obtenerValor();
        for (int i = 0; i < notas.size(); i++) {
            if (notas.get(i).obtenerValor() <= notaBaja) {
                notaBaja = notas.get(i).obtenerValor();
            }
        }
        peorNota = notaBaja;
    }
    public void establecerPromedio(){
        double suma = 0;
        promedio = 0;
        int contador = 0;
        for (int i = 0; i < notas.size(); i++) {
            suma = suma + notas.get(i).obtenerValor();
            contador = i;
        }
        promedio = suma / (contador + 1);
    }
    
    public double obtenerMejorNota(){
        return mejorNota;
        
    }
    
    public double obtenerPeorNota(){
        return peorNota;
    }
    public double obtenerMejorPromedio(){
        return promedio;
        
    }
    
    @Override
     public String toString() {
        String cadena = String.format("Nombre Estudiante: %s %s\n"
                + "Cédula: %s"
                + "Notas: \n",
                nombresEstudiante,
                apellidosEstudiante,
                identificacionEstudiante);
        for (int i = 0; i < notas.size(); i++) {
            cadena = String.format("%s%.1f", cadena,
                    notas.get(i).obtenerValor());
        }
        cadena = String.format("%sPromedio: %.1f"
                + "Mejor Nota: %.1f"
                + "Peor Nota: %.1f", cadena,
                promedio,
                mejorNota,
                peorNota);
        return cadena;
    }

    
    
    
    

}
