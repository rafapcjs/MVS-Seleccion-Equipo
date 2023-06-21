/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tabla;

import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WIN-10
 */
public class Modelo {
     //VARIABLES
    private int id;
    private String nombre;
    private int edad;
    private int estaura;
    private String sexo;
    private String ciudad;
    private int peso;
    private int  CAMILO;
    private int PAOLA;
    private int PEDRO;

    public Modelo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEstaura() {
        return estaura;
    }

    public void setEstaura(int estaura) {
        this.estaura = estaura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getCAMILO() {
        return CAMILO;
    }

    public void setCAMILO(int CAMILO) {
        this.CAMILO = CAMILO;
    }

    public int getPAOLA() {
        return PAOLA;
    }

    public void setPAOLA(int PAOLA) {
        this.PAOLA = PAOLA;
    }

    public int getPEDRO() {
        return PEDRO;
    }

    public void setPEDRO(int PEDRO) {
        this.PEDRO = PEDRO;
    }public int calcular(JTextField mostrar,JTable tabla){
      int p = 0;
    int t = 0;
    
        if (tabla.getRowCount()>0) {
             for (int i = 0; i < tabla.getRowCount(); i++) {
            p=Integer.parseInt(tabla.getValueAt(i, 7).toString());
            t=t+p;
        }
        }
       
        return t;
    }
 public int calcular1(JTextField mostrar,JTable tabla){
      int p = 0;
    int t = 0;
    
        if (tabla.getRowCount()>0) {
             for (int i = 0; i < tabla.getRowCount(); i++) {
            p=Integer.parseInt(tabla.getValueAt(i, 8).toString());
            t=t+p;
        }
        }
       
        return t;
    }
 public int calcular2(JTextField mostrar,JTable tabla){
      int p = 0;
    int t = 0;
 
        if (tabla.getRowCount()>0) {
             for (int i = 0; i < tabla.getRowCount(); i++) {
            p=Integer.parseInt(tabla.getValueAt(i, 9).toString());
            t=t+p;
        }
        }
       
        return t;
    }
    
}