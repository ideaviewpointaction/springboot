package com.example.demo.baseTest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;


/**
 *
 * 这里报nullpoint是因为druid的filter没有初始化,所以解决办法有2个，对filter初始化及初始化applicationContext
 *                  2.不进行过滤 及将过滤配置为spring.datasource.druid.web-stat-filter.enabled=false
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
@ActiveProfiles("test")
public class MockMvcExampleTests {

    @Autowired
    private MockMvc mvc;

    @Test
    public void exampleTest() throws Exception {
        //这里的andExpect是增加预期值与服务器返回值进行比较
        this.mvc.perform(MockMvcRequestBuilders.get("/hellow"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("\"hellow, my name is刘茂,I'm18. I live in 北京   昌平区country=18\""));
    }
}
