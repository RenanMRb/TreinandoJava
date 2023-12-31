package resolucaodosistema;

import java.awt.*;

public class ResolucaoDoSistema {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        Toolkit resolucao = Toolkit.getDefaultToolkit();
        Dimension dimensao = resolucao.getScreenSize();
        System.out.println("Resolução do sistema: " +dimensao.width + " x " +dimensao.height);
    }
}