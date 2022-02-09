package edu.escuelaing.arem;

public class Converter {

    private String tipo;



    public Converter(String type) {
        this.tipo = type;

    }

    public float parse(float n){
        if( tipo.equals("Celsius")){
            return parseFahrenheit(n);
        }
        else if(tipo.equals("Fahrenheit")) {
            return parseCelsius(n);
        }
        return 0;
    }

    private float parseFahrenheit(float numero) {
        float answer = numero * 9/5 + 32;
        return answer;
    }

    private float parseCelsius(float numero){
        float answer = (numero - 32) * 5/9 ;
        return answer;
    }


    public String getTipo() {
        return tipo;
    }


}
