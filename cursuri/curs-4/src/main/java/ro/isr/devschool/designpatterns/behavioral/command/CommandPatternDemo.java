package ro.isr.devschool.designpatterns.behavioral.command;

import com.sun.org.apache.xpath.internal.operations.Or;


public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock abcStock=new Stock();
        Order buyStockOrder=new BuyStock(abcStock);
        Order sellStockOrder=new SellStock(abcStock);

        Broker broker=new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.placeOrder();

    }
}
