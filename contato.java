import java.util.Scanner;

public class contato {
    public static void main(String[] args) {
        Scanner contato = new Scanner(System.in);
        int tam = 5;
        String nomes[] = new String[tam];
        String telefone[] = new String[tam];

        System.out.println("Bem-Vindo á lista de contatos! ");

        for(int i = 0; i < tam; i++){
            System.out.print("Informe o nome do contato " + (i + 1) + ": ");
            nomes[i] = contato.nextLine();
            System.out.print("Informe o número de telefone do contato " + (i + 1) + ": ");
            telefone[i] = contato.nextLine();
        }

        for(int i = 0; i < tam; i++){
            System.out.println("Nome: " + nomes[i]);
            System.out.println("Telefone: " + telefone[i]);
        }
    }
    
}
    
    

     
