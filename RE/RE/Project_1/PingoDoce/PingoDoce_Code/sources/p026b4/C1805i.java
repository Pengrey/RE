package p026b4;

import android.graphics.PointF;
import java.util.List;
import p152i4.C6013a;
import p459y3.AbstractC13078a;
import p459y3.C13096m;

/* renamed from: b4.i */
/* loaded from: classes.dex */
public class C1805i implements InterfaceC1809m<PointF, PointF> {

    /* renamed from: a */
    private final C1798b f5487a;

    /* renamed from: b */
    private final C1798b f5488b;

    public C1805i(C1798b c1798b, C1798b c1798b2) {
        this.f5487a = c1798b;
        this.f5488b = c1798b2;
    }

    @Override // p026b4.InterfaceC1809m
    /* renamed from: a */
    public AbstractC13078a<PointF, PointF> mo35329a() {
        return new C13096m(this.f5487a.mo35329a(), this.f5488b.mo35329a());
    }

    @Override // p026b4.InterfaceC1809m
    /* renamed from: b */
    public List<C6013a<PointF>> mo35328b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // p026b4.InterfaceC1809m
    /* renamed from: c */
    public boolean mo35327c() {
        return this.f5487a.mo35327c() && this.f5488b.mo35327c();
    }
}
