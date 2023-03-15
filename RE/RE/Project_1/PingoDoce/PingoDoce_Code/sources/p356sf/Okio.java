package p356sf;

import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: sf.b */
/* loaded from: classes2.dex */
public final class Okio implements InterfaceC10189f0 {
    /* renamed from: B */
    public void mo8688B(Buffer buffer, long j) {
        Intrinsics.isThisObjectNull(buffer, "source");
        buffer.skip(j);
    }

    public void close() {
    }

    public void flush() {
    }

    /* renamed from: timeout */
    public Timeout mo40536timeout() {
        return Timeout.f26564d;
    }
}
