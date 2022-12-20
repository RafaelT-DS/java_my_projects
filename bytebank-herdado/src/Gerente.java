//Gerente herda da Classe Funcionário, tem tudo o que o funcionário tem
public class Gerente extends Funcionario {
    private int senha;

    public void setSenha(int senha){ //DÚVIDA
        this.senha = senha;
    }

    public boolean autentica(int senha){
        if(this.senha == senha){
            return true;
        } else {
            return false;
        }
    }

    public Gerente(){

    }

    public double getBonificacao(){
        System.out.println("Chamando o método de bonificação do GERENTE");
        return super.getBonificacao() + super.getSalario(); //Super quer dizer
        // que o atributo não está nessa classe

    }


}
