package herencia_interfaces;

public class Boss extends Employee {
    public Boss(String name){
        super();
    }
    public String Campeon(){
        return "Campeon";
    }
    @Override
    public void GenerarInforme(){
        System.out.print("El jefe esta genero un informe\n");
    }
}