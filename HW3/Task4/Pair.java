package HW3.Task4;
//    Напишите обобщенный класс Pair, который представляет собой пару значений разного типа. Класс должен иметь
//    методы getFirst(), getSecond() для получения значений пары, а также переопределение метода toString(),
//    возвращающее строковое представление пары.

public class Pair<T,K> {
    T first;
    K second;

    public T getFirst() {
        return first;
    }

    public K getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return first + " : " + second;
    }

    public Pair(T first, K second) {
        this.first = first;
        this.second = second;
    }

    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair<>("jjjjjjjj", 5);
        System.out.println(pair);
    }
}
