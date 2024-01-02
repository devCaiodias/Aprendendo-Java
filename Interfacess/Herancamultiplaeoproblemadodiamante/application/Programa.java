package Interfacess.Herancamultiplaeoproblemadodiamante.application;

import Interfacess.Herancamultiplaeoproblemadodiamante.devaice.ComboDeveice;
import Interfacess.Herancamultiplaeoproblemadodiamante.devaice.ConcretePrinter;
import Interfacess.Herancamultiplaeoproblemadodiamante.devaice.ConcreteScanner;

public class Programa {
    public static void main(String[] args) {
        ConcretePrinter p = new ConcretePrinter("1206");
        p.processDoc("My Caio");
        p.printer("My Caio");

        System.out.println();
        ConcreteScanner s = new ConcreteScanner("1478");
        s.processDoc("My instagram");
        System.out.println("Scan Resulte: " + s.scan());

        System.out.println();
        ComboDeveice c = new ComboDeveice("14578");
        c.processDoc("My Vinicius");
        c.printer("My disertativo");
        System.out.println("Scanner Resulte: " + c.scan());
    }
}
