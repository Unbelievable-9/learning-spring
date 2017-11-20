package info.unbelievable9;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Copyright 2017 (C) Unbelievable9
 * Created on : 2017/11/20
 * Author     : Unbelievable9
 **/
public class FakePrintStream extends PrintStream {

    private static StringBuffer stringBuffer = new StringBuffer();

    public FakePrintStream() {
        super(new ByteArrayOutputStream());
    }

    @Override
    public void println(String x) {
        stringBuffer.append(x).append("\n");
    }

    public String getPrintedString() {
        return stringBuffer.toString();
    }

    public void clear() {
        stringBuffer = new StringBuffer();
    }
}
