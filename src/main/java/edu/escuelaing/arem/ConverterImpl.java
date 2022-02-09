package edu.escuelaing.arem;

import java.text.DecimalFormat;

public class ConverterImpl implements ConverterService {

    private String tipo;

    private static final DecimalFormat df = new DecimalFormat("0.00");


    public ConverterImpl(String type) {
        this.tipo = type;

    }

    @Override
    public String parse(float n){
        if( tipo.equals("Celsius")){
            return parseFahrenheit(n);
        }
        else if(tipo.equals("Fahrenheit")) {
            return parseCelsius(n);
        }
        return "";
    }

    private String parseFahrenheit(float numero) {
        float answer = numero * 9/5 + 32;

        return df.format(answer);
    }

    private String parseCelsius(float numero){
        float answer = (numero - 32) * 5/9 ;
        return df.format(answer);
    }


    public String getType() {
        return tipo;
    }


}
