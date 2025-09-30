import java.util.Scanner;
import java.util.ArrayList;
public class main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String name;
        dado d = new dado();
        int qtdj, i, somaF=0, apost;
        do{
            System.out.print("Quantos jogadores teremos na partida?\t");
            qtdj = scan.nextInt();
            scan.nextLine();
        }while(qtdj<=0 || qtdj>11);
        ArrayList<player>jogadores = new ArrayList<player>();
        for(i=0;i<qtdj;i++){
            player aux = new player();
            System.out.println("Nome do(a) jogador(ra) de númreo " + i);
            name = scan.nextLine();
            aux.setNome(name);
            do{
                System.out.println("E o valor da sua aposta (>1 e <13)");
                apost = scan.nextInt();
                aux.setAposta(apost);
                scan.nextLine();
            }while(aux.getAposta()<=1 || aux.getAposta()>12);
            jogadores.add(aux);
        }
        System.out.println("\n\tValor dos dados: " + d.somaDD());
        System.out.println("\tVencedores:\n");
        for(i=0;i<jogadores.size();i++){
            if(jogadores.get(i).getAposta() == d.somaDD()){
                System.out.println(jogadores.get(i).getNome().trim().toUpperCase());
            }else{
                somaF++;
            }
        }
        if(somaF==qtdj){
            System.out.print("COMPUTADOR");
        }
    }
}
