package cn.web.sharding.jdbc.demo.mapper;

import cn.web.sharding.jdbc.demo.model.OrderDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author : wangebie
 * @date : 2021/3/18 10:11
 */
@Mapper
public interface OrderMapper {
    /**
     * select
     *
     * @param id id
     * @return
     */
    OrderDO selectById(@Param("id") Integer id);

    /**
     * select list
     *
     * @param userId user id
     * @return
     */
    List<OrderDO> selectListByUserId(@Param("userId") Integer userId);

    /**
     * insert
     *
     * @param order order
     */
    void insert(OrderDO order);

    /**
     * page get
     * @param offset offset
     * @param limit limit
     * @return obj
     */
    List<OrderDO> selectPage(@Param("offset")Integer offset,@Param("limit")Integer limit);
}
