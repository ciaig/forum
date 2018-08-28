package com.yc.service.impl;

import com.yc.dao.DetialMapper;
import com.yc.dao.DiscussMapper;
import com.yc.dao.PlateMapper;
import com.yc.domain.*;
import com.yc.service.PlateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class PlateServiceImpl implements PlateService {
    @Autowired
    private PlateMapper plateMapper;
    @Autowired
    private DetialMapper detialMapper;
    @Autowired
    private DiscussMapper discussMapper;
    @Override
    public List<Plate> getPlateListBycId(Integer cateId) {
        PlateExample plateExample = new PlateExample();
        plateExample.createCriteria().andCIdEqualTo(cateId);
        List<Plate> plates = plateMapper.selectByExample(plateExample);
        return plates;
    }

    @Override
    public Detial getDetialById(Integer detialId) {
        DetialExample detialExample = new DetialExample();
        detialExample.createCriteria().andPIdEqualTo(detialId);
        List<Detial> detials = detialMapper.selectByExample(detialExample);
        return detials.get(0);
    }

    @Override
    public Plate getPlateBypId(Integer plateId) {
        PlateExample plateExample = new PlateExample();
        plateExample.createCriteria().andPIdEqualTo(plateId);
        List<Plate> plates = plateMapper.selectByExample(plateExample);
        return plates.get(0);
    }

    @Override
    @Transactional
    public void post(Plate plate, String content) {
        plateMapper.insert(plate);
        Detial detial = new Detial();
        detial.setdContent(content);
        detial.setpId(plate.getpId());
        detial.setdCreatetime(new Date());
        detialMapper.insert(detial);

    }

    @Override
    public List<Discuss> getDiscussByPid(Integer pId) {
        DiscussExample discussExample = new DiscussExample();
        discussExample.createCriteria().andPIdEqualTo(pId);
        List<Discuss> discussList = discussMapper.selectByExample(discussExample);
        return discussList;
    }

    @Override
    @Transactional
    public void postDiscuss(Discuss discuss) {
        if(discuss.getcContent().length()<=6){
            throw new RuntimeException("回复内容不能少于六个字");
        }
        discuss.setPostTime(new Date());
        discussMapper.insert(discuss);
    }

    @Override
    public List<Plate> getPlateListOrderByTime() {
        PlateExample plateExample = new PlateExample();
        plateExample.setOrderByClause("p_id desc");
        List<Plate> plates = plateMapper.selectByExample(plateExample);
        return plates;
    }

    @Override
    public List<Plate> getPlateListOrderByDisscuss() {
        PlateExample plateExample = new PlateExample();
        List<Plate> plates = plateMapper.selectByExample(plateExample);
        return plates;
    }

}
