package com.google.zxing;

/* loaded from: classes2.dex */
public final class NotFoundException extends ReaderException {

    /* renamed from: y */
    private static final NotFoundException f11888y;

    static {
        NotFoundException notFoundException = new NotFoundException();
        f11888y = notFoundException;
        notFoundException.setStackTrace(ReaderException.f11890x);
    }

    private NotFoundException() {
    }

    /* renamed from: a */
    public static NotFoundException m27700a() {
        return f11888y;
    }
}
