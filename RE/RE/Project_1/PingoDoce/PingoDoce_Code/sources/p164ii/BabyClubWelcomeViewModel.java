package p164ii;

import android.text.Html;
import android.text.SpannedString;
import android.view.View;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.LiveData;
import com.github.aachartmodel.aainfographics.C2336R;
import id.InterfaceC6108l;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import mg.AnalyticsManager;
import mg.ClubManager;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p181jd.AbstractC6438m;
import p181jd.C6429c0;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p489zc.C13777q;
import p494zh.BaseViewModel;
import p494zh.C13869l0;
import pt.pingodoce.app.data.local.models.clubs.Club;
import pt.pingodoce.app.data.local.models.clubs.ClubBaby;
import pt.pingodoce.app.data.local.models.clubs.EnumC8691a;

/* renamed from: ii.w */
/* loaded from: classes2.dex */
public final class BabyClubWelcomeViewModel extends BaseViewModel {

    /* renamed from: m */
    private final AnalyticsManager f16943m;

    /* renamed from: n */
    private final C1436e0 f16944n;

    /* renamed from: o */
    private final C1436e0 f16945o;

    /* renamed from: p */
    private final LiveData f16946p;

    /* renamed from: q */
    private final C1436e0 f16947q;

    /* renamed from: r */
    private final InterfaceC6108l f16948r;

    /* renamed from: s */
    private final InterfaceC6108l f16949s;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BabyClubWelcomeViewModel.kt */
    /* renamed from: ii.w$a */
    /* loaded from: classes2.dex */
    public static final class C6179a extends AbstractC6438m implements InterfaceC6108l {
        C6179a() {
            super(1);
        }

        /* renamed from: a */
        public final void m21977a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            BabyClubWelcomeViewModel.this.m105u();
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m21977a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BabyClubWelcomeViewModel.kt */
    /* renamed from: ii.w$b */
    /* loaded from: classes2.dex */
    public static final class C6180b extends AbstractC6438m implements InterfaceC6108l {
        C6180b() {
            super(1);
        }

        /* renamed from: a */
        public final void m21976a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            BaseViewModel.m119C(BabyClubWelcomeViewModel.this, C13869l0.f34986a, null, 2, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m21976a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BabyClubWelcomeViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, ClubManager clubManager, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider);
        Object obj;
        CharSequence fromHtml;
        boolean z;
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(clubManager, "clubManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f16943m = analyticsManager;
        C1436e0 c1436e0 = new C1436e0();
        this.f16944n = c1436e0;
        this.f16945o = new C1436e0();
        this.f16946p = c1436e0;
        this.f16947q = new C1436e0();
        InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7709b.C7729s.f20355b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
        Iterator it = clubManager.m18644j().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Club) obj).m14653d() == EnumC8691a.Baby) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        Club club = (Club) obj;
        if (club != null) {
            List m14625a = club.m14651f().m14625a();
            ClubBaby clubBaby = m14625a != null ? (ClubBaby) C13777q.m249W(m14625a) : null;
            C1436e0 c1436e02 = this.f16945o;
            List m14625a2 = club.m14651f().m14625a();
            Integer valueOf = m14625a2 != null ? Integer.valueOf(m14625a2.size()) : null;
            Intrinsics.ifNullDoSomething(valueOf);
            c1436e02.mo166p(Boolean.valueOf(valueOf.intValue() < 3));
            C1436e0 c1436e03 = this.f16944n;
            if (clubBaby != null) {
                List m14625a3 = club.m14651f().m14625a();
                Integer valueOf2 = m14625a3 != null ? Integer.valueOf(m14625a3.size()) : null;
                Intrinsics.ifNullDoSomething(valueOf2);
                if (valueOf2.intValue() > 1) {
                    this.f16947q.mo166p(Boolean.TRUE);
                    C6429c0 c6429c0 = C6429c0.f17515a;
                    String string = resourcesProvider.m6899a().getString(C2336R.string.lbl_clubs_baby_welcome_to_baby_club_subtitle_alt, Arrays.copyOf(new Object[]{clubBaby.m14630f()}, 1));
                    Intrinsics.checkIfNull(string, "ctx.getString(id, *formatArgs)");
                    String format = String.format(string, Arrays.copyOf(new Object[0], 0));
                    Intrinsics.checkIfNull(format, "format(format, *args)");
                    fromHtml = SpannedString.valueOf(format);
                    Intrinsics.checkIfNull(fromHtml, "valueOf(this)");
                    c1436e03.mo166p(fromHtml);
                }
            }
            this.f16947q.mo166p(Boolean.FALSE);
            String string2 = resourcesProvider.m6899a().getString(C2336R.string.lbl_clubs_baby_welcome_to_baby_club_subtitle);
            Intrinsics.checkIfNull(string2, "ctx.getString(id)");
            fromHtml = Html.fromHtml(string2, 0);
            c1436e03.mo166p(fromHtml);
        }
        this.f16948r = BaseViewModel.m113I(this, 0L, new C6180b(), 1, null);
        this.f16949s = BaseViewModel.m113I(this, 0L, new C6179a(), 1, null);
    }

    /* renamed from: L */
    public static /* synthetic */ void m21984L(BabyClubWelcomeViewModel babyClubWelcomeViewModel, View view) {
        m21980P(babyClubWelcomeViewModel, view);
    }

    /* renamed from: M */
    public static /* synthetic */ void m21983M(BabyClubWelcomeViewModel babyClubWelcomeViewModel, View view) {
        m21978R(babyClubWelcomeViewModel, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: P */
    public static final void m21980P(BabyClubWelcomeViewModel babyClubWelcomeViewModel, View view) {
        Intrinsics.isThisObjectNull(babyClubWelcomeViewModel, "this$0");
        InterfaceC7886d.C7887a.m17629a(babyClubWelcomeViewModel.f16943m, AnalyticEvents.AbstractC7709b.C7731u.f20357b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
        babyClubWelcomeViewModel.f16949s.mo9587d(C13195u.f34156a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R */
    public static final void m21978R(BabyClubWelcomeViewModel babyClubWelcomeViewModel, View view) {
        Intrinsics.isThisObjectNull(babyClubWelcomeViewModel, "this$0");
        if (Intrinsics.equals(babyClubWelcomeViewModel.f16947q.mo172f(), Boolean.TRUE)) {
            InterfaceC7886d.C7887a.m17629a(babyClubWelcomeViewModel.f16943m, AnalyticEvents.AbstractC7709b.C7712b.f20338b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
        } else {
            InterfaceC7886d.C7887a.m17629a(babyClubWelcomeViewModel.f16943m, AnalyticEvents.AbstractC7709b.C7730t.f20356b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
        }
        babyClubWelcomeViewModel.f16948r.mo9587d(C13195u.f34156a);
    }

    /* renamed from: N */
    public final LiveData m21982N() {
        return this.f16946p;
    }

    /* renamed from: O */
    public final View.OnClickListener m21981O() {
        return new View.OnClickListener() { // from class: ii.u
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BabyClubWelcomeViewModel.m21980P(BabyClubWelcomeViewModel.this, view);
            }
        };
    }

    /* renamed from: Q */
    public final View.OnClickListener m21979Q() {
        return new View.OnClickListener() { // from class: ii.v
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BabyClubWelcomeViewModel.m21978R(BabyClubWelcomeViewModel.this, view);
            }
        };
    }
}
