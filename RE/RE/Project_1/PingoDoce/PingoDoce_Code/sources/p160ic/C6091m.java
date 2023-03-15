package p160ic;

import android.graphics.Rect;
import java.util.List;
import p138hc.C5905q;

/* renamed from: ic.m */
/* loaded from: classes2.dex */
public class C6091m {

    /* renamed from: a */
    private C5905q f16793a;

    /* renamed from: b */
    private int f16794b;

    /* renamed from: c */
    private AbstractC6095q f16795c = new C6092n();

    public C6091m(int i, C5905q c5905q) {
        this.f16794b = i;
        this.f16793a = c5905q;
    }

    /* renamed from: a */
    public C5905q m22170a(List<C5905q> list, boolean z) {
        return this.f16795c.m22161b(list, m22169b(z));
    }

    /* renamed from: b */
    public C5905q m22169b(boolean z) {
        C5905q c5905q = this.f16793a;
        if (c5905q == null) {
            return null;
        }
        return z ? c5905q.m22777c() : c5905q;
    }

    /* renamed from: c */
    public int m22168c() {
        return this.f16794b;
    }

    /* renamed from: d */
    public Rect m22167d(C5905q c5905q) {
        return this.f16795c.mo22159d(c5905q, this.f16793a);
    }

    /* renamed from: e */
    public void m22166e(AbstractC6095q abstractC6095q) {
        this.f16795c = abstractC6095q;
    }
}
