package com.task.service;

import org.oasisopen.sca.annotation.Remotable;


@Remotable
public interface CalculatorService {
    double add(double n1, double n2);
    double subtract(double n1, double n2);
    double multiply(double n1, double n2);
    double divide(double n1, double n2);
}