package p179jb;

import p239mb.C7154a;

/* renamed from: jb.b */
/* loaded from: classes2.dex */
final class C6413b extends AbstractC6419g {

    /* renamed from: c */
    private final short f17481c;

    /* renamed from: d */
    private final short f17482d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6413b(AbstractC6419g abstractC6419g, int i, int i2) {
        super(abstractC6419g);
        this.f17481c = (short) i;
        this.f17482d = (short) i2;
    }

    @Override // p179jb.AbstractC6419g
    /* renamed from: c */
    public void mo20980c(C7154a c7154a, byte[] bArr) {
        int i = 0;
        while (true) {
            short s = this.f17482d;
            if (i >= s) {
                return;
            }
            if (i == 0 || (i == 31 && s <= 62)) {
                c7154a.m19080c(31, 5);
                short s2 = this.f17482d;
                if (s2 > 62) {
                    c7154a.m19080c(s2 - 31, 16);
                } else if (i == 0) {
                    c7154a.m19080c(Math.min((int) s2, 31), 5);
                } else {
                    c7154a.m19080c(s2 - 31, 5);
                }
            }
            c7154a.m19080c(bArr[this.f17481c + i], 8);
            i++;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append((int) this.f17481c);
        sb2.append("::");
        sb2.append((this.f17481c + this.f17482d) - 1);
        sb2.append('>');
        return sb2.toString();
    }
}
