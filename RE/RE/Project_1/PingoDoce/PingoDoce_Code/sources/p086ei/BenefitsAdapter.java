package p086ei;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.AbstractC1637q;
import androidx.recyclerview.widget.RecyclerView;
import com.github.aachartmodel.aainfographics.C2336R;
import gi.BenefitViewState;
import gi.C5691c;
import gi.EnumC5690a;
import gi.InterfaceC5692d;
import id.InterfaceC6108l;
import java.util.List;
import p086ei.BenefitsAdapter;
import p181jd.Intrinsics;
import p426wg.AbstractC11878lf;
import p426wg.AbstractC12103xb;
import p489zc._Collections;

/* renamed from: ei.l */
/* loaded from: classes2.dex */
public final class BenefitsAdapter extends AbstractC1637q {

    /* renamed from: e */
    private final InterfaceC6108l f14107e;

    /* compiled from: BenefitsAdapter.kt */
    /* renamed from: ei.l$a */
    /* loaded from: classes2.dex */
    public final class C5090a extends RecyclerView.AbstractC1531c0 {

        /* renamed from: t */
        private final AbstractC12103xb f14108t;

        /* renamed from: u */
        final /* synthetic */ BenefitsAdapter f14109u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5090a(BenefitsAdapter benefitsAdapter, AbstractC12103xb abstractC12103xb) {
            super(abstractC12103xb.m37802s());
            Intrinsics.isThisObjectNull(abstractC12103xb, "binding");
            this.f14109u = benefitsAdapter;
            this.f14108t = abstractC12103xb;
        }

        /* renamed from: M */
        public static /* synthetic */ void m25719M(BenefitsAdapter benefitsAdapter, BenefitViewState benefitViewState, View view) {
            m25717O(benefitsAdapter, benefitViewState, view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: O */
        public static final void m25717O(BenefitsAdapter benefitsAdapter, BenefitViewState benefitViewState, View view) {
            Intrinsics.isThisObjectNull(benefitsAdapter, "this$0");
            Intrinsics.isThisObjectNull(benefitViewState, "$benefitRow");
            BenefitsAdapter.m25724G(benefitsAdapter).mo9587d(benefitViewState.m23338b());
        }

        /* renamed from: N */
        public final void m25718N(InterfaceC5692d interfaceC5692d) {
            Intrinsics.isThisObjectNull(interfaceC5692d, "benefitViewState");
            final BenefitViewState benefitViewState = (BenefitViewState) interfaceC5692d;
            this.f14108t.mo3599Q(benefitViewState);
            this.f14108t.f31890x.setImageResource(benefitViewState.m23338b().m13926s() ? C2336R.C2337drawable.ic_to_expire : C2336R.C2337drawable.ic_new);
            int i = 4;
            this.f14108t.f31890x.setVisibility((benefitViewState.m23338b().m13926s() || benefitViewState.m23338b().m13925t()) ? 0 : 4);
            this.f14108t.f31891y.setImageResource(benefitViewState.m23338b().m13923w() ? C2336R.C2337drawable.ic_wine_glass_24 : C2336R.C2337drawable.ic_babyclub_24);
            AppCompatImageView appCompatImageView = this.f14108t.f31891y;
            if (benefitViewState.m23338b().m13923w() || benefitViewState.m23338b().m13927r()) {
                i = 0;
            }
            appCompatImageView.setVisibility(i);
            View m37802s = this.f14108t.m37802s();
            final BenefitsAdapter benefitsAdapter = this.f14109u;
            m37802s.setOnClickListener(new View.OnClickListener() { // from class: ei.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BenefitsAdapter.C5090a.m25717O(BenefitsAdapter.this, benefitViewState, view);
                }
            });
            this.f14108t.m37807n();
        }
    }

    /* compiled from: BenefitsAdapter.kt */
    /* renamed from: ei.l$b */
    /* loaded from: classes2.dex */
    public final class C5091b extends RecyclerView.AbstractC1531c0 {

        /* renamed from: t */
        private final AbstractC11878lf f14110t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5091b(BenefitsAdapter benefitsAdapter, AbstractC11878lf abstractC11878lf) {
            super(abstractC11878lf.m37802s());
            Intrinsics.isThisObjectNull(abstractC11878lf, "binding");
            this.f14110t = abstractC11878lf;
        }

        /* renamed from: M */
        public final void m25716M(InterfaceC5692d interfaceC5692d) {
            Intrinsics.isThisObjectNull(interfaceC5692d, "benefitViewState");
            this.f14110t.mo3992Q((C5691c) interfaceC5692d);
            this.f14110t.m37807n();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BenefitsAdapter(InterfaceC6108l interfaceC6108l) {
        super(C5092m.m25715a());
        Intrinsics.isThisObjectNull(interfaceC6108l, "onItemClickListener");
        this.f14107e = interfaceC6108l;
    }

    /* renamed from: G */
    public static final /* synthetic */ InterfaceC6108l m25724G(BenefitsAdapter benefitsAdapter) {
        return benefitsAdapter.f14107e;
    }

    /* renamed from: H */
    public final void m25723H(List list) {
        List m453p0;
        Intrinsics.isThisObjectNull(list, "list");
        m453p0 = _Collections.m453p0(list);
        m35900F(m453p0);
    }

    /* renamed from: h */
    public int mo36545h(int i) {
        return ((InterfaceC5692d) m35902D(i)).mo23336a().getValue();
    }

    /* renamed from: s */
    public void mo35523M(RecyclerView.AbstractC1531c0 abstractC1531c0, int i) {
        Intrinsics.isThisObjectNull(abstractC1531c0, "holder");
        InterfaceC5692d interfaceC5692d = (InterfaceC5692d) m35902D(i);
        if (abstractC1531c0 instanceof C5091b) {
            Intrinsics.checkIfNull(interfaceC5692d, "item");
            ((C5091b) abstractC1531c0).m25716M(interfaceC5692d);
        } else if (abstractC1531c0 instanceof C5090a) {
            Intrinsics.checkIfNull(interfaceC5692d, "item");
            ((C5090a) abstractC1531c0).m25718N(interfaceC5692d);
        }
    }

    /* renamed from: u */
    public RecyclerView.AbstractC1531c0 mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == EnumC5690a.BenefitTitle.getValue()) {
            ViewDataBinding m37764e = C1275f.m37764e(from, C2336R.layout.view_title_row_benefits, viewGroup, false);
            Intrinsics.checkIfNull(m37764e, "inflate(inflater, R.layo…_benefits, parent, false)");
            return new C5091b(this, (AbstractC11878lf) m37764e);
        }
        ViewDataBinding m37764e2 = C1275f.m37764e(from, C2336R.layout.view_row_benefits, viewGroup, false);
        Intrinsics.checkIfNull(m37764e2, "inflate(inflater, R.layo…_benefits, parent, false)");
        return new C5090a(this, (AbstractC12103xb) m37764e2);
    }
}
