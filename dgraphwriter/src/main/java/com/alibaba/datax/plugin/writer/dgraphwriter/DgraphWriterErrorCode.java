package com.alibaba.datax.plugin.writer.dgraphwriter;

import com.alibaba.datax.common.spi.ErrorCode;

/**
 * @author niekl
 */

public enum DgraphWriterErrorCode implements ErrorCode {

    UNEXCEPT_EXCEPTION("UNEXCEPT_EXCEPTION","未知异常");

    private final String code;

    private final String description;

    private DgraphWriterErrorCode(String code,String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
