package com.yc.service;

import com.yc.domain.User;

public interface UserService {
    void registe(User user);

    User login(String uName, String uPassword);

    void update(User user);

    User getById(Integer getuId);
}
