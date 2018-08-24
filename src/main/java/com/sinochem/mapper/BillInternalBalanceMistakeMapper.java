package com.sinochem.mapper;

import com.sinochem.domain.BillInternalBalanceMistake;
import com.sinochem.domain.BillInternalBalanceMistakeExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BillInternalBalanceMistakeMapper {
    int countByExample(BillInternalBalanceMistakeExample example);

    int deleteByExample(BillInternalBalanceMistakeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BillInternalBalanceMistake record);

    int insertSelective(BillInternalBalanceMistake record);

    List<BillInternalBalanceMistake> selectByExample(BillInternalBalanceMistakeExample example);

    BillInternalBalanceMistake selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BillInternalBalanceMistake record, @Param("example") BillInternalBalanceMistakeExample example);

    int updateByExample(@Param("record") BillInternalBalanceMistake record, @Param("example") BillInternalBalanceMistakeExample example);

    int updateByPrimaryKeySelective(BillInternalBalanceMistake record);

    int updateByPrimaryKey(BillInternalBalanceMistake record);
}