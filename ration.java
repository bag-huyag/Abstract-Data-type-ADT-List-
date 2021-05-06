
public class ration implements Comparable<ration> {
    private int chisl;
    private int znamen;

    public ration(int a, int b) {
        if (b == 0) throw new ArithmeticException("Error");
        chisl = a;
        znamen = b;
        int n = delitel(Math.abs(chisl), Math.abs(znamen));
        chisl /= n;
        znamen /= n;
        if (znamen < 0) {
            chisl *= -1;
            znamen *= -1;
        }
    }

    //НОД
    private int delitel(int g, int k) {
        int f;
        do {
            f = g % k;
            g = k;
            k = f;
        }
        while (f != 0);
        return g;
    }

    public int compareTo(ration o) {
        return (chisl * o.znamen) - (o.chisl * znamen);
    }

    public String toString() {
        String s = "";
        if (chisl == 0) {
            s += 0;
        } else {
            if (znamen == 1) s += chisl;
            else s += chisl + "/" + znamen;

        }
        return (s);
    }
}
