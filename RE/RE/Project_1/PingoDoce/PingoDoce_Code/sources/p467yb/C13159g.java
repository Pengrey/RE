package p467yb;

import com.google.zxing.FormatException;
import com.google.zxing.NotFoundException;
import p239mb.C7154a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: yb.g */
/* loaded from: classes2.dex */
public final class C13159g extends AbstractC13160h {
    /* JADX INFO: Access modifiers changed from: package-private */
    public C13159g(C7154a c7154a) {
        super(c7154a);
    }

    @Override // p467yb.AbstractC13162j
    /* renamed from: d */
    public String mo1512d() throws NotFoundException, FormatException {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(01)");
        int length = sb2.length();
        sb2.append(m1514b().m1483f(4, 4));
        m1519g(sb2, 8, length);
        return m1514b().m1488a(sb2, 48);
    }
}
