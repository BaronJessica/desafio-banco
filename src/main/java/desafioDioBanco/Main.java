package desafioDioBanco;

public class Main {
    public static void main(String[] args) {
        Cliente jessica = new Cliente();
        jessica.setNome("Jessica");

        conta cc = new contaCorrente(jessica);
        conta poupanca = new contaPoupanca(jessica);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
