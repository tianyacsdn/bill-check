package com.sinochem.mapper;

import com.sinochem.domain.BillBalanceMistake;
import com.sinochem.domain.BillBalanceMistakeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BillBalanceMistakeMapper {
    int countByExample(BillBalanceMistakeExample example);

    int deleteByExample(BillBalanceMistakeExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BillBalanceMistake record);

    int insertSelective(BillBalanceMistake record);

    List<BillBalanceMistake> selectByExample(BillBalanceMistakeExample example);

    BillBalanceMistake selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BillBalanceMistake record, @Param("example") BillBalanceMistakeExample example);

    int updateByExample(@Param("record") BillBalanceMistake record, @Param("example") BillBalanceMistakeExample example);

    int updateByPrimaryKeySelective(BillBalanceMistake record);

    int updateByPrimaryKey(BillBalanceMistake record);
}