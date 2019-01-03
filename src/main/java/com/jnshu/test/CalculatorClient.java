package com.jnshu.test;

import com.task.service.CalculatorService;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class CalculatorClient {
    public static void main(String[] args) {
        CalculatorService c= null;
        try {
            c = (CalculatorService) Naming.lookup("//localhost:8099/CalculatorRMIService");
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
        assert c != null;
        System.out.println(c.add(1,2));
    }
}