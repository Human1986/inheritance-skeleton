package com.epam.rd.qa.inheritance;

import java.math.BigDecimal;

public class Employee {
    private final String name;
    private final BigDecimal salary;
    private BigDecimal bonus;

    public Employee(String name, BigDecimal salary) {
        if (name == null || salary == null) throw new IllegalArgumentException();
        if (name.trim().isEmpty() || salary.doubleValue() < 0) throw new IllegalArgumentException();

        this.name = name;
        this.salary = salary;
    }

    public BigDecimal toPay() {
        return getSalary().add(bonus);
    }

    public String getName() {
        return name;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setBonus(BigDecimal bonus) {
        if (bonus == null) throw new IllegalArgumentException();
        if (bonus.compareTo(BigDecimal.ZERO) <= 0) throw new IllegalArgumentException();
        this.bonus = bonus;
    }
}
