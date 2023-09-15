import java.time.LocalDate;

import entidades.Endereco;
import entidades.pessoas.Paciente;

public class App {
    public static void main(String[] args) throws Exception {
        Paciente paciente = new Paciente("João","123", new Endereco(), LocalDate.of(2000, 8,10));

        System.out.println(paciente);
    }
}
