//Внедрить итератор из задания 3 в коллекцию, написанную в задании 2 таким образом,
//        чтобы итератор был внутренним классом и, соответственно, объектом в коллекции.
package HW3.Task1;


import java.util.Arrays;
import java.util.Iterator;

public class GenericArray<T> {
    Object[] arr = new Object[0];


    GenericIterator<T> genericIterator;
    GenericArray(){
        genericIterator = (GenericIterator<T>) new GenericIterator<>();
    }
    public void getIterator(){
        for (T item : genericIterator) {
            System.out.println(item);
        }
    }
    public void add(T t){
        Object[] temp_arr = new Object[arr.length + 1];

        for (int index = 0; index < arr.length; index++) {
            temp_arr[index] = arr[index];
        }
        temp_arr[temp_arr.length - 1] = t;

        arr = temp_arr;
//        System.out.println(Arrays.toString(arr)); //++++++++++++++++++++++++++++++++++++++++++++++
        genericIterator.setArr(arr);
        System.out.println(Arrays.toString(genericIterator.getArr()));
    }

    public void remove(T t){
        Integer position = find(t);
        if (position != null) {
            Object[] temp_arr = new Object[arr.length - 1];

            for (int i = 0; i < position; i++) {
                temp_arr[i] = arr[i];
            }

            for (int i = position; i < arr.length -1; i++) {
                temp_arr[i] = arr[i + 1];
            }

            arr = temp_arr;
            genericIterator.setArr(arr);
        }

    }

    public Integer find(T t){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(t)) return i;
        }
        return null;
    }

    public void info(){

        while(genericIterator.hasNext()){
            System.out.println(genericIterator.next());
        }
    }


    public class GenericIterator<T> implements Iterator<T>, Iterable<T>{
        private Object[] arr = new Object[0];
        private Integer index = 0;

        public void setArr(Object[] arr) {
            this.arr = arr;
        }

        GenericIterator(){
        }

        @Override
        public boolean hasNext() {
            return (arr.length > index);
        }

        @Override
        public T next(){
            if (hasNext()) {
                return (T) arr[index++];
            }
            return null;
        }

        @Override
        public Iterator<T> iterator() {
            return new GenericIterator<>();
        }

        public Object[] getArr() {
            return arr;
        }
    }

    public static void main(String[] args) {
        GenericArray genericArray = new GenericArray();
        genericArray.add("1234");
        genericArray.add("5678");
        genericArray.add("7777");
        genericArray.add("vdfvd");
        genericArray.add("12vdfrrrr34");

        genericArray.info();


    }
}


