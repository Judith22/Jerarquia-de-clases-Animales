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
public abstract class Borrego extends Animal{
    double mee;
    public Borrego (double mee){
      this.mee=mee;
      
    }

    @Override
    public double getSonido(){
        
        return mee;
    }   
}
