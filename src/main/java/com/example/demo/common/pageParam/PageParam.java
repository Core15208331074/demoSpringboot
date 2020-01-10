package com.example.demo.common.pageParam;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(value = "分页对象")
public class PageParam {
    @ApiModelProperty(value = "当前页码")
    private Integer currentPage;
    @ApiModelProperty(value = "页面大小")
    private Integer pageSize;
    @ApiModelProperty(value = "总页数")
    private Integer pageTotal;
    @ApiModelProperty(value = "总数")
    private Integer totals;
}
