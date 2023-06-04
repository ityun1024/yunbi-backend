package com.yupi.springbootinit.mapper;

import com.yupi.springbootinit.model.entity.Chart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.MapKey;

import java.util.List;
import java.util.Map;

/**
 * @author 19737
 * @description 针对表【chart(图表信息表)】的数据库操作Mapper
 * @createDate 2023-05-23 22:34:49
 * @Entity com.yupi.springbootinit.model.entity.Chart
 */
public interface ChartMapper extends BaseMapper<Chart> {

//    @MapKey("querySql")
//    List<Map<String, Object>> queryChartData(String querySql);

    List<Map<String, Object>> queryChartData(String querySql);

}




