package com.focusmr.online.onlineweb.api;

/**
 * Generic onlineweb exception.
 */
public class OnlineWebException extends RuntimeException {
    /**
     * Decorator exception.
     *
     * @param cause cause
     */
    public OnlineWebException(Throwable cause) {
        super(cause);
    }
}
