package p179jb;

import p239mb.C7154a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: jb.e */
/* loaded from: classes2.dex */
public final class C6417e extends AbstractC6419g {

    /* renamed from: c */
    private final short f17489c;

    /* renamed from: d */
    private final short f17490d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6417e(AbstractC6419g abstractC6419g, int i, int i2) {
        super(abstractC6419g);
        this.f17489c = (short) i;
        this.f17490d = (short) i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p179jb.AbstractC6419g
    /* renamed from: c */
    public void mo20980c(C7154a c7154a, byte[] bArr) {
        c7154a.m19080c(this.f17489c, this.f17490d);
    }

    public String toString() {
        short s = this.f17489c;
        short s2 = this.f17490d;
        int i = (s & ((1 << s2) - 1)) | (1 << s2);
        return "<" + Integer.toBinaryString(i | (1 << this.f17490d)).substring(1) + '>';
    }
}
