package desafioDioBanco;

public class contaPoupanca extends conta{

    public contaPoupanca(Cliente cliente){
        super(cliente);
    }
    @Override
    public void imprimirExtrato() {
        System.out.println("--extrato conta poupanca--");
        super.imiprimirInfosComuns();
    }
}
