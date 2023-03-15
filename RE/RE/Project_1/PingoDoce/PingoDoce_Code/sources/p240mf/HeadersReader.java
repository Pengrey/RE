package p240mf;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p107ff.Headers;
import p181jd.Intrinsics;
import p356sf.InterfaceC10187e;

/* renamed from: mf.a */
/* loaded from: classes2.dex */
public final class HeadersReader {

    /* renamed from: a */
    private final InterfaceC10187e f19014a;

    /* renamed from: b */
    private long f19015b;

    /* compiled from: HeadersReader.kt */
    /* renamed from: mf.a$a */
    /* loaded from: classes2.dex */
    public static final class C7188a {
        private C7188a() {
        }

        public /* synthetic */ C7188a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C7188a(null);
    }

    public HeadersReader(InterfaceC10187e interfaceC10187e) {
        Intrinsics.isThisObjectNull(interfaceC10187e, "source");
        this.f19014a = interfaceC10187e;
        this.f19015b = 262144L;
    }

    /* renamed from: a */
    public final Headers m18990a() {
        Headers.C5498a c5498a = new Headers.C5498a();
        while (true) {
            String m18989b = m18989b();
            if (m18989b.length() == 0) {
                return c5498a.m24002f();
            }
            c5498a.m24005c(m18989b);
        }
    }

    /* renamed from: b */
    public final String m18989b() {
        String mo8756h0 = this.f19014a.mo8756h0(this.f19015b);
        this.f19015b -= mo8756h0.length();
        return mo8756h0;
    }
}
