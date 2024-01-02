package Interfacess.Herancamultiplaeoproblemadodiamante.devaice;

public class ComboDeveice extends Deveice implements Scanner, Printer {

    public ComboDeveice(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void printer(String doc) {
        System.out.println("Printer: " + doc);
    }

    @Override
    public String scan() {
        return "Scanner content";
    }

    @Override
    public void processDoc(String doc) {
        System.out.println("Combo process: " + doc);
    }
    
}
