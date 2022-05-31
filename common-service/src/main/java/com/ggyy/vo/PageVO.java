package com.ggyy.vo;

import lombok.Data;

import java.util.List;
@Data
public class PageVO<T> {
    private List<T> content;
    private Long size;
    private Long total;
}
