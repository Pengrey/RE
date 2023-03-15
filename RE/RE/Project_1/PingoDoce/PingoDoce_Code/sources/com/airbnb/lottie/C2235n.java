package com.airbnb.lottie;

import androidx.core.util.C1072d;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import p130h4.C5850f;
import p301q.C9552b;

/* renamed from: com.airbnb.lottie.n */
/* loaded from: classes.dex */
public class C2235n {

    /* renamed from: a */
    private boolean f6496a = false;

    /* renamed from: b */
    private final Set<InterfaceC2237b> f6497b = new C9552b();

    /* renamed from: c */
    private final Map<String, C5850f> f6498c = new HashMap();

    /* compiled from: PerformanceTracker.java */
    /* renamed from: com.airbnb.lottie.n$a */
    /* loaded from: classes.dex */
    class C2236a implements Comparator<C1072d<String, Float>> {
        C2236a(C2235n c2235n) {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(C1072d<String, Float> c1072d, C1072d<String, Float> c1072d2) {
            float floatValue = c1072d.f3407b.floatValue();
            float floatValue2 = c1072d2.f3407b.floatValue();
            if (floatValue2 > floatValue) {
                return 1;
            }
            return floatValue > floatValue2 ? -1 : 0;
        }
    }

    /* compiled from: PerformanceTracker.java */
    /* renamed from: com.airbnb.lottie.n$b */
    /* loaded from: classes.dex */
    public interface InterfaceC2237b {
        /* renamed from: a */
        void m34288a(float f);
    }

    public C2235n() {
        new C2236a(this);
    }

    /* renamed from: a */
    public void m34291a(String str, float f) {
        if (this.f6496a) {
            C5850f c5850f = this.f6498c.get(str);
            if (c5850f == null) {
                c5850f = new C5850f();
                this.f6498c.put(str, c5850f);
            }
            c5850f.m22904a(f);
            if (str.equals("__container")) {
                for (InterfaceC2237b interfaceC2237b : this.f6497b) {
                    interfaceC2237b.m34288a(f);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m34290b(boolean z) {
        this.f6496a = z;
    }
}
