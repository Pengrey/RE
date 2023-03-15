package p123gj;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import ie.BindableViewHolder;
import ie.DiffUtilAsyncBindableAdapter;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p426wg.AbstractC12071vd;

/* renamed from: gj.h */
/* loaded from: classes2.dex */
public final class RecentProductsAdapter extends DiffUtilAsyncBindableAdapter {

    /* renamed from: e */
    private final InterfaceC6108l f15952e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RecentProductsAdapter.kt */
    /* renamed from: gj.h$a */
    /* loaded from: classes2.dex */
    public static final class C5700a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C5700a f15953w = new C5700a();

        C5700a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(String str, String str2) {
            Intrinsics.isThisObjectNull(str, "old");
            Intrinsics.isThisObjectNull(str2, "new");
            return Boolean.valueOf(Intrinsics.equals(str, str2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RecentProductsAdapter(InterfaceC6108l interfaceC6108l) {
        super(C5700a.f15953w);
        Intrinsics.isThisObjectNull(interfaceC6108l, "action");
        this.f15952e = interfaceC6108l;
    }

    /* renamed from: I */
    public static /* synthetic */ void m23315I(RecentProductsAdapter recentProductsAdapter, String str, View view) {
        m23313K(recentProductsAdapter, str, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static final void m23313K(RecentProductsAdapter recentProductsAdapter, String str, View view) {
        Intrinsics.isThisObjectNull(recentProductsAdapter, "this$0");
        Intrinsics.isThisObjectNull(str, "$item");
        recentProductsAdapter.f15952e.mo9587d(str);
    }

    /* renamed from: J */
    public void mo35523M(BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        final String str = (String) m22155D(bindableViewHolder.m36568j());
        if (str != null) {
            ((AbstractC12071vd) bindableViewHolder.m22151M()).f31740y.setText(str);
            ((AbstractC12071vd) bindableViewHolder.m22151M()).f31739x.setOnClickListener(new View.OnClickListener() { // from class: gj.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    RecentProductsAdapter.m23313K(RecentProductsAdapter.this, str, view);
                }
            });
        }
    }

    /* renamed from: L */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        AbstractC12071vd m3697Q = AbstractC12071vd.m3697Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m3697Q, "inflate(LayoutInflater.f….context), parent, false)");
        return new C5701i(m3697Q);
    }
}
