package ru.mirea.lab1;

public class TestStock {
    public static void main(String[] args) {
        Stock stock1 = new Stock("SBER", "ПАО Сбербанк", 281.5, 282.87);
        System.out.println("procent =" + stock1.getChangePercent());
    }
}
