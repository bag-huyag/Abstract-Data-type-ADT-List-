public class AbstractDelete {
    public static <L extends Comparable<L>> void deleteD (T<L> p) {
        L c;
        for (int i=p.first();i!=p.end();i=p.next(i)) {
            L now = p.retrieve(i);
            for (int j = p.next(i); j !=p.end(); j = p.next(j))
            {
                c=p.retrieve(j);
                if (now.compareTo(c)==0)
                {
                    p.delete (j);
                    j=p.previous(j);
                }
            }
        }
    }



    public static void main(String[] args){

        T <Integer> r=new T<Integer>(new Integer[5]); //рациональные числа
        r.insert(0, r.end());
        r.insert(1, r.end());
        r.insert(2, r.end());
        r.insert(3, r.end());
        r.insert(1, r.end());
        r.printList();
        System.out.println("После изменения");
        deleteD(r);
        r.printList();
        System.out.println();

        T<String> c= new T<String>(new String[8]); //строки
        c.insert("p",c.end() );
        c.insert("r", c.end());
        c.insert("o", c.end());
        c.insert("p", c.end());
        c.insert("i", c.end());
        c.insert("s", c.end());
        c.printList();
        System.out.println("После изменения");
        deleteD(c);
        c.printList();
        System.out.println();

        T<RazionalList> k=new T<RazionalList>(new RazionalList[8]);
        k.insert (new RazionalList(4,5),k.end());
        k.insert (new RazionalList(7,5),k.end());
        k.insert (new RazionalList(4,16),k.end());
        k.insert (new RazionalList(-5,6),k.end());
        k.insert (new RazionalList(4,5),k.end());
        k.insert (new RazionalList(0,5),k.end());
        k.printList();
        System.out.println("После изменения");
        deleteD(k);
        k.printList();
        System.out.println();
    }

}
