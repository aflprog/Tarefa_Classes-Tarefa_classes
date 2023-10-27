/**
 *  Alexandre Ferreira de Lima
 **/
public class Classe_Principal {

    public static void main(String args[]){
            Aluno Aluno= new Aluno();
            Aluno.setNomeAluno("Alexandre");
            Aluno.setIdade(40);

            System.out.println("Aluno: "+Aluno.getNomeAluno()); /* escreve o nome do aluno
             na tela (pulei linha só pra usar esse tipo de comentário, desculpe pela bagunça, vou melhorar)*/

            System.out.println("Idade: "+Aluno.getIdade()+" anos");// escreve a idade do aluno na tela..
    }
}
