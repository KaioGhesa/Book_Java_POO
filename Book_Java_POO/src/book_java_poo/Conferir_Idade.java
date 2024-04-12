package book_java_poo;
import java.util.Scanner;

public class Conferir_Idade {
    public static void main(String[] args) {
        
        int idade;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite sua idade: ");
        idade = sc.nextInt();
        
        if(idade < 18){
            System.out.println("Menor de idade nao entra!!!");
        }else{
            System.out.println("Seja bem vindo Sr.");
        }
    }
}
