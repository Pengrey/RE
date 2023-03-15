package com.google.zxing;

/* loaded from: classes2.dex */
public final class FormatException extends ReaderException {

    /* renamed from: y */
    private static final FormatException f11887y;

    static {
        FormatException formatException = new FormatException();
        f11887y = formatException;
        formatException.setStackTrace(ReaderException.f11890x);
    }

    private FormatException() {
    }

    /* renamed from: a */
    public static FormatException m27702a() {
        return ReaderException.f11889w ? new FormatException() : f11887y;
    }

    /* renamed from: b */
    public static FormatException m27701b(Throwable th2) {
        return ReaderException.f11889w ? new FormatException(th2) : f11887y;
    }

    private FormatException(Throwable th2) {
        super(th2);
    }
}
