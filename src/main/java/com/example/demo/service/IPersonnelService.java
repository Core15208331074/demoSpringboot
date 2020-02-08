package com.example.demo.service;

import com.example.demo.entity.Personnel;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface IPersonnelService {
    PageInfo<Personnel> findAllPersonnel(Personnel personnel);
    List<Personnel> findAllPersonnel();
}
