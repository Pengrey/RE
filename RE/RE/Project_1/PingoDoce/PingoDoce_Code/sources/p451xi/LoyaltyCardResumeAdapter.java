package p451xi;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.C0857d;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.C1275f;
import androidx.databinding.ViewDataBinding;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import ie.BindableViewHolder;
import ie.DiffUtilAsyncBindableAdapter;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p426wg.AbstractC12104xc;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.EnumC9077a;
import pt.pingodoce.app.presentation.common.loyaltycard.resume.LoyaltyCardResumeViewModel;

/* renamed from: xi.i */
/* loaded from: classes2.dex */
public final class LoyaltyCardResumeAdapter extends DiffUtilAsyncBindableAdapter {

    /* renamed from: e */
    private final InterfaceC6108l f33746e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LoyaltyCardResumeAdapter.kt */
    /* renamed from: xi.i$a */
    /* loaded from: classes2.dex */
    public static final class C13000a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C13000a f33747w = new C13000a();

        C13000a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(LoyaltyCardResumeViewModel loyaltyCardResumeViewModel, LoyaltyCardResumeViewModel loyaltyCardResumeViewModel2) {
            Intrinsics.isThisObjectNull(loyaltyCardResumeViewModel, "old");
            Intrinsics.isThisObjectNull(loyaltyCardResumeViewModel2, "new");
            return Boolean.valueOf(Intrinsics.equals(loyaltyCardResumeViewModel, loyaltyCardResumeViewModel2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LoyaltyCardResumeAdapter.kt */
    /* renamed from: xi.i$b */
    /* loaded from: classes2.dex */
    public static final class C13001b extends BindableViewHolder {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C13001b(AbstractC12104xc abstractC12104xc) {
            super(abstractC12104xc);
            Intrinsics.isThisObjectNull(abstractC12104xc, "binding");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoyaltyCardResumeAdapter(InterfaceC6108l interfaceC6108l) {
        super(C13000a.f33747w);
        Intrinsics.isThisObjectNull(interfaceC6108l, "callback");
        this.f33746e = interfaceC6108l;
    }

    /* renamed from: I */
    public static /* synthetic */ void m1963I(LoyaltyCardResumeAdapter loyaltyCardResumeAdapter, View view) {
        m1960L(loyaltyCardResumeAdapter, view);
    }

    /* renamed from: J */
    public static /* synthetic */ void m1962J(LoyaltyCardResumeAdapter loyaltyCardResumeAdapter, View view) {
        m1959M(loyaltyCardResumeAdapter, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static final void m1960L(LoyaltyCardResumeAdapter loyaltyCardResumeAdapter, View view) {
        Intrinsics.isThisObjectNull(loyaltyCardResumeAdapter, "this$0");
        loyaltyCardResumeAdapter.f33746e.mo9587d(EnumC9077a.INVITE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static final void m1959M(LoyaltyCardResumeAdapter loyaltyCardResumeAdapter, View view) {
        Intrinsics.isThisObjectNull(loyaltyCardResumeAdapter, "this$0");
        loyaltyCardResumeAdapter.f33746e.mo9587d(EnumC9077a.EDIT);
    }

    /* renamed from: K */
    public void mo35523M(BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        LoyaltyCardResumeViewModel loyaltyCardResumeViewModel = (LoyaltyCardResumeViewModel) m22155D(bindableViewHolder.m36568j());
        if (loyaltyCardResumeViewModel != null) {
            ((AbstractC12104xc) bindableViewHolder.m22151M()).mo3598Q(loyaltyCardResumeViewModel);
            if (loyaltyCardResumeViewModel.m12650f()) {
                ((AbstractC12104xc) bindableViewHolder.m22151M()).f31898x.setOnClickListener(new View.OnClickListener() { // from class: xi.g
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LoyaltyCardResumeAdapter.m1960L(LoyaltyCardResumeAdapter.this, view);
                    }
                });
            }
            if (loyaltyCardResumeViewModel.m12648i()) {
                ((AbstractC12104xc) bindableViewHolder.m22151M()).f31900z.setOnClickListener(new View.OnClickListener() { // from class: xi.h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        LoyaltyCardResumeAdapter.m1959M(LoyaltyCardResumeAdapter.this, view);
                    }
                });
            } else {
                ViewGroup.LayoutParams layoutParams = ((AbstractC12104xc) bindableViewHolder.m22151M()).f31894B.getLayoutParams();
                layoutParams.width = -2;
                ((AbstractC12104xc) bindableViewHolder.m22151M()).f31894B.setLayoutParams(layoutParams);
            }
            C0857d c0857d = new C0857d();
            c0857d.m39396g((ConstraintLayout) ((AbstractC12104xc) bindableViewHolder.m22151M()).m37802s());
            c0857d.m39394i(((AbstractC12104xc) bindableViewHolder.m22151M()).f31893A.getId(), 3, loyaltyCardResumeViewModel.m12653c().isEmpty() ? ((AbstractC12104xc) bindableViewHolder.m22151M()).f31894B.getId() : ((AbstractC12104xc) bindableViewHolder.m22151M()).f31896D.getId(), 4, 0);
            c0857d.m39400c((ConstraintLayout) ((AbstractC12104xc) bindableViewHolder.m22151M()).m37802s());
            ((AbstractC12104xc) bindableViewHolder.m22151M()).f31893A.setText(Html.fromHtml(loyaltyCardResumeViewModel.m12652d(), 0));
        }
    }

    /* renamed from: N */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        ViewDataBinding m37764e = C1275f.m37764e(LayoutInflater.from(viewGroup.getContext()), C2336R.layout.view_row_for_onboarding_resume, viewGroup, false);
        Intrinsics.checkIfNull(m37764e, "inflate(LayoutInflater.f…ng_resume, parent, false)");
        return new C13001b((AbstractC12104xc) m37764e);
    }
}
