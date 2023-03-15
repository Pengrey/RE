package okhttp3.internal.http2;

import java.io.IOException;
import java.util.List;
import p181jd.Intrinsics;
import p356sf.InterfaceC10187e;

/* renamed from: okhttp3.internal.http2.h */
/* loaded from: classes2.dex */
public interface PushObserver {

    /* renamed from: a */
    public static final PushObserver f21182a;

    /* compiled from: PushObserver.kt */
    /* renamed from: okhttp3.internal.http2.h$a */
    /* loaded from: classes2.dex */
    public static final class C8143a {

        /* renamed from: a */
        static final /* synthetic */ C8143a f21183a = new C8143a();

        /* compiled from: PushObserver.kt */
        /* renamed from: okhttp3.internal.http2.h$a$a */
        /* loaded from: classes2.dex */
        private static final class C8144a implements PushObserver {
            /* renamed from: a */
            public boolean m16534a(int i, List list) {
                Intrinsics.isThisObjectNull(list, "requestHeaders");
                return true;
            }

            /* renamed from: b */
            public boolean m16533b(int i, List list, boolean z) {
                Intrinsics.isThisObjectNull(list, "responseHeaders");
                return true;
            }

            /* renamed from: c */
            public boolean m16532c(int i, InterfaceC10187e interfaceC10187e, int i2, boolean z) throws IOException {
                Intrinsics.isThisObjectNull(interfaceC10187e, "source");
                interfaceC10187e.skip(i2);
                return true;
            }

            /* renamed from: d */
            public void m16531d(int i, EnumC8112a enumC8112a) {
                Intrinsics.isThisObjectNull(enumC8112a, "errorCode");
            }
        }

        private C8143a() {
        }
    }

    static {
        C8143a c8143a = C8143a.f21183a;
        f21182a = new C8143a.C8144a();
    }

    /* renamed from: a */
    boolean m16538a(int i, List list);

    /* renamed from: b */
    boolean m16537b(int i, List list, boolean z);

    /* renamed from: c */
    boolean m16536c(int i, InterfaceC10187e interfaceC10187e, int i2, boolean z) throws IOException;

    /* renamed from: d */
    void m16535d(int i, EnumC8112a enumC8112a);
}
