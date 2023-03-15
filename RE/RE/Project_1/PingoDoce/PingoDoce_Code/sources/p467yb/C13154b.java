package p467yb;

import p239mb.C7154a;

/* renamed from: yb.b */
/* loaded from: classes2.dex */
final class C13154b extends AbstractC13158f {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C13154b(C7154a c7154a) {
        super(c7154a);
    }

    @Override // p467yb.AbstractC13161i
    /* renamed from: h */
    protected void mo1518h(StringBuilder sb2, int i) {
        if (i < 10000) {
            sb2.append("(3202)");
        } else {
            sb2.append("(3203)");
        }
    }

    @Override // p467yb.AbstractC13161i
    /* renamed from: i */
    protected int mo1517i(int i) {
        return i < 10000 ? i : i - 10000;
    }
}
