/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parking_vehiculos;

import java.util.ArrayList;
import java.io.*;

import javax.swing.JOptionPane;

/**
 *
 * @author kevin
 */
public class Archivo {

    ArrayList<Vehiculos> arr = new ArrayList<>();

    
    //funcion escribir en el archivo
    public void escribir(ArrayList<Vehiculos> arr) {
        try (PrintWriter salida = new PrintWriter(new BufferedWriter(new FileWriter("Parking.txt")))) {
            for (int i = 0; i < arr.size(); i++) {
                salida.println(arr.get(i).getDueño() + "-" + arr.get(i).getPatente() + "-" + arr.get(i).getTipo() + "-" + arr.get(i).getFecha()+"-"+arr.get(i).hora);
              
            }
              salida.close();
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "ERROR al escribir en el archivo" + ex);
        }
    }
    //funcion leer que devuelve un arraylist
    public ArrayList<Vehiculos> leer() {
        ArrayList<Vehiculos> arrlist=new ArrayList<>();
        try {
            BufferedReader entrada=new BufferedReader(new FileReader("Parking.txt"));
            //variable "s" aloja lineas, var "s2" aloja todas las lineas
            String s,s2=new String();
            String dueño;
            String patente;
            String tipo;
            String fecha;
            String hora;
            while ((s=entrada.readLine())!=null) {
                s2=s2+s+"\n"; 
                String[] informacion=s.split("-");
                dueño=informacion[0];
                patente=informacion[1];
                tipo=informacion[2];
                fecha=informacion[3];
                hora=informacion[4];
                arrlist.add(new Vehiculos(dueño, patente, tipo, fecha,hora));
                
            }
            
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ERROR al leer el archivo: "+e);
        }
      return arrlist;

    }
}
