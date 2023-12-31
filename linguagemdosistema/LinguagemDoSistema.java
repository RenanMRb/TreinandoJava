package linguagemdosistema;

import java.util.*;

public class LinguagemDoSistema {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");  
        System.out.flush(); 
        Locale localizacao = Locale.getDefault();
        System.out.print("Idioma do sistema: ");
        System.out.print(localizacao.getDisplayLanguage());
        System.out.print("-");
        System.out.println(localizacao.getLanguage());
    }
}