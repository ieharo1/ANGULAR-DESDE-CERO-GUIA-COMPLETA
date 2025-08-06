package herencia_interfaces;

public abstract class Disenadores extends Employee implements ICaracteristicas, IRepetido {
    public Disenadores(String name){
        super();
    }
    public void Dibujo(){
    System.out.print("Estoy dibujando\n");
    }
    int ICaracteristicas(){
        int numero=10;
        return numero;
    }
    int IRepetido(){
        return 90;
    }
    public abstract String dibujos();
}
