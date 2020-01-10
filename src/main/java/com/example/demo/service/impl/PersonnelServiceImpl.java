package com.example.demo.service.impl;

import com.example.demo.entity.Personnel;
import com.example.demo.mapper.PersonnelMapper;
import com.example.demo.service.IPersonnelService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonnelServiceImpl implements IPersonnelService {

    @Autowired
    private PersonnelMapper personnelMapper;

    @Override
    public PageInfo<Personnel> findAllPersonnel(Personnel personnel) {
        PageHelper.startPage(personnel.getCurrentPage(), personnel.getPageSize());
        PageInfo pg = new PageInfo();
        List<Personnel> list = personnelMapper.selectAllPersonnel(personnel);
        Integer totals = personnelMapper.selectAllPersonnelCount(personnel);
        pg.setList(list);
        pg.setTotal(totals);
        pg.setPageNum(personnel.getCurrentPage());
        return pg;
    }

    @Override
    public List<Personnel> findAllPersonnel() {
        return personnelMapper.selectAllPersonnel();
    }
}
