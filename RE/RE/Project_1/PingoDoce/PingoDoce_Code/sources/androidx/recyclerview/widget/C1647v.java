package androidx.recyclerview.widget;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.view.C1078a;
import androidx.core.view.C1112b0;
import androidx.core.view.accessibility.C1085c;
import androidx.core.view.accessibility.C1090d;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: androidx.recyclerview.widget.v */
/* loaded from: classes.dex */
public class C1647v extends C1078a {

    /* renamed from: d */
    final RecyclerView f5007d;

    /* renamed from: e */
    private final C1648a f5008e;

    /* compiled from: RecyclerViewAccessibilityDelegate.java */
    /* renamed from: androidx.recyclerview.widget.v$a */
    /* loaded from: classes.dex */
    public static class C1648a extends C1078a {

        /* renamed from: d */
        final C1647v f5009d;

        /* renamed from: e */
        private Map<View, C1078a> f5010e = new WeakHashMap();

        public C1648a(C1647v c1647v) {
            this.f5009d = c1647v;
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: a */
        public boolean mo35857a(View view, AccessibilityEvent accessibilityEvent) {
            C1078a c1078a = this.f5010e.get(view);
            if (c1078a != null) {
                return c1078a.mo35857a(view, accessibilityEvent);
            }
            return super.mo35857a(view, accessibilityEvent);
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: b */
        public C1090d mo19282b(View view) {
            C1078a c1078a = this.f5010e.get(view);
            if (c1078a != null) {
                return c1078a.mo19282b(view);
            }
            return super.mo19282b(view);
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: f */
        public void mo19281f(View view, AccessibilityEvent accessibilityEvent) {
            C1078a c1078a = this.f5010e.get(view);
            if (c1078a != null) {
                c1078a.mo19281f(view, accessibilityEvent);
            } else {
                super.mo19281f(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: g */
        public void mo19280g(View view, C1085c c1085c) {
            if (!this.f5009d.m35858o() && this.f5009d.f5007d.getLayoutManager() != null) {
                this.f5009d.f5007d.getLayoutManager().m36474P0(view, c1085c);
                C1078a c1078a = this.f5010e.get(view);
                if (c1078a != null) {
                    c1078a.mo19280g(view, c1085c);
                    return;
                } else {
                    super.mo19280g(view, c1085c);
                    return;
                }
            }
            super.mo19280g(view, c1085c);
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: h */
        public void mo28955h(View view, AccessibilityEvent accessibilityEvent) {
            C1078a c1078a = this.f5010e.get(view);
            if (c1078a != null) {
                c1078a.mo28955h(view, accessibilityEvent);
            } else {
                super.mo28955h(view, accessibilityEvent);
            }
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: i */
        public boolean mo35856i(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            C1078a c1078a = this.f5010e.get(viewGroup);
            if (c1078a != null) {
                return c1078a.mo35856i(viewGroup, view, accessibilityEvent);
            }
            return super.mo35856i(viewGroup, view, accessibilityEvent);
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: j */
        public boolean mo28844j(View view, int i, Bundle bundle) {
            if (!this.f5009d.m35858o() && this.f5009d.f5007d.getLayoutManager() != null) {
                C1078a c1078a = this.f5010e.get(view);
                if (c1078a != null) {
                    if (c1078a.mo28844j(view, i, bundle)) {
                        return true;
                    }
                } else if (super.mo28844j(view, i, bundle)) {
                    return true;
                }
                return this.f5009d.f5007d.getLayoutManager().m36439j1(view, i, bundle);
            }
            return super.mo28844j(view, i, bundle);
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: l */
        public void mo35855l(View view, int i) {
            C1078a c1078a = this.f5010e.get(view);
            if (c1078a != null) {
                c1078a.mo35855l(view, i);
            } else {
                super.mo35855l(view, i);
            }
        }

        @Override // androidx.core.view.C1078a
        /* renamed from: m */
        public void mo35854m(View view, AccessibilityEvent accessibilityEvent) {
            C1078a c1078a = this.f5010e.get(view);
            if (c1078a != null) {
                c1078a.mo35854m(view, accessibilityEvent);
            } else {
                super.mo35854m(view, accessibilityEvent);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: n */
        public C1078a m35853n(View view) {
            return this.f5010e.remove(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: o */
        public void m35852o(View view) {
            C1078a m38416n = C1112b0.m38416n(view);
            if (m38416n == null || m38416n == this) {
                return;
            }
            this.f5010e.put(view, m38416n);
        }
    }

    public C1647v(RecyclerView recyclerView) {
        this.f5007d = recyclerView;
        C1078a m35859n = m35859n();
        if (m35859n != null && (m35859n instanceof C1648a)) {
            this.f5008e = (C1648a) m35859n;
        } else {
            this.f5008e = new C1648a(this);
        }
    }

    @Override // androidx.core.view.C1078a
    /* renamed from: f */
    public void mo19281f(View view, AccessibilityEvent accessibilityEvent) {
        super.mo19281f(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || m35858o()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().mo36304L0(accessibilityEvent);
        }
    }

    @Override // androidx.core.view.C1078a
    /* renamed from: g */
    public void mo19280g(View view, C1085c c1085c) {
        super.mo19280g(view, c1085c);
        if (m35858o() || this.f5007d.getLayoutManager() == null) {
            return;
        }
        this.f5007d.getLayoutManager().m36476N0(c1085c);
    }

    @Override // androidx.core.view.C1078a
    /* renamed from: j */
    public boolean mo28844j(View view, int i, Bundle bundle) {
        if (super.mo28844j(view, i, bundle)) {
            return true;
        }
        if (m35858o() || this.f5007d.getLayoutManager() == null) {
            return false;
        }
        return this.f5007d.getLayoutManager().m36444h1(i, bundle);
    }

    /* renamed from: n */
    public C1078a m35859n() {
        return this.f5008e;
    }

    /* renamed from: o */
    boolean m35858o() {
        return this.f5007d.m36635o0();
    }
}
