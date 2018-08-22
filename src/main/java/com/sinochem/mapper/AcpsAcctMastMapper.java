package com.sinochem.mapper;

import com.sinochem.domain.AcpsAcctMast;
import com.sinochem.domain.AcpsAcctMastExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AcpsAcctMastMapper {
    int countByExample(AcpsAcctMastExample example);

    int deleteByExample(AcpsAcctMastExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AcpsAcctMast record);

    int insertSelective(AcpsAcctMast record);

    List<AcpsAcctMast> selectByExample(AcpsAcctMastExample example);

    AcpsAcctMast selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AcpsAcctMast record, @Param("example") AcpsAcctMastExample example);

    int updateByExample(@Param("record") AcpsAcctMast record, @Param("example") AcpsAcctMastExample example);

    int updateByPrimaryKeySelective(AcpsAcctMast record);

    int updateByPrimaryKey(AcpsAcctMast record);
}