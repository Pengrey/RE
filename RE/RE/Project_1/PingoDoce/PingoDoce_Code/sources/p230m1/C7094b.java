package p230m1;

import android.content.res.Configuration;
import android.content.res.Resources;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p181jd.Intrinsics;
import p478z0.ImageVector;

/* compiled from: VectorResources.android.kt */
/* renamed from: m1.b */
/* loaded from: classes.dex */
public final class C7094b {

    /* renamed from: a */
    private final HashMap f18831a = new HashMap();

    /* compiled from: VectorResources.android.kt */
    /* renamed from: m1.b$a */
    /* loaded from: classes.dex */
    public static final class C7095a {

        /* renamed from: a */
        private final ImageVector f18832a;

        /* renamed from: b */
        private final int f18833b;

        public C7095a(ImageVector imageVector, int i) {
            Intrinsics.isThisObjectNull(imageVector, "imageVector");
            this.f18832a = imageVector;
            this.f18833b = i;
        }

        /* renamed from: a */
        public final int m19312a() {
            return this.f18833b;
        }

        /* renamed from: b */
        public final ImageVector m19311b() {
            return this.f18832a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C7095a) {
                C7095a c7095a = (C7095a) obj;
                return Intrinsics.equals(this.f18832a, c7095a.f18832a) && this.f18833b == c7095a.f18833b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f18832a.hashCode() * 31) + Integer.hashCode(this.f18833b);
        }

        public String toString() {
            return "ImageVectorEntry(imageVector=" + this.f18832a + ", configFlags=" + this.f18833b + ')';
        }
    }

    /* compiled from: VectorResources.android.kt */
    /* renamed from: m1.b$b */
    /* loaded from: classes.dex */
    public static final class C7096b {

        /* renamed from: a */
        private final Resources.Theme f18834a;

        /* renamed from: b */
        private final int f18835b;

        public C7096b(Resources.Theme theme, int i) {
            Intrinsics.isThisObjectNull(theme, "theme");
            this.f18834a = theme;
            this.f18835b = i;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C7096b) {
                C7096b c7096b = (C7096b) obj;
                return Intrinsics.equals(this.f18834a, c7096b.f18834a) && this.f18835b == c7096b.f18835b;
            }
            return false;
        }

        public int hashCode() {
            return (this.f18834a.hashCode() * 31) + Integer.hashCode(this.f18835b);
        }

        public String toString() {
            return "Key(theme=" + this.f18834a + ", id=" + this.f18835b + ')';
        }
    }

    /* renamed from: a */
    public final void m19316a() {
        this.f18831a.clear();
    }

    /* renamed from: b */
    public final C7095a m19315b(C7096b c7096b) {
        Intrinsics.isThisObjectNull(c7096b, "key");
        WeakReference weakReference = (WeakReference) this.f18831a.get(c7096b);
        if (weakReference == null) {
            return null;
        }
        return (C7095a) weakReference.get();
    }

    /* renamed from: c */
    public final void m19314c(int i) {
        Iterator it = this.f18831a.entrySet().iterator();
        while (it.hasNext()) {
            Object next = it.next();
            Intrinsics.checkIfNull(next, "it.next()");
            C7095a c7095a = (C7095a) ((WeakReference) ((Map.Entry) next).getValue()).get();
            if (c7095a == null || Configuration.needNewResources(i, c7095a.m19312a())) {
                it.remove();
            }
        }
    }

    /* renamed from: d */
    public final void m19313d(C7096b c7096b, C7095a c7095a) {
        Intrinsics.isThisObjectNull(c7096b, "key");
        Intrinsics.isThisObjectNull(c7095a, "imageVectorEntry");
        this.f18831a.put(c7096b, new WeakReference(c7095a));
    }
}
