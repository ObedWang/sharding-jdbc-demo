package cn.web.sharding.jdbc.demo.model;

import lombok.Data;

/**
 * @author : wangebie
 * @date : 2021/3/18 10:10
 */
@Data
public class OrderConfigDO {
    /**
     * 编号
     */
    private Integer id;
    /**
     * 支付超时时间
     *
     * 单位：分钟
     */
    private Integer payTimeout;
}
