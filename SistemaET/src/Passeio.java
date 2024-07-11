import java.util.ArrayList;
import java.util.Date;
import java.util.Optional;

public class Passeio {
    String nome;
    Date dataPasseio;
    String horarioInicio;
    String horarioFim;
    Double preco;
    Optional<ArrayList<Turista>> turistas;

    public Passeio() {
    }

    public Passeio(String nome, Date dataPasseio, String horarioInicio, String horarioFim, Double preco, Optional<ArrayList<Turista>> turistas) {
        this.nome = nome;
        this.dataPasseio = dataPasseio;
        this.horarioInicio = horarioInicio;
        this.horarioFim = horarioFim;
        this.preco = preco;
        this.turistas = turistas;
    }
}
