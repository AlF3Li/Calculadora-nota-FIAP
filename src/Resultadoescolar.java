import java.util.Arrays;
import java.util.Scanner;

public class Resultadoescolar{
    
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        
        System.out.println("================ MENU ================");
        System.out.println("1 - Calcular nota do primeiro semestre");
        System.out.println("2 - Calcular nota do segundo semestre");
        System.out.println("3 - Calcular nota final (ano inteiro)");
        System.out.println("======================================");

        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
    
        switch (opcao) {
            case 1:
                calcular1Semestre();
                break;
    
            case 2:
                calcular2Semestre();
                break;
    
            case 3:
                double nota1Semestre = calcular1Semestre();
                double nota2Semestre = calcular2Semestre();
                double notaFinal = (nota1Semestre * 0.4) + (nota2Semestre * 0.6);

            if (notaFinal >= 6 && notaFinal <= 10){
                System.out.printf("\nSua nota geral no ano foi de: %.1f%n%s%n", notaFinal, "Você está aprovado");
            } else if (notaFinal >= 4 && notaFinal < 6) {
                System.out.printf("\nSua nota geral no ano foi de: %.1f%n%s%n", notaFinal, "Você está de exame");
            } else if (notaFinal >= 0 && notaFinal < 4){
                System.out.printf("\nSua nota geral no ano foi de: %.1f%n%s%n", notaFinal, "Você está reprovado");
            }
        }
    }
    public static double calcular1Semestre(){

        System.out.println("\nNOTA DO PRIMEIRO SEMESTRE\n");


        System.out.println("Digite sua primeira nota do challenge: "); 
        byte notaChallenge1 = scanner.nextByte();

        System.out.println("Digite sua segunda nota do challenge: "); 
        byte notaChallenge2 = scanner.nextByte();

        System.out.println("Digite sua terceira nota do challenge: "); 
        byte notaChallenge3 = scanner.nextByte();

        System.out.println("Digite sua primeira nota do checkpoint: "); 
        byte notaCheckpoint1 = scanner.nextByte();

        System.out.println("Digite sua segunda nota do checkpoint: "); 
        byte notaCheckpoint2 = scanner.nextByte();

        System.out.println("Digite sua terceira nota do checkpoint: "); 
        byte notaCheckpoint3 = scanner.nextByte();
        
        System.out.println("Digite sua nota da GS: "); 
        byte notaGs = scanner.nextByte();

        byte[] notasChallenge = { notaChallenge1, notaChallenge2, notaChallenge3 };
        Arrays.sort(notasChallenge);
        float mediaChallenge = (notasChallenge[1] + notasChallenge[2]) / 2f;

        byte[] notasCheckpoint = { notaCheckpoint1, notaCheckpoint2, notaCheckpoint3 };
        Arrays.sort(notasCheckpoint);
        float mediaCheckpoint = (notasCheckpoint[1] + notasCheckpoint[2]) / 2f;

        double nota1Semestre = mediaChallenge * 0.2f + mediaCheckpoint * 0.2f + notaGs * 0.6;
        

        if(nota1Semestre >= 6 && nota1Semestre <= 10){
            System.out.printf("SUA NOTA DO PRIMEIRO SEMESTRE: %.1f%n", nota1Semestre);
        } else {
            System.out.println("Ocorreu um erro no input da nota. Insira um número de 0 até 10");
        }
        return nota1Semestre;

        }
        

        public static double calcular2Semestre(){

            System.out.println("\nNOTA DO SEGUNDO SEMESTRE\n");

            System.out.println("Digite sua primeira nota do challenge: "); 
            byte notaChallenge1 = scanner.nextByte();
    
            System.out.println("Digite sua segunda nota do challenge: "); 
            byte notaChallenge2 = scanner.nextByte();
    
            System.out.println("Digite sua terceira nota do challenge: "); 
            byte notaChallenge3 = scanner.nextByte();
    
            System.out.println("Digite sua primeira nota do checkpoint: "); 
            byte notaCheckpoint1 = scanner.nextByte();
    
            System.out.println("Digite sua segunda nota do checkpoint: "); 
            byte notaCheckpoint2 = scanner.nextByte();
    
            System.out.println("Digite sua terceira nota do checkpoint: "); 
            byte notaCheckpoint3 = scanner.nextByte();
            
            System.out.println("Digite sua nota da GS: "); 
            byte notaGs = scanner.nextByte();
    
            byte[] notasChallenge = { notaChallenge1, notaChallenge2, notaChallenge3 };
            Arrays.sort(notasChallenge);
            float mediaChallenge = (notasChallenge[1] + notasChallenge[2]) / 2f;
    
            byte[] notasCheckpoint = { notaCheckpoint1, notaCheckpoint2, notaCheckpoint3 };
            Arrays.sort(notasCheckpoint);
            float mediaCheckpoint = (notasCheckpoint[1] + notasCheckpoint[2]) / 2f;
    
            double nota2Semestre = mediaChallenge * 0.2f + mediaCheckpoint * 0.2f + notaGs * 0.6;

            if(nota2Semestre >= 6 && nota2Semestre <= 10){
                System.out.printf("SUA NOTA DO SEGUNDO SEMESTRE: %.1f%n", nota2Semestre);
            } else {
                System.out.println("Ocorreu um erro no input da nota. Insira um número de 0 até 10");
            }

            return nota2Semestre;
        }
    }