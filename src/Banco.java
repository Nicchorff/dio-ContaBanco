public class Banco {
    public int numero;
    public String agencia;
    public String nome;
    public  double saldo;

    public Banco(int numero, String agencia, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.saldo = saldo;
    }

    public String nomeCompleto(String nome, String sobrenome){
        return nome + " " + sobrenome;
    }
}
