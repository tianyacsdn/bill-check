package com.sinochem.parse.impl;

import com.sinochem.parse.FtpFactory;
import com.sinochem.parse.FtpService;

public class PABFtpFactory implements FtpFactory {
    @Override
    public FtpService build() {
        return new PABFtpServiceImpl();
    }
}
