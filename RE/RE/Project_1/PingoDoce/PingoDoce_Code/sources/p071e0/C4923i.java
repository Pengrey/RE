package p071e0;

import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import p181jd.Intrinsics;
import p302q0.C9575g;
import p489zc.C13777q;
import p489zc.C13780s;

/* compiled from: RippleContainer.android.kt */
/* renamed from: e0.i */
/* loaded from: classes.dex */
public final class C4923i extends ViewGroup {

    /* renamed from: A */
    private int f13686A;

    /* renamed from: w */
    private final int f13687w;

    /* renamed from: x */
    private final List f13688x;

    /* renamed from: y */
    private final List f13689y;

    /* renamed from: z */
    private final C4924j f13690z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4923i(Context context) {
        super(context);
        Intrinsics.isThisObjectNull(context, "context");
        this.f13687w = 5;
        ArrayList arrayList = new ArrayList();
        this.f13688x = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f13689y = arrayList2;
        this.f13690z = new C4924j();
        setClipChildren(false);
        C4926l c4926l = new C4926l(context);
        addView(c4926l);
        arrayList.add(c4926l);
        arrayList2.add(c4926l);
        this.f13686A = 1;
        setTag(C9575g.hide_in_inspector_tag, Boolean.TRUE);
    }

    /* renamed from: a */
    public final void m26274a(C4907a c4907a) {
        Intrinsics.isThisObjectNull(c4907a, "<this>");
        c4907a.m26311n();
        C4926l m26271b = this.f13690z.m26271b(c4907a);
        if (m26271b != null) {
            m26271b.m26265d();
            this.f13690z.m26270c(c4907a);
            this.f13689y.add(m26271b);
        }
    }

    /* renamed from: b */
    public final C4926l m26273b(C4907a c4907a) {
        int m195i;
        Intrinsics.isThisObjectNull(c4907a, "<this>");
        C4926l m26271b = this.f13690z.m26271b(c4907a);
        if (m26271b != null) {
            return m26271b;
        }
        C4926l c4926l = (C4926l) C13777q.m209z(this.f13689y);
        if (c4926l == null) {
            int i = this.f13686A;
            m195i = C13780s.m195i(this.f13688x);
            if (i > m195i) {
                Context context = getContext();
                Intrinsics.checkIfNull(context, "context");
                c4926l = new C4926l(context);
                addView(c4926l);
                this.f13688x.add(c4926l);
            } else {
                c4926l = (C4926l) this.f13688x.get(this.f13686A);
                C4907a m26272a = this.f13690z.m26272a(c4926l);
                if (m26272a != null) {
                    m26272a.m26311n();
                    this.f13690z.m26270c(m26272a);
                    c4926l.m26265d();
                }
            }
            int i2 = this.f13686A;
            if (i2 < this.f13687w - 1) {
                this.f13686A = i2 + 1;
            } else {
                this.f13686A = 0;
            }
        }
        this.f13690z.m26269d(c4907a, c4926l);
        return c4926l;
    }

    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }
}
