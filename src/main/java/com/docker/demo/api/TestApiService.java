package com.docker.demo.api;

import com.docker.demo.bo.TestBO;
import com.docker.demo.bo.TestRspBO;
import org.springframework.stereotype.Service;

/**
 * 标题：TestApiService
 * 说明：
 * 时间：2022/7/12 14:48
 *
 * @author TC
 */
@Service
public class TestApiService {
        public TestRspBO getInfo(TestBO reqBO){
            TestRspBO rspBO = new TestRspBO();
            rspBO.setCode("OJBK");
            return rspBO;
        }
}
