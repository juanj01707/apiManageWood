package com.uco.managewood.apimanagewood.util;

public interface MessageSender<T> {
    void execute(T message);
}
