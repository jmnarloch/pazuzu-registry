package org.zalando.pazuzu.exception;

public class NotFoundException extends ServiceException {
    public NotFoundException(Error error) {
        super(error);
    }

    public NotFoundException(Error error, String details) {
        super(error, details);
    }
}
