package com.docker.demo.bo;

import lombok.Data;

import java.io.Serializable;

/**
 * 标题：TestBO
 * 说明：
 * 时间：2022/7/12 14:48
 *
 * @author TC
 */
@Data
public class TestBO implements Serializable {
    private static final long serialVersionUID = 6578301493046322650L;
    private String value;
}
