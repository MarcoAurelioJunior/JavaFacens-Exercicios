package exercicioCursoExtra;
import java.util.Scanner;
public class calculoVolume {
    public static void main(String[] args) {

        double valorPi = 3.14156; //Utilizado em vários calculos de volume

        Scanner scannerOption = new Scanner(System.in); // Scanner para saber a opção do usuário
            
            System.out.println("Digite 1: Calcular volume de uma ESFERA");
            System.out.println("Digite 2: Calcular volume de um CILINDRO");
            System.out.println("Digite 3: Calcular volume de um CUBO");
            System.out.print("Escolha uma dessas opções: ");

            int valorEscolhido = scannerOption.nextInt();
        

            if (valorEscolhido == 1) { 
                Scanner esfera = new Scanner(System.in);

                    System.out.print("Digite o valor do RAIO da esfera: ");   
                    
                    double valorRaioEsfera = esfera.nextFloat();

                    double calculoVolumeEsfera =  (((double)4/3) * valorPi) * (valorRaioEsfera * valorRaioEsfera * valorRaioEsfera);;
                    System.out.printf("O valor do volume dessa esfera é de aproximadamente: %.2f", calculoVolumeEsfera);

                esfera.close();
            } else if(valorEscolhido == 2) {

                Scanner scanner = new Scanner(System.in);
                    System.out.print("Digite o valor do Raio do cilindro: ");
                    double valorRaio = scanner.nextDouble();
                        System.out.print("Digite o valor da altura do cilindro: ");
                    double valorAltura = scanner.nextDouble();

                    double calculoVolume =  valorPi * ((valorRaio*valorRaio) * valorAltura);

                    System.out.printf("O valor do volume desse cilindro é de apoximadamente: %.2f", calculoVolume);

                scanner.close();
                
            } else if(valorEscolhido == 3){
                Scanner cubo = new Scanner(System.in);
                    System.out.print("Digite o valor de um dos lados: ");

                    double valorLadoCubo = cubo.nextDouble();

                    double calculoVolumeCubo = valorLadoCubo * valorLadoCubo * valorLadoCubo;
                    System.out.printf("O valor do volume do cubo é de: %.1f", calculoVolumeCubo);

                cubo.close();
            } else{
                System.out.printf("O valor %d, não existe!", valorEscolhido);
            }


        scannerOption.close();
    }

}
