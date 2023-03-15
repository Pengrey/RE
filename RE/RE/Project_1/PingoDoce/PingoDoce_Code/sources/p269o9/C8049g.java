package p269o9;

import com.google.firebase.crashlytics.internal.common.C4199h;
import java.util.Map;
import java.util.concurrent.atomic.AtomicMarkableReference;
import java.util.concurrent.atomic.AtomicReference;
import p355s9.C10098f;

/* renamed from: o9.g */
/* loaded from: classes.dex */
public class C8049g {

    /* renamed from: a */
    private final C8050a f20806a = new C8050a(this, false);

    /* renamed from: b */
    private final C8050a f20807b = new C8050a(this, true);

    /* renamed from: c */
    private final AtomicMarkableReference<String> f20808c = new AtomicMarkableReference<>(null, false);

    /* compiled from: UserMetadata.java */
    /* renamed from: o9.g$a */
    /* loaded from: classes.dex */
    private class C8050a {

        /* renamed from: a */
        final AtomicMarkableReference<C8036b> f20809a;

        public C8050a(C8049g c8049g, boolean z) {
            new AtomicReference(null);
            this.f20809a = new AtomicMarkableReference<>(new C8036b(64, z ? 8192 : 1024), false);
        }

        /* renamed from: a */
        public Map<String, String> m17060a() {
            return this.f20809a.getReference().m17118a();
        }
    }

    public C8049g(String str, C10098f c10098f, C4199h c4199h) {
        new C8040d(c10098f);
    }

    /* renamed from: c */
    public static C8049g m17062c(String str, C10098f c10098f, C4199h c4199h) {
        C8040d c8040d = new C8040d(c10098f);
        C8049g c8049g = new C8049g(str, c10098f, c4199h);
        c8049g.f20806a.f20809a.getReference().m17115d(c8040d.m17102f(str, false));
        c8049g.f20807b.f20809a.getReference().m17115d(c8040d.m17102f(str, true));
        c8049g.f20808c.set(c8040d.m17101g(str), false);
        return c8049g;
    }

    /* renamed from: d */
    public static String m17061d(String str, C10098f c10098f) {
        return new C8040d(c10098f).m17101g(str);
    }

    /* renamed from: a */
    public Map<String, String> m17064a() {
        return this.f20806a.m17060a();
    }

    /* renamed from: b */
    public Map<String, String> m17063b() {
        return this.f20807b.m17060a();
    }
}
