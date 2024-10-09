import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int votosTaffe = 0;
        int votosRofrigo = 0;
        int votosLucas = 0;
        int votosAlessandro = 0;
        int votosInvalidos = 0;




        //Informar quantos usuarios irão votar
        System.out.println("informe quantos eleitores");
        int quantidadeEleitor = scanner.nextInt();


        //criando uma forma de guardar votos
        int[] votosRealizados = new int[quantidadeEleitor];

        for (int i = 0; i < quantidadeEleitor; i++) {

            System.out.println("exibindo votos");
            System.out.println("Taffe teve: " + votosTaffe + "votos!");
            System.out.println("Rodrigp teve: " + votosRofrigo + "votos!");
            System.out.println("Lucas teve: " + votosLucas + "votos!");
            System.out.println("Alessandro teve: " + votosAlessandro + "votos!");

            if (votosTaffe > votosRofrigo && votosTaffe > votosAlessandro && votosTaffe > votosLucas) {
                System.out.println("O grande ganhador é o Taffe");
            } else if (votosRofrigo > votosTaffe && votosRofrigo > votosAlessandro && votosRofrigo > votosLucas) {
                System.out.println("O grande ganhador é o Rodrigo");
            } else if (votosAlessandro > votosTaffe && votosAlessandro > votosRofrigo && votosAlessandro > votosLucas) {
                System.out.println("O grande ganhador é o Alessandro");
            } else {
                System.out.println("O grande ganhador é o Lucas");


                int voto = 0;

                do{
                    System.out.println("Eleitor numero " + i);
                    System.out.println("Os candidatos da eleição são os seguintes");
                    System.out.println("99 - Taffe");
                    System.out.println("88 - Rodrigo");
                    System.out.println("77 - Lucas");
                    System.out.println("66 - Alessandro");
                    System.out.println("qual seu voto ?");

                    voto = scanner.nextInt();

                } while (voto != 99 && voto != 88 && voto != 77 && voto != 66);

                //guarda o voto
                votosRealizados[i] = voto;

                //Contabillizando o total dos votos
                if (voto == 99) {
                    votosTaffe++;
                } else if (voto == 88) {
                    votosRofrigo++;
                } else if (voto == 77) {
                    votosLucas++;
                } else {
                    votosAlessandro++;
                }


            }
        }
    }
}