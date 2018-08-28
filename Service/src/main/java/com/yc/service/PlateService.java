package com.yc.service;

import com.yc.domain.ChildCategory;
import com.yc.domain.Detial;
import com.yc.domain.Discuss;
import com.yc.domain.Plate;

import java.util.List;

public interface PlateService {
    List<Plate> getPlateListBycId(Integer cateId);

    Detial getDetialById(Integer detialId);

    Plate getPlateBypId(Integer getpId);

    void post(Plate plate, String content);

    List<Discuss> getDiscussByPid(Integer getpId);

    void postDiscuss(Discuss discuss);
}
