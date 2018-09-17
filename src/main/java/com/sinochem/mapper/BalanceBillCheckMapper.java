package com.sinochem.mapper;

import com.sinochem.domain.BalanceBillCheck;
import com.sinochem.domain.BalanceBillCheckExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BalanceBillCheckMapper {
    int countByExample(BalanceBillCheckExample example);

    int deleteByExample(BalanceBillCheckExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BalanceBillCheck record);

    int insertSelective(BalanceBillCheck record);

    List<BalanceBillCheck> selectByExample(BalanceBillCheckExample example);

    BalanceBillCheck selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BalanceBillCheck record, @Param("example") BalanceBillCheckExample example);

    int updateByExample(@Param("record") BalanceBillCheck record, @Param("example") BalanceBillCheckExample example);

    int updateByPrimaryKeySelective(BalanceBillCheck record);

    int updateByPrimaryKey(BalanceBillCheck record);

    int insertBatch(List<BalanceBillCheck> records);
}