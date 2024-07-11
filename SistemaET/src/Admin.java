public class Admin implements Sistema{
    String nome;
    String email;
    String senha;
    NivelAcessoSistema nivelAcesso = NivelAcessoSistema.ADMIN;

    public Admin() {
    }

    public Admin(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    @Override
    public Turista registrarTurista() {
        return null;
    }

    @Override
    public Acomodacao reservarAcomodacao() {
        return null;
    }

    @Override
    public Passeio agendarPasseio() {
        return null;
    }

    @Override
    public void traduzir() {

    }

    public void monitorarSaude(){}

    public void iniciarProtocoloEmergencia(){}
}
