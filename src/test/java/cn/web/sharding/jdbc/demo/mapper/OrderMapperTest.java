package cn.web.sharding.jdbc.demo.mapper;

import cn.web.sharding.jdbc.demo.Application;
import cn.web.sharding.jdbc.demo.model.OrderDO;
import org.apache.shardingsphere.api.hint.HintManager;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author : wangebie
 * @date : 2021/3/18 10:27
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class OrderMapperTest {

    @Resource
    private OrderMapper orderMapper;


    @Test
    public void testSelectById() { // 测试从库的负载均衡
        for (int i = 0; i < 8; i++) {
            OrderDO order = orderMapper.selectById(1);
            System.out.println(order);
        }
    }

    @Test
    public void testSelectById02() { // 测试强制访问主库
        try (HintManager hintManager = HintManager.getInstance()) {
            // 设置强制访问主库
            hintManager.setMasterRouteOnly();
            // 执行查询
            OrderDO order = orderMapper.selectById(1);
            System.out.println(order);
        }
    }

    @Test
    public void testInsert() { // 插入
        for (int i = 1; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                OrderDO order = new OrderDO();
                order.setUserId(i);
                orderMapper.insert(order);
            }

        }
    }

    @Test
    public void testSelectPage() {
        orderMapper.selectPage(3, 20).forEach(System.out::println);
    }

}