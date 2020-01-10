package com.example.demo.mapper;

import com.example.demo.entity.Personnel;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonnelMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Personnel record);

    int insertSelective(Personnel record);

    Personnel selectByPrimaryKey(Integer id);

    List<Personnel> selectAllPersonnel(Personnel personnel);

    List<Personnel> selectAllPersonnel();

    Integer selectAllPersonnelCount(Personnel personnel);

    int updateByPrimaryKeySelective(Personnel record);

    int updateByPrimaryKeyWithBLOBs(Personnel record);

    int updateByPrimaryKey(Personnel record);
}