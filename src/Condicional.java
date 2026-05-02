public class Condicional {
    public static void main(String[] args) {

        int anoDoLancamento = 2022;
        boolean incluidoNoPlano = true;
        double media= (9.5 + 6.2 + 8.4) / 3;
        String tipoPlano = "normal";

        if (anoDoLancamento >= 2022){
            System.out.println("Lançamento acima ou do ano de 2022.");
        }else {
            System.out.println("Lançamento abaixo do ano de 2022.");
        }

        if (incluidoNoPlano == true && tipoPlano.equals("plus")){
            System.out.println("Liberado para assistir o filme.");
        } else {
            System.out.println("Fora do plano ou deve pagar a assinatura.");
        }

    }
}
