package src;

import org.json.JSONException;
import org.json.JSONObject;

public class Main {
    public static void main(String[] args) throws JSONException {

        String HelloWorld = "Hello World";

        JSONObject HelloWorldJSON = new JSONObject().put("Message", HelloWorld);

        System.out.println(HelloWorldJSON.toString());
    }
}
