
package projetoherancas;
/*Aqui bolsista extends de ALUNO que estends de pessoa*/

public class Bolsista extends Aluno{
    
    private double bolsa;
    
    
    
    public void renovarBolsa(){
        System.out.println("Renovando bolsa de " + this.getNome());
        
    }
    
    //método sobrescrito com a palavra @Override que estendes de ALUNO,tem este mesmo
    // metodo
    
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome()+ " é bolsita! Pagamento com desconto!!");
        
    }

    public double getBolsa() {
        return bolsa;
    }

    public void setBolsa(double bolsa) {
        this.bolsa = bolsa;
    }
    
    

    
    
    
    
}
