package com.l2d.tuto.springbootwebfluxsecurity.security.exception;

/**
 * @author duc-d
 */
public class UnauthorizedException extends RuntimeException {

    public UnauthorizedException(String message) {
        super(message);
    }
}
