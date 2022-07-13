package com.docker.demo.bo;

import lombok.Data;

import java.io.Serializable;

/**
 * 标题：TestRspBO
 * 说明：
 * 时间：2022/7/12 14:51
 *
 * @author TC
 */
@Data
public class TestRspBO implements Serializable {
    private static final long serialVersionUID = 1546943734973096902L;
    private String code;
}
