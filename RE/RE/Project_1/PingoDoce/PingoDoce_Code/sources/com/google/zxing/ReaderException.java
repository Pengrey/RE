package com.google.zxing;

/* loaded from: classes2.dex */
public abstract class ReaderException extends Exception {

    /* renamed from: w */
    protected static final boolean f11889w;

    /* renamed from: x */
    protected static final StackTraceElement[] f11890x;

    static {
        f11889w = System.getProperty("surefire.test.class.path") != null;
        f11890x = new StackTraceElement[0];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReaderException() {
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReaderException(Throwable th2) {
        super(th2);
    }
}
