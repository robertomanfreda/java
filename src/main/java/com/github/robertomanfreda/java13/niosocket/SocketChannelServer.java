package com.github.robertomanfreda.java13.niosocket;

import java.io.Closeable;
import java.io.IOException;
import java.net.SocketImpl;

public class SocketChannelServer implements Closeable {
    @Override
    public void close() throws IOException {

    }
    private SocketImpl impl;
}