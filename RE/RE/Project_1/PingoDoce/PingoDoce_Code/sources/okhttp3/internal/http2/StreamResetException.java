package okhttp3.internal.http2;

import java.io.IOException;
import p181jd.Intrinsics;

/* compiled from: StreamResetException.kt */
/* loaded from: classes2.dex */
public final class StreamResetException extends IOException {

    /* renamed from: w */
    public final EnumC8112a f21032w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamResetException(EnumC8112a enumC8112a) {
        super(Intrinsics.addStrAndObj("stream was reset: ", enumC8112a));
        Intrinsics.isThisObjectNull(enumC8112a, "errorCode");
        this.f21032w = enumC8112a;
    }
}
