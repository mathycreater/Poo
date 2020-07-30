
package ContaBanco;
public class ContaBanco {
    // atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    // métodos
    public void estadoAtual(){
    System.out.println("Conta: " + this.getNumConta());
    System.out.println("Tipo: " + this.getTipo());
    System.out.println("Dono: " + this.getDono());
    System.out.println("Saldo: " + this.getSaldo());
    System.out.println("Status: " + this.getStatus());
    }
    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)) {
            this.setSaldo(50);
        } else if ("CP".equals(t)) {
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso");
    }
    public void fecharConta(){
        if (this.getSaldo()> 0) {
            System.out.println("Conta não pode ser fechada");
        } else if (this.getSaldo() <0) {
            System.out.println("Conta não pode ser fechada");
        } else {
            this.setStatus(false);
            System.out.println("Conta fechada com sucesso!");            
        }
    }
    public void depositar(float v){
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado na conta");
        } else {
            System.out.println("Impossível depositar em uma conta fechada");       
        }       
    }
    public void sacar(float v){
        if (this.getStatus()) {
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado na conta");
                } else {
                    System.out.println("impossível sacar deuma conta fechada!");              
            }
        }
        
    }
    public void pagarMensal(){
        int v = 0;
        if ("CC".equals(this.getTipo())) {
            v = 12;       
        } else if ("CP".equals(this.getTipo())) {
            v = 20;
        }
        if (this.getStatus()) {
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso!");        
        } else {
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }
    // construtor
    public void ContaBanco(){
        this.saldo=0;
        this.status = false;
    }
    public void setNumConta(int n) {
        this.numConta = n;
    }

    public int getNumConta() {
        return numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDono() {
        return dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean getStatus() {
        return status;
    }    

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
} 
