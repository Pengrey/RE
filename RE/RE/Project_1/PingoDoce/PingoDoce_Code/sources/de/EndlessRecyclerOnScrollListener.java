package de;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: de.a */
/* loaded from: classes2.dex */
public abstract class EndlessRecyclerOnScrollListener extends RecyclerView.AbstractC1555t {

    /* renamed from: a */
    private final int f13104a;

    /* renamed from: b */
    private LinearLayoutManager f13105b;

    public /* synthetic */ EndlessRecyclerOnScrollListener(LinearLayoutManager linearLayoutManager, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(linearLayoutManager, (i2 & 2) != 0 ? 0 : i);
    }

    /* renamed from: b */
    public void mo29913b(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.isThisObjectNull(recyclerView, "recyclerView");
        super.mo29913b(recyclerView, i, i2);
        int m36771b2 = this.f13105b.m36771b2();
        int m36483K = this.f13105b.m36483K();
        int m36462Z = this.f13105b.m36462Z();
        if (this.f13105b.m36754s2() != 0) {
            i = i2;
        }
        boolean z = true;
        if (!(!this.f13105b.m36753t2()) ? i >= 0 : i <= 0) {
            z = false;
        }
        if (!z || (m36771b2 + m36483K) - this.f13104a < m36462Z) {
            return;
        }
        m26607c(this.f13105b.m36767f2() + this.f13104a);
    }

    /* renamed from: c */
    public abstract void m26607c(int i);

    public EndlessRecyclerOnScrollListener(LinearLayoutManager linearLayoutManager, int i) {
        Intrinsics.isThisObjectNull(linearLayoutManager, "manager");
        this.f13104a = i;
        this.f13105b = linearLayoutManager;
    }
}
