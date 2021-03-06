package IXL;

/**
 * Created by renee on 8/13/17.
 */
public class Addition {
    public String addFraction(String s) {
        String[] fractions = s.split("\\+");
        String[] frac1 = fractions[0].split("/");
        int a = Integer.parseInt(frac1[0]);
        int b = Integer.parseInt(frac1[1]);
        String[] frac2 = fractions[1].split("/");
        int c = Integer.parseInt(frac2[0]);
        int d = Integer.parseInt(frac2[1]);

        int numerator = a * d + b * c;
        int denominator = b * d;
        int factor = gcd(numerator, denominator);
        while (factor != 1) {
            numerator /= factor;
            denominator /= factor;
            factor = gcd(numerator, denominator);
        }
        return String.valueOf(numerator) + "/" + String.valueOf(denominator);
    }
    private int gcd(int a, int b) {
        if (a % b != 0) {
            return gcd(b, a % b);
        } else {
            return b;
        }
    }
    public String[] getResult(String[] list) {
        String[] result = new String[list.length];
        for (int i = 0; i < list.length; i++) {
            result[i] = addFraction(list[i]);
        }
        return result;
    }
    public static void main(String[] args) {
        Addition sol = new Addition();
        System.out.println(sol.addFraction("2/1+3/4"));
    }
}
