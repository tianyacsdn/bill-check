package com.sinochem;

import com.sinochem.domain.BalanceInnerCheck;
import lombok.Data;

@Data
public class BalanceInnerCheckDTO extends BalanceInnerCheck {
    private Integer pageSize;
    private Integer pageNum;
}
