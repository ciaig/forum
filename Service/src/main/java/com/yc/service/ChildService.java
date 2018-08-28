package com.yc.service;

import com.yc.domain.ChildCategory;

import java.util.List;

public interface ChildService {
    List<ChildCategory> getAll();

    List<ChildCategory> getByfId(Integer getfId);

    List<ChildCategory> getAllChild();
}
