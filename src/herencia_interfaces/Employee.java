package herencia_interfaces;

public class Employee {
    private String name;
    public void Employee(String nombre){
    name=nombre;
    }
    public void Salary(int numhours, int Salary)
    {
        Salary=numhours*7;
    }
    public void GenerarInforme(){
        System.out.printf("Estoy generando un informe\n");
      
    } 
    
}
