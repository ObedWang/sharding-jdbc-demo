package cn.web.sharding.jdbc.demo.mapper;

import cn.web.sharding.jdbc.demo.model.OrderConfigDO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author : wangebie
 * @date : 2021/3/18 10:21
 */
@Mapper
public interface OrderConfigMapper {
    /**
     * select
     *
     * @param id id
     * @return obj
     */
    OrderConfigDO selectById(@Param("id") Integer id);
}
