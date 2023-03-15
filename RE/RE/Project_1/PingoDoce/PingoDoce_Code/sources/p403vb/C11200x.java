package p403vb;

import com.google.zxing.C4409m;
import com.google.zxing.NotFoundException;
import com.google.zxing.ReaderException;
import p239mb.C7154a;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: vb.x */
/* loaded from: classes2.dex */
public final class C11200x {

    /* renamed from: c */
    private static final int[] f28761c = {1, 1, 2};

    /* renamed from: a */
    private final C11198v f28762a = new C11198v();

    /* renamed from: b */
    private final C11199w f28763b = new C11199w();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public C4409m m5767a(int i, C7154a c7154a, int i2) throws NotFoundException {
        int[] m5760o = AbstractC11201y.m5760o(c7154a, i2, false, f28761c);
        try {
            return this.f28763b.m5772b(i, c7154a, m5760o);
        } catch (ReaderException unused) {
            return this.f28762a.m5775b(i, c7154a, m5760o);
        }
    }
}
