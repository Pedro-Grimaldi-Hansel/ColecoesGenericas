package Controller;

public class MinhaClasse {
    private static int num;
    public static Double num1;

    public MinhaClasse (int num){
        this.num=num;
    }
    public MinhaClasse (Double num1){
        this.num1=num1;
    }
    public static int aoQuadrado(){
        return num*num;
    }
    public static Double aoQuadradoD(){
        return num1*num1;
    }
}
