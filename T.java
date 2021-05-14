 public class T <L extends Comparable<L>> {
    private L[] mas;
    private int last; //последний занятый

    public T(L[] m) {
        mas = m;
        last = -1;
    }

    public int end() {
        return last + 1;
    }

    public int makenull() {
        return last = -1;
    }

    public int previous(int p) { //предыдущее
        if (p < 0 || p > last) throw new IndexOutOfBoundsException("Нет последнего значения");
        else
            return (p - 1);
    }

    public int next(int p) { //значение следующего
        if (p > last+1 || p == end()) throw new IndexOutOfBoundsException("Некорректное значение"); //изменить
            return (p + 1);
    }

    public int first() {
         return 0;
    }

    public void printList() { //вывод на печать
        for (int i = 0; i <= last; i++)
            System.out.println(mas[i].toString());
    }

    public int locate(L x) { //нахождение в массиве
        int p = last ;
        int i;
        for ( i = 0; i <=p; i++) {
            if (x.compareTo(mas[i]) == 0)
                return i;
        }
        return i;
    }

    public L retrieve(int p) { //возвращение с позиции
        if (p == last+1 || p > last) throw new IndexOutOfBoundsException("Некорректное значение");
        return mas[p];
    }

    public void delete(int p) { //удаление символа
        if (p <last+1 && p >= 0) {
    for (int i = p; i <last; i++) {
        mas[i] = mas[i + 1];
    }
    last--;
}

    }

    public void insert(L x, int p) { //вставка элеммента
if ((p>last)&&(p==mas.length)) return;
       for (int i=last;i>p;i--)
       {
            mas[i+1]=mas[i];
    }
       mas[p]=x;
      last++;
    }
     }
