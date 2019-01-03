package com.task.serviceImpl;

import com.task.service.MultiplyInterface;

public class AddServiceImpl implements MultiplyInterface {
    public double multiply(double n1, double n2) {
        return n1+n2;
    }
}