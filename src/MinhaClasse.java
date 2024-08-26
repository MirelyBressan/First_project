public class MinhaClasse {
    public static void main (String [] args) {
        System.out.println("Olá!");
        
        //Estrutura 
        //Tipo NomeBemDefino = Atribuiçao (opcional em alguns casos)

        //Exemplo
        //int idade = 23;
        //double altura = 1.62;
        //Dog spike; // observe que aqui a variável spike não tem valor 

        // Variáveis
        //String meuNome = "Mirely";
        //int anoFabricacao = 2023;
        //boolean verdadeira = false;

        //Métodos
        //Exemplo
        //int somar (int numeroUm, int numero2);
        //String formatarCep (long cep);

        String primeiroNome = "Mirely";
        String segundoNome = "Bressan";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);  

        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
