package book_java_poo;
public class dados_primitivos {
    public static void main(String[] args) {
        int i = 5; //aqui recebe uma copia do valor 5
        int j = 6; // aqui recebe uma copia do valor 6
        int soma; // aqui recebe uma variavel escrito soma
        i = i + 1; // aqui soma o valor que esta em i + 1
        
        soma = i + j; //aqui soma i+1+ (valor que esta no numero 6)
        
        System.out.println("seu numero e " + soma);
    }
}
