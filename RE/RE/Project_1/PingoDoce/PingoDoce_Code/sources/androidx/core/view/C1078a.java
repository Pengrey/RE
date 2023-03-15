package androidx.core.view;

import android.os.Build;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.view.accessibility.C1085c;
import androidx.core.view.accessibility.C1090d;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;
import p128h2.C5816c;

/* renamed from: androidx.core.view.a */
/* loaded from: classes.dex */
public class C1078a {

    /* renamed from: c */
    private static final View.AccessibilityDelegate f3413c = new View.AccessibilityDelegate();

    /* renamed from: a */
    private final View.AccessibilityDelegate f3414a;

    /* renamed from: b */
    private final View.AccessibilityDelegate f3415b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccessibilityDelegateCompat.java */
    /* renamed from: androidx.core.view.a$a */
    /* loaded from: classes.dex */
    public static final class C1079a extends View.AccessibilityDelegate {

        /* renamed from: a */
        final C1078a f3416a;

        C1079a(C1078a c1078a) {
            this.f3416a = c1078a;
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.f3416a.mo35857a(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            C1090d mo19282b = this.f3416a.mo19282b(view);
            if (mo19282b != null) {
                return (AccessibilityNodeProvider) mo19282b.m38502e();
            }
            return null;
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3416a.mo19281f(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            C1085c m38578L0 = C1085c.m38578L0(accessibilityNodeInfo);
            m38578L0.m38600A0(C1112b0.m38443Z(view));
            m38578L0.m38538m0(C1112b0.m38448U(view));
            m38578L0.m38522u0(C1112b0.m38408r(view));
            m38578L0.m38590F0(C1112b0.m38460M(view));
            this.f3416a.mo19280g(view, m38578L0);
            m38578L0.m38553f(accessibilityNodeInfo.getText(), view);
            List<C1085c.C1086a> m38611c = C1078a.m38611c(view);
            for (int i = 0; i < m38611c.size(); i++) {
                m38578L0.m38561b(m38611c.get(i));
            }
        }

        @Override // android.view.View.AccessibilityDelegate
        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.f3416a.mo28955h(view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.f3416a.mo35856i(viewGroup, view, accessibilityEvent);
        }

        @Override // android.view.View.AccessibilityDelegate
        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.f3416a.mo28844j(view, i, bundle);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEvent(View view, int i) {
            this.f3416a.mo35855l(view, i);
        }

        @Override // android.view.View.AccessibilityDelegate
        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.f3416a.mo35854m(view, accessibilityEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AccessibilityDelegateCompat.java */
    /* renamed from: androidx.core.view.a$b */
    /* loaded from: classes.dex */
    public static class C1080b {
        /* renamed from: a */
        static AccessibilityNodeProvider m38607a(View.AccessibilityDelegate accessibilityDelegate, View view) {
            return accessibilityDelegate.getAccessibilityNodeProvider(view);
        }

        /* renamed from: b */
        static boolean m38606b(View.AccessibilityDelegate accessibilityDelegate, View view, int i, Bundle bundle) {
            return accessibilityDelegate.performAccessibilityAction(view, i, bundle);
        }
    }

    public C1078a() {
        this(f3413c);
    }

    /* renamed from: c */
    static List<C1085c.C1086a> m38611c(View view) {
        List<C1085c.C1086a> list = (List) view.getTag(C5816c.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: e */
    private boolean m38609e(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] m38531q = C1085c.m38531q(view.createAccessibilityNodeInfo().getText());
            for (int i = 0; m38531q != null && i < m38531q.length; i++) {
                if (clickableSpan.equals(m38531q[i])) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    private boolean m38608k(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(C5816c.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (m38609e(clickableSpan, view)) {
            clickableSpan.onClick(view);
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean mo35857a(View view, AccessibilityEvent accessibilityEvent) {
        return this.f3414a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: b */
    public C1090d mo19282b(View view) {
        AccessibilityNodeProvider m38607a;
        if (Build.VERSION.SDK_INT < 16 || (m38607a = C1080b.m38607a(this.f3414a, view)) == null) {
            return null;
        }
        return new C1090d(m38607a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public View.AccessibilityDelegate m38610d() {
        return this.f3415b;
    }

    /* renamed from: f */
    public void mo19281f(View view, AccessibilityEvent accessibilityEvent) {
        this.f3414a.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: g */
    public void mo19280g(View view, C1085c c1085c) {
        this.f3414a.onInitializeAccessibilityNodeInfo(view, c1085c.m38580K0());
    }

    /* renamed from: h */
    public void mo28955h(View view, AccessibilityEvent accessibilityEvent) {
        this.f3414a.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: i */
    public boolean mo35856i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f3414a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: j */
    public boolean mo28844j(View view, int i, Bundle bundle) {
        List<C1085c.C1086a> m38611c = m38611c(view);
        boolean z = false;
        int i2 = 0;
        while (true) {
            if (i2 >= m38611c.size()) {
                break;
            }
            C1085c.C1086a c1086a = m38611c.get(i2);
            if (c1086a.m38510b() == i) {
                z = c1086a.m38508d(view, bundle);
                break;
            }
            i2++;
        }
        if (!z && Build.VERSION.SDK_INT >= 16) {
            z = C1080b.m38606b(this.f3414a, view, i, bundle);
        }
        return (z || i != C5816c.accessibility_action_clickable_span || bundle == null) ? z : m38608k(bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1), view);
    }

    /* renamed from: l */
    public void mo35855l(View view, int i) {
        this.f3414a.sendAccessibilityEvent(view, i);
    }

    /* renamed from: m */
    public void mo35854m(View view, AccessibilityEvent accessibilityEvent) {
        this.f3414a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public C1078a(View.AccessibilityDelegate accessibilityDelegate) {
        this.f3414a = accessibilityDelegate;
        this.f3415b = new C1079a(this);
    }
}
