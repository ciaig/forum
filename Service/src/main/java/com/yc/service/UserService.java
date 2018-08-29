package com.yc.service;

import com.yc.domain.User;

import java.util.List;

public interface UserService {
    void registe(User user);

    User login(String uName, String uPassword);

    void update(User user);

    User getById(Integer getuId);

    List<User> getFollowListByuId(Integer userId);

    void folllow(Integer loginId, Integer userId);
}
