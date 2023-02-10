package Controller;

public class MinhaClasseTesteNova {
    public static void main (String[] args) throws Exception{
        MinhaClasseNova<Integer> inteiro = new MinhaClasseNova<>(2);
        inteiro.printar();

        MinhaClasseNova<Double> decimal = new MinhaClasseNova<>(2.00);
        decimal.printar();

        MinhaClasseNova<String> palavra = new MinhaClasseNova<>("Alou");
        palavra.printar();
    }
}
