import com.google.common.primitives.Floats;

public class Main {
    public static void main(String[] args) {
        float a = 4f;
        float b = 4f;
        int output = Floats.compare(a, b);
        System.out.println("Comparing " + a
                + " and " + b + " : "
                + output);


        float a2 = 4.2f;
        float b2 = 3.1f;
        int output2 = Floats.compare(a2, b2);
        System.out.println("Comparing " + a2
                + " and " + b2 + " : "
                + output2);


        float a3 = 2.5f;
        float b3 = 4f;
        int output3 = Floats.compare(a3, b3);
        System.out.println("Comparing " + a3
                + " and " + b3 + " : "
                + output3);
    }
}