package com.train;

public class Tickets {
    int tickets;           // 車票數
    int roundTripTickets;  // 回程票數
    int ticketPrice;
    float discount;        // 折數
    int total;             // 總金額

    Tickets(int ticketPrice, float discount){    // 建構子
        this.ticketPrice = ticketPrice;
        this.discount = discount;
    }

    public void enterTickets(){
        System.out.println("Please enter number of tickets:");

    }

    public void enterRoundTripTickets(){
        System.out.println("How many round-trip tickets:");
    }

    public int calculate(String tickets, String roundTripTickets){
        this.tickets = Integer.parseInt(tickets);
        this.roundTripTickets = Integer.parseInt(roundTripTickets);

        // 計算有幾張單程車票，並計算價錢
        int oneWay = this.tickets - this.roundTripTickets;
        int price1 = oneWay * ticketPrice;

        // 計算有幾張來回車票，打折後計算價錢
        float price2 = this.roundTripTickets * ticketPrice * 2 * discount;
        total = price1 + Math.round(price2); // 單程價錢 ＋ 來回價錢 ＝ 總費用
        return total;
    }
}
