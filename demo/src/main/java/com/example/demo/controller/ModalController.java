package com.example.demo.controller;

import com.example.demo.entity.RandomData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName ModalController
 * @Description
 * @Author gehui
 * @Date 2019/7/11 6:41
 * @Version
 **/
@RestController
public class ModalController {

    @Autowired
    private RandomData randomData;

    @GetMapping("/randomData")
    public RandomData getRandom() {
        return randomData;
    }

}
