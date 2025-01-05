package ru.netology.javaqa.services;

import ru.netology.javaqa.services.CountMonthService;

public class Main {
    public static void main(String[] args) {
        CountMonthService service = new CountMonthService();
        System.out.println(service.calculate(10_000, 3_000, 20_000));
    }
}