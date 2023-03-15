package okhttp3.internal.connection;

import java.io.IOException;
import p181jd.Intrinsics;
import p468yc.Exceptions;

/* compiled from: RouteException.kt */
/* loaded from: classes2.dex */
public final class RouteException extends RuntimeException {

    /* renamed from: w */
    private final IOException f20943w;

    /* renamed from: x */
    private IOException f20944x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RouteException(IOException iOException) {
        super(iOException);
        Intrinsics.isThisObjectNull(iOException, "firstConnectException");
        this.f20943w = iOException;
        this.f20944x = iOException;
    }

    /* renamed from: a */
    public final void m16893a(IOException iOException) {
        Intrinsics.isThisObjectNull(iOException, "e");
        Exceptions.m1470a(this.f20943w, iOException);
        this.f20944x = iOException;
    }

    /* renamed from: b */
    public final IOException m16892b() {
        return this.f20943w;
    }

    /* renamed from: c */
    public final IOException m16891c() {
        return this.f20944x;
    }
}
