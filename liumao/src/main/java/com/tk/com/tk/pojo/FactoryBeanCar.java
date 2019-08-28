package com.tk.com.tk.pojo;

import org.springframework.beans.factory.FactoryBean;

public class FactoryBeanCar implements FactoryBean<Car> {

    private String carInfo;
    @Override
    public Car getObject() throws Exception {
        String[] split = carInfo.split(",");
        Car car = new Car();
        car.setBrand(split[0]);
        car.setSpeed(Integer.valueOf(split[1]));
        car.setPrice(Double.valueOf(split[2]));
        return car;

    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }

    public void setCarInfo(String carInfo) {
        this.carInfo = carInfo;
    }
}
