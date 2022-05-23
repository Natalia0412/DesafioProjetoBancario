public class Main {
    public static void main(String[] args) {
        Cliente cli=new Cliente();
        cli.setNome("Natália");
        Conta cc=new ContaCorrente(cli);
        cc.depositar(100);

        Conta cp=new ContaPoupanca(cli);
        cp.depositar(100);
        cp.sacar(50);
        cc.transferir(50,cp);
       cc.imprimirExtrato();
       cp.imprimirExtrato();
    }
}
