package com.sinochem.parse;

import java.util.List;

public interface TxtBalanceBill{
    List parse(String filePath) throws Exception;

    List parse(String filePath, String billDate) throws Exception;
}
