package Interfacess.Herancamultiplaeoproblemadodiamante.devaice;

public class ConcretePrinter extends Deveice implements Printer{

    public ConcretePrinter(String serialNumber) {
        super(serialNumber);
    }

    @Override
    public void processDoc(String doc) {
      System.out.println("Printer process: " + doc);
    }

    @Override
    public void printer(String doc) {
        System.out.println("Printer: " + doc);
    }
    
}
