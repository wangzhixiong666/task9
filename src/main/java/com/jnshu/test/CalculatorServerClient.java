package com.jnshu.test;

import org.apache.tuscany.sca.node.Node;
import org.apache.tuscany.sca.node.NodeFactory;

public class CalculatorServerClient {
    public static void main(String[] args) {
//相当于spring 读取配置文件，进行实例化里的对象。
        Node node = NodeFactory.newInstance().createNode("Calculator.composite");
        node.start();
        System.out.println("service启动");
    }
}