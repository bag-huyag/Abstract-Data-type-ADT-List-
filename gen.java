

public class gen<T extends Comparable<T>> {
    private T[] ob;
    private int last;//последний занятый

    //Создание массива объектов
    public gen(T[] obj) {
        ob = obj;
        last = -1;
    }


    public int Next(int p) {
        if ((p >= last) && (p < 0)) {
            throw new IndexOutOfBoundsException("Выход за границы");
        } else {
            return (p + 1);
        }
    }

    public int Previous(int p) {
        if ((p <= 0) && (p > last)) {
            throw new IndexOutOfBoundsException("Выход за границы");
        } else {
            return (p - 1);
        }
    }

    public T Retrieve(int p) {
        if ((p < 0) && (p > last)) {
            throw new IndexOutOfBoundsException("Выход за границы");
        } else {
            return (ob[p]);
        }
    }

    public void Delete(int p) {
        if ((p >= 0) && (p < last + 1)) {
            for (int i = p; i < last; i++) {
                ob[i] = ob[i + 1];
            }
            last--;
        }
    }

    public int Locate(T x) {

        for (int i = 0; i < last + 1; i++) {
            if (x.compareTo(ob[i]) == 0) {
                return i;
            }
        }
        return last + 1;
    }

    public int end() {
        return last + 1;
    }

    public int first() {
        return 0;
    }

    public void Makenull() {
        last = -1;
    }

    public void Insert(T x, int p) {
        if ((p > last) && (last == ob.length)) return;
        for (int i = last; i > p; i--) {
            ob[i] = ob[i - 1];
        }
        ob[p] = x;
        last += 1;
    }

    public void Printlist() {
        for (int i = 0; i <= last; i++) {
            System.out.print(ob[i].toString() + " ");
        }
        System.out.println(" ");
    }

}


