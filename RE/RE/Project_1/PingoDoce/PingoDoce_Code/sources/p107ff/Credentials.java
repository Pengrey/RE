package p107ff;

import java.nio.charset.Charset;
import p181jd.Intrinsics;
import p356sf.ByteString;

/* renamed from: ff.o */
/* loaded from: classes2.dex */
public final class Credentials {
    static {
        new Credentials();
    }

    private Credentials() {
    }

    /* renamed from: a */
    public static final String m24072a(String str, String str2, Charset charset) {
        Intrinsics.isThisObjectNull(str, "username");
        Intrinsics.isThisObjectNull(str2, "password");
        Intrinsics.isThisObjectNull(charset, "charset");
        return Intrinsics.addStrAndObj("Basic ", ByteString.f26546z.m8693c(str + ':' + str2, charset).m8720b());
    }
}
