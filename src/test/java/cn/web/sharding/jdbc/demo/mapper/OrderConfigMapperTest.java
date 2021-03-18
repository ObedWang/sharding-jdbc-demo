package cn.web.sharding.jdbc.demo.mapper;

import cn.web.sharding.jdbc.demo.Application;
import cn.web.sharding.jdbc.demo.model.OrderConfigDO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.*;

/**
 * @author : wangebie
 * @date : 2021/3/18 10:23
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class OrderConfigMapperTest {

    @Resource
    private OrderConfigMapper orderConfigMapper;
    @Test
    public void selectById() {
        OrderConfigDO orderConfig = orderConfigMapper.selectById(1);
        System.out.println(orderConfig);
    }
}