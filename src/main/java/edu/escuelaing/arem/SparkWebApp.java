package edu.escuelaing.arem;
import org.json.JSONObject;

import static spark.Spark.*;
public class SparkWebApp {

    public static void main(String[] args) {
        port(getPort());
        staticFiles.location("/public");
        get("/Converter/:tipo/:numero", (req, res) -> parse(req.params(":tipo"),req.params(":numero")));
    }

    public static JSONObject parse(String tipo, String numero){
        Converter converter = new Converter(tipo);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("tipo", converter.getTipo());
        jsonObject.put("numero", numero);
        jsonObject.put("respuesta", converter.parse(Float.parseFloat(numero)));
        return jsonObject;
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set
    }


}
