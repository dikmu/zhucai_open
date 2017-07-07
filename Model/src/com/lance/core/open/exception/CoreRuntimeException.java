package com.lance.core.open.exception;


public class CoreRuntimeException extends RuntimeException {
    
    
    @SuppressWarnings("compatibility:-1754078254211456567")
    
    public static final String ERROR_CODE_1="001";
    
    private static final long serialVersionUID = 1L;

    public CoreRuntimeException(String string, Throwable throwable, boolean b, boolean b1) {
        super(string, throwable, b, b1);
    }

    public CoreRuntimeException(Throwable throwable) {
        super(throwable);
    }

    public CoreRuntimeException(String string, Throwable throwable) {
        super(string, throwable);
    }

    public CoreRuntimeException(String string) {
        super(string);
    }
    
    /**
     * 自定义系统异常
     * @param string 显示到界面的异常
     * @param code 异常号
     * @param msg 仅记录到日志
     */
    public CoreRuntimeException(String string,String code,String msg) {
        super(string+"error code:"+code);
        System.err.println(msg);
    }

    public CoreRuntimeException() {
        super();
    }


}
