package com.sinochem.mapper;

import com.sinochem.domain.AcpsBalanceTransDtl;
import com.sinochem.domain.AcpsBalanceTransDtlExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface AcpsBalanceTransDtlMapper {
    int countByExample(AcpsBalanceTransDtlExample example);

    int deleteByExample(AcpsBalanceTransDtlExample example);

    int deleteByPrimaryKey(Long id);

    int insert(AcpsBalanceTransDtl record);

    int insertSelective(AcpsBalanceTransDtl record);

    List<AcpsBalanceTransDtl> selectByExample(AcpsBalanceTransDtlExample example);

    AcpsBalanceTransDtl selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") AcpsBalanceTransDtl record, @Param("example") AcpsBalanceTransDtlExample example);

    int updateByExample(@Param("record") AcpsBalanceTransDtl record, @Param("example") AcpsBalanceTransDtlExample example);

    int updateByPrimaryKeySelective(AcpsBalanceTransDtl record);

    int updateByPrimaryKey(AcpsBalanceTransDtl record);

    int insertBatch(List<AcpsBalanceTransDtl> records);
}