package p164ii;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import id.InterfaceC6112p;
import ie.BindableViewHolder;
import ie.DiffUtilAsyncBindableAdapter;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p426wg.AbstractC11697bc;
import pt.pingodoce.app.data.local.models.clubs.ClubBaby;
import pt.pingodoce.app.presentation.clubs.baby.EnumC8984a;

/* renamed from: ii.c */
/* loaded from: classes2.dex */
public final class BabyClubAdapter extends DiffUtilAsyncBindableAdapter {

    /* renamed from: e */
    private final InterfaceC6112p f16901e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BabyClubAdapter.kt */
    /* renamed from: ii.c$a */
    /* loaded from: classes2.dex */
    public static final class C6160a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C6160a f16902w = new C6160a();

        C6160a() {
            super(2);
        }

        /* renamed from: a */
        public final Boolean mo39856d(ClubBaby clubBaby, ClubBaby clubBaby2) {
            Intrinsics.isThisObjectNull(clubBaby, "old");
            Intrinsics.isThisObjectNull(clubBaby2, "new");
            return Boolean.valueOf(Intrinsics.equals(clubBaby, clubBaby2));
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BabyClubAdapter(InterfaceC6112p interfaceC6112p) {
        super(C6160a.f16902w);
        Intrinsics.isThisObjectNull(interfaceC6112p, "action");
        this.f16901e = interfaceC6112p;
    }

    /* renamed from: I */
    public static /* synthetic */ void m22034I(BabyClubAdapter babyClubAdapter, BindableViewHolder bindableViewHolder, View view) {
        m22030M(babyClubAdapter, bindableViewHolder, view);
    }

    /* renamed from: J */
    public static /* synthetic */ void m22033J(BabyClubAdapter babyClubAdapter, BindableViewHolder bindableViewHolder, View view) {
        m22031L(babyClubAdapter, bindableViewHolder, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static final void m22031L(BabyClubAdapter babyClubAdapter, BindableViewHolder bindableViewHolder, View view) {
        Intrinsics.isThisObjectNull(babyClubAdapter, "this$0");
        Intrinsics.isThisObjectNull(bindableViewHolder, "$holder");
        ClubBaby clubBaby = (ClubBaby) babyClubAdapter.m22155D(bindableViewHolder.m36568j());
        if (clubBaby != null) {
            babyClubAdapter.f16901e.mo39856d(clubBaby, EnumC8984a.EDIT);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: M */
    public static final void m22030M(BabyClubAdapter babyClubAdapter, BindableViewHolder bindableViewHolder, View view) {
        Intrinsics.isThisObjectNull(babyClubAdapter, "this$0");
        Intrinsics.isThisObjectNull(bindableViewHolder, "$holder");
        ClubBaby clubBaby = (ClubBaby) babyClubAdapter.m22155D(bindableViewHolder.m36568j());
        if (clubBaby != null) {
            babyClubAdapter.f16901e.mo39856d(clubBaby, EnumC8984a.DELETE);
        }
    }

    /* renamed from: K */
    public void mo35523M(final BindableViewHolder bindableViewHolder, int i) {
        Intrinsics.isThisObjectNull(bindableViewHolder, "holder");
        ClubBaby clubBaby = (ClubBaby) m22155D(bindableViewHolder.m36568j());
        if (clubBaby != null) {
            ((AbstractC11697bc) bindableViewHolder.m22151M()).mo4418S(clubBaby);
            ((AbstractC11697bc) bindableViewHolder.m22151M()).f29955x.setOnClickListener(new View.OnClickListener() { // from class: ii.b
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BabyClubAdapter.m22031L(BabyClubAdapter.this, bindableViewHolder, view);
                }
            });
            ((AbstractC11697bc) bindableViewHolder.m22151M()).f29956y.setOnClickListener(new View.OnClickListener() { // from class: ii.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BabyClubAdapter.m22030M(BabyClubAdapter.this, bindableViewHolder, view);
                }
            });
        }
    }

    /* renamed from: N */
    public BindableViewHolder mo42215u(ViewGroup viewGroup, int i) {
        Intrinsics.isThisObjectNull(viewGroup, "parent");
        AbstractC11697bc m4460Q = AbstractC11697bc.m4460Q(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        Intrinsics.checkIfNull(m4460Q, "inflate(\n               …      false\n            )");
        return new C6169n(m4460Q);
    }
}
