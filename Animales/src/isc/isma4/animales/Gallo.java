/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package isc.isma4.animales;

/**
 *
 * @author lenovo
 */
public abstract class Gallo extends Animal{
    double quikiriki;
    public Gallo (double quikiriki){
        this.quikiriki=quikiriki;
    }
    
    @Override
    public double getSonido(){
        return quikiriki;
    }
}
