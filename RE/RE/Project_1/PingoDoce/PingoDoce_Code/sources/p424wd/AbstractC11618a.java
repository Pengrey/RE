package p424wd;

import bd.InterfaceC1886d;
import java.util.Arrays;
import p181jd.Intrinsics;
import p424wd.AbstractC11620c;
import p468yc.C13183m;
import p468yc.C13195u;

/* renamed from: wd.a */
/* loaded from: classes2.dex */
public abstract class AbstractC11618a<S extends AbstractC11620c<?>> {

    /* renamed from: w */
    private AbstractC11620c[] f29705w;

    /* renamed from: x */
    private int f29706x;

    /* renamed from: y */
    private int f29707y;

    /* renamed from: f */
    public static final /* synthetic */ int m4586f(AbstractC11618a abstractC11618a) {
        return abstractC11618a.f29706x;
    }

    /* renamed from: g */
    public static final /* synthetic */ AbstractC11620c[] m4585g(AbstractC11618a abstractC11618a) {
        return abstractC11618a.f29705w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: h */
    public final AbstractC11620c m4584h() {
        AbstractC11620c abstractC11620c;
        synchronized (this) {
            AbstractC11620c[] abstractC11620cArr = this.f29705w;
            if (abstractC11620cArr == null) {
                abstractC11620cArr = m4582j(2);
                this.f29705w = abstractC11620cArr;
            } else if (this.f29706x >= abstractC11620cArr.length) {
                Object[] copyOf = Arrays.copyOf(abstractC11620cArr, abstractC11620cArr.length * 2);
                Intrinsics.checkIfNull(copyOf, "copyOf(this, newSize)");
                this.f29705w = (AbstractC11620c[]) copyOf;
                abstractC11620cArr = (AbstractC11620c[]) copyOf;
            }
            int i = this.f29707y;
            do {
                abstractC11620c = abstractC11620cArr[i];
                if (abstractC11620c == null) {
                    abstractC11620c = m4583i();
                    abstractC11620cArr[i] = abstractC11620c;
                }
                i++;
                if (i >= abstractC11620cArr.length) {
                    i = 0;
                }
            } while (!abstractC11620c.mo20033c(this));
            this.f29707y = i;
            this.f29706x++;
        }
        return abstractC11620c;
    }

    /* renamed from: i */
    protected abstract AbstractC11620c m4583i();

    /* renamed from: j */
    protected abstract AbstractC11620c[] m4582j(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: k */
    public final void m4581k(AbstractC11620c abstractC11620c) {
        int i;
        InterfaceC1886d[] mo20032d;
        synchronized (this) {
            int i2 = this.f29706x - 1;
            this.f29706x = i2;
            if (i2 == 0) {
                this.f29707y = 0;
            }
            mo20032d = abstractC11620c.mo20032d(this);
        }
        for (InterfaceC1886d interfaceC1886d : mo20032d) {
            if (interfaceC1886d != null) {
                C13183m.C13184a c13184a = C13183m.f34143w;
                interfaceC1886d.resumeWith(C13183m.m1458a(C13195u.f34156a));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l */
    public final int m4580l() {
        return this.f29706x;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: m */
    public final AbstractC11620c[] m4579m() {
        return this.f29705w;
    }
}
