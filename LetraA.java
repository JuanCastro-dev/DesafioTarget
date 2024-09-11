public class LetraA{

    public static void main(String[] args){
        String frase = "Este código demonstrará quantidade de letras A presente nesta frase";
        char letraA = 'A';
        frase = frase.toUpperCase();

        int contador = 0;

        for(int i=0;i<frase.length();i++){
            if (frase.charAt(i) == letraA){
                contador = contador + 1;
            }
        }

        System.out.println("Quantidade de letras 'A': " + contador);



    }
    
}
