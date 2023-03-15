package pt.pingodoce.app.presentation.clubs;

import android.os.Bundle;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.AbstractC1423a;
import androidx.lifecycle.InterfaceC1440f0;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6097a;
import id.InterfaceC6108l;
import java.util.Iterator;
import java.util.List;
import ke.ViewModelFactoryByInjection;
import me.InterfaceC7186c;
import ne.EventObserver;
import p144hi.ClubViewModel;
import p164ii.BabyClubHomeActivity;
import p181jd.AbstractC6438m;
import p181jd.C6450z;
import p181jd.Intrinsics;
import p185ji.WineClubHomeActivity;
import p221le.UiEventsLiveData;
import p314qd.InterfaceC9717b;
import p315qe.AbstractC9725a;
import p426wg.AbstractC11957q;
import p468yc.C13182l;
import p468yc.C13195u;
import p494zh.BaseActivity;
import p494zh.C13814b2;
import p494zh.C13819c2;
import pe.C8617d;
import pe.C8618e;
import pt.pingodoce.app.data.local.models.clubs.Club;
import pt.pingodoce.app.data.local.models.clubs.EnumC8691a;
import pt.pingodoce.app.presentation.clubs.ClubActivity;

/* compiled from: ClubActivity.kt */
/* loaded from: classes2.dex */
public final class ClubActivity extends BaseActivity {

    /* renamed from: f0 */
    public ViewModelFactoryByInjection f23668f0;

    /* renamed from: g0 */
    private boolean f23669g0;

    /* renamed from: h0 */
    private boolean f23670h0;

    /* compiled from: ClubActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.ClubActivity$a */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C8963a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23671a;

        static {
            int[] iArr = new int[EnumC8691a.values().length];
            iArr[EnumC8691a.Baby.ordinal()] = 1;
            iArr[EnumC8691a.Wine.ordinal()] = 2;
            f23671a = iArr;
        }
    }

    /* compiled from: ClubActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.ClubActivity$b */
    /* loaded from: classes2.dex */
    static final class C8964b extends AbstractC6438m implements InterfaceC6097a {
        C8964b() {
            super(0);
        }

        /* renamed from: a */
        public final AbstractC1423a mo42214q() {
            return ViewModelFactoryByInjection.m20376c(ClubActivity.this.m12982k1(), ClubActivity.this, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClubActivity.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.ClubActivity$c */
    /* loaded from: classes2.dex */
    public static final class C8965c extends AbstractC6438m implements InterfaceC6108l {
        C8965c() {
            super(1);
        }

        /* renamed from: a */
        public final void m12973a(C13182l c13182l) {
            Intrinsics.isThisObjectNull(c13182l, "it");
            InterfaceC7186c interfaceC7186c = (InterfaceC7186c) c13182l.m1460c();
            if (interfaceC7186c instanceof C13814b2) {
                ClubActivity clubActivity = ClubActivity.this;
                BabyClubHomeActivity.m22025a(clubActivity, clubActivity.m12977o1());
            } else if (interfaceC7186c instanceof C13819c2) {
                ClubActivity clubActivity2 = ClubActivity.this;
                WineClubHomeActivity.m20835a(clubActivity2, clubActivity2.m12976p1());
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12973a((C13182l) obj);
            return C13195u.f34156a;
        }
    }

    /* renamed from: i1 */
    public static /* synthetic */ void m12984i1(AbstractC11957q abstractC11957q, List list) {
        m12980m1(abstractC11957q, list);
    }

    /* renamed from: j1 */
    public static /* synthetic */ void m12983j1(ClubActivity clubActivity, ClubViewModel clubViewModel, AbstractC11957q abstractC11957q, List list) {
        m12978n1(clubActivity, clubViewModel, abstractC11957q, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m1 */
    public static final void m12980m1(AbstractC11957q abstractC11957q, List list) {
        Intrinsics.isThisObjectNull(abstractC11957q, "$binding");
        ConstraintLayout constraintLayout = abstractC11957q.f31240E;
        Intrinsics.checkIfNull(constraintLayout, "binding.clubsList");
        Intrinsics.checkIfNull(list, "it");
        constraintLayout.setVisibility(list.isEmpty() ^ true ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n1 */
    public static final void m12978n1(ClubActivity clubActivity, ClubViewModel clubViewModel, AbstractC11957q abstractC11957q, List list) {
        Intrinsics.isThisObjectNull(clubActivity, "this$0");
        Intrinsics.isThisObjectNull(clubViewModel, "$viewModel");
        Intrinsics.isThisObjectNull(abstractC11957q, "$binding");
        Intrinsics.checkIfNull(list, "clubs");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Club club = (Club) it.next();
            int i = C8963a.f23671a[club.m14653d().ordinal()];
            if (i == 1) {
                clubActivity.f23669g0 = club.m14640w();
                clubViewModel.m22623W(club.m14645n());
                abstractC11957q.f31251z.setText(club.m14643s());
                TextView textView = abstractC11957q.f31249x;
                Intrinsics.checkIfNull(textView, BuildConfig.VERSION_NAME);
                textView.setVisibility(club.m14640w() ^ true ? 0 : 8);
                textView.setText(club.m14650h());
                TextView textView2 = abstractC11957q.f31250y;
                Intrinsics.checkIfNull(textView2, BuildConfig.VERSION_NAME);
                textView2.setVisibility(club.m14640w() ? 0 : 8);
                textView2.setText(clubActivity.getString(C2336R.string.lbl_account_member_since, new Object[]{club.m14647k()}));
                if (club.m14640w()) {
                    abstractC11957q.f31236A.setVisibility(8);
                    abstractC11957q.f31237B.setVisibility(0);
                } else {
                    abstractC11957q.f31236A.setVisibility(0);
                    abstractC11957q.f31237B.setVisibility(8);
                }
            } else if (i == 2) {
                clubActivity.f23670h0 = club.m14640w();
                clubViewModel.m22622X(club.m14645n());
                abstractC11957q.f31244I.setText(club.m14643s());
                TextView textView3 = abstractC11957q.f31242G;
                Intrinsics.checkIfNull(textView3, BuildConfig.VERSION_NAME);
                textView3.setVisibility(club.m14640w() ^ true ? 0 : 8);
                textView3.setText(club.m14650h());
                TextView textView4 = abstractC11957q.f31243H;
                Intrinsics.checkIfNull(textView4, BuildConfig.VERSION_NAME);
                textView4.setVisibility(club.m14640w() ? 0 : 8);
                textView4.setText(clubActivity.getString(C2336R.string.lbl_account_member_since, new Object[]{club.m14647k()}));
                if (club.m14640w()) {
                    abstractC11957q.f31246K.setVisibility(0);
                    abstractC11957q.f31245J.setVisibility(8);
                } else {
                    abstractC11957q.f31246K.setVisibility(8);
                    abstractC11957q.f31245J.setVisibility(0);
                }
            }
        }
        UiEventsLiveData.f18671a.m19526d().mo171i(clubActivity, new EventObserver(new C8965c()));
    }

    /* renamed from: D0 */
    protected int mo11827D0() {
        Bundle extras = getIntent().getExtras();
        boolean z = true;
        if (extras == null || !extras.getBoolean("EXTRA_FOR_FLYER_FROM_BANNER")) {
            z = false;
        }
        return z ? super.mo11827D0() : C2336R.C2337drawable.ic_close;
    }

    /* renamed from: J0 */
    protected InterfaceC9717b m12987J0() {
        return C6450z.m20906b(ClubViewModel.class);
    }

    /* renamed from: K0 */
    protected InterfaceC6097a m12986K0() {
        return new C8964b();
    }

    /* renamed from: k1 */
    public final ViewModelFactoryByInjection m12982k1() {
        ViewModelFactoryByInjection viewModelFactoryByInjection = this.f23668f0;
        if (viewModelFactoryByInjection != null) {
            return viewModelFactoryByInjection;
        }
        Intrinsics.throwUninitPropException("factory");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: l1 */
    public void m12985P0(final AbstractC11957q abstractC11957q, final ClubViewModel clubViewModel) {
        Intrinsics.isThisObjectNull(abstractC11957q, "binding");
        Intrinsics.isThisObjectNull(clubViewModel, "viewModel");
        clubViewModel.m22629Q().mo171i(this, new InterfaceC1440f0() { // from class: hi.b
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                ClubActivity.m12980m1(AbstractC11957q.this, (List) obj);
            }
        });
        clubViewModel.m22629Q().mo171i(this, new InterfaceC1440f0() { // from class: hi.a
            @Override // androidx.lifecycle.InterfaceC1440f0
            /* renamed from: c */
            public final void mo37325a(Object obj) {
                ClubActivity.m12978n1(ClubActivity.this, clubViewModel, abstractC11957q, (List) obj);
            }
        });
    }

    /* renamed from: n */
    public boolean m12979n() {
        return true;
    }

    /* renamed from: o1 */
    public final boolean m12977o1() {
        return this.f23669g0;
    }

    /* renamed from: p1 */
    public final boolean m12976p1() {
        return this.f23670h0;
    }

    /* renamed from: v0 */
    protected AbstractC9725a mo42216v0() {
        Bundle extras = getIntent().getExtras();
        boolean z = true;
        if (extras == null || !extras.getBoolean("EXTRA_FOR_FLYER_FROM_BANNER")) {
            z = false;
        }
        return z ? new C8617d() : new C8618e();
    }

    /* renamed from: x0 */
    protected int mo21966x0() {
        return C2336R.layout.activity_club_home;
    }
}
