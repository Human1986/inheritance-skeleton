package com.epam.rd.qa.inheritance;

import java.math.BigDecimal;

public class Company {
    private final Employee[] employees;

    public Company(Employee[] employees) {
        if (employees == null) {
            throw new IllegalArgumentException("Employees array must not be null");
        }
        for (Employee employee : employees) {
            if (employee == null) {
                throw new IllegalArgumentException("Employees array must not contain null objects");
            }
        }
        this.employees = employees;
    }

    public void giveEverybodyBonus(BigDecimal companyBonus) {
        for (Employee employee : employees) {
            employee.setBonus(companyBonus);
        }
    }

    public BigDecimal totalToPay() {
        BigDecimal amount = BigDecimal.ZERO;
        for (Employee employee : employees) {
            amount = amount.add(employee.toPay());
        }
        return amount;
    }

    public String nameMaxSalary() {
        BigDecimal maxSalary = BigDecimal.ZERO;
        String maxSalaryEmployeeName = "";
        for (Employee employee : employees) {
            if (employee.toPay().compareTo(maxSalary) > 0) {
                maxSalary = employee.toPay();
                maxSalaryEmployeeName = employee.getName();
            }
        }
        return maxSalaryEmployeeName;
    }
}
