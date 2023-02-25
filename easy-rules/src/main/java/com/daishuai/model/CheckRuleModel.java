package com.daishuai.model;

import lombok.Data;

/**
 * @author admin
 * @version 1.0.0
 * @description TODO
 * @createTime 2023-02-25 22:49:16
 */
@Data
public class CheckRuleModel {

    private String name;

    public void setName(String name) {
        this.name = name;
    }
}
