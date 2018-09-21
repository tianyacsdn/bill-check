package com.sinochem.mapper;

import com.sinochem.domain.BalanceInnerCheck;
import com.sinochem.domain.BalanceInnerCheckExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface BalanceInnerCheckMapper {
    int countByExample(BalanceInnerCheckExample example);

    int deleteByExample(BalanceInnerCheckExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BalanceInnerCheck record);

    int insertSelective(BalanceInnerCheck record);

    List<BalanceInnerCheck> selectByExample(BalanceInnerCheckExample example);

    BalanceInnerCheck selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BalanceInnerCheck record, @Param("example") BalanceInnerCheckExample example);

    int updateByExample(@Param("record") BalanceInnerCheck record, @Param("example") BalanceInnerCheckExample example);

    int updateByPrimaryKeySelective(BalanceInnerCheck record);

    int updateByPrimaryKey(BalanceInnerCheck record);
}