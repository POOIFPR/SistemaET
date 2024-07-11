import java.util.Optional;

public class Acomodacao {
    String nome;
    int identificacao;
    String endereco;
    Optional<Turista> turista;

    public Acomodacao(String nome, int identificacao, String endereco, Optional<Turista> turista) {
        this.nome = nome;
        this.identificacao = identificacao;
        this.endereco = endereco;
        this.turista = turista;
    }
}
