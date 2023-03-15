package p179jb;

import java.util.LinkedList;
import p239mb.C7154a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jb.f */
/* loaded from: classes2.dex */
public final class C6418f {

    /* renamed from: e */
    static final C6418f f17491e = new C6418f(AbstractC6419g.f17496b, 0, 0, 0);

    /* renamed from: a */
    private final int f17492a;

    /* renamed from: b */
    private final AbstractC6419g f17493b;

    /* renamed from: c */
    private final int f17494c;

    /* renamed from: d */
    private final int f17495d;

    private C6418f(AbstractC6419g abstractC6419g, int i, int i2, int i3) {
        this.f17493b = abstractC6419g;
        this.f17492a = i;
        this.f17494c = i2;
        this.f17495d = i3;
    }

    /* renamed from: b */
    private static int m20991b(C6418f c6418f) {
        int i = c6418f.f17494c;
        if (i > 62) {
            return 21;
        }
        if (i > 31) {
            return 20;
        }
        return i > 0 ? 10 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C6418f m20992a(int i) {
        AbstractC6419g abstractC6419g = this.f17493b;
        int i2 = this.f17492a;
        int i3 = this.f17495d;
        if (i2 == 4 || i2 == 2) {
            int i4 = C6415d.f17485c[i2][0];
            int i5 = 65535 & i4;
            int i6 = i4 >> 16;
            abstractC6419g = abstractC6419g.m20982a(i5, i6);
            i3 += i6;
            i2 = 0;
        }
        int i7 = this.f17494c;
        C6418f c6418f = new C6418f(abstractC6419g, i2, i7 + 1, i3 + ((i7 == 0 || i7 == 31) ? 18 : i7 == 62 ? 9 : 8));
        return c6418f.f17494c == 2078 ? c6418f.m20990c(i + 1) : c6418f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public C6418f m20990c(int i) {
        int i2 = this.f17494c;
        return i2 == 0 ? this : new C6418f(this.f17493b.m20981b(i - i2, i2), this.f17492a, 0, this.f17495d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m20989d() {
        return this.f17494c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m20988e() {
        return this.f17495d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public int m20987f() {
        return this.f17492a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m20986g(C6418f c6418f) {
        int i = this.f17495d + (C6415d.f17485c[this.f17492a][c6418f.f17492a] >> 16);
        int i2 = this.f17494c;
        int i3 = c6418f.f17494c;
        if (i2 < i3) {
            i += m20991b(c6418f) - m20991b(this);
        } else if (i2 > i3 && i3 > 0) {
            i += 10;
        }
        return i <= c6418f.f17495d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public C6418f m20985h(int i, int i2) {
        int i3 = this.f17495d;
        AbstractC6419g abstractC6419g = this.f17493b;
        int i4 = this.f17492a;
        if (i != i4) {
            int i5 = C6415d.f17485c[i4][i];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            abstractC6419g = abstractC6419g.m20982a(i6, i7);
            i3 += i7;
        }
        int i8 = i == 2 ? 4 : 5;
        return new C6418f(abstractC6419g.m20982a(i2, i8), i, 0, i3 + i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public C6418f m20984i(int i, int i2) {
        AbstractC6419g abstractC6419g = this.f17493b;
        int i3 = this.f17492a;
        int i4 = i3 == 2 ? 4 : 5;
        return new C6418f(abstractC6419g.m20982a(C6415d.f17487e[i3][i], i4).m20982a(i2, 5), this.f17492a, 0, this.f17495d + i4 + 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C7154a m20983j(byte[] bArr) {
        LinkedList<AbstractC6419g> linkedList = new LinkedList();
        for (AbstractC6419g abstractC6419g = m20990c(bArr.length).f17493b; abstractC6419g != null; abstractC6419g = abstractC6419g.m20979d()) {
            linkedList.addFirst(abstractC6419g);
        }
        C7154a c7154a = new C7154a();
        for (AbstractC6419g abstractC6419g2 : linkedList) {
            abstractC6419g2.mo20980c(c7154a, bArr);
        }
        return c7154a;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", C6415d.f17484b[this.f17492a], Integer.valueOf(this.f17495d), Integer.valueOf(this.f17494c));
    }
}
