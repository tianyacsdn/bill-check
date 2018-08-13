package com.sinochem.domain;

import java.io.Serializable;

public class RemoteResponse implements Serializable {

    private Boolean success = Boolean.TRUE;

    private String code;

    private String msg;

    private Object data;

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public Boolean getSuccess() {
        return success;
    }

    public String getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

    public Object getData() {
        return data;
    }


}
