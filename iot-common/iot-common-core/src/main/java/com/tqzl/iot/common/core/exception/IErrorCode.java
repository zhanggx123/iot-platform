
package com.tqzl.iot.common.core.exception;

import java.io.Serializable;

public interface IErrorCode extends Serializable {

    String getResultCode();

    String getResultMessage();
}
