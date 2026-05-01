public class Main {
    public static void main(String[] args) {

        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maverick");

        // Declaração de variáveis
        int anoDoLancamento = 2002;
        System.out.println("Ano de lançamento: " + anoDoLancamento);

        boolean incluidoNoPlano = true;

        double media= (9.5 + 6.2 + 8.4) / 3;
        System.out.println(media);

        String sinopse;
        sinopse = """
                Filme Top Gun
                Filme de aventura
                Muito Bom!
                Ano de Lançamento:
                """ + anoDoLancamento;
        System.out.println(sinopse);

        //Casting de tipos de variáveis (Perdendo a precisão do calculo por retornar um valor inteiro)
        int classificacao = (int) (media/2);

    }
}