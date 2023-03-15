package pt.pingodoce.app.presentation.clubs.wine;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import be.OperatorExtensions;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import lk.EnumC7070a;
import me.C7185b;
import mg.AnalyticsManager;
import mg.ClubManager;
import mg.ConsentsManager;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p162ig.Term;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p276og.Result;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc._Collections;
import p494zh.AbstractC13816c;
import p494zh.AppNavigationTypes;
import p494zh.BaseViewModel;
import p494zh.C13807a0;
import p494zh.C13820c3;
import p494zh.C13825d3;
import p494zh.C13839g3;
import p494zh.C13844h3;
import p494zh.C13849i3;
import p494zh.C13854j3;
import p494zh.C13859k3;
import p494zh.C13887p0;
import pt.pingodoce.app.data.local.flows.ClubWineFlowData;
import pt.pingodoce.app.data.local.models.clubs.Club;
import pt.pingodoce.app.data.local.models.clubs.ClubData;
import pt.pingodoce.app.data.local.models.clubs.EnumC8691a;
import pt.pingodoce.app.data.local.models.clubs.FormField;
import pt.pingodoce.app.data.remote.models.response.Consent;
import pt.pingodoce.app.presentation.clubs.wine.WineClubViewModel;
import td.InterfaceC10524i0;

/* renamed from: pt.pingodoce.app.presentation.clubs.wine.f */
/* loaded from: classes2.dex */
public final class WineClubUpdateViewModel extends WineClubViewModel {

    /* renamed from: d0 */
    private final ClubManager f23803d0;

    /* renamed from: e0 */
    private final ConsentsManager f23804e0;

    /* renamed from: f0 */
    private final AnalyticsManager f23805f0;

    /* renamed from: g0 */
    private final C1436e0 f23806g0;

    /* renamed from: h0 */
    private final LiveData f23807h0;

    /* renamed from: i0 */
    private ClubWineFlowData f23808i0;

    /* renamed from: j0 */
    private final InterfaceC6108l f23809j0;

    /* compiled from: WineClubUpdateViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.f$a */
    /* loaded from: classes2.dex */
    public enum EnumC9035a {
        SKIP
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WineClubUpdateViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.f$b */
    /* loaded from: classes2.dex */
    public static final class C9036b extends AbstractC6438m implements InterfaceC6108l {

        /* compiled from: WineClubUpdateViewModel.kt */
        /* renamed from: pt.pingodoce.app.presentation.clubs.wine.f$b$a */
        /* loaded from: classes2.dex */
        public /* synthetic */ class C9037a {

            /* renamed from: a */
            public static final /* synthetic */ int[] f23811a;

            static {
                int[] iArr = new int[EnumC9035a.values().length];
                iArr[EnumC9035a.SKIP.ordinal()] = 1;
                f23811a = iArr;
            }
        }

        C9036b() {
            super(1);
        }

        /* renamed from: a */
        public final void m12763a(EnumC9035a enumC9035a) {
            Intrinsics.isThisObjectNull(enumC9035a, "it");
            if (C9037a.f23811a[enumC9035a.ordinal()] == 1) {
                WineClubUpdateViewModel.this.m12767r1(WineClubViewModel.AbstractC9050b.C9053c.f23872a);
            }
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12763a((EnumC9035a) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WineClubUpdateViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateViewModel$fetchConsentsUrl$1", m20196f = "WineClubUpdateViewModel.kt", m20195l = {386}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.f$c */
    /* loaded from: classes2.dex */
    public static final class C9038c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ String f23812A;

        /* renamed from: x */
        int f23813x;

        /* renamed from: z */
        final /* synthetic */ EnumC7070a f23815z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: WineClubUpdateViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateViewModel$fetchConsentsUrl$1$1", m20196f = "WineClubUpdateViewModel.kt", m20195l = {388, 389}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.clubs.wine.f$c$a */
        /* loaded from: classes2.dex */
        public static final class C9039a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: A */
            final /* synthetic */ String f23816A;

            /* renamed from: x */
            int f23817x;

            /* renamed from: y */
            final /* synthetic */ EnumC7070a f23818y;

            /* renamed from: z */
            final /* synthetic */ WineClubUpdateViewModel f23819z;

            /* compiled from: WineClubUpdateViewModel.kt */
            /* renamed from: pt.pingodoce.app.presentation.clubs.wine.f$c$a$a */
            /* loaded from: classes2.dex */
            public /* synthetic */ class C9040a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f23820a;

                static {
                    int[] iArr = new int[EnumC7070a.values().length];
                    iArr[EnumC7070a.TERM_OF_USE.ordinal()] = 1;
                    iArr[EnumC7070a.PRIVACY.ordinal()] = 2;
                    f23820a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9039a(EnumC7070a enumC7070a, WineClubUpdateViewModel wineClubUpdateViewModel, String str, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f23818y = enumC7070a;
                this.f23819z = wineClubUpdateViewModel;
                this.f23816A = str;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C9039a(this.f23818y, this.f23819z, this.f23816A, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C9039a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                Result result;
                m34636d = C2116d.m34636d();
                int i = this.f23817x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    int i2 = C9040a.f23820a[this.f23818y.ordinal()];
                    if (i2 == 1) {
                        ConsentsManager m12779g1 = WineClubUpdateViewModel.m12779g1(this.f23819z);
                        this.f23817x = 1;
                        obj = m12779g1.m18568c("71", this);
                        if (obj == m34636d) {
                            return m34636d;
                        }
                        result = (Result) obj;
                    } else if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    } else {
                        ConsentsManager m12779g12 = WineClubUpdateViewModel.m12779g1(this.f23819z);
                        this.f23817x = 2;
                        obj = m12779g12.m18565f(this);
                        if (obj == m34636d) {
                            return m34636d;
                        }
                        result = (Result) obj;
                    }
                } else if (i == 1) {
                    C13186n.m1453b(obj);
                    result = (Result) obj;
                } else if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                    result = (Result) obj;
                }
                if (result instanceof Result.C8078c) {
                    Result.C8078c c8078c = (Result.C8078c) result;
                    Object m16962b = c8078c.m16962b();
                    EnumC7070a enumC7070a = this.f23818y;
                    WineClubUpdateViewModel wineClubUpdateViewModel = this.f23819z;
                    String str = this.f23816A;
                    Consent consent = (Consent) m16962b;
                    int i3 = C9040a.f23820a[enumC7070a.ordinal()];
                    if (i3 == 1) {
                        WineClubUpdateViewModel.m12778h1(wineClubUpdateViewModel).mo166p(new C7185b(new Term(str, ((Consent) c8078c.m16962b()).m13866b())));
                    } else if (i3 == 2) {
                        WineClubUpdateViewModel.m12778h1(wineClubUpdateViewModel).mo166p(new C7185b(new Term(str, ((Consent) c8078c.m16962b()).m13867a())));
                    }
                } else if (result instanceof Result.C8077b) {
                    this.f23819z.m20319p0();
                    WineClubUpdateViewModel.m12777i1(this.f23819z, ((Result.C8077b) result).m16964b());
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9038c(EnumC7070a enumC7070a, String str, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f23815z = enumC7070a;
            this.f23812A = str;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9038c(this.f23815z, this.f23812A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9038c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23813x;
            if (i == 0) {
                C13186n.m1453b(obj);
                WineClubUpdateViewModel wineClubUpdateViewModel = WineClubUpdateViewModel.this;
                C9039a c9039a = new C9039a(this.f23815z, wineClubUpdateViewModel, this.f23812A, null);
                this.f23813x = 1;
                if (WineClubUpdateViewModel.m12776j1(wineClubUpdateViewModel, true, c9039a, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WineClubUpdateViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateViewModel$stepperAssigner$1$1$1", m20196f = "WineClubUpdateViewModel.kt", m20195l = {214}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.f$d */
    /* loaded from: classes2.dex */
    public static final class C9041d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ Club f23821A;

        /* renamed from: x */
        int f23822x;

        /* renamed from: z */
        final /* synthetic */ WineClubViewModel.AbstractC9050b f23824z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: WineClubUpdateViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateViewModel$stepperAssigner$1$1$1$1", m20196f = "WineClubUpdateViewModel.kt", m20195l = {231}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.clubs.wine.f$d$a */
        /* loaded from: classes2.dex */
        public static final class C9042a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: A */
            final /* synthetic */ Club f23825A;

            /* renamed from: x */
            int f23826x;

            /* renamed from: y */
            final /* synthetic */ WineClubViewModel.AbstractC9050b f23827y;

            /* renamed from: z */
            final /* synthetic */ WineClubUpdateViewModel f23828z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9042a(WineClubViewModel.AbstractC9050b abstractC9050b, WineClubUpdateViewModel wineClubUpdateViewModel, Club club, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f23827y = abstractC9050b;
                this.f23828z = wineClubUpdateViewModel;
                this.f23825A = club;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C9042a(this.f23827y, this.f23828z, this.f23825A, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C9042a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f23826x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    WineClubViewModel.AbstractC9050b abstractC9050b = this.f23827y;
                    if (Intrinsics.equals(abstractC9050b, WineClubViewModel.AbstractC9050b.C9051a.f23870a)) {
                        InterfaceC7886d.C7887a.m17629a(WineClubUpdateViewModel.m12781e1(this.f23828z), AnalyticEvents.AbstractC7859g.C7876q.f20499b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
                    } else if (Intrinsics.equals(abstractC9050b, WineClubViewModel.AbstractC9050b.C9053c.f23872a)) {
                        InterfaceC7886d.C7887a.m17629a(WineClubUpdateViewModel.m12781e1(this.f23828z), AnalyticEvents.AbstractC7859g.C7877r.f20500b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
                    }
                    ClubManager m12780f1 = WineClubUpdateViewModel.m12780f1(this.f23828z);
                    Club club = this.f23825A;
                    this.f23826x = 1;
                    obj = m12780f1.m18643k(club, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                Result result = (Result) obj;
                if (result instanceof Result.C8078c) {
                    WineClubUpdateViewModel wineClubUpdateViewModel = this.f23828z;
                    ArrayList m12743L0 = wineClubUpdateViewModel.m12743L0();
                    C13859k3 c13859k3 = C13859k3.f34967a;
                    wineClubUpdateViewModel.m12733V0(m12743L0.indexOf(c13859k3));
                    WineClubUpdateViewModel wineClubUpdateViewModel2 = this.f23828z;
                    wineClubUpdateViewModel2.m120B(c13859k3, wineClubUpdateViewModel2.m34578S());
                } else if (result instanceof Result.C8077b) {
                    WineClubUpdateViewModel.m12777i1(this.f23828z, ((Result.C8077b) result).m16964b());
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9041d(WineClubViewModel.AbstractC9050b abstractC9050b, Club club, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f23824z = abstractC9050b;
            this.f23821A = club;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9041d(this.f23824z, this.f23821A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9041d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23822x;
            if (i == 0) {
                C13186n.m1453b(obj);
                WineClubUpdateViewModel wineClubUpdateViewModel = WineClubUpdateViewModel.this;
                C9042a c9042a = new C9042a(this.f23824z, wineClubUpdateViewModel, this.f23821A, null);
                this.f23822x = 1;
                if (WineClubUpdateViewModel.m12776j1(wineClubUpdateViewModel, true, c9042a, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WineClubUpdateViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateViewModel$stepperAssigner$2$1$1", m20196f = "WineClubUpdateViewModel.kt", m20195l = {263}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.f$e */
    /* loaded from: classes2.dex */
    public static final class C9043e extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23829x;

        /* renamed from: z */
        final /* synthetic */ Club f23831z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: WineClubUpdateViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateViewModel$stepperAssigner$2$1$1$1", m20196f = "WineClubUpdateViewModel.kt", m20195l = {264}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.clubs.wine.f$e$a */
        /* loaded from: classes2.dex */
        public static final class C9044a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f23832x;

            /* renamed from: y */
            final /* synthetic */ WineClubUpdateViewModel f23833y;

            /* renamed from: z */
            final /* synthetic */ Club f23834z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9044a(WineClubUpdateViewModel wineClubUpdateViewModel, Club club, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f23833y = wineClubUpdateViewModel;
                this.f23834z = club;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C9044a(this.f23833y, this.f23834z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C9044a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f23832x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    ClubManager m12780f1 = WineClubUpdateViewModel.m12780f1(this.f23833y);
                    Club club = this.f23834z;
                    this.f23832x = 1;
                    obj = m12780f1.m18641m(club, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                Result result = (Result) obj;
                if (result instanceof Result.C8078c) {
                    WineClubUpdateViewModel wineClubUpdateViewModel = this.f23833y;
                    wineClubUpdateViewModel.m12733V0(wineClubUpdateViewModel.m12743L0().indexOf(C13820c3.f34927a));
                    BaseViewModel.m119C(this.f23833y, C13887p0.f35008a, null, 2, null);
                } else if (result instanceof Result.C8077b) {
                    WineClubUpdateViewModel.m12777i1(this.f23833y, ((Result.C8077b) result).m16964b());
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9043e(Club club, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f23831z = club;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9043e(this.f23831z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9043e) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23829x;
            if (i == 0) {
                C13186n.m1453b(obj);
                WineClubUpdateViewModel wineClubUpdateViewModel = WineClubUpdateViewModel.this;
                C9044a c9044a = new C9044a(wineClubUpdateViewModel, this.f23831z, null);
                this.f23829x = 1;
                if (WineClubUpdateViewModel.m12776j1(wineClubUpdateViewModel, true, c9044a, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: WineClubUpdateViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateViewModel$stepperAssigner$3$1$1", m20196f = "WineClubUpdateViewModel.kt", m20195l = {292}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.clubs.wine.f$f */
    /* loaded from: classes2.dex */
    public static final class C9045f extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23835x;

        /* renamed from: z */
        final /* synthetic */ Club f23837z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: WineClubUpdateViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateViewModel$stepperAssigner$3$1$1$1", m20196f = "WineClubUpdateViewModel.kt", m20195l = {293}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.clubs.wine.f$f$a */
        /* loaded from: classes2.dex */
        public static final class C9046a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f23838x;

            /* renamed from: y */
            final /* synthetic */ WineClubUpdateViewModel f23839y;

            /* renamed from: z */
            final /* synthetic */ Club f23840z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C9046a(WineClubUpdateViewModel wineClubUpdateViewModel, Club club, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f23839y = wineClubUpdateViewModel;
                this.f23840z = club;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C9046a(this.f23839y, this.f23840z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C9046a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f23838x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    ClubManager m12780f1 = WineClubUpdateViewModel.m12780f1(this.f23839y);
                    Club club = this.f23840z;
                    this.f23838x = 1;
                    obj = m12780f1.m18641m(club, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                Result result = (Result) obj;
                if (result instanceof Result.C8078c) {
                    WineClubUpdateViewModel wineClubUpdateViewModel = this.f23839y;
                    wineClubUpdateViewModel.m12733V0(wineClubUpdateViewModel.m12743L0().indexOf(C13820c3.f34927a));
                    BaseViewModel.m119C(this.f23839y, C13887p0.f35008a, null, 2, null);
                } else if (result instanceof Result.C8077b) {
                    WineClubUpdateViewModel.m12777i1(this.f23839y, ((Result.C8077b) result).m16964b());
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9045f(Club club, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f23837z = club;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C9045f(this.f23837z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C9045f) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23835x;
            if (i == 0) {
                C13186n.m1453b(obj);
                WineClubUpdateViewModel wineClubUpdateViewModel = WineClubUpdateViewModel.this;
                C9046a c9046a = new C9046a(wineClubUpdateViewModel, this.f23837z, null);
                this.f23835x = 1;
                if (WineClubUpdateViewModel.m12776j1(wineClubUpdateViewModel, true, c9046a, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WineClubUpdateViewModel(C1459l0 c1459l0, ClubManager clubManager, ConsentsManager consentsManager, ResourcesProvider resourcesProvider, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider, clubManager, analyticsManager);
        Set m452q0;
        Set m452q02;
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(clubManager, "clubManager");
        Intrinsics.isThisObjectNull(consentsManager, "consentsManager");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f23803d0 = clubManager;
        this.f23804e0 = consentsManager;
        this.f23805f0 = analyticsManager;
        C1436e0 c1436e0 = new C1436e0();
        this.f23806g0 = c1436e0;
        this.f23807h0 = c1436e0;
        this.f23808i0 = (ClubWineFlowData) m34578S();
        this.f23809j0 = OperatorExtensions.m35176e(0L, null, new C9036b(), 3, null);
        m12737R0().mo166p(m12770o1());
        m12738Q0().mo166p(m12771n1());
        m12752C0().mo166p(this.f23808i0.m14764c());
        m452q0 = _Collections.m452q0(this.f23808i0.m14762e());
        m12731X0(m452q0);
        m452q02 = _Collections.m452q0(this.f23808i0.m14763d());
        m12732W0(m452q02);
    }

    /* renamed from: e1 */
    public static final /* synthetic */ AnalyticsManager m12781e1(WineClubUpdateViewModel wineClubUpdateViewModel) {
        return wineClubUpdateViewModel.f23805f0;
    }

    /* renamed from: f1 */
    public static final /* synthetic */ ClubManager m12780f1(WineClubUpdateViewModel wineClubUpdateViewModel) {
        return wineClubUpdateViewModel.f23803d0;
    }

    /* renamed from: g1 */
    public static final /* synthetic */ ConsentsManager m12779g1(WineClubUpdateViewModel wineClubUpdateViewModel) {
        return wineClubUpdateViewModel.f23804e0;
    }

    /* renamed from: h1 */
    public static final /* synthetic */ C1436e0 m12778h1(WineClubUpdateViewModel wineClubUpdateViewModel) {
        return wineClubUpdateViewModel.f23806g0;
    }

    /* renamed from: i1 */
    public static final /* synthetic */ void m12777i1(WineClubUpdateViewModel wineClubUpdateViewModel, Throwable th2) {
        wineClubUpdateViewModel.m109l(th2);
    }

    /* renamed from: j1 */
    public static final /* synthetic */ Object m12776j1(WineClubUpdateViewModel wineClubUpdateViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return wineClubUpdateViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: k1 */
    private final Club m12775k1(String str, List list, List list2) {
        Object obj;
        List m453p0;
        boolean z;
        boolean z2;
        List m18644j = this.f23803d0.m18644j();
        Iterator it = m18644j.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Club) obj).m14653d() == EnumC8691a.Wine) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        Club club = (Club) obj;
        Club m14655b = club != null ? Club.m14655b(club, null, null, null, null, null, null, null, null, null, null, null, null, true, null, new ClubData(null, str, list, list2, 1, null), club.m14644r(), 12287, null) : null;
        if (m14655b != null) {
            m453p0 = _Collections.m453p0(m18644j);
            for (Object obj2 : m18644j) {
                if (((Club) obj2).m14653d() == EnumC8691a.Wine) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    m453p0.remove(obj2);
                    m453p0.add(m14655b);
                    return m14655b;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return null;
    }

    /* renamed from: n1 */
    private final List m12771n1() {
        boolean z;
        for (Club club : this.f23803d0.m18644j()) {
            if (club.m14653d() == EnumC8691a.Wine) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                for (FormField formField : club.m14648j()) {
                    if (Intrinsics.equals(formField.m14615a(), "region")) {
                        return formField.m14611e();
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* renamed from: o1 */
    private final List m12770o1() {
        boolean z;
        for (Club club : this.f23803d0.m18644j()) {
            if (club.m14653d() == EnumC8691a.Wine) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                for (FormField formField : club.m14648j()) {
                    if (Intrinsics.equals(formField.m14615a(), "wineType")) {
                        return formField.m14611e();
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* renamed from: s1 */
    public static /* synthetic */ void m12766s1(WineClubUpdateViewModel wineClubUpdateViewModel, WineClubViewModel.AbstractC9050b abstractC9050b, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC9050b = WineClubViewModel.AbstractC9050b.C9051a.f23870a;
        }
        wineClubUpdateViewModel.m12767r1(abstractC9050b);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f6 A[RETURN] */
    /* renamed from: t1 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final pt.pingodoce.app.data.local.models.clubs.Club m12765t1(java.lang.String r32, java.util.List r33, java.util.List r34) {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.clubs.wine.WineClubUpdateViewModel.m12765t1(java.lang.String, java.util.List, java.util.List):pt.pingodoce.app.data.local.models.clubs.Club");
    }

    /* renamed from: u1 */
    static /* synthetic */ Club m12764u1(WineClubUpdateViewModel wineClubUpdateViewModel, String str, List list, List list2, int i, Object obj) {
        if ((i & 2) != 0) {
            list = null;
        }
        if ((i & 4) != 0) {
            list2 = null;
        }
        return wineClubUpdateViewModel.m12765t1(str, list, list2);
    }

    /* renamed from: l1 */
    public final void m12774l1(String str, EnumC7070a enumC7070a) {
        Intrinsics.isThisObjectNull(str, "title");
        Intrinsics.isThisObjectNull(enumC7070a, "type");
        Object mo172f = m20387j().mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        if (((Boolean) mo172f).booleanValue()) {
            return;
        }
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C9038c(enumC7070a, str, null), 3, null);
    }

    /* renamed from: m1 */
    public final LiveData m12773m1() {
        return this.f23807h0;
    }

    /* renamed from: n0 */
    protected Object m12772n0(InterfaceC1886d interfaceC1886d) {
        m12766s1(this, null, 1, null);
        return C13195u.f34156a;
    }

    /* renamed from: p1 */
    public final void m12769p1() {
        InterfaceC7886d.C7887a.m17629a(this.f23805f0, AnalyticEvents.AbstractC7859g.C7867h.f20490b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
    }

    /* renamed from: q1 */
    public final void m12768q1() {
        InterfaceC7886d.C7887a.m17629a(this.f23805f0, AnalyticEvents.AbstractC7859g.C7868i.f20491b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
    }

    /* renamed from: r1 */
    public final void m12767r1(WineClubViewModel.AbstractC9050b abstractC9050b) {
        List m455n0;
        List m455n02;
        List m455n03;
        List m455n04;
        Intrinsics.isThisObjectNull(abstractC9050b, "stepType");
        AbstractC13816c abstractC13816c = (AbstractC13816c) m12743L0().get(m12747H0());
        if (abstractC13816c instanceof C13839g3) {
            InterfaceC7886d.C7887a.m17629a(this.f23805f0, AnalyticEvents.AbstractC7859g.C7865f.f20488b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
            if (Intrinsics.equals(abstractC9050b, WineClubViewModel.AbstractC9050b.C9051a.f23870a)) {
                ClubWineFlowData clubWineFlowData = (ClubWineFlowData) m34578S();
                T mo172f = m12752C0().mo172f();
                Intrinsics.ifNullDoSomething(mo172f);
                m34576U(ClubWineFlowData.m14765b(clubWineFlowData, (String) mo172f, null, null, null, 14, null));
                InterfaceC7886d.C7887a.m17629a(this.f23805f0, AnalyticEvents.AbstractC7859g.C7866g.f20489b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
                ArrayList m12743L0 = m12743L0();
                C13820c3 c13820c3 = C13820c3.f34927a;
                m12733V0(m12743L0.indexOf(c13820c3));
                m120B(c13820c3, m34578S());
                return;
            }
            m12733V0(m12743L0().indexOf(C13839g3.f34947a));
            BaseViewModel.m119C(this, C13807a0.f34915a, null, 2, null);
        } else if (abstractC13816c instanceof C13820c3) {
            if (Intrinsics.equals(abstractC9050b, WineClubViewModel.AbstractC9050b.C9051a.f23870a)) {
                ClubWineFlowData clubWineFlowData2 = (ClubWineFlowData) m34578S();
                T mo172f2 = m12752C0().mo172f();
                Intrinsics.ifNullDoSomething(mo172f2);
                m34576U(ClubWineFlowData.m14765b(clubWineFlowData2, (String) mo172f2, null, null, null, 14, null));
                ArrayList m12743L02 = m12743L0();
                C13854j3 c13854j3 = C13854j3.f34962a;
                m12733V0(m12743L02.indexOf(c13854j3));
                InterfaceC7886d.C7887a.m17629a(this.f23805f0, AnalyticEvents.AbstractC7859g.C7860a.f20483b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
                m120B(c13854j3, m34578S());
                return;
            }
            ArrayList m12743L03 = m12743L0();
            C13839g3 c13839g3 = C13839g3.f34947a;
            m12733V0(m12743L03.indexOf(c13839g3));
            InterfaceC7886d.C7887a.m17629a(this.f23805f0, AnalyticEvents.AbstractC7859g.C7861b.f20484b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
            m120B(c13839g3, m34578S());
        } else if (abstractC13816c instanceof C13854j3) {
            if (Intrinsics.equals(abstractC9050b, WineClubViewModel.AbstractC9050b.C9051a.f23870a)) {
                ArrayList m12743L04 = m12743L0();
                C13849i3 c13849i3 = C13849i3.f34957a;
                m12733V0(m12743L04.indexOf(c13849i3));
                m120B(c13849i3, m34578S());
                return;
            }
            ArrayList m12743L05 = m12743L0();
            C13839g3 c13839g32 = C13839g3.f34947a;
            m12733V0(m12743L05.indexOf(c13839g32));
            m120B(c13839g32, m34578S());
        } else if (abstractC13816c instanceof C13849i3) {
            InterfaceC7886d.C7887a.m17629a(this.f23805f0, AnalyticEvents.AbstractC7859g.C7880u.f20503b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
            WineClubViewModel.AbstractC9050b.C9051a c9051a = WineClubViewModel.AbstractC9050b.C9051a.f23870a;
            if (!Intrinsics.equals(abstractC9050b, c9051a) && !Intrinsics.equals(abstractC9050b, WineClubViewModel.AbstractC9050b.C9053c.f23872a)) {
                ArrayList m12743L06 = m12743L0();
                C13839g3 c13839g33 = C13839g3.f34947a;
                m12733V0(m12743L06.indexOf(c13839g33));
                InterfaceC7886d.C7887a.m17629a(this.f23805f0, AnalyticEvents.AbstractC7859g.C7881v.f20504b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
                m120B(c13839g33, m34578S());
                return;
            }
            ClubWineFlowData clubWineFlowData3 = (ClubWineFlowData) m34578S();
            m455n04 = _Collections.m455n0(m12739P0());
            m34576U(ClubWineFlowData.m14765b(clubWineFlowData3, null, null, m455n04, null, 11, null));
            ArrayList m12743L07 = m12743L0();
            C13844h3 c13844h3 = C13844h3.f34952a;
            m12733V0(m12743L07.indexOf(c13844h3));
            if (Intrinsics.equals(abstractC9050b, c9051a)) {
                InterfaceC7886d.C7887a.m17629a(this.f23805f0, AnalyticEvents.AbstractC7859g.C7882w.f20505b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
            } else if (Intrinsics.equals(abstractC9050b, WineClubViewModel.AbstractC9050b.C9053c.f23872a)) {
                InterfaceC7886d.C7887a.m17629a(this.f23805f0, AnalyticEvents.AbstractC7859g.C7883x.f20506b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
            }
            m120B(c13844h3, m34578S());
        } else if (abstractC13816c instanceof C13844h3) {
            InterfaceC7886d.C7887a.m17629a(this.f23805f0, AnalyticEvents.AbstractC7859g.C7874o.f20497b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
            if (!Intrinsics.equals(abstractC9050b, WineClubViewModel.AbstractC9050b.C9051a.f23870a) && !Intrinsics.equals(abstractC9050b, WineClubViewModel.AbstractC9050b.C9053c.f23872a)) {
                ArrayList m12743L08 = m12743L0();
                C13849i3 c13849i32 = C13849i3.f34957a;
                m12733V0(m12743L08.indexOf(c13849i32));
                InterfaceC7886d.C7887a.m17629a(this.f23805f0, AnalyticEvents.AbstractC7859g.C7875p.f20498b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
                BaseViewModel.m119C(this, c13849i32, null, 2, null);
                return;
            }
            ClubWineFlowData clubWineFlowData4 = (ClubWineFlowData) m34578S();
            m455n03 = _Collections.m455n0(m12740O0());
            m34576U(ClubWineFlowData.m14765b(clubWineFlowData4, null, m455n03, null, null, 13, null));
            ClubWineFlowData clubWineFlowData5 = (ClubWineFlowData) m34578S();
            Club m12775k1 = m12775k1(clubWineFlowData5.m14764c(), clubWineFlowData5.m14763d(), clubWineFlowData5.m14762e());
            if (m12775k1 != null) {
                C6772d.m20158d(C1473p0.m36987a(this), null, null, new C9041d(abstractC9050b, m12775k1, null), 3, null);
            }
        } else if (abstractC13816c instanceof AppNavigationTypes) {
            if (Intrinsics.equals(abstractC9050b, WineClubViewModel.AbstractC9050b.C9051a.f23870a)) {
                ClubWineFlowData clubWineFlowData6 = (ClubWineFlowData) m34578S();
                m455n02 = _Collections.m455n0(m12739P0());
                m34576U(ClubWineFlowData.m14765b(clubWineFlowData6, null, null, m455n02, null, 11, null));
                Club m12764u1 = m12764u1(this, "wineType", null, ((ClubWineFlowData) m34578S()).m14762e(), 2, null);
                if (m12764u1 != null) {
                    C6772d.m20158d(C1473p0.m36987a(this), null, null, new C9043e(m12764u1, null), 3, null);
                    return;
                }
                return;
            }
            m12733V0(m12743L0().indexOf(C13820c3.f34927a));
            BaseViewModel.m119C(this, C13887p0.f35008a, null, 2, null);
        } else if (abstractC13816c instanceof C13825d3) {
            if (Intrinsics.equals(abstractC9050b, WineClubViewModel.AbstractC9050b.C9051a.f23870a)) {
                ClubWineFlowData clubWineFlowData7 = (ClubWineFlowData) m34578S();
                m455n0 = _Collections.m455n0(m12740O0());
                m34576U(ClubWineFlowData.m14765b(clubWineFlowData7, null, m455n0, null, null, 13, null));
                Club m12764u12 = m12764u1(this, "region", ((ClubWineFlowData) m34578S()).m14763d(), null, 4, null);
                if (m12764u12 != null) {
                    C6772d.m20158d(C1473p0.m36987a(this), null, null, new C9045f(m12764u12, null), 3, null);
                    return;
                }
                return;
            }
            m12733V0(m12743L0().indexOf(C13820c3.f34927a));
            BaseViewModel.m119C(this, C13887p0.f35008a, null, 2, null);
        }
    }
}
