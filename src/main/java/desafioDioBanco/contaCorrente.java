package desafioDioBanco;

public class contaCorrente extends conta {


   public contaCorrente(Cliente cliente){
       super(cliente);

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("---extrato conta corrente---");
        super.imiprimirInfosComuns();

    }


}