package app;

public class Multiplos {
    public String metodo1(int n){
        if( (n % 3 == 0) && (n % 5 == 0)){
            return "Facebook";
        }else if (n % 3 == 0){
            return "Face";
        }else if (n % 5 == 0){
            return "book";
        }else{
            return String.valueOf(n);
        }
    }
    public String metodo2(int[] n){
        String resultado = "";
        for(int i = 0; i < n.length; i++){
            resultado +=   metodo1(n[i]);
            if( i < n.length -1){
                resultado += " ";
            }
        }
        return resultado;
    }
}
