package p459y3;

import java.util.List;
import p040c4.C2066c;
import p152i4.C6013a;

/* renamed from: y3.d */
/* loaded from: classes.dex */
public class C13087d extends AbstractC13089f<C2066c> {

    /* renamed from: i */
    private final C2066c f34021i;

    public C13087d(List<C6013a<C2066c>> list) {
        super(list);
        C2066c c2066c = list.get(0).f16603b;
        int m34786c = c2066c != null ? c2066c.m34786c() : 0;
        this.f34021i = new C2066c(new float[m34786c], new int[m34786c]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p459y3.AbstractC13078a
    /* renamed from: p */
    public C2066c mo1633i(C6013a<C2066c> c6013a, float f) {
        this.f34021i.m34785d(c6013a.f16603b, c6013a.f16604c, f);
        return this.f34021i;
    }
}
