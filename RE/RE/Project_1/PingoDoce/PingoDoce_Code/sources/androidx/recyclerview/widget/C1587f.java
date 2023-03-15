package androidx.recyclerview.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.recyclerview.widget.f */
/* loaded from: classes.dex */
public class C1587f {

    /* renamed from: a */
    final InterfaceC1589b f4792a;

    /* renamed from: b */
    final C1588a f4793b = new C1588a();

    /* renamed from: c */
    final List<View> f4794c = new ArrayList();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChildHelper.java */
    /* renamed from: androidx.recyclerview.widget.f$a */
    /* loaded from: classes.dex */
    public static class C1588a {

        /* renamed from: a */
        long f4795a = 0;

        /* renamed from: b */
        C1588a f4796b;

        C1588a() {
        }

        /* renamed from: c */
        private void m36086c() {
            if (this.f4796b == null) {
                this.f4796b = new C1588a();
            }
        }

        /* renamed from: a */
        void m36088a(int i) {
            if (i >= 64) {
                C1588a c1588a = this.f4796b;
                if (c1588a != null) {
                    c1588a.m36088a(i - 64);
                    return;
                }
                return;
            }
            this.f4795a &= ~(1 << i);
        }

        /* renamed from: b */
        int m36087b(int i) {
            C1588a c1588a = this.f4796b;
            if (c1588a == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f4795a);
                }
                return Long.bitCount(this.f4795a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f4795a & ((1 << i) - 1));
            } else {
                return c1588a.m36087b(i - 64) + Long.bitCount(this.f4795a);
            }
        }

        /* renamed from: d */
        boolean m36085d(int i) {
            if (i < 64) {
                return (this.f4795a & (1 << i)) != 0;
            }
            m36086c();
            return this.f4796b.m36085d(i - 64);
        }

        /* renamed from: e */
        void m36084e(int i, boolean z) {
            if (i >= 64) {
                m36086c();
                this.f4796b.m36084e(i - 64, z);
                return;
            }
            long j = this.f4795a;
            boolean z2 = (Long.MIN_VALUE & j) != 0;
            long j2 = (1 << i) - 1;
            this.f4795a = ((j & (~j2)) << 1) | (j & j2);
            if (z) {
                m36081h(i);
            } else {
                m36088a(i);
            }
            if (z2 || this.f4796b != null) {
                m36086c();
                this.f4796b.m36084e(0, z2);
            }
        }

        /* renamed from: f */
        boolean m36083f(int i) {
            if (i >= 64) {
                m36086c();
                return this.f4796b.m36083f(i - 64);
            }
            long j = 1 << i;
            long j2 = this.f4795a;
            boolean z = (j2 & j) != 0;
            long j3 = j2 & (~j);
            this.f4795a = j3;
            long j4 = j - 1;
            this.f4795a = (j3 & j4) | Long.rotateRight((~j4) & j3, 1);
            C1588a c1588a = this.f4796b;
            if (c1588a != null) {
                if (c1588a.m36085d(0)) {
                    m36081h(63);
                }
                this.f4796b.m36083f(0);
            }
            return z;
        }

        /* renamed from: g */
        void m36082g() {
            this.f4795a = 0L;
            C1588a c1588a = this.f4796b;
            if (c1588a != null) {
                c1588a.m36082g();
            }
        }

        /* renamed from: h */
        void m36081h(int i) {
            if (i >= 64) {
                m36086c();
                this.f4796b.m36081h(i - 64);
                return;
            }
            this.f4795a |= 1 << i;
        }

        public String toString() {
            if (this.f4796b == null) {
                return Long.toBinaryString(this.f4795a);
            }
            return this.f4796b.toString() + "xx" + Long.toBinaryString(this.f4795a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ChildHelper.java */
    /* renamed from: androidx.recyclerview.widget.f$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1589b {
        /* renamed from: a */
        View mo36080a(int i);

        /* renamed from: b */
        void mo36079b(View view);

        /* renamed from: c */
        RecyclerView.AbstractC1531c0 mo36078c(View view);

        /* renamed from: d */
        void mo36077d(int i);

        /* renamed from: e */
        void mo36076e(View view);

        /* renamed from: f */
        void mo36075f(View view, int i);

        /* renamed from: g */
        int mo36074g();

        /* renamed from: h */
        void mo36073h(int i);

        /* renamed from: i */
        void mo36072i();

        /* renamed from: j */
        void mo36071j(View view, int i, ViewGroup.LayoutParams layoutParams);

        /* renamed from: k */
        int mo36070k(View view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1587f(InterfaceC1589b interfaceC1589b) {
        this.f4792a = interfaceC1589b;
    }

    /* renamed from: h */
    private int m36101h(int i) {
        if (i < 0) {
            return -1;
        }
        int mo36074g = this.f4792a.mo36074g();
        int i2 = i;
        while (i2 < mo36074g) {
            int m36087b = i - (i2 - this.f4793b.m36087b(i2));
            if (m36087b == 0) {
                while (this.f4793b.m36085d(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += m36087b;
        }
        return -1;
    }

    /* renamed from: l */
    private void m36097l(View view) {
        this.f4794c.add(view);
        this.f4792a.mo36079b(view);
    }

    /* renamed from: t */
    private boolean m36089t(View view) {
        if (this.f4794c.remove(view)) {
            this.f4792a.mo36076e(view);
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m36108a(View view, int i, boolean z) {
        int m36101h;
        if (i < 0) {
            m36101h = this.f4792a.mo36074g();
        } else {
            m36101h = m36101h(i);
        }
        this.f4793b.m36084e(m36101h, z);
        if (z) {
            m36097l(view);
        }
        this.f4792a.mo36075f(view, m36101h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m36107b(View view, boolean z) {
        m36108a(view, -1, z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m36106c(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int m36101h;
        if (i < 0) {
            m36101h = this.f4792a.mo36074g();
        } else {
            m36101h = m36101h(i);
        }
        this.f4793b.m36084e(m36101h, z);
        if (z) {
            m36097l(view);
        }
        this.f4792a.mo36071j(view, m36101h, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m36105d(int i) {
        int m36101h = m36101h(i);
        this.f4793b.m36083f(m36101h);
        this.f4792a.mo36077d(m36101h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public View m36104e(int i) {
        int size = this.f4794c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = this.f4794c.get(i2);
            RecyclerView.AbstractC1531c0 mo36078c = this.f4792a.mo36078c(view);
            if (mo36078c.m36565m() == i && !mo36078c.m36558t() && !mo36078c.m36556v()) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public View m36103f(int i) {
        return this.f4792a.mo36080a(m36101h(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public int m36102g() {
        return this.f4792a.mo36074g() - this.f4794c.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public View m36100i(int i) {
        return this.f4792a.mo36080a(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public int m36099j() {
        return this.f4792a.mo36074g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: k */
    public void m36098k(View view) {
        int mo36070k = this.f4792a.mo36070k(view);
        if (mo36070k >= 0) {
            this.f4793b.m36081h(mo36070k);
            m36097l(view);
            return;
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m */
    public int m36096m(View view) {
        int mo36070k = this.f4792a.mo36070k(view);
        if (mo36070k == -1 || this.f4793b.m36085d(mo36070k)) {
            return -1;
        }
        return mo36070k - this.f4793b.m36087b(mo36070k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: n */
    public boolean m36095n(View view) {
        return this.f4794c.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: o */
    public void m36094o() {
        this.f4793b.m36082g();
        for (int size = this.f4794c.size() - 1; size >= 0; size--) {
            this.f4792a.mo36076e(this.f4794c.get(size));
            this.f4794c.remove(size);
        }
        this.f4792a.mo36072i();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: p */
    public void m36093p(View view) {
        int mo36070k = this.f4792a.mo36070k(view);
        if (mo36070k < 0) {
            return;
        }
        if (this.f4793b.m36083f(mo36070k)) {
            m36089t(view);
        }
        this.f4792a.mo36073h(mo36070k);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q */
    public void m36092q(int i) {
        int m36101h = m36101h(i);
        View mo36080a = this.f4792a.mo36080a(m36101h);
        if (mo36080a == null) {
            return;
        }
        if (this.f4793b.m36083f(m36101h)) {
            m36089t(mo36080a);
        }
        this.f4792a.mo36073h(m36101h);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r */
    public boolean m36091r(View view) {
        int mo36070k = this.f4792a.mo36070k(view);
        if (mo36070k == -1) {
            m36089t(view);
            return true;
        } else if (this.f4793b.m36085d(mo36070k)) {
            this.f4793b.m36083f(mo36070k);
            m36089t(view);
            this.f4792a.mo36073h(mo36070k);
            return true;
        } else {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: s */
    public void m36090s(View view) {
        int mo36070k = this.f4792a.mo36070k(view);
        if (mo36070k >= 0) {
            if (this.f4793b.m36085d(mo36070k)) {
                this.f4793b.m36088a(mo36070k);
                m36089t(view);
                return;
            }
            throw new RuntimeException("trying to unhide a view that was not hidden" + view);
        }
        throw new IllegalArgumentException("view is not a child, cannot hide " + view);
    }

    public String toString() {
        return this.f4793b.toString() + ", hidden list:" + this.f4794c.size();
    }
}
