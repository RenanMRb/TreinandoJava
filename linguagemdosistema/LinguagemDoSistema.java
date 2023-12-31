package linguagemdosistema;

import java.util.*;

public class LinguagemDoSistema {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        Locale localizacao = Locale.getDefault();
        System.out.println("Idioma do sistema: " + localizacao.getDisplayLanguage() + "-" + localizacao.getLanguage());
    }
}