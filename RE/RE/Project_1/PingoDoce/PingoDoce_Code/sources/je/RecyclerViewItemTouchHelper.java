package je;

import android.graphics.Canvas;
import android.view.View;
import androidx.recyclerview.widget.C1618k;
import androidx.recyclerview.widget.InterfaceC1632l;
import androidx.recyclerview.widget.RecyclerView;
import id.InterfaceC6112p;
import id.InterfaceC6113q;
import je.TouchableViewHolder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p468yc.C13182l;

/* renamed from: je.a */
/* loaded from: classes2.dex */
public final class RecyclerViewItemTouchHelper<H extends TouchableViewHolder<?>> extends C1618k.AbstractC1630i {

    /* renamed from: d */
    private final int f17536d;

    /* renamed from: e */
    private final int f17537e;

    /* renamed from: f */
    private final InterfaceC6113q f17538f;

    /* renamed from: g */
    private final InterfaceC6112p f17539g;

    public /* synthetic */ RecyclerViewItemTouchHelper(int i, int i2, InterfaceC6113q interfaceC6113q, InterfaceC6112p interfaceC6112p, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 4 : i2, (i3 & 4) != 0 ? null : interfaceC6113q, (i3 & 8) != 0 ? null : interfaceC6112p);
    }

    /* renamed from: B */
    public void mo35962B(RecyclerView.AbstractC1531c0 abstractC1531c0, int i) {
        if (abstractC1531c0 != null) {
            C1618k.AbstractC1624f.m35952i().mo35926b(((TouchableViewHolder) abstractC1531c0).m20893P());
        }
    }

    /* renamed from: C */
    public void mo35961C(RecyclerView.AbstractC1531c0 abstractC1531c0, int i) {
        InterfaceC6113q interfaceC6113q;
        Intrinsics.isThisObjectNull(abstractC1531c0, "viewHolder");
        TouchableViewHolder touchableViewHolder = (TouchableViewHolder) abstractC1531c0;
        if (!touchableViewHolder.m20892Q() || (interfaceC6113q = this.f17538f) == null) {
            return;
        }
        interfaceC6113q.mo4533i(abstractC1531c0, Integer.valueOf(i), Integer.valueOf(touchableViewHolder.m36568j()));
    }

    /* renamed from: c */
    public void mo35958c(RecyclerView recyclerView, RecyclerView.AbstractC1531c0 abstractC1531c0) {
        Intrinsics.isThisObjectNull(recyclerView, "recyclerView");
        Intrinsics.isThisObjectNull(abstractC1531c0, "viewHolder");
        C1618k.AbstractC1624f.m35952i().mo35927a(((TouchableViewHolder) abstractC1531c0).m20893P());
    }

    /* renamed from: l */
    public int mo35949l(RecyclerView recyclerView, RecyclerView.AbstractC1531c0 abstractC1531c0) {
        Intrinsics.isThisObjectNull(recyclerView, "recyclerView");
        Intrinsics.isThisObjectNull(abstractC1531c0, "viewHolder");
        if (!(abstractC1531c0 instanceof TouchableViewHolder)) {
            return C1618k.AbstractC1624f.m35940u(0, 0);
        }
        TouchableViewHolder touchableViewHolder = (TouchableViewHolder) abstractC1531c0;
        return C1618k.AbstractC1624f.m35940u(touchableViewHolder.m20892Q() ? this.f17536d : 0, touchableViewHolder.m20892Q() ? this.f17537e : 0);
    }

    /* renamed from: v */
    public void mo35939v(Canvas canvas, RecyclerView recyclerView, RecyclerView.AbstractC1531c0 abstractC1531c0, float f, float f2, int i, boolean z) {
        C13182l c13182l;
        C13182l c13182l2;
        Intrinsics.isThisObjectNull(canvas, "c");
        Intrinsics.isThisObjectNull(recyclerView, "recyclerView");
        Intrinsics.isThisObjectNull(abstractC1531c0, "viewHolder");
        TouchableViewHolder touchableViewHolder = (TouchableViewHolder) abstractC1531c0;
        C1618k.AbstractC1624f.m35952i().mo35924d(canvas, recyclerView, touchableViewHolder.m20893P(), f, f2, i, z);
        View m20894O = touchableViewHolder.m20894O();
        if (m20894O != null) {
            InterfaceC1632l m35952i = C1618k.AbstractC1624f.m35952i();
            InterfaceC6112p interfaceC6112p = this.f17539g;
            float floatValue = (interfaceC6112p == null || (c13182l2 = (C13182l) interfaceC6112p.mo39856d(Float.valueOf(f), Float.valueOf(f2))) == null) ? f / 7 : ((Number) c13182l2.m1460c()).floatValue();
            InterfaceC6112p interfaceC6112p2 = this.f17539g;
            m35952i.mo35924d(canvas, recyclerView, m20894O, floatValue, (interfaceC6112p2 == null || (c13182l = (C13182l) interfaceC6112p2.mo39856d(Float.valueOf(f), Float.valueOf(f2))) == null) ? f2 : ((Number) c13182l.m1459d()).floatValue(), i, z);
        }
    }

    /* renamed from: z */
    public boolean mo35935z(RecyclerView recyclerView, RecyclerView.AbstractC1531c0 abstractC1531c0, RecyclerView.AbstractC1531c0 abstractC1531c02) {
        Intrinsics.isThisObjectNull(recyclerView, "recyclerView");
        Intrinsics.isThisObjectNull(abstractC1531c0, "viewHolder");
        Intrinsics.isThisObjectNull(abstractC1531c02, "target");
        return true;
    }

    public RecyclerViewItemTouchHelper(int i, int i2, InterfaceC6113q interfaceC6113q, InterfaceC6112p interfaceC6112p) {
        super(i, i2);
        this.f17536d = i;
        this.f17537e = i2;
        this.f17538f = interfaceC6113q;
        this.f17539g = interfaceC6112p;
    }
}
