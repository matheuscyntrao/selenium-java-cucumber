package AcheBuilder.Helpers;

import java.util.Random;

public  class EmailGenerator {

    private String generate() {
        StringBuilder builder = new StringBuilder();
        Random rnd = new Random();
        while (builder.length() < 20) {
            int index = (int)(rnd.nextFloat() * "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".length());
            builder.append("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890".charAt(index));
        }
        return builder + "@mailinator.com";
    }

    public String getValidRandomEmail() {
        return this.generate();
    }

}
