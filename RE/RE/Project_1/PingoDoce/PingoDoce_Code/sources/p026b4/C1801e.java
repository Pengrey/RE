package p026b4;

import android.graphics.PointF;
import java.util.List;
import p152i4.C6013a;
import p459y3.AbstractC13078a;
import p459y3.C13092i;
import p459y3.C13093j;

/* renamed from: b4.e */
/* loaded from: classes.dex */
public class C1801e implements InterfaceC1809m<PointF, PointF> {

    /* renamed from: a */
    private final List<C6013a<PointF>> f5486a;

    public C1801e(List<C6013a<PointF>> list) {
        this.f5486a = list;
    }

    @Override // p026b4.InterfaceC1809m
    /* renamed from: a */
    public AbstractC13078a<PointF, PointF> mo35329a() {
        if (this.f5486a.get(0).m22358h()) {
            return new C13093j(this.f5486a);
        }
        return new C13092i(this.f5486a);
    }

    @Override // p026b4.InterfaceC1809m
    /* renamed from: b */
    public List<C6013a<PointF>> mo35328b() {
        return this.f5486a;
    }

    @Override // p026b4.InterfaceC1809m
    /* renamed from: c */
    public boolean mo35327c() {
        return this.f5486a.size() == 1 && this.f5486a.get(0).m22358h();
    }
}
