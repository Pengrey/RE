package p305q3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;
import p396v3.C11091c;
import p468yc.C13191r;
import p489zc.C13769l0;

/* renamed from: q3.l */
/* loaded from: classes.dex */
public final class C9636l implements Iterable, InterfaceC6650a {

    /* renamed from: x */
    public static final C9636l f25433x;

    /* renamed from: w */
    private final Map f25434w;

    /* compiled from: Parameters.kt */
    /* renamed from: q3.l$a */
    /* loaded from: classes.dex */
    public static final class C9637a {

        /* renamed from: a */
        private final Map f25435a;

        public C9637a(C9636l c9636l) {
            Map m322q;
            m322q = C13769l0.m322q(C9636l.m10315b(c9636l));
            this.f25435a = m322q;
        }

        /* renamed from: a */
        public final C9636l m10312a() {
            return new C9636l(C11091c.m6169b(this.f25435a), null);
        }
    }

    /* compiled from: Parameters.kt */
    /* renamed from: q3.l$b */
    /* loaded from: classes.dex */
    public static final class C9638b {
        private C9638b() {
        }

        public /* synthetic */ C9638b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: Parameters.kt */
    /* renamed from: q3.l$c */
    /* loaded from: classes.dex */
    public static final class C9639c {

        /* renamed from: a */
        private final Object f25436a;

        /* renamed from: b */
        private final String f25437b;

        /* renamed from: a */
        public final String m10311a() {
            return this.f25437b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C9639c) {
                C9639c c9639c = (C9639c) obj;
                if (Intrinsics.equals(this.f25436a, c9639c.f25436a) && Intrinsics.equals(this.f25437b, c9639c.f25437b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            Object obj = this.f25436a;
            int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
            String str = this.f25437b;
            return hashCode + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Entry(value=" + this.f25436a + ", memoryCacheKey=" + this.f25437b + ')';
        }
    }

    static {
        new C9638b(null);
        f25433x = new C9636l();
    }

    private C9636l(Map map) {
        this.f25434w = map;
    }

    public /* synthetic */ C9636l(Map map, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
    }

    /* renamed from: b */
    public static final /* synthetic */ Map m10315b(C9636l c9636l) {
        return c9636l.f25434w;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C9636l) && Intrinsics.equals(this.f25434w, ((C9636l) obj).f25434w);
    }

    /* renamed from: f */
    public final Map m10314f() {
        Map m334e;
        if (isEmpty()) {
            m334e = C13769l0.m334e();
            return m334e;
        }
        Map map = this.f25434w;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            String m10311a = ((C9639c) entry.getValue()).m10311a();
            if (m10311a != null) {
                linkedHashMap.put(entry.getKey(), m10311a);
            }
        }
        return linkedHashMap;
    }

    /* renamed from: h */
    public final C9637a m10313h() {
        return new C9637a(this);
    }

    public int hashCode() {
        return this.f25434w.hashCode();
    }

    public final boolean isEmpty() {
        return this.f25434w.isEmpty();
    }

    public Iterator iterator() {
        Map map = this.f25434w;
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(C13191r.m1447a((String) entry.getKey(), (C9639c) entry.getValue()));
        }
        return arrayList.iterator();
    }

    public String toString() {
        return "Parameters(entries=" + this.f25434w + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C9636l() {
        /*
            r1 = this;
            java.util.Map r0 = p489zc.C13766i0.m398e()
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p305q3.C9636l.<init>():void");
    }
}
