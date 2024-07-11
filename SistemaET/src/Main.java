import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Turista turista = new Turista("Acre",
                "Sidronium",
                new Date(),
                "Ficará 4 dias pra conhecer Las Vegas",
                "Acreano");

        Acomodacao acomodacao = new Acomodacao("Hotel Varginha",
                145235,
                "Rua dos Ovnis, 578",
                Optional.of(turista));

        Admin admin = new Admin("Horácio",
                "horacinho@gmail.delas",
                "ehohoras45");

        ArrayList<Turista> turistas = new ArrayList<>();

        Passeio passeio = new Passeio("Volta pelos cassinos",
                new Date(),
                "21h30",
                "23h10",
                150.00,
                Optional.of(turistas));

        Recepcionista recepcionista = new Recepcionista("Hercilio Luz",
                "herluz@email.com",
                "futfut777");
    }
}