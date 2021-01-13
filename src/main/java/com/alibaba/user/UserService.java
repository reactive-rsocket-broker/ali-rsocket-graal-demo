package com.alibaba.user;

import reactor.core.publisher.Mono;

/**
 * user reactive service
 *
 * @author leijuan
 */
public interface UserService {

    /**
     * RPC call to get user
     *
     * @param id user
     * @return user
     */
    Mono<User> findById(Integer id);

}
