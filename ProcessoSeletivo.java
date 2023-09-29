import java.util.Scanner;

public class ProcessoSeletivo {

    Scanner scanner = new Scanner(System.in);
    public static void main (String[] args){

    }

    public boolean AnalisarCandidato(double salarioPretendido){

        double salarioBase= 2000;

        if(salarioBase > salarioPretendido){
            System.out.println("Ligar pro candidato");
            return true; 
        }
        else if(salarioBase == salarioPretendido){
            System.out.println("Ligar pro candidato com contra proposta");
            return true; 
        }
        else{
            System.out.println("Aguardando resultado dos demais candidatos");
            return false; 
        }

    }

    public void CadastrarCandidatos(){

        System.out.println("Digite o número de candidatos: ");
        int qtdeCandidatos = scanner.nextInt(); 

        String[] candidatos = new String[qtdeCandidatos];

        for(int i = 0; i < qtdeCandidatos; i++){
            System.out.println("Digite o nome do candidato " + (i+1)  + ": ");
            candidatos[i] = scanner.nextLine(); 
        }
    }

    public void SelecionarCandidatos(String[] candidatos){

         int qtdeSelecionados = 0, candidatoAtual = 0;
         String[] candidatosSelecionados = new String[5];

         while(qtdeSelecionados < 5){

            System.out.println("Salário pretendido do candidato " + (candidatoAtual + 1) +" (" + candidatos[candidatoAtual] + "): ");
            double salarioPretendido = scanner.nextDouble(); 

            if(AnalisarCandidato(salarioPretendido)){

                System.out.println( candidatos[candidatoAtual] + " foi selecionado(a)!");

                candidatosSelecionados[qtdeSelecionados]= candidatos[candidatoAtual]; 
                qtdeSelecionados++; 
            }
            else{
               System.out.println( candidatos[candidatoAtual] + " não foi selecionado(a)"); 
            }

            candidatoAtual++; 
        }

    }
 
}