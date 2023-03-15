package p144hi;

import android.view.View;
import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.LiveData;
import id.InterfaceC6108l;
import mg.AnalyticsManager;
import mg.ClubManager;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13195u;
import p494zh.BaseViewModel;

/* renamed from: hi.h */
/* loaded from: classes2.dex */
public class ClubViewModel extends BaseViewModel {

    /* renamed from: m */
    private final AnalyticsManager f16446m;

    /* renamed from: n */
    private final C1436e0 f16447n;

    /* renamed from: o */
    private final LiveData f16448o;

    /* renamed from: p */
    private final C1436e0 f16449p;

    /* renamed from: q */
    private final LiveData f16450q;

    /* renamed from: r */
    private final LiveData f16451r;

    /* renamed from: s */
    private final InterfaceC6108l f16452s;

    /* renamed from: t */
    private final InterfaceC6108l f16453t;

    /* renamed from: u */
    private final InterfaceC6108l f16454u;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClubViewModel.kt */
    /* renamed from: hi.h$a */
    /* loaded from: classes2.dex */
    public static final class C5950a extends AbstractC6438m implements InterfaceC6108l {
        C5950a() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
            if (r8 == true) goto L7;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m22619a(p468yc.C13195u r8) {
            /*
                r7 = this;
                java.lang.String r0 = "it"
                p181jd.Intrinsics.isThisObjectNull(r8, r0)
                hi.h r8 = p144hi.ClubViewModel.this
                androidx.lifecycle.LiveData r8 = r8.m22629Q()
                java.lang.Object r8 = r8.mo172f()
                java.util.List r8 = (java.util.List) r8
                r0 = 1
                r1 = 0
                if (r8 == 0) goto L44
                boolean r2 = r8.isEmpty()
                if (r2 == 0) goto L1d
            L1b:
                r8 = r1
                goto L41
            L1d:
                java.util.Iterator r8 = r8.iterator()
            L21:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L1b
                java.lang.Object r2 = r8.next()
                pt.pingodoce.app.data.local.models.clubs.Club r2 = (pt.pingodoce.app.data.local.models.clubs.Club) r2
                pt.pingodoce.app.data.local.models.clubs.a r3 = r2.m14653d()
                pt.pingodoce.app.data.local.models.clubs.a r4 = pt.pingodoce.app.data.local.models.clubs.EnumC8691a.Baby
                if (r3 != r4) goto L3d
                boolean r2 = r2.m14640w()
                if (r2 == 0) goto L3d
                r2 = r0
                goto L3e
            L3d:
                r2 = r1
            L3e:
                if (r2 == 0) goto L21
                r8 = r0
            L41:
                if (r8 != r0) goto L44
                goto L45
            L44:
                r0 = r1
            L45:
                if (r0 == 0) goto L5b
                hi.h r8 = p144hi.ClubViewModel.this
                mg.a r0 = p144hi.ClubViewModel.m22631O(r8)
                ng.a$c$b r1 = ng.AnalyticEvents.AbstractC7737c.C7739b.f20364b
                ng.c r2 = ng.EnumC7885c.Button
                ng.b r3 = ng.EnumC7884b.Click
                r4 = 0
                r5 = 8
                r6 = 0
                ng.InterfaceC7886d.C7887a.m17629a(r0, r1, r2, r3, r4, r5, r6)
                goto L6e
            L5b:
                hi.h r8 = p144hi.ClubViewModel.this
                mg.a r0 = p144hi.ClubViewModel.m22631O(r8)
                ng.a$c$a r1 = ng.AnalyticEvents.AbstractC7737c.C7738a.f20363b
                ng.c r2 = ng.EnumC7885c.Button
                ng.b r3 = ng.EnumC7884b.Click
                r4 = 0
                r5 = 8
                r6 = 0
                ng.InterfaceC7886d.C7887a.m17629a(r0, r1, r2, r3, r4, r5, r6)
            L6e:
                hi.h r8 = p144hi.ClubViewModel.this
                zh.b2 r0 = p494zh.C13814b2.f34922a
                r1 = 2
                r2 = 0
                p494zh.BaseViewModel.m119C(r8, r0, r2, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p144hi.ClubViewModel.C5950a.m22619a(yc.u):void");
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m22619a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClubViewModel.kt */
    /* renamed from: hi.h$b */
    /* loaded from: classes2.dex */
    public static final class C5951b extends AbstractC6438m implements InterfaceC6108l {
        C5951b() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
            if (r8 == true) goto L7;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m22618a(p468yc.C13195u r8) {
            /*
                r7 = this;
                java.lang.String r0 = "it"
                p181jd.Intrinsics.isThisObjectNull(r8, r0)
                hi.h r8 = p144hi.ClubViewModel.this
                androidx.lifecycle.LiveData r8 = r8.m22629Q()
                java.lang.Object r8 = r8.mo172f()
                java.util.List r8 = (java.util.List) r8
                r0 = 1
                r1 = 0
                if (r8 == 0) goto L44
                boolean r2 = r8.isEmpty()
                if (r2 == 0) goto L1d
            L1b:
                r8 = r1
                goto L41
            L1d:
                java.util.Iterator r8 = r8.iterator()
            L21:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L1b
                java.lang.Object r2 = r8.next()
                pt.pingodoce.app.data.local.models.clubs.Club r2 = (pt.pingodoce.app.data.local.models.clubs.Club) r2
                pt.pingodoce.app.data.local.models.clubs.a r3 = r2.m14653d()
                pt.pingodoce.app.data.local.models.clubs.a r4 = pt.pingodoce.app.data.local.models.clubs.EnumC8691a.Wine
                if (r3 != r4) goto L3d
                boolean r2 = r2.m14640w()
                if (r2 == 0) goto L3d
                r2 = r0
                goto L3e
            L3d:
                r2 = r1
            L3e:
                if (r2 == 0) goto L21
                r8 = r0
            L41:
                if (r8 != r0) goto L44
                goto L45
            L44:
                r0 = r1
            L45:
                if (r0 == 0) goto L5b
                hi.h r8 = p144hi.ClubViewModel.this
                mg.a r0 = p144hi.ClubViewModel.m22631O(r8)
                ng.a$c$d r1 = ng.AnalyticEvents.AbstractC7737c.C7741d.f20366b
                ng.c r2 = ng.EnumC7885c.Button
                ng.b r3 = ng.EnumC7884b.Click
                r4 = 0
                r5 = 8
                r6 = 0
                ng.InterfaceC7886d.C7887a.m17629a(r0, r1, r2, r3, r4, r5, r6)
                goto L6e
            L5b:
                hi.h r8 = p144hi.ClubViewModel.this
                mg.a r0 = p144hi.ClubViewModel.m22631O(r8)
                ng.a$c$c r1 = ng.AnalyticEvents.AbstractC7737c.C7740c.f20365b
                ng.c r2 = ng.EnumC7885c.Button
                ng.b r3 = ng.EnumC7884b.Click
                r4 = 0
                r5 = 8
                r6 = 0
                ng.InterfaceC7886d.C7887a.m17629a(r0, r1, r2, r3, r4, r5, r6)
            L6e:
                hi.h r8 = p144hi.ClubViewModel.this
                zh.c2 r0 = p494zh.C13819c2.f34926a
                r1 = 2
                r2 = 0
                p494zh.BaseViewModel.m119C(r8, r0, r2, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p144hi.ClubViewModel.C5951b.m22618a(yc.u):void");
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m22618a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClubViewModel.kt */
    /* renamed from: hi.h$c */
    /* loaded from: classes2.dex */
    public static final class C5952c extends AbstractC6438m implements InterfaceC6108l {
        C5952c() {
            super(1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0041, code lost:
            if (r8 == true) goto L7;
         */
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void m22617a(p468yc.C13195u r8) {
            /*
                r7 = this;
                java.lang.String r0 = "it"
                p181jd.Intrinsics.isThisObjectNull(r8, r0)
                hi.h r8 = p144hi.ClubViewModel.this
                androidx.lifecycle.LiveData r8 = r8.m22629Q()
                java.lang.Object r8 = r8.mo172f()
                java.util.List r8 = (java.util.List) r8
                r0 = 1
                r1 = 0
                if (r8 == 0) goto L44
                boolean r2 = r8.isEmpty()
                if (r2 == 0) goto L1d
            L1b:
                r8 = r1
                goto L41
            L1d:
                java.util.Iterator r8 = r8.iterator()
            L21:
                boolean r2 = r8.hasNext()
                if (r2 == 0) goto L1b
                java.lang.Object r2 = r8.next()
                pt.pingodoce.app.data.local.models.clubs.Club r2 = (pt.pingodoce.app.data.local.models.clubs.Club) r2
                pt.pingodoce.app.data.local.models.clubs.a r3 = r2.m14653d()
                pt.pingodoce.app.data.local.models.clubs.a r4 = pt.pingodoce.app.data.local.models.clubs.EnumC8691a.Baby
                if (r3 != r4) goto L3d
                boolean r2 = r2.m14640w()
                if (r2 == 0) goto L3d
                r2 = r0
                goto L3e
            L3d:
                r2 = r1
            L3e:
                if (r2 == 0) goto L21
                r8 = r0
            L41:
                if (r8 != r0) goto L44
                goto L45
            L44:
                r0 = r1
            L45:
                if (r0 == 0) goto L5b
                hi.h r8 = p144hi.ClubViewModel.this
                mg.a r0 = p144hi.ClubViewModel.m22631O(r8)
                ng.a$b$e r1 = ng.AnalyticEvents.AbstractC7709b.C7715e.f20341b
                ng.c r2 = ng.EnumC7885c.Button
                ng.b r3 = ng.EnumC7884b.Click
                r4 = 0
                r5 = 8
                r6 = 0
                ng.InterfaceC7886d.C7887a.m17629a(r0, r1, r2, r3, r4, r5, r6)
                goto L6e
            L5b:
                hi.h r8 = p144hi.ClubViewModel.this
                mg.a r0 = p144hi.ClubViewModel.m22631O(r8)
                ng.a$b$a0 r1 = ng.AnalyticEvents.AbstractC7709b.C7711a0.f20337b
                ng.c r2 = ng.EnumC7885c.Button
                ng.b r3 = ng.EnumC7884b.Click
                r4 = 0
                r5 = 8
                r6 = 0
                ng.InterfaceC7886d.C7887a.m17629a(r0, r1, r2, r3, r4, r5, r6)
            L6e:
                hi.h r8 = p144hi.ClubViewModel.this
                zh.a3 r0 = p494zh.C13810a3.f34918a
                r1 = 2
                r2 = 0
                p494zh.BaseViewModel.m119C(r8, r0, r2, r1, r2)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p144hi.ClubViewModel.C5952c.m22617a(yc.u):void");
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m22617a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClubViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, ClubManager clubManager, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(clubManager, "clubManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f16446m = analyticsManager;
        C1436e0 c1436e0 = new C1436e0();
        this.f16447n = c1436e0;
        this.f16448o = c1436e0;
        C1436e0 c1436e02 = new C1436e0();
        this.f16449p = c1436e02;
        this.f16450q = c1436e02;
        this.f16451r = m106t(clubManager.m18645i());
        this.f16452s = BaseViewModel.m113I(this, 0L, new C5951b(), 1, null);
        this.f16453t = BaseViewModel.m113I(this, 0L, new C5950a(), 1, null);
        this.f16454u = BaseViewModel.m113I(this, 0L, new C5952c(), 1, null);
        InterfaceC7886d.C7887a.m17629a(analyticsManager, AnalyticEvents.AbstractC7737c.C7742e.f20367b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
    }

    /* renamed from: L */
    public static /* synthetic */ void m22634L(ClubViewModel clubViewModel, View view) {
        m22626T(clubViewModel, view);
    }

    /* renamed from: M */
    public static /* synthetic */ void m22633M(ClubViewModel clubViewModel, View view) {
        m22620Z(clubViewModel, view);
    }

    /* renamed from: N */
    public static /* synthetic */ void m22632N(ClubViewModel clubViewModel, View view) {
        m22624V(clubViewModel, view);
    }

    /* renamed from: O */
    public static final /* synthetic */ AnalyticsManager m22631O(ClubViewModel clubViewModel) {
        return clubViewModel.f16446m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T */
    public static final void m22626T(ClubViewModel clubViewModel, View view) {
        Intrinsics.isThisObjectNull(clubViewModel, "this$0");
        clubViewModel.f16453t.mo9587d(C13195u.f34156a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V */
    public static final void m22624V(ClubViewModel clubViewModel, View view) {
        Intrinsics.isThisObjectNull(clubViewModel, "this$0");
        clubViewModel.f16452s.mo9587d(C13195u.f34156a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z */
    public static final void m22620Z(ClubViewModel clubViewModel, View view) {
        Intrinsics.isThisObjectNull(clubViewModel, "this$0");
        clubViewModel.f16454u.mo9587d(C13195u.f34156a);
    }

    /* renamed from: P */
    public final LiveData m22630P() {
        return this.f16448o;
    }

    /* renamed from: Q */
    public final LiveData m22629Q() {
        return this.f16451r;
    }

    /* renamed from: R */
    public final LiveData m22628R() {
        return this.f16450q;
    }

    /* renamed from: S */
    public final View.OnClickListener m22627S() {
        return new View.OnClickListener() { // from class: hi.e
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClubViewModel.m22626T(ClubViewModel.this, view);
            }
        };
    }

    /* renamed from: U */
    public final View.OnClickListener m22625U() {
        return new View.OnClickListener() { // from class: hi.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClubViewModel.m22624V(ClubViewModel.this, view);
            }
        };
    }

    /* renamed from: W */
    public final void m22623W(String str) {
        Intrinsics.isThisObjectNull(str, "url");
        this.f16447n.mo166p(str);
    }

    /* renamed from: X */
    public final void m22622X(String str) {
        Intrinsics.isThisObjectNull(str, "url");
        this.f16449p.mo166p(str);
    }

    /* renamed from: Y */
    public final View.OnClickListener m22621Y() {
        return new View.OnClickListener() { // from class: hi.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ClubViewModel.m22620Z(ClubViewModel.this, view);
            }
        };
    }
}
