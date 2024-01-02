package Interfacess.Herancamultiplaeoproblemadodiamante.devaice;

public abstract class Deveice {
    private String serialNumber;

    public Deveice(String serialNumber){
        this.serialNumber = serialNumber;
    }

    public String getSerialNumnber(){
        return serialNumber;
    }

    public void setSerialNumber(String seial){
        this.serialNumber = seial;
    }

    public abstract void processDoc(String doc);

}
