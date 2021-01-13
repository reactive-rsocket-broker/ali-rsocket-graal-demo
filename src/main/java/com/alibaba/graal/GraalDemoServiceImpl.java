package com.alibaba.graal;

import com.alibaba.rsocket.RSocketService;
import org.springframework.stereotype.Service;

/**
 * Graal Demo service implementation
 *
 * @author leijuan
 */
@Service
@RSocketService(serviceInterface = GraalDemoService.class)
public class GraalDemoServiceImpl implements GraalDemoService {
    @Override
    public String hello(String name) {
        return "Hello " + name;
    }
}
