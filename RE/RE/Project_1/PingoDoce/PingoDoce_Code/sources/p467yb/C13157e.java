package p467yb;

import com.google.zxing.NotFoundException;
import p239mb.C7154a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: yb.e */
/* loaded from: classes2.dex */
public final class C13157e extends AbstractC13161i {

    /* renamed from: c */
    private final String f34111c;

    /* renamed from: d */
    private final String f34112d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C13157e(C7154a c7154a, String str, String str2) {
        super(c7154a);
        this.f34111c = str2;
        this.f34112d = str;
    }

    /* renamed from: k */
    private void m1522k(StringBuilder sb2, int i) {
        int m1483f = m1514b().m1483f(i, 16);
        if (m1483f == 38400) {
            return;
        }
        sb2.append('(');
        sb2.append(this.f34111c);
        sb2.append(')');
        int i2 = m1483f % 32;
        int i3 = m1483f / 32;
        int i4 = (i3 % 12) + 1;
        int i5 = i3 / 12;
        if (i5 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i5);
        if (i4 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i4);
        if (i2 / 10 == 0) {
            sb2.append('0');
        }
        sb2.append(i2);
    }

    @Override // p467yb.AbstractC13162j
    /* renamed from: d */
    public String mo1512d() throws NotFoundException {
        if (m1513c().m19072l() == 84) {
            StringBuilder sb2 = new StringBuilder();
            m1520f(sb2, 8);
            m1516j(sb2, 48, 20);
            m1522k(sb2, 68);
            return sb2.toString();
        }
        throw NotFoundException.m27700a();
    }

    @Override // p467yb.AbstractC13161i
    /* renamed from: h */
    protected void mo1518h(StringBuilder sb2, int i) {
        sb2.append('(');
        sb2.append(this.f34112d);
        sb2.append(i / 100000);
        sb2.append(')');
    }

    @Override // p467yb.AbstractC13161i
    /* renamed from: i */
    protected int mo1517i(int i) {
        return i % 100000;
    }
}
