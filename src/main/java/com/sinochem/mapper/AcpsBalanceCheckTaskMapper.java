package com.sinochem.mapper;

import com.sinochem.domain.AcpsBalanceCheckTask;
import com.sinochem.domain.AcpsBalanceCheckTaskExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AcpsBalanceCheckTaskMapper {
    int countByExample(AcpsBalanceCheckTaskExample example);

    int deleteByExample(AcpsBalanceCheckTaskExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AcpsBalanceCheckTask record);

    int insertSelective(AcpsBalanceCheckTask record);

    List<AcpsBalanceCheckTask> selectByExample(AcpsBalanceCheckTaskExample example);

    AcpsBalanceCheckTask selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AcpsBalanceCheckTask record, @Param("example") AcpsBalanceCheckTaskExample example);

    int updateByExample(@Param("record") AcpsBalanceCheckTask record, @Param("example") AcpsBalanceCheckTaskExample example);

    int updateByPrimaryKeySelective(AcpsBalanceCheckTask record);

    int updateByPrimaryKey(AcpsBalanceCheckTask record);
}