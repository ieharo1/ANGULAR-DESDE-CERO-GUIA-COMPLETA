/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Scrappy Doo Coco
 */
public class Matm {
    int nDig;

    public Matm(int nDig) {
        this.nDig = nDig;
    }
    public double redondear(double val){
        return Math.round(val * Math.pow(10, nDig))/Math.pow(10, nDig);
    }
    public boolean fprimo(int n){
        if(n<4)return true;
        if(n%2==0)return false;
        int divisor;
        for(divisor=3;n%divisor!=0;divisor+=2);
        return(divisor>=n);
    }
}
