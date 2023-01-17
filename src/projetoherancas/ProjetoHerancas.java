
package projetoherancas;

public class ProjetoHerancas {

    
    public static void main(String[] args) {
        Visitante v1= new Visitante();
        v1.setNome("Dáda");
        v1.setIdade(35);
        v1.setSexo("Feminino");
        
        Aluno aluno = new Aluno();
        aluno.setNome("Claudio");
        aluno.setCurso("Informatica");
        aluno.setIdade(25);
        aluno.pagarMensalidade();
        
        Professor professor = new Professor();
        professor.setNome("João");
        professor.setSalario(1500f);
        professor.setEspecialidade("Java");
        professor.receberAumento();
        
        Tecnico tecnico = new Tecnico();
        tecnico.setNome("Antenor");
        tecnico.setRegistroProfissional("Dar Aula");
        
        
        System.out.println(v1.toString());
        System.out.println(aluno.toString());
        System.out.println(professor.toString());
        System.out.println(tecnico.toString());
    }
    
}
