
class Main {

    public static void main(String[] args) {
        //Строки
        gen<String> s = new gen<String>(new String[10]);
        //Числа
        gen<Integer> i = new gen<Integer>(new Integer[10]);
        //Рациональные числа
        gen<ration> r = new gen<ration>(new ration[10]);

        //Заполнение массива чисел
        i.Insert(0, i.end());
        i.Insert(1, i.end());
        i.Insert(2, i.end());
        i.Insert(2, i.end());
        i.Insert(1, i.end());
        i.Insert(0, i.end());

//        int tempVar = 0;                              //Суета...
//        while (tempVar <= 2) {
//            i.Insert(tempVar, i.end());
//            tempVar = tempVar + 1;
//        }
//        while (tempVar >= 0) {
//            i.Insert(tempVar, i.end());
//            tempVar = tempVar - 1;
//        }

        i.Printlist();
        deleteDublicate(i);
        i.Printlist();

        //Заполнение массива рациональных чисел
        r.Insert(new ration(1, -12), r.end());
        r.Insert(new ration(-2, 24), r.end());
        r.Insert(new ration(3, 5), r.end());
        r.Insert(new ration(0, 1), r.end());
        r.Insert(new ration(6, 10), r.end());
        r.Insert(new ration(0, 1), r.end());
        r.Printlist();
        deleteDublicate(r);
        r.Printlist();

        //Заполнение массива строк
        s.Insert("a", s.end());
        s.Insert("b", s.end());
        s.Insert("c", s.end());
        s.Insert("c", s.end());
        s.Insert("b", s.end());
        s.Insert("a", s.end());
        s.Printlist();
        deleteDublicate(s);
        s.Printlist();

    }

    //Удаление дупликатов
    public static <T extends Comparable<T>> void deleteDublicate(gen<T> L) {
        for (int i = L.first(); i < L.end(); i = L.Next(i)) {
            T now = L.Retrieve(i);
            for (int j = L.Next(i); j < L.end(); j = L.Next(j)) {
                T next = L.Retrieve(j);
                if (now.compareTo(next) == 0) {
                    L.Delete(j);
                    j = L.Previous(j);
                }
            }
        }
    }
}
