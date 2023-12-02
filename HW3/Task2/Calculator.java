package HW3.Task2;
//    Написать класс Калькулятор (необобщенный), который содержит обобщенные статические методы:
//    sum(), multiply(), divide(), subtract(). Параметры этих методов – два
//    числа разного типа, над которыми должна быть произведена операция.


import java.text.NumberFormat;
import java.util.Locale;

public class Calculator {
    public static <T extends Number, V extends Number> double sum(T a, V b) {
        return a.doubleValue() + b.doubleValue();
    }

    public static <T extends Number, V extends Number> double multiply(T a, V b) {
        return a.doubleValue() * b.doubleValue();
    }

    public static <T extends Number, V extends Number> double subtraction(T a, V b) {
        return a.doubleValue() - b.doubleValue();
    }

    public static <T extends Number, V extends Number> double divide(T a, V b) {
        return a.doubleValue() / b.doubleValue();
    }


    public static double[] getArrayOfCalcOperations() {
        return new double[]{
                Calculator.divide(54, 15.5),
                Calculator.sum((short) 5, 158L),
                Calculator.multiply((byte) 8, 7.0f),
                Calculator.subtraction((long) 17, (short) 15)
        };
    }

    public static void printAllResults(double[] results) {
        NumberFormat nf = getNumberFormat();
        for (double result : results) {
            System.out.println("result = " + nf.format(result) + ";");
        }
    }

    public static NumberFormat getNumberFormat() {
        NumberFormat nf = NumberFormat.getInstance(Locale.ROOT);

        nf.setMinimumFractionDigits(0);
        nf.setMaximumFractionDigits(3);
        return nf;
    }

    public static void main(String[] args) {
        printAllResults(getArrayOfCalcOperations());
    }


}
