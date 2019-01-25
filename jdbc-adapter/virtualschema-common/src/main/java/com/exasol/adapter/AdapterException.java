package com.exasol.adapter;

/**
 * Virtual schema adapter exception.
 */
public class AdapterException extends Exception {
    private static final long serialVersionUID = -5821711270758573195L;

    /**
     * Create an new {@link AdapterException}
     *
     * @param message error message
     */
    public AdapterException(final String message) {
        super(message);
    }

    /**
     * Create an new {@link AdapterException}
     *
     * @param message error message
     * @param cause   root cause
     */
    public AdapterException(final String message, final Exception cause) {
        super(message, cause);
    }
}