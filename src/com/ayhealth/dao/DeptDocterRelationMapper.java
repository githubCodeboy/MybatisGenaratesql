package com.ayhealth.dao;

import com.ayhealth.pojo.DeptDocterRelation;
import com.ayhealth.pojo.DeptDocterRelationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DeptDocterRelationMapper {
    int countByExample(DeptDocterRelationExample example);

    int deleteByExample(DeptDocterRelationExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DeptDocterRelation record);

    int insertSelective(DeptDocterRelation record);

    List<DeptDocterRelation> selectByExample(DeptDocterRelationExample example);

    DeptDocterRelation selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DeptDocterRelation record, @Param("example") DeptDocterRelationExample example);

    int updateByExample(@Param("record") DeptDocterRelation record, @Param("example") DeptDocterRelationExample example);

    int updateByPrimaryKeySelective(DeptDocterRelation record);

    int updateByPrimaryKey(DeptDocterRelation record);
}