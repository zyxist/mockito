package org.mockito.listeners;

public interface VerificationStartedEvent {
    void setMock(Object mock);

    Object getMock();
}
