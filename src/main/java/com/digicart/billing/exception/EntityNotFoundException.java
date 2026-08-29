package com.digicart.billing.exception;

/**
 * Domain exception: Entity Not Found Exception.
 */
public class EntityNotFoundException extends RuntimeException {
    public EntityNotFoundException(String message) {
        super(message);
    }
}
