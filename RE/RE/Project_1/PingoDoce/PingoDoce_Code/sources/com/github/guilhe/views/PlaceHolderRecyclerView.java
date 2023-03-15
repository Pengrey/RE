package com.github.guilhe.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p416w5.InterfaceC11569a;

/* compiled from: PlaceHolderRecyclerView.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0002H\u0016R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR$\u0010\u0014\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m20207d2 = {"Lcom/github/guilhe/views/PlaceHolderRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroidx/recyclerview/widget/RecyclerView$g;", "adapter", "Lyc/u;", "setAdapter", "Lw5/a;", "holdersAdapter", "Lw5/a;", "getHoldersAdapter", "()Lw5/a;", "setHoldersAdapter", "(Lw5/a;)V", "Landroidx/recyclerview/widget/RecyclerView$n;", "f1", "Landroidx/recyclerview/widget/RecyclerView$n;", "getHoldersItemDecoration", "()Landroidx/recyclerview/widget/RecyclerView$n;", "setHoldersItemDecoration", "(Landroidx/recyclerview/widget/RecyclerView$n;)V", "holdersItemDecoration", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", BuildConfig.VERSION_NAME, "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "placeholder-recyclerview_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class PlaceHolderRecyclerView extends RecyclerView {

    /* renamed from: d1 */
    private RecyclerView.AbstractC1535g f6877d1;

    /* renamed from: e1 */
    public InterfaceC11569a f6878e1;

    /* renamed from: f1 */
    private RecyclerView.AbstractC1545n f6879f1;

    public PlaceHolderRecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ PlaceHolderRecyclerView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* renamed from: B1 */
    public final void m33813B1(boolean z) {
        RecyclerView.AbstractC1535g abstractC1535g;
        if (this.f6878e1 != null) {
            RecyclerView.AbstractC1545n abstractC1545n = this.f6879f1;
            if (abstractC1545n != null) {
                if (z) {
                    m36657h(abstractC1545n);
                } else {
                    m36678Z0(abstractC1545n);
                }
            }
            if (z) {
                InterfaceC11569a interfaceC11569a = this.f6878e1;
                if (interfaceC11569a == null) {
                    Intrinsics.throwUninitPropException("holdersAdapter");
                }
                Objects.requireNonNull(interfaceC11569a, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder>");
                abstractC1535g = (RecyclerView.AbstractC1535g) interfaceC11569a;
            } else {
                abstractC1535g = this.f6877d1;
                if (abstractC1535g == null) {
                    Intrinsics.throwUninitPropException("itemAdapter");
                }
            }
            if (!Intrinsics.equals(abstractC1535g, getAdapter())) {
                setAdapter(abstractC1535g);
            }
        }
    }

    public final InterfaceC11569a getHoldersAdapter() {
        InterfaceC11569a interfaceC11569a = this.f6878e1;
        if (interfaceC11569a == null) {
            Intrinsics.throwUninitPropException("holdersAdapter");
        }
        return interfaceC11569a;
    }

    public final RecyclerView.AbstractC1545n getHoldersItemDecoration() {
        return this.f6879f1;
    }

    public void setAdapter(RecyclerView.AbstractC1535g abstractC1535g) {
        super.setAdapter(abstractC1535g);
        if (abstractC1535g instanceof InterfaceC11569a) {
            return;
        }
        Objects.requireNonNull(abstractC1535g, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.Adapter<androidx.recyclerview.widget.RecyclerView.ViewHolder>");
        this.f6877d1 = abstractC1535g;
    }

    public final void setHoldersAdapter(InterfaceC11569a interfaceC11569a) {
        Intrinsics.isThisObjectNull(interfaceC11569a, "<set-?>");
        this.f6878e1 = interfaceC11569a;
    }

    public final void setHoldersItemDecoration(RecyclerView.AbstractC1545n abstractC1545n) {
        this.f6879f1 = abstractC1545n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaceHolderRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.isThisObjectNull(context, "context");
    }
}
