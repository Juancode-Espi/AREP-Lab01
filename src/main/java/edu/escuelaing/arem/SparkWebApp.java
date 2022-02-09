package edu.escuelaing.arem;
import org.json.JSONObject;

import static spark.Spark.*;
public class SparkWebApp {

    public static void main(String[] args) {
        port(getPort());
        staticFiles.location("/public");
        get("/Converter/:type/:number", (req, res) -> parse(req.params(":type"),req.params(":number")));
    }

    public static JSONObject parse(String tipo, String numero){
        ConverterService converter = new ConverterImpl(tipo);
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("type", converter.getType());
        jsonObject.put("number", numero);
        jsonObject.put("answer", converter.parse(Float.parseFloat(numero)));
        return jsonObject;
    }

    static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 4567; //returns default port if heroku-port isn't set
    }


}
