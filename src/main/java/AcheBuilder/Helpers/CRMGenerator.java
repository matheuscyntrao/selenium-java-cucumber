package AcheBuilder.Helpers;

import java.util.Random;

public class CRMGenerator {

    private String generate() {
        StringBuilder builder = new StringBuilder();
        Random rnd = new Random();
        while (builder.length() < 7) {
            int index = (int)(rnd.nextFloat() * "1234567890".length());
            builder.append("1234567890".charAt(index));
        }
        return builder.toString();
    }

    public String getValidRandomCRM() {
        return this.generate();
    }

}
