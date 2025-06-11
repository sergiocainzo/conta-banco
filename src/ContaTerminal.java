import java.util.Random;
import java.util.Scanner;

public class ContaTerminal{
    // Atributos
    Scanner scan = new Scanner(System.in);
    Random random = new Random();
    private int numero;
    private String agencia, nome_cliente;
    private double saldo;

    // Construtor
    public ContaTerminal() {
        this.setNumero(numero);
        this.setAgencia(agencia);
        this.setNome_cliente(nome_cliente);
        this.setSaldo(saldo);
    }

    // Métodos Getters & Setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    // Métodos Personalizados

    // Metodo de Cadastro de Cliente
    public void cadastrarConta() {
        System.out.println("************** CADASTRO **************");
        System.out.print("Informe seu Nome Completo: ");
        this.nome_cliente = scan.nextLine().toUpperCase().trim();
        System.out.print("Agencia: ");
        this.agencia = scan.nextLine().trim();
        System.out.print("Conta: ");
        this.numero = scan.nextInt();
        System.out.print("Saldo: R$");
        this.saldo = scan.nextDouble();
        System.out.println("\nProcessando....");

        // Adicionando os dados do cliente
        this.setNome_cliente(this.nome_cliente);
        this.setAgencia(this.agencia);
        this.setNumero(this.numero);
        this.setSaldo(this.saldo);

        // Encerrando o Scan
        scan.close();
        System.out.println("Cadastro realizado com sucesso.");

    }

    // Metodo de Exibição
    public void exibirCadastro() {
        System.out.println("\n************ Dados do Usuário ************");
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque.\n",this.getNome_cliente(),this.getAgencia(),this.getNumero(), this.getSaldo());
    }

}
