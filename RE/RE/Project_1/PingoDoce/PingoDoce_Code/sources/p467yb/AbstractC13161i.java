package p467yb;

import p239mb.C7154a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: yb.i */
/* loaded from: classes2.dex */
public abstract class AbstractC13161i extends AbstractC13160h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC13161i(C7154a c7154a) {
        super(c7154a);
    }

    /* renamed from: h */
    protected abstract void mo1518h(StringBuilder sb2, int i);

    /* renamed from: i */
    protected abstract int mo1517i(int i);

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public final void m1516j(StringBuilder sb2, int i, int i2) {
        int m1483f = m1514b().m1483f(i, i2);
        mo1518h(sb2, m1483f);
        int mo1517i = mo1517i(m1483f);
        int i3 = 100000;
        for (int i4 = 0; i4 < 5; i4++) {
            if (mo1517i / i3 == 0) {
                sb2.append('0');
            }
            i3 /= 10;
        }
        sb2.append(mo1517i);
    }
}
