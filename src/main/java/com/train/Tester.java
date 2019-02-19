package com.train;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Tickets t = new Tickets(1000, 0.9f);
        Scanner scanner = new Scanner(System.in);

        t.enterTickets();
        String tickets = scanner.next();

        t.enterRoundTripTickets();
        String roundTripTickets = scanner.next();

        System.out.println("\nTotal tickets：" + tickets);
        System.out.println("Round-Trip：" + roundTripTickets);
        System.out.println("Total：" + t.calculate(tickets, roundTripTickets));
    }
}
