import java.util.Scanner;

public class ProcessoSeletivo {

    public static String[] CadastrarCandidatos(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número de candidatos: ");
        int qtdeCandidatos = scanner.nextInt(); 
        scanner.nextLine();
        
        String[] candidatos = new String[qtdeCandidatos];

        for(int i = 0; i < qtdeCandidatos; i++){
            System.out.println("Digite o nome do candidato " + (i+1)  + ": ");
            candidatos[i] = scanner.nextLine(); 
            
        }

        scanner.close();
        
        return candidatos; 
    }

    public static boolean AnalisarCandidato(double salarioPretendido){

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

    public static String[] SelecionarCandidatos(String[] candidatos){

         Scanner scanner = new Scanner(System.in);

         int qtdeSelecionados = 0, candidatoAtual = 0;
         String[] candidatosSelecionados = new String[5];

         while(qtdeSelecionados < 5){

            System.out.println("Salário pretendido do candidato " + (candidatoAtual + 1) +" (" + candidatos[candidatoAtual] + "): ");
                double salarioPretendido = scanner.nextDouble(); 
                scanner.nextLine();

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

        scanner.close();

        return candidatosSelecionados;    
    }
 
    public static void MostrarCandidatos(String[] selecionados){

        System.out.println("Os candidatos selecionados foram: ");
        for(int i = 0; i < selecionados.length; i++){
            System.out.println(selecionados[i]);
        }
    }

    public static void main (String[] args){

        String[] candidatos = CadastrarCandidatos(); 
        String[] selecionados = SelecionarCandidatos(candidatos);

        MostrarCandidatos(selecionados);


    }

    

    
}