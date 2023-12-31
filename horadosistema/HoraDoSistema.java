package horadosistema;

import java.util.Date;

public class HoraDoSistema {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        Date relogio = new Date();
        System.out.println("Hora do sistema: " + relogio.toString());
    }
}