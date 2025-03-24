import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner opcaoScanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("-----   Cadastro    -----\n");
            System.out.println("Selecione sua opção:\n1. Unidade\n2. Proprietario\n3. Condominio\n4. Sair\n\nOpção:");
            
            int op = opcaoScanner.nextInt(); // Isso vai ler o proximo digito inteiro e mandar pro op
            
            if (op == 1) {
                System.out.println("-----    Unidade -----\n");
            } else if (op == 2) {
                System.out.println("-----    Proprietario -----\n");
            } else if (op == 3) {
                System.out.println("-----    Condominio -----\n");
            } else if (op == 4) {
                System.out.println("-----    Saida -----\n");
                break; // Sair do loop
            } else {
                System.out.println("OPÇÃO INVALIDA!\n");
            }
        }
        
        opcaoScanner.close(); // fecha o scanner 
    }
}




//import java.util.Scanner;

//public class Menu{

//    public static void main(String[] args) {
//        while (true){
//            int op = 0;            
//            System.out.println("-----   Cadastro    -----\n");
//            Scanner opcaoScanner = new Scanner(System.in);
//
//            System.out.println("Selecione sua opção:\n1. Unidade\n2. Proprietario\n3. Condominio\n4.Sair\n\nOpção:");
//           int op = opcaoScanner;
//            if (op == 1){
//                System.out.println("-----    Proprietario -----\n");
//            }
//            if (op == 2){
//                System.out.println("-----    Proprietario -----\n");
//            }
//           if (op == 3){
//                System.out.println("-----    Proprietario -----\n");
//            }
//            if (op == 4){
//                System.out.println("-----    Saida -----\n");
//                break;
//            }
//            else{
//                System.out.println("OPÇÃO INVALIDA!\n");
//            }
//            
//            
//       }
//    }
//}       
