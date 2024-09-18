package ru.mirea.lab1;

public class Stock {
    String symbol;
    String name;
    double previosClosingPrice;
    double currentPrice;

    Stock(String newSymbol, String newName, double newPreviosClosingPrice, double newCurrentPrice){
        symbol = newSymbol;
        name = newName;
        previosClosingPrice = newPreviosClosingPrice;
        currentPrice = newCurrentPrice;
    }
    double getChangePercent(){

        return ((currentPrice - previosClosingPrice)/previosClosingPrice) * 100;
    }
}
