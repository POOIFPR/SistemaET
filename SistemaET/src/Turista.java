import java.util.Date;

public class Turista {
    String planetaOrigem;
    String especie;
    Date dataChegada;
    String periodoDeEstadia;
    String idiomaNativo;

    public Turista() {
    }

    public Turista(String planetaOrigem, String especie, Date dataChegada, String periodoDeEstadia, String idiomaNativo) {
        this.planetaOrigem = planetaOrigem;
        this.especie = especie;
        this.dataChegada = dataChegada;
        this.periodoDeEstadia = periodoDeEstadia;
        this.idiomaNativo = idiomaNativo;
    }

    public String acessarInformacoesLocaisInteresse(){
        return null;
    }

    public String acessarRegras(){
        return null;
    }

    public String retornarServicos(){
        return null;
    }
}