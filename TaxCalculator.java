package com.TaxCalculator11thAug2023;

import java.util.Scanner;

class TaxCalculator {
    public double calculateTax(String empName, boolean isIndian, double empSal)
            throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax");
        }

        if (empName == null || empName.isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty");
        }

        double taxAmount;
        if (empSal > 100000) {
            taxAmount = empSal * 0.08;
        } else if (empSal >= 50000 && empSal <= 100000) {
            taxAmount = empSal * 0.06;
        } else if (empSal >= 30000 && empSal < 50000) {
            taxAmount = empSal * 0.05;
        } else if (empSal >= 10000 && empSal < 30000) {
            taxAmount = empSal * 0.04;
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax");
        }

        return taxAmount;
    }
}
