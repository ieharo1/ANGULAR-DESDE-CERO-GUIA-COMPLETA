package herencia_interfaces;

public class Secretary extends Employee{
    public Secretary(String name){
        super();
    }
    @Override
    public void GenerarInforme(){
    System.out.print("La secretaria genero un informe\n");
    }
    
}
