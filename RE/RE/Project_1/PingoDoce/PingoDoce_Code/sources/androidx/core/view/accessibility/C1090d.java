package androidx.core.view.accessibility;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: androidx.core.view.accessibility.d */
/* loaded from: classes.dex */
public class C1090d {

    /* renamed from: a */
    private final Object f3444a;

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* renamed from: androidx.core.view.accessibility.d$a */
    /* loaded from: classes.dex */
    static class C1091a extends AccessibilityNodeProvider {

        /* renamed from: a */
        final C1090d f3445a;

        C1091a(C1090d c1090d) {
            this.f3445a = c1090d;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            C1085c mo19263b = this.f3445a.mo19263b(i);
            if (mo19263b == null) {
                return null;
            }
            return mo19263b.m38580K0();
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            List<C1085c> m38503c = this.f3445a.m38503c(str, i);
            if (m38503c == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            int size = m38503c.size();
            for (int i2 = 0; i2 < size; i2++) {
                arrayList.add(m38503c.get(i2).m38580K0());
            }
            return arrayList;
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.f3445a.mo19261f(i, i2, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* renamed from: androidx.core.view.accessibility.d$b */
    /* loaded from: classes.dex */
    static class C1092b extends C1091a {
        C1092b(C1090d c1090d) {
            super(c1090d);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public AccessibilityNodeInfo findFocus(int i) {
            C1085c mo19262d = this.f3445a.mo19262d(i);
            if (mo19262d == null) {
                return null;
            }
            return mo19262d.m38580K0();
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat.java */
    /* renamed from: androidx.core.view.accessibility.d$c */
    /* loaded from: classes.dex */
    static class C1093c extends C1092b {
        C1093c(C1090d c1090d) {
            super(c1090d);
        }

        @Override // android.view.accessibility.AccessibilityNodeProvider
        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            this.f3445a.m38504a(i, C1085c.m38578L0(accessibilityNodeInfo), str, bundle);
        }
    }

    public C1090d() {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            this.f3444a = new C1093c(this);
        } else if (i >= 19) {
            this.f3444a = new C1092b(this);
        } else if (i >= 16) {
            this.f3444a = new C1091a(this);
        } else {
            this.f3444a = null;
        }
    }

    /* renamed from: a */
    public void m38504a(int i, C1085c c1085c, String str, Bundle bundle) {
    }

    /* renamed from: b */
    public C1085c mo19263b(int i) {
        return null;
    }

    /* renamed from: c */
    public List<C1085c> m38503c(String str, int i) {
        return null;
    }

    /* renamed from: d */
    public C1085c mo19262d(int i) {
        return null;
    }

    /* renamed from: e */
    public Object m38502e() {
        return this.f3444a;
    }

    /* renamed from: f */
    public boolean mo19261f(int i, int i2, Bundle bundle) {
        return false;
    }

    public C1090d(Object obj) {
        this.f3444a = obj;
    }
}
