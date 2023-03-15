package p459y3;

import android.graphics.Path;
import java.util.List;
import p040c4.C2078l;
import p130h4.C5851g;
import p152i4.C6013a;

/* renamed from: y3.l */
/* loaded from: classes.dex */
public class C13095l extends AbstractC13078a<C2078l, Path> {

    /* renamed from: i */
    private final C2078l f34033i;

    /* renamed from: j */
    private final Path f34034j;

    public C13095l(List<C6013a<C2078l>> list) {
        super(list);
        this.f34033i = new C2078l();
        this.f34034j = new Path();
    }

    @Override // p459y3.AbstractC13078a
    /* renamed from: p */
    public Path mo1633i(C6013a<C2078l> c6013a, float f) {
        this.f34033i.m34734c(c6013a.f16603b, c6013a.f16604c, f);
        C5851g.m22895i(this.f34033i, this.f34034j);
        return this.f34034j;
    }
}
