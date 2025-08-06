/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_interfaces;


/**
 *
 * @author Scrappy Doo Coco
 */
public class Herencia_Interfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Salary =10;
        Employee Direc= new Boss("Marco");
        Direc.GenerarInforme();
        Direc.Salary(20, Salary);
        
        Employee Sec=new Secretary("Luisa");
        Sec.GenerarInforme();
        Sec.Salary(10, Salary);
        
        Employee Boss= new Boss("Jorge");
        Boss.GenerarInforme();
        Boss.Salary(20, Salary);
        
        Disenadores dise= new Disenadores("bryan"){
            @Override
            public String dibujos() {
               return "Muchos dibujos\n" ; //To change body of generated methods, choose Tools | Templates.
            }

            @Override
            public int NumeroDibujos() {
               return 20; //To change body of generated methods, choose Tools | Templates.
            }
    };
        dise.Dibujo();
        dise.GenerarInforme();
        System.out.print(dise.NumeroDibujos()+"\n");
       
        
    }
}

