import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class ForAndWhile {
    public static void main(String[] args) {
        /*for (int i = 0; i < 10; i++) {
           System.out.println("printa " + i);
        }*/

        List<String> funcionarios = new ArrayList<>();
        funcionarios.add("Rodrigo");
        funcionarios.add("Fred");
        funcionarios.add("Lucas");
        funcionarios.add("Vilmar");
        funcionarios.add("André");

        for (int i = 0; i < funcionarios.size(); i++) {
            System.out.println("Funcionario " + funcionarios.get(i));
        }
    }
}
