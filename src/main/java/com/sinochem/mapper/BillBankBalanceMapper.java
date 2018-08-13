package com.sinochem.mapper;

import com.sinochem.domain.BillBankBalance;
import com.sinochem.domain.BillBankBalanceExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BillBankBalanceMapper {
    int countByExample(BillBankBalanceExample example);

    int deleteByExample(BillBankBalanceExample example);

    int deleteByPrimaryKey(Long id);

    int insert(BillBankBalance record);

    int insertSelective(BillBankBalance record);

    List<BillBankBalance> selectByExample(BillBankBalanceExample example);

    BillBankBalance selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") BillBankBalance record, @Param("example") BillBankBalanceExample example);

    int updateByExample(@Param("record") BillBankBalance record, @Param("example") BillBankBalanceExample example);

    int updateByPrimaryKeySelective(BillBankBalance record);

    int updateByPrimaryKey(BillBankBalance record);
}