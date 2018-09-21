package com.sinochem.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sinochem.BalanceInnerCheckDTO;
import com.sinochem.domain.BalanceInnerCheck;
import com.sinochem.domain.BalanceInnerCheckExample;
import com.sinochem.mapper.BalanceInnerCheckMapper;
import com.sinochem.service.BalanceInnerCheckService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

@Service
@Slf4j
public class BalanceInnerCheckServiceImpl implements BalanceInnerCheckService {
    private final BalanceInnerCheckMapper balanceInnerCheckMapper;

    public BalanceInnerCheckServiceImpl(BalanceInnerCheckMapper balanceInnerCheckMapper) {
        this.balanceInnerCheckMapper = balanceInnerCheckMapper;
    }

    @Override
    public List<BalanceInnerCheck> listBalanceInnerCheck(BalanceInnerCheck param) {
        return select(param);
    }

    @Override
    public PageInfo listBalanceInnerCheckByPage(BalanceInnerCheckDTO param) {
        Integer pageNum = 1;
        if (param.getPageNum() != null) {
            pageNum = param.getPageNum();
        }
        Integer pageSize = 10;
        if (param.getPageSize() != null) {
            pageSize = param.getPageSize();
        }
        PageHelper.startPage(pageNum, pageSize);
        List<BalanceInnerCheck> list = select(param);
        PageInfo result = new PageInfo(list, pageSize);
        return result;
    }

    @Override
    public int insert(BalanceInnerCheck record) {
        record.setCreateTime(new Date());
        return balanceInnerCheckMapper.insertSelective(record);
    }

    private List<BalanceInnerCheck> select(BalanceInnerCheck param) {
        BalanceInnerCheckExample example = new BalanceInnerCheckExample();
        BalanceInnerCheckExample.Criteria criteria = example.createCriteria();
        if (param.getId() != null) {
            criteria.andIdEqualTo(param.getId());
        }
        if (param.getCheckDate() != null) {
            criteria.andCheckDateEqualTo(param.getCheckDate());
        }
        if (!StringUtils.isEmpty(param.getMastAcctNum())) {
            criteria.andMastAcctNumEqualTo(param.getMastAcctNum());
        }
        if (!StringUtils.isEmpty(param.getAcctNum())) {
            criteria.andAcctNumEqualTo(param.getAcctNum());
        }
        if (param.getCustId() != null) {
            criteria.andCustIdEqualTo(param.getCustId());
        }
        if (!StringUtils.isEmpty(param.getAcctName())) {
            criteria.andAcctNameEqualTo(param.getAcctName());
        }
        if (param.getAcctType() != null) {
            criteria.andAcctTypeEqualTo(param.getAcctType());
        }
        if (!StringUtils.isEmpty(param.getGatewayChannel())) {
            criteria.andGatewayChannelEqualTo(param.getGatewayChannel());
        }
        if (!StringUtils.isEmpty(param.getGatewayChannelCode())) {
            criteria.andGatewayChannelCodeEqualTo(param.getGatewayChannelCode());
        }
        if (param.getInnerTotalBalance() != null) {
            criteria.andInnerTotalBalanceEqualTo(param.getInnerTotalBalance());
        }
        if (param.getAcpsTotalBalance() != null) {
            criteria.andAcpsTotalBalanceEqualTo(param.getAcpsTotalBalance());
        }
        if (param.getInnerAvailableBalance() != null) {
            criteria.andInnerAvailableBalanceEqualTo(param.getInnerAvailableBalance());
        }
        if (param.getAcpsAvailableBalance() != null) {
            criteria.andAcpsAvailableBalanceEqualTo(param.getAcpsAvailableBalance());
        }
        if (param.getInnerAvailableDrawBalance() != null) {
            criteria.andInnerAvailableDrawBalanceEqualTo(param.getInnerAvailableDrawBalance());
        }
        if (param.getAcpsAvailableDrawBalance() != null) {
            criteria.andAcpsAvailableDrawBalanceEqualTo(param.getAcpsAvailableDrawBalance());
        }
        if (param.getInnerFrozenBalance() != null) {
            criteria.andInnerFrozenBalanceEqualTo(param.getInnerFrozenBalance());
        }
        if (param.getAcpsFrozenBalance() != null) {
            criteria.andAcpsFrozenBalanceEqualTo(param.getAcpsFrozenBalance());
        }
        if (param.getInnerPreMinusAmt() != null) {
            criteria.andInnerPreMinusAmtEqualTo(param.getInnerPreMinusAmt());
        }
        if (param.getAcpsPreMinusAmt() != null) {
            criteria.andAcpsPreMinusAmtEqualTo(param.getAcpsPreMinusAmt());
        }
        if (param.getInnerPendingPaymentBalance() != null) {
            criteria.andInnerPendingPaymentBalanceEqualTo(param.getInnerPendingPaymentBalance());
        }
        if (param.getAcpsPendingPaymentBalance() != null) {
            criteria.andAcpsPendingPaymentBalanceEqualTo(param.getAcpsPendingPaymentBalance());
        }
        if (param.getCheckStatus() != null) {
            criteria.andCheckStatusEqualTo(param.getCheckStatus());
        }
        if (param.getAlarmState() != null) {
            criteria.andAlarmStateEqualTo(param.getAlarmState());
        }
        if (!StringUtils.isEmpty(param.getErrorType())) {
            criteria.andErrorTypeDetailEqualTo(param.getErrorType());
        }
        if (!StringUtils.isEmpty(param.getErrorTypeDetail())) {
            criteria.andErrorTypeDetailEqualTo(param.getErrorTypeDetail());
        }
        if (!StringUtils.isEmpty(param.getModifyRemark())) {
            criteria.andModifyRemarkEqualTo(param.getModifyRemark());
        }
        if (!StringUtils.isEmpty(param.getRemark())) {
            criteria.andRemarkEqualTo(param.getRemark());
        }
        if (param.getOptId() != null) {
            criteria.andOptIdEqualTo(param.getOptId());
        }
        if (param.getCreateTime() != null) {
            criteria.andCreateTimeEqualTo(param.getCreateTime());
        }
        if (param.getUpdateTime() != null) {
            criteria.andUpdateTimeEqualTo(param.getUpdateTime());
        }
        return balanceInnerCheckMapper.selectByExample(example);
    }
}
