
package projetoherancas;


public class Tecnico extends Aluno{
    
    private String registroProfissional;
    
    
    public void praticar(){
        System.out.println("Tecnico em Informatica");
        
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
    
    
    
}
