package com.sinochem.mapper;

import com.sinochem.domain.BalanceRealTimeCheck;
import com.sinochem.domain.BalanceRealTimeCheckExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BalanceRealTimeCheckMapper {
    int countByExample(BalanceRealTimeCheckExample example);

    int deleteByExample(BalanceRealTimeCheckExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BalanceRealTimeCheck record);

    int insertSelective(BalanceRealTimeCheck record);

    List<BalanceRealTimeCheck> selectByExample(BalanceRealTimeCheckExample example);

    BalanceRealTimeCheck selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BalanceRealTimeCheck record, @Param("example") BalanceRealTimeCheckExample example);

    int updateByExample(@Param("record") BalanceRealTimeCheck record, @Param("example") BalanceRealTimeCheckExample example);

    int updateByPrimaryKeySelective(BalanceRealTimeCheck record);

    int updateByPrimaryKey(BalanceRealTimeCheck record);

    int insertBatch(List<BalanceRealTimeCheck> records);
}