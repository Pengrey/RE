package p248n4;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p076e5.CrashShieldHandler;
import p181jd.Intrinsics;
import p489zc._Collections;

/* renamed from: n4.n */
/* loaded from: classes.dex */
public final class PersistedEvents implements Serializable {

    /* renamed from: w */
    private final HashMap f20252w;

    /* compiled from: PersistedEvents.kt */
    /* renamed from: n4.n$a */
    /* loaded from: classes.dex */
    public static final class C7674a {
        private C7674a() {
        }

        public /* synthetic */ C7674a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: PersistedEvents.kt */
    /* renamed from: n4.n$b */
    /* loaded from: classes.dex */
    public static final class C7675b implements Serializable {

        /* renamed from: w */
        private final HashMap f20253w;

        /* compiled from: PersistedEvents.kt */
        /* renamed from: n4.n$b$a */
        /* loaded from: classes.dex */
        public static final class C7676a {
            private C7676a() {
            }

            public /* synthetic */ C7676a(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        static {
            new C7676a(null);
        }

        public C7675b(HashMap hashMap) {
            Intrinsics.isThisObjectNull(hashMap, "proxyEvents");
            this.f20253w = hashMap;
        }

        private final Object readResolve() throws ObjectStreamException {
            return new PersistedEvents(this.f20253w);
        }
    }

    static {
        new C7674a(null);
    }

    public PersistedEvents() {
        this.f20252w = new HashMap();
    }

    private final Object writeReplace() throws ObjectStreamException {
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            return new C7675b(this.f20252w);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    /* renamed from: a */
    public final void m17751a(AccessTokenAppIdPair accessTokenAppIdPair, List list) {
        List m453p0;
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            Intrinsics.isThisObjectNull(accessTokenAppIdPair, "accessTokenAppIdPair");
            Intrinsics.isThisObjectNull(list, "appEvents");
            if (!this.f20252w.containsKey(accessTokenAppIdPair)) {
                HashMap hashMap = this.f20252w;
                m453p0 = _Collections.m453p0(list);
                hashMap.put(accessTokenAppIdPair, m453p0);
                return;
            }
            List list2 = (List) this.f20252w.get(accessTokenAppIdPair);
            if (list2 != null) {
                list2.addAll(list);
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }

    /* renamed from: b */
    public final List m17750b(AccessTokenAppIdPair accessTokenAppIdPair) {
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            Intrinsics.isThisObjectNull(accessTokenAppIdPair, "accessTokenAppIdPair");
            return (List) this.f20252w.get(accessTokenAppIdPair);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    /* renamed from: c */
    public final Set m17749c() {
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            Set keySet = this.f20252w.keySet();
            Intrinsics.checkIfNull(keySet, "events.keys");
            return keySet;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    public PersistedEvents(HashMap hashMap) {
        Intrinsics.isThisObjectNull(hashMap, "appEventMap");
        HashMap hashMap2 = new HashMap();
        this.f20252w = hashMap2;
        hashMap2.putAll(hashMap);
    }
}
