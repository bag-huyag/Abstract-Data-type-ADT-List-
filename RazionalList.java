public class RazionalList implements Comparable <RazionalList>{
    private  int chisl;
    private int znam;
    public RazionalList (int c,int z)
    {
        int p;
        if (z==0) throw new ArithmeticException("Знаменатель не может равняться нулю");
        chisl=c;
        znam=z;
        if (chisl!=0)
        {
            p=del(Math.abs(chisl),Math.abs(znam));
        znam/=p;
        chisl/=p;
        }
    }
    private int del (int c,int k) // нахождение НОД
    {
        int tmp;
        while (k !=0) //do while
        {
            tmp = c%k;
             c = k;
            k = tmp;
        }
        return c;
    }
    public int compareTo (RazionalList x)
    {
        return ((chisl*x.znam)-(x.chisl*znam));
    } //проверка на сокращемость дроби
    public String toString () //для вывода на печать+ выделить целую часть для вывода  в виде прави. дроби
    {
        String str= chisl+"/"+znam;
        return str;
    }
}
