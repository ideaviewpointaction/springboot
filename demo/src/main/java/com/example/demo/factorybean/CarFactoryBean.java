package com.example.demo.factorybean;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:test.properties")
public class CarFactoryBean implements FactoryBean<Car> {
    @Value("${factorybean.carInfo}")
    private String carInfo;
    @Override
    public Car getObject() throws Exception {
        Car car = new Car();
//        carInfo="11,22,33";
        String[] split = carInfo.split(",");
        car.setBrand(split[0]);
        car.setMaxSpeed(Integer.valueOf(split[1]));
        car.setPrice(Double.valueOf(split[2]));
        return car;
    }

    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }

    public void setCarInfo(String carInfo){
        this.setCarInfo(carInfo);
    }
}
