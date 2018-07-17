package com.adpanshi.cashloan.bourse.borrow.exception;

/**
 * Created by zsw on 2018/7/11 0011.
 */
public class BorrowException extends RuntimeException {

    public BorrowException(){}

    public BorrowException(String message){
        super(message);
    }

    public BorrowException(String message, Throwable cause) {
        super(message, cause);
    }

    public BorrowException(Throwable cause) {
        super(cause);
    }
}
