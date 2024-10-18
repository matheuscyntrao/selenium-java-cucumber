package AcheBuilder.Helpers;

public class CPFGenerator {

    private boolean withDots = true;

    private int randomize(int n) {
        int ranNum = (int) (Math.random() * n);
        return ranNum;
    }

    private int mod(int dd, int dv) {
        return (int) Math.round(dd - (Math.floor(dd / dv) * dv));
    }

    public String getValidRandomCPF() {
        int n = 9;
        int n1 = randomize(n);
        int n2 = randomize(n);
        int n3 = randomize(n);
        int n4 = randomize(n);
        int n5 = randomize(n);
        int n6 = randomize(n);
        int n7 = randomize(n);
        int n8 = randomize(n);
        int n9 = randomize(n);
        int d1 = n9 * 2 + n8 * 3 + n7 * 4 + n6 * 5 + n5 * 6 + n4 * 7 + n3 * 8 + n2 * 9 + n1 * 10;

        d1 = 11 - (mod(d1, 11));

        if (d1 >= 10)
            d1 = 0;

        int d2 = d1 * 2 + n9 * 3 + n8 * 4 + n7 * 5 + n6 * 6 + n5 * 7 + n4 * 8 + n3 * 9 + n2 * 10 + n1 * 11;

        d2 = 11 - (mod(d2, 11));

        String cpf = null;

        if (d2 >= 10)
            d2 = 0;
        cpf = "";

        if (withDots)
            cpf = "" + n1 + n2 + n3 + '.' + n4 + n5 + n6 + '.' + n7 + n8 + n9 + '-' + d1 + d2;
        else
            cpf = "" + n1 + n2 + n3 + n4 + n5 + n6 + n7 + n8 + n9 + d1 + d2;

        return cpf;
    }

}