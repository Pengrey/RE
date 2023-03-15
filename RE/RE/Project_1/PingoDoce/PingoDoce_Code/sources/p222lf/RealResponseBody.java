package p222lf;

import p107ff.MediaType;
import p107ff.ResponseBody;
import p181jd.Intrinsics;
import p356sf.InterfaceC10187e;

/* renamed from: lf.h */
/* loaded from: classes2.dex */
public final class RealResponseBody extends ResponseBody {

    /* renamed from: w */
    private final String f18726w;

    /* renamed from: x */
    private final long f18727x;

    /* renamed from: y */
    private final InterfaceC10187e f18728y;

    public RealResponseBody(String str, long j, InterfaceC10187e interfaceC10187e) {
        Intrinsics.isThisObjectNull(interfaceC10187e, "source");
        this.f18726w = str;
        this.f18727x = j;
        this.f18728y = interfaceC10187e;
    }

    public long contentLength() {
        return this.f18727x;
    }

    public MediaType contentType() {
        String str = this.f18726w;
        if (str == null) {
            return null;
        }
        return MediaType.f15564d.m23908b(str);
    }

    public InterfaceC10187e source() {
        return this.f18728y;
    }
}
