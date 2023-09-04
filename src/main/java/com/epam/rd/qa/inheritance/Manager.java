package com.epam.rd.qa.inheritance;

import java.math.BigDecimal;

public class Manager extends Employee {

    private final int clientAmount;

    public Manager(String name, BigDecimal salary, int clientAmount) {
        super(name, salary);
        if (clientAmount < 0) throw new IllegalArgumentException();
        this.clientAmount = clientAmount;
    }


    public void setBonus(BigDecimal bonus) {
        if (bonus == null) throw new IllegalArgumentException();
        if (bonus.doubleValue() <= 0) throw new IllegalArgumentException();

        if (clientAmount > 150) {
            super.setBonus(bonus.add(new BigDecimal(1000)));
        } else if (clientAmount > 100) {
            super.setBonus(bonus.add(new BigDecimal(500)));
        } else {
            super.setBonus(bonus);
        }
    }
}