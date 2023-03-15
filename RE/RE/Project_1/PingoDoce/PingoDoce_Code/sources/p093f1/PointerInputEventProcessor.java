package p093f1;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: f1.v */
/* loaded from: classes.dex */
public final class PointerInputEventProcessor {

    /* renamed from: a */
    private final Map f14672a = new LinkedHashMap();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PointerInputEventProcessor.kt */
    /* renamed from: f1.v$a */
    /* loaded from: classes.dex */
    public static final class C5319a {

        /* renamed from: a */
        private final long f14673a;

        /* renamed from: b */
        private final long f14674b;

        /* renamed from: c */
        private final boolean f14675c;

        private C5319a(long j, long j2, boolean z, int i) {
            this.f14673a = j;
            this.f14674b = j2;
            this.f14675c = z;
        }

        public /* synthetic */ C5319a(long j, long j2, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, j2, z, i);
        }

        /* renamed from: a */
        public final boolean m24642a() {
            return this.f14675c;
        }

        /* renamed from: b */
        public final long m24641b() {
            return this.f14674b;
        }

        /* renamed from: c */
        public final long m24640c() {
            return this.f14673a;
        }
    }

    /* renamed from: a */
    public final void m24644a() {
        this.f14672a.clear();
    }

    /* renamed from: b */
    public final C5283g m24643b(C5320w c5320w, InterfaceC5282f0 interfaceC5282f0) {
        long m24640c;
        boolean m24642a;
        long mo24793m;
        Intrinsics.isThisObjectNull(c5320w, "pointerInputEvent");
        Intrinsics.isThisObjectNull(interfaceC5282f0, "positionCalculator");
        LinkedHashMap linkedHashMap = new LinkedHashMap(c5320w.m24638b().size());
        List m24638b = c5320w.m24638b();
        int size = m24638b.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            C5321x c5321x = (C5321x) m24638b.get(i);
            C5319a c5319a = (C5319a) this.f14672a.get(C5317t.m24665a(c5321x.m24635c()));
            if (c5319a == null) {
                m24642a = z;
                m24640c = c5321x.m24629i();
                mo24793m = c5321x.m24633e();
            } else {
                m24640c = c5319a.m24640c();
                m24642a = c5319a.m24642a();
                mo24793m = interfaceC5282f0.mo24793m(c5319a.m24641b());
            }
            linkedHashMap.put(C5317t.m24665a(c5321x.m24635c()), new C5318u(c5321x.m24635c(), c5321x.m24629i(), c5321x.m24633e(), c5321x.m24637a(), m24640c, mo24793m, m24642a, new C5277d(z, z, 3, null), c5321x.m24630h(), c5321x.m24636b(), c5321x.m24631g(), null));
            if (c5321x.m24637a()) {
                this.f14672a.put(C5317t.m24665a(c5321x.m24635c()), new C5319a(c5321x.m24629i(), c5321x.m24632f(), c5321x.m24637a(), c5321x.m24630h(), null));
            } else {
                this.f14672a.remove(C5317t.m24665a(c5321x.m24635c()));
            }
            i = i2;
            z = false;
        }
        return new C5283g(linkedHashMap, c5320w);
    }
}
