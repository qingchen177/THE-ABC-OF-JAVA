package com.qingchen.mybatisplus.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.qingchen.mybatisplus.demo.entity.Singer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;

/**
 * @author qingchen
 * @date 20/10/2023 上午 11:10
 */
@SpringBootTest
public class SingerServiceTest {

    @Autowired
    private SingerService service;

    @Test
    public void lbd() {
        LambdaQueryWrapper<Singer> wrapper = new LambdaQueryWrapper<Singer>();
        wrapper.select(Singer::getName,Singer::getAge)
                .eq(Singer::getId,"1556883204951130116");
        Singer one = service.getOne(wrapper);
        System.out.println("one = " + one);
    }

    @Test
    public void customSql() {
        List<String> list = Arrays.asList("1556834884136407042","1556834884220293122","1556837578213335041");
        LambdaQueryWrapper<Singer> wrapper = new LambdaQueryWrapper<Singer>();
        wrapper.in(Singer::getId,list);

        service.updateCustomSql(wrapper);
    }
}
