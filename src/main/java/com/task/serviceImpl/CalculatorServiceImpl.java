package com.task.serviceImpl;

import com.task.service.CalculatorService;
import org.oasisopen.sca.annotation.Reference;




public class CalculatorServiceImpl implements CalculatorService {
    private AddServiceImpl addService;
    private DivideServiceImpl divideService;
    private MultiplyServiceImpl multiplyService;
    private SubtractServiceImpl subtractService;
    /**
     * 引用其他组件IAdd，ISubtract，IMultiply,IDivide
     *  @Reference 进行注入说明引用其他组件 会和.composite文件进行配置
     */

    public AddServiceImpl getAddService() {
        return addService;
    }
    @Reference
    public void setAddService(AddServiceImpl addService) {
        this.addService = addService;
    }

    public DivideServiceImpl getDivideService() {
        return divideService;
    }
    @Reference
    public void setDivideService(DivideServiceImpl divideService) {
        this.divideService = divideService;
    }

    public MultiplyServiceImpl getMultiplyService() {
        return multiplyService;
    }
    @Reference
    public void setMultiplyService(MultiplyServiceImpl multiplyService) {
        this.multiplyService = multiplyService;
    }

    public SubtractServiceImpl getSubtractService() {
        return subtractService;
    }
    @Reference
    public void setSubtractService(SubtractServiceImpl subtractService) {
        this.subtractService = subtractService;
    }

    public double add(double n1, double n2) {
        return addService.multiply(n1,n2);
    }


    public double subtract(double n1, double n2) {
        return subtractService.subtract(n1,n2);
    }

    public double multiply(double n1, double n2) {
        return multiplyService.multiply(n1,n2);
    }

    public double divide(double n1, double n2) {
        return divideService.divide(n1,n2);
    }
}