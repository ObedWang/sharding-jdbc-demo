package cn.web.sharding.jdbc.demo.model;

import lombok.Data;

/**
 * @author : wangebie
 * @date : 2021/3/18 9:17
 */
@Data
public class OrderDO {

    /**
     * 订单编号
     */
    private Long id;
    /**
     * 用户编号
     */
    private Integer userId;
}
