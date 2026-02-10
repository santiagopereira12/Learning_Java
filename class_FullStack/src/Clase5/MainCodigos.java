package Clase5;

import java.util.ArrayList;
import java.util.List;

public class MainCodigos {
    public static void main(String[] args) {
        List<Codigos> code = new ArrayList<>();
        code.add(new Codigos(1,"Santiago"));
        code.add(new Codigos(2,"Camilo"));
        code.add(new Codigos(3,"Andres"));
        code.add(new Codigos(4,"Luis"));

        for (int i = 0 ; i < code.size(); i++){
            if (i == code.size() -1){
                System.out.println(code.get(i).getId());
            }
        }
    }
}
