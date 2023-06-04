package com.yupi.springbootinit.model.vo;

import lombok.Data;

/**
 * @ClassName:BIResponse
 * @Description BI 的返回结果
 * @Author ITYun
 * @Version 1.0
 */
@Data
public class BiResponse {

    private String genChart;

    private String genResult;

    private Long chartId;
}
