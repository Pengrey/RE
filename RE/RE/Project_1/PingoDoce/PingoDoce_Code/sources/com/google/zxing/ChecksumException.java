package com.google.zxing;

/* loaded from: classes2.dex */
public final class ChecksumException extends ReaderException {

    /* renamed from: y */
    private static final ChecksumException f11886y;

    static {
        ChecksumException checksumException = new ChecksumException();
        f11886y = checksumException;
        checksumException.setStackTrace(ReaderException.f11890x);
    }

    private ChecksumException() {
    }

    /* renamed from: a */
    public static ChecksumException m27703a() {
        return ReaderException.f11889w ? new ChecksumException() : f11886y;
    }
}
