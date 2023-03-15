package p123gj;

import android.content.res.ColorStateList;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import fm.C5579c;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import ie.BindableViewHolder;
import ie.DiffUtilAsyncBindableAdapter;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p426wg.AbstractC11875lc;
import pt.pingodoce.app.data.remote.models.response.Tag;

/* renamed from: gj.e */
/* loaded from: classes2.dex */
public final class CategoryFilterAdapter extends DiffUtilAsyncBindableAdapter {

    /* renamed from: e */
    private final InterfaceC6108l f15948e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: CategoryFilterAdapter.kt */
    /* renamed from: gj.e$a */
    /* loaded from: classes2.dex */
    public static final class C5697a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C5697a f15949w = new C5697a();

        C5697a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(Tag tag, Tag tag2) {
            Intrinsics.isThisObjectNull(tag, "old");
            Intrinsics.isThisObjectNull(tag2, "new");
            return Boolean.valueOf(Intrinsics.equals(tag, tag2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CategoryFilterAdapter(InterfaceC6108l interfaceC6108l) {
        super(C5697a.f15949w);
        Intrinsics.isThisObjectNull(interfaceC6108l, "action");
        this.f15948e = interfaceC6108l;
    }

    /* renamed from: I */
    public static /* synthetic */ void m23322I(CategoryFilterAdapter categoryFilterAdapter, Tag tag, View view) {
        m23320K(categoryFilterAdapter, tag, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: K */
    public static final void m23320K(CategoryFilterAdapter categoryFilterAdapter, Tag tag, View view) {
        Intrinsics.isThisObjectNull(categoryFilterAdapter, "this$0");
        Intrinsics.isThisObjectNull(tag, "$item");
        categoryFilterAdapter.f15948e.mo9587d(tag);
    }

    /* renamed from: J */
    public void mo35523M(BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        final Tag tag = (Tag) m22155D(bindableViewHolder.m36568j());
        if (tag != null) {
            ColorStateList m23711h = C5579c.m23711h(tag.m13688e());
            ((AbstractC11875lc) bindableViewHolder.m22151M()).f30883x.setTextColor(m23711h);
            ((AbstractC11875lc) bindableViewHolder.m22151M()).f30883x.setStrokeColor(m23711h);
            ((AbstractC11875lc) bindableViewHolder.m22151M()).f30883x.setRippleColor(m23711h);
            ((AbstractC11875lc) bindableViewHolder.m22151M()).f30883x.setBackgroundTintList(C5579c.m23711h(tag.m13686h()));
            ((AbstractC11875lc) bindableViewHolder.m22151M()).f30883x.setText(tag.m13690c());
            ((AbstractC11875lc) bindableViewHolder.m22151M()).f30883x.setOnClickListener(new View.OnClickListener() { // from class: gj.d
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CategoryFilterAdapter.m23320K(CategoryFilterAdapter.this, tag, view);
                }
            });
        }
    }

    /* renamed from: L */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        AbstractC11875lc m4047Q = AbstractC11875lc.m4047Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m4047Q, "inflate(LayoutInflater.f….context), parent, false)");
        return new C5698f(m4047Q);
    }
}
