public class Nome {
    public static void main(String[] args) {
    
    
    
       Dados DadoPessoa = new  Dados();
       InfoFaculdade dadosfacul = new InfoFaculdade();
 
          DadoPessoa.nome = "Guilherme Gomes";
          DadoPessoa.cidade = "Sinop";
          DadoPessoa.idade = 20;
          dadosfacul.turma = "2º ADS";
          dadosfacul.turno = "Vespertino";
          dadosfacul.curso = ("Analise e desenvolvimento de Sistemas");
          dadosfacul.ra = 2258;
          
          System.out.println("Nome : " + DadoPessoa.nome);
          
          System.out.println("Cidade : " + DadoPessoa.cidade);
          
          System.out.println("Idade : " + DadoPessoa.idade);
           
          System.out.println("Semestre : " + dadosfacul.curso);
          
          System.out.println("Turno : " + dadosfacul.turno);
          
          System.out.println("Curso : " + dadosfacul.curso);
          
          System.out.println("Ra: " + dadosfacul.ra);
          
 
    } 
 }