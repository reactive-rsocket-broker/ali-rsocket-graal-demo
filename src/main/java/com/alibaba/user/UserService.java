package com.alibaba.user;

import com.alibaba.rsocket.RSocketServiceInterface;
import reactor.core.publisher.Mono;

/**
 * user reactive service
 *
 * @author leijuan
 */
@RSocketServiceInterface
public interface UserService {

    /**
     * RPC call to get user
     *
     * @param id user
     * @return user
     */
    Mono<User> findById(Integer id);

}
