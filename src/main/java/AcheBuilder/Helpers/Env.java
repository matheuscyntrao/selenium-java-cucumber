package AcheBuilder.Helpers;

import io.github.cdimascio.dotenv.Dotenv;

public class Env {

    public static String getEnvURL(String url) {
        Dotenv dotenv = Dotenv.load();
        return dotenv.get(url);
    }

}
