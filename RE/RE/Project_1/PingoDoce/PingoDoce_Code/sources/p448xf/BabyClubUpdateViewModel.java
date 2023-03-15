package p448xf;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
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
import p164ii.BabyClubViewModel;
import p181jd.Intrinsics;
import p276og.Result;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc._Collections;
import p494zh.AbstractC13816c;
import p494zh.BaseViewModel;
import p494zh.C13826e;
import p494zh.C13830f;
import p494zh.C13835g;
import p494zh.C13840h;
import p494zh.C13845i;
import p494zh.C13850j;
import p494zh.C13883o0;
import pt.pingodoce.app.data.local.flows.ClubBabyFlowData;
import pt.pingodoce.app.data.local.models.clubs.Club;
import pt.pingodoce.app.data.local.models.clubs.ClubBaby;
import pt.pingodoce.app.data.local.models.clubs.ClubData;
import pt.pingodoce.app.data.local.models.clubs.EnumC8691a;
import pt.pingodoce.app.data.remote.models.response.Consent;
import td.InterfaceC10524i0;

/* renamed from: xf.a */
/* loaded from: classes2.dex */
public final class BabyClubUpdateViewModel extends BabyClubViewModel {

    /* renamed from: X */
    private final ClubManager f32507X;

    /* renamed from: Y */
    private final ConsentsManager f32508Y;

    /* renamed from: Z */
    private final AnalyticsManager f32509Z;

    /* renamed from: a0 */
    private final ClubBabyFlowData f32510a0;

    /* renamed from: b0 */
    private ClubBabyFlowData f32511b0;

    /* renamed from: c0 */
    private final C1436e0 f32512c0;

    /* renamed from: d0 */
    private final LiveData f32513d0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: BabyClubUpdateViewModel.kt */
    /* renamed from: xf.a$a */
    /* loaded from: classes2.dex */
    public static final class C12344a {

        /* renamed from: a */
        private final Club f32514a;

        /* renamed from: b */
        private final List f32515b;

        public C12344a(Club club, List list) {
            Intrinsics.isThisObjectNull(club, "club");
            Intrinsics.isThisObjectNull(list, "tempClubListUpdated");
            this.f32514a = club;
            this.f32515b = list;
        }

        /* renamed from: a */
        public final Club m2999a() {
            return this.f32514a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C12344a) {
                C12344a c12344a = (C12344a) obj;
                return Intrinsics.equals(this.f32514a, c12344a.f32514a) && Intrinsics.equals(this.f32515b, c12344a.f32515b);
            }
            return false;
        }

        public int hashCode() {
            return (this.f32514a.hashCode() * 31) + this.f32515b.hashCode();
        }

        public String toString() {
            Club club = this.f32514a;
            List list = this.f32515b;
            return "ActionMetadata(club=" + club + ", tempClubListUpdated=" + list + ")";
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BabyClubUpdateViewModel.kt */
    @InterfaceC6759f(m20197c = "presentation.clubs.baby.BabyClubUpdateViewModel$fetchConsentsUrl$1", m20196f = "BabyClubUpdateViewModel.kt", m20195l = {348}, m20194m = "invokeSuspend")
    /* renamed from: xf.a$b */
    /* loaded from: classes2.dex */
    public static final class C12345b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ String f32516A;

        /* renamed from: x */
        int f32517x;

        /* renamed from: z */
        final /* synthetic */ EnumC7070a f32519z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BabyClubUpdateViewModel.kt */
        @InterfaceC6759f(m20197c = "presentation.clubs.baby.BabyClubUpdateViewModel$fetchConsentsUrl$1$1", m20196f = "BabyClubUpdateViewModel.kt", m20195l = {350, 351}, m20194m = "invokeSuspend")
        /* renamed from: xf.a$b$a */
        /* loaded from: classes2.dex */
        public static final class C12346a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: A */
            final /* synthetic */ String f32520A;

            /* renamed from: x */
            int f32521x;

            /* renamed from: y */
            final /* synthetic */ EnumC7070a f32522y;

            /* renamed from: z */
            final /* synthetic */ BabyClubUpdateViewModel f32523z;

            /* compiled from: BabyClubUpdateViewModel.kt */
            /* renamed from: xf.a$b$a$a */
            /* loaded from: classes2.dex */
            public /* synthetic */ class C12347a {

                /* renamed from: a */
                public static final /* synthetic */ int[] f32524a;

                static {
                    int[] iArr = new int[EnumC7070a.values().length];
                    iArr[EnumC7070a.TERM_OF_USE.ordinal()] = 1;
                    iArr[EnumC7070a.PRIVACY.ordinal()] = 2;
                    f32524a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12346a(EnumC7070a enumC7070a, BabyClubUpdateViewModel babyClubUpdateViewModel, String str, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f32522y = enumC7070a;
                this.f32523z = babyClubUpdateViewModel;
                this.f32520A = str;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C12346a(this.f32522y, this.f32523z, this.f32520A, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C12346a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                Result result;
                m34636d = C2116d.m34636d();
                int i = this.f32521x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    int i2 = C12347a.f32524a[this.f32522y.ordinal()];
                    if (i2 == 1) {
                        ConsentsManager m3016Z0 = BabyClubUpdateViewModel.m3016Z0(this.f32523z);
                        this.f32521x = 1;
                        obj = m3016Z0.m18568c("70", this);
                        if (obj == m34636d) {
                            return m34636d;
                        }
                        result = (Result) obj;
                    } else if (i2 != 2) {
                        throw new NoWhenBranchMatchedException();
                    } else {
                        ConsentsManager m3016Z02 = BabyClubUpdateViewModel.m3016Z0(this.f32523z);
                        this.f32521x = 2;
                        obj = m3016Z02.m18565f(this);
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
                    EnumC7070a enumC7070a = this.f32522y;
                    BabyClubUpdateViewModel babyClubUpdateViewModel = this.f32523z;
                    String str = this.f32520A;
                    Consent consent = (Consent) m16962b;
                    int i3 = C12347a.f32524a[enumC7070a.ordinal()];
                    if (i3 == 1) {
                        BabyClubUpdateViewModel.m3014b1(babyClubUpdateViewModel).mo166p(new C7185b(new Term(str, ((Consent) c8078c.m16962b()).m13866b())));
                    } else if (i3 == 2) {
                        BabyClubUpdateViewModel.m3014b1(babyClubUpdateViewModel).mo166p(new C7185b(new Term(str, ((Consent) c8078c.m16962b()).m13867a())));
                    }
                } else if (result instanceof Result.C8077b) {
                    this.f32523z.m20319p0();
                    BabyClubUpdateViewModel.m3013c1(this.f32523z, ((Result.C8077b) result).m16964b());
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12345b(EnumC7070a enumC7070a, String str, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f32519z = enumC7070a;
            this.f32516A = str;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C12345b(this.f32519z, this.f32516A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C12345b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f32517x;
            if (i == 0) {
                C13186n.m1453b(obj);
                BabyClubUpdateViewModel babyClubUpdateViewModel = BabyClubUpdateViewModel.this;
                C12346a c12346a = new C12346a(this.f32519z, babyClubUpdateViewModel, this.f32516A, null);
                this.f32517x = 1;
                if (BabyClubUpdateViewModel.m3012d1(babyClubUpdateViewModel, true, c12346a, this) == m34636d) {
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
    /* compiled from: BabyClubUpdateViewModel.kt */
    @InterfaceC6759f(m20197c = "presentation.clubs.baby.BabyClubUpdateViewModel$stepperAssigner$1", m20196f = "BabyClubUpdateViewModel.kt", m20195l = {112}, m20194m = "invokeSuspend")
    /* renamed from: xf.a$c */
    /* loaded from: classes2.dex */
    public static final class C12348c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f32525x;

        C12348c(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C12348c(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C12348c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            Club club;
            Object obj2;
            boolean z;
            m34636d = C2116d.m34636d();
            int i = this.f32525x;
            if (i == 0) {
                C13186n.m1453b(obj);
                BabyClubUpdateViewModel babyClubUpdateViewModel = BabyClubUpdateViewModel.this;
                BabyClubUpdateViewModel.m3011e1(babyClubUpdateViewModel, BabyClubUpdateViewModel.m3015a1(babyClubUpdateViewModel).indexOf(C13850j.f34958a));
                ClubManager m3017Y0 = BabyClubUpdateViewModel.m3017Y0(BabyClubUpdateViewModel.this);
                this.f32525x = 1;
                obj = m3017Y0.m18646h(this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            List list = (List) ((Result) obj).m16966a();
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    if (((Club) obj2).m14653d() == EnumC8691a.Baby) {
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
                club = (Club) obj2;
            } else {
                club = null;
            }
            Boolean m20201a = club != null ? C6755b.m20201a(club.m14640w()) : null;
            if (Intrinsics.equals(m20201a, C6755b.m20201a(false))) {
                BaseViewModel.m119C(BabyClubUpdateViewModel.this, C13883o0.f35005a, null, 2, null);
            } else if (Intrinsics.equals(m20201a, C6755b.m20201a(true))) {
                InterfaceC7886d.C7887a.m17629a(BabyClubUpdateViewModel.m3018X0(BabyClubUpdateViewModel.this), AnalyticEvents.AbstractC7709b.C7717g.f20343b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
                BaseViewModel.m119C(BabyClubUpdateViewModel.this, C13835g.f34943a, null, 2, null);
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BabyClubUpdateViewModel.kt */
    @InterfaceC6759f(m20197c = "presentation.clubs.baby.BabyClubUpdateViewModel$stepperAssigner$2$1", m20196f = "BabyClubUpdateViewModel.kt", m20195l = {193}, m20194m = "invokeSuspend")
    /* renamed from: xf.a$d */
    /* loaded from: classes2.dex */
    public static final class C12349d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f32527x;

        /* renamed from: z */
        final /* synthetic */ C12344a f32529z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BabyClubUpdateViewModel.kt */
        @InterfaceC6759f(m20197c = "presentation.clubs.baby.BabyClubUpdateViewModel$stepperAssigner$2$1$1", m20196f = "BabyClubUpdateViewModel.kt", m20195l = {195, 200, 214}, m20194m = "invokeSuspend")
        /* renamed from: xf.a$d$a */
        /* loaded from: classes2.dex */
        public static final class C12350a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f32530x;

            /* renamed from: y */
            final /* synthetic */ BabyClubUpdateViewModel f32531y;

            /* renamed from: z */
            final /* synthetic */ C12344a f32532z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12350a(BabyClubUpdateViewModel babyClubUpdateViewModel, C12344a c12344a, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f32531y = babyClubUpdateViewModel;
                this.f32532z = c12344a;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C12350a(this.f32531y, this.f32532z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C12350a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            /* JADX WARN: Removed duplicated region for block: B:38:0x0098  */
            /* JADX WARN: Removed duplicated region for block: B:39:0x00b1  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00e6  */
            /* JADX WARN: Removed duplicated region for block: B:50:0x00ff  */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    Method dump skipped, instructions count: 273
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: p448xf.BabyClubUpdateViewModel.C12349d.C12350a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12349d(C12344a c12344a, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f32529z = c12344a;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C12349d(this.f32529z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C12349d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f32527x;
            if (i == 0) {
                C13186n.m1453b(obj);
                BabyClubUpdateViewModel babyClubUpdateViewModel = BabyClubUpdateViewModel.this;
                C12350a c12350a = new C12350a(babyClubUpdateViewModel, this.f32529z, null);
                this.f32527x = 1;
                if (BabyClubUpdateViewModel.m3012d1(babyClubUpdateViewModel, true, c12350a, this) == m34636d) {
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
    /* compiled from: BabyClubUpdateViewModel.kt */
    @InterfaceC6759f(m20197c = "presentation.clubs.baby.BabyClubUpdateViewModel$stepperAssigner$3$1", m20196f = "BabyClubUpdateViewModel.kt", m20195l = {248}, m20194m = "invokeSuspend")
    /* renamed from: xf.a$e */
    /* loaded from: classes2.dex */
    public static final class C12351e extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f32533x;

        /* renamed from: z */
        final /* synthetic */ C12344a f32535z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BabyClubUpdateViewModel.kt */
        @InterfaceC6759f(m20197c = "presentation.clubs.baby.BabyClubUpdateViewModel$stepperAssigner$3$1$1", m20196f = "BabyClubUpdateViewModel.kt", m20195l = {249}, m20194m = "invokeSuspend")
        /* renamed from: xf.a$e$a */
        /* loaded from: classes2.dex */
        public static final class C12352a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f32536x;

            /* renamed from: y */
            final /* synthetic */ BabyClubUpdateViewModel f32537y;

            /* renamed from: z */
            final /* synthetic */ C12344a f32538z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C12352a(BabyClubUpdateViewModel babyClubUpdateViewModel, C12344a c12344a, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f32537y = babyClubUpdateViewModel;
                this.f32538z = c12344a;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C12352a(this.f32537y, this.f32538z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C12352a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f32536x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    ClubManager m3017Y0 = BabyClubUpdateViewModel.m3017Y0(this.f32537y);
                    Club m2999a = this.f32538z.m2999a();
                    this.f32536x = 1;
                    obj = m3017Y0.m18641m(m2999a, this);
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
                    BabyClubUpdateViewModel babyClubUpdateViewModel = this.f32537y;
                    BabyClubUpdateViewModel.m3011e1(babyClubUpdateViewModel, BabyClubUpdateViewModel.m3015a1(babyClubUpdateViewModel).indexOf(C13850j.f34958a));
                    BabyClubUpdateViewModel babyClubUpdateViewModel2 = this.f32537y;
                    babyClubUpdateViewModel2.m120B(C13835g.f34943a, babyClubUpdateViewModel2.m3007i1());
                } else if (result instanceof Result.C8077b) {
                    BabyClubUpdateViewModel.m3013c1(this.f32537y, ((Result.C8077b) result).m16964b());
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C12351e(C12344a c12344a, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f32535z = c12344a;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C12351e(this.f32535z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C12351e) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f32533x;
            if (i == 0) {
                C13186n.m1453b(obj);
                BabyClubUpdateViewModel babyClubUpdateViewModel = BabyClubUpdateViewModel.this;
                C12352a c12352a = new C12352a(babyClubUpdateViewModel, this.f32535z, null);
                this.f32533x = 1;
                if (BabyClubUpdateViewModel.m3012d1(babyClubUpdateViewModel, true, c12352a, this) == m34636d) {
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
    public BabyClubUpdateViewModel(C1459l0 c1459l0, ClubManager clubManager, ConsentsManager consentsManager, AnalyticsManager analyticsManager, ResourcesProvider resourcesProvider) {
        super(c1459l0, resourcesProvider, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(clubManager, "clubManager");
        Intrinsics.isThisObjectNull(consentsManager, "consentsManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        this.f32507X = clubManager;
        this.f32508Y = consentsManager;
        this.f32509Z = analyticsManager;
        this.f32510a0 = new ClubBabyFlowData(null, null, null, null, 15, null);
        this.f32511b0 = (ClubBabyFlowData) c1459l0.m37005b("EXTRA_FOR_FLOW_DATA");
        C1436e0 c1436e0 = new C1436e0();
        this.f32512c0 = c1436e0;
        this.f32513d0 = c1436e0;
        C1436e0 m22003M0 = m22003M0();
        ClubBabyFlowData clubBabyFlowData = this.f32511b0;
        m22003M0.mo166p(clubBabyFlowData != null ? clubBabyFlowData.m14773d() : null);
        C1436e0 m22012D0 = m22012D0();
        ClubBabyFlowData clubBabyFlowData2 = this.f32511b0;
        m22012D0.mo166p(clubBabyFlowData2 != null ? clubBabyFlowData2.m14776a() : null);
        C1436e0 m22007I0 = m22007I0();
        ClubBabyFlowData clubBabyFlowData3 = this.f32511b0;
        m22007I0.mo166p(clubBabyFlowData3 != null ? clubBabyFlowData3.m14775b() : null);
        C1436e0 m22006J0 = m22006J0();
        ClubBabyFlowData clubBabyFlowData4 = this.f32511b0;
        m22006J0.mo166p(clubBabyFlowData4 != null ? clubBabyFlowData4.m14774c() : null);
    }

    /* renamed from: X0 */
    public static final /* synthetic */ AnalyticsManager m3018X0(BabyClubUpdateViewModel babyClubUpdateViewModel) {
        return babyClubUpdateViewModel.f32509Z;
    }

    /* renamed from: Y0 */
    public static final /* synthetic */ ClubManager m3017Y0(BabyClubUpdateViewModel babyClubUpdateViewModel) {
        return babyClubUpdateViewModel.f32507X;
    }

    /* renamed from: Z0 */
    public static final /* synthetic */ ConsentsManager m3016Z0(BabyClubUpdateViewModel babyClubUpdateViewModel) {
        return babyClubUpdateViewModel.f32508Y;
    }

    /* renamed from: a1 */
    public static final /* synthetic */ ArrayList m3015a1(BabyClubUpdateViewModel babyClubUpdateViewModel) {
        return babyClubUpdateViewModel.m22004L0();
    }

    /* renamed from: b1 */
    public static final /* synthetic */ C1436e0 m3014b1(BabyClubUpdateViewModel babyClubUpdateViewModel) {
        return babyClubUpdateViewModel.f32512c0;
    }

    /* renamed from: c1 */
    public static final /* synthetic */ void m3013c1(BabyClubUpdateViewModel babyClubUpdateViewModel, Throwable th2) {
        babyClubUpdateViewModel.m109l(th2);
    }

    /* renamed from: d1 */
    public static final /* synthetic */ Object m3012d1(BabyClubUpdateViewModel babyClubUpdateViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return babyClubUpdateViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* renamed from: e1 */
    public static final /* synthetic */ void m3011e1(BabyClubUpdateViewModel babyClubUpdateViewModel, int i) {
        babyClubUpdateViewModel.m21999Q0(i);
    }

    /* renamed from: f1 */
    private final C12344a m3010f1(String str, String str2, String str3, String str4) {
        boolean z;
        Club club;
        Object obj;
        ArrayList arrayList;
        byte b;
        List m18644j = this.f32507X.m18644j();
        Iterator it = m18644j.iterator();
        while (true) {
            z = true;
            club = null;
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Club) obj).m14653d() == EnumC8691a.Baby) {
                b = 1;
                continue;
            } else {
                b = 0;
                continue;
            }
            if (b != 0) {
                break;
            }
        }
        Club club2 = (Club) obj;
        if (club2 != null) {
            List m14625a = club2.m14651f().m14625a();
            if (m14625a != null && !m14625a.isEmpty()) {
                z = false;
            }
            if (z) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(new ClubBaby(str, str3, str4, str2));
                arrayList = arrayList2;
            } else {
                List m14625a2 = club2.m14651f().m14625a();
                List m453p0 = m14625a2 != null ? _Collections.m453p0(m14625a2) : null;
                Intrinsics.ifNullDoSomething(m453p0);
                m453p0.add(new ClubBaby(str, str3, str4, str2));
                arrayList = m453p0;
            }
            club = Club.m14655b(club2, null, null, null, null, null, null, null, null, null, null, null, null, true, null, new ClubData(arrayList, null, null, null, 14, null), club2.m14644r(), 12287, null);
        }
        return m3009g1(club, m18644j);
    }

    /* renamed from: g1 */
    private final C12344a m3009g1(Club club, List list) {
        List m453p0;
        boolean z;
        if (club != null) {
            m453p0 = _Collections.m453p0(list);
            for (Object obj : list) {
                if (((Club) obj).m14653d() == EnumC8691a.Baby) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (z) {
                    m453p0.remove(obj);
                    m453p0.add(club);
                    return new C12344a(club, m453p0);
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        return null;
    }

    /* renamed from: n1 */
    public static /* synthetic */ void m3001n1(BabyClubUpdateViewModel babyClubUpdateViewModel, BabyClubViewModel.AbstractC6173a abstractC6173a, int i, Object obj) {
        if ((i & 1) != 0) {
            abstractC6173a = BabyClubViewModel.AbstractC6173a.C6174a.f16939a;
        }
        babyClubUpdateViewModel.m3003m1(abstractC6173a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: o1 */
    private final C12344a m3000o1(String str, String str2) {
        Club club;
        Object obj;
        List m453p0;
        boolean z;
        List m18644j = this.f32507X.m18644j();
        Iterator it = m18644j.iterator();
        while (true) {
            club = null;
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
        Club club2 = (Club) obj;
        if (club2 != null) {
            List m14625a = club2.m14651f().m14625a();
            Intrinsics.ifNullDoSomething(m14625a);
            m453p0 = _Collections.m453p0(m14625a);
            Iterator it2 = m453p0.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                if (Intrinsics.equals(((ClubBaby) next).m14632d(), str)) {
                    club = next;
                    break;
                }
            }
            ClubBaby clubBaby = (ClubBaby) club;
            if (clubBaby != null) {
                m453p0.remove(clubBaby);
                m453p0.add(ClubBaby.m14634b(clubBaby, null, null, null, str2, 7, null));
            }
            club = Club.m14655b(club2, null, null, null, null, null, null, null, null, null, null, null, null, false, null, new ClubData(m453p0, null, null, null, 14, null), club2.m14644r(), 16383, null);
        }
        return m3009g1(club, m18644j);
    }

    /* renamed from: h1 */
    public final void m3008h1(String str, EnumC7070a enumC7070a) {
        Intrinsics.isThisObjectNull(str, "title");
        Intrinsics.isThisObjectNull(enumC7070a, "type");
        Object mo172f = m20387j().mo172f();
        Intrinsics.ifNullDoSomething(mo172f);
        if (((Boolean) mo172f).booleanValue()) {
            return;
        }
        C6772d.m20158d(C1473p0.m36987a(this), null, null, new C12345b(enumC7070a, str, null), 3, null);
    }

    /* renamed from: i1 */
    public final ClubBabyFlowData m3007i1() {
        return this.f32510a0;
    }

    /* renamed from: j1 */
    public final LiveData m3006j1() {
        return this.f32513d0;
    }

    /* renamed from: k1 */
    public final void m3005k1() {
        InterfaceC7886d.C7887a.m17629a(this.f32509Z, AnalyticEvents.AbstractC7709b.C7732v.f20358b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
    }

    /* renamed from: l1 */
    public final void m3004l1() {
        InterfaceC7886d.C7887a.m17629a(this.f32509Z, AnalyticEvents.AbstractC7709b.C7733w.f20359b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
    }

    /* renamed from: m1 */
    public final void m3003m1(BabyClubViewModel.AbstractC6173a abstractC6173a) {
        boolean z;
        Object obj;
        boolean z2;
        Intrinsics.isThisObjectNull(abstractC6173a, "stepType");
        AbstractC13816c abstractC13816c = (AbstractC13816c) m22004L0().get(m22009G0());
        if (abstractC13816c instanceof C13850j) {
            InterfaceC7886d.C7887a.m17629a(this.f32509Z, AnalyticEvents.AbstractC7709b.C7716f.f20342b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
            if (!Intrinsics.equals(abstractC6173a, BabyClubViewModel.AbstractC6173a.C6174a.f16939a)) {
                C6772d.m20158d(C1473p0.m36987a(this), null, null, new C12348c(null), 3, null);
                return;
            }
            ClubBabyFlowData clubBabyFlowData = this.f32510a0;
            T mo172f = m22003M0().mo172f();
            Intrinsics.ifNullDoSomething(mo172f);
            clubBabyFlowData.m14769i((String) mo172f);
            m21999Q0(m22004L0().indexOf(C13826e.f34933a));
            Iterator it = this.f32507X.m18644j().iterator();
            while (true) {
                z = true;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((Club) obj).m14653d() == EnumC8691a.Baby) {
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
            ClubData m14651f = club != null ? club.m14651f() : null;
            Intrinsics.ifNullDoSomething(m14651f);
            List m14625a = m14651f.m14625a();
            if (m14625a != null && !m14625a.isEmpty()) {
                z = false;
            }
            if (z) {
                m120B(C13826e.f34933a, this.f32510a0);
                return;
            }
            InterfaceC7886d.C7887a.m17629a(this.f32509Z, AnalyticEvents.AbstractC7709b.C7718h.f20344b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
            m3003m1(BabyClubViewModel.AbstractC6173a.C6174a.f16939a);
        } else if (abstractC13816c instanceof C13826e) {
            if (Intrinsics.equals(abstractC6173a, BabyClubViewModel.AbstractC6173a.C6174a.f16939a)) {
                ArrayList m22004L0 = m22004L0();
                C13840h c13840h = C13840h.f34948a;
                m21999Q0(m22004L0.indexOf(c13840h));
                InterfaceC7886d.C7887a.m17629a(this.f32509Z, AnalyticEvents.AbstractC7709b.C7721k.f20347b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
                m120B(c13840h, this.f32510a0);
                return;
            }
            ArrayList m22004L02 = m22004L0();
            C13850j c13850j = C13850j.f34958a;
            m21999Q0(m22004L02.indexOf(c13850j));
            m120B(c13850j, this.f32510a0);
        } else if (abstractC13816c instanceof C13840h) {
            InterfaceC7886d.C7887a.m17629a(this.f32509Z, AnalyticEvents.AbstractC7709b.C7719i.f20345b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
            if (Intrinsics.equals(abstractC6173a, BabyClubViewModel.AbstractC6173a.C6174a.f16939a)) {
                ClubBabyFlowData clubBabyFlowData2 = this.f32510a0;
                T mo172f2 = m22012D0().mo172f();
                Intrinsics.ifNullDoSomething(mo172f2);
                clubBabyFlowData2.m14772e((String) mo172f2);
                ArrayList m22004L03 = m22004L0();
                C13845i c13845i = C13845i.f34953a;
                m21999Q0(m22004L03.indexOf(c13845i));
                InterfaceC7886d.C7887a.m17629a(this.f32509Z, AnalyticEvents.AbstractC7709b.C7724n.f20350b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
                m120B(c13845i, this.f32510a0);
                return;
            }
            ArrayList m22004L04 = m22004L0();
            C13850j c13850j2 = C13850j.f34958a;
            m21999Q0(m22004L04.indexOf(c13850j2));
            InterfaceC7886d.C7887a.m17629a(this.f32509Z, AnalyticEvents.AbstractC7709b.C7720j.f20346b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
            m120B(c13850j2, this.f32510a0);
        } else if (abstractC13816c instanceof C13845i) {
            InterfaceC7886d.C7887a.m17629a(this.f32509Z, AnalyticEvents.AbstractC7709b.C7722l.f20348b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
            if (Intrinsics.equals(abstractC6173a, BabyClubViewModel.AbstractC6173a.C6174a.f16939a)) {
                ClubBabyFlowData clubBabyFlowData3 = this.f32510a0;
                T mo172f3 = m22007I0().mo172f();
                Intrinsics.ifNullDoSomething(mo172f3);
                clubBabyFlowData3.m14771f((String) mo172f3);
                this.f32510a0.m14770h(m22015A0());
                C12344a m3010f1 = m3010f1(this.f32510a0.m14775b(), this.f32510a0.m14773d(), this.f32510a0.m14776a(), this.f32510a0.m14774c());
                if (m3010f1 != null) {
                    C6772d.m20158d(C1473p0.m36987a(this), null, null, new C12349d(m3010f1, null), 3, null);
                    return;
                }
                return;
            }
            ArrayList m22004L05 = m22004L0();
            C13840h c13840h2 = C13840h.f34948a;
            m21999Q0(m22004L05.indexOf(c13840h2));
            InterfaceC7886d.C7887a.m17629a(this.f32509Z, AnalyticEvents.AbstractC7709b.C7723m.f20349b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
            m120B(c13840h2, this.f32510a0);
        } else if (abstractC13816c instanceof C13830f) {
            if (Intrinsics.equals(abstractC6173a, BabyClubViewModel.AbstractC6173a.C6174a.f16939a)) {
                ClubBabyFlowData clubBabyFlowData4 = this.f32510a0;
                T mo172f4 = m22003M0().mo172f();
                Intrinsics.ifNullDoSomething(mo172f4);
                clubBabyFlowData4.m14769i((String) mo172f4);
                T mo172f5 = m22007I0().mo172f();
                Intrinsics.ifNullDoSomething(mo172f5);
                T mo172f6 = m22003M0().mo172f();
                Intrinsics.ifNullDoSomething(mo172f6);
                C12344a m3000o1 = m3000o1((String) mo172f5, (String) mo172f6);
                if (m3000o1 != null) {
                    C6772d.m20158d(C1473p0.m36987a(this), null, null, new C12351e(m3000o1, null), 3, null);
                    return;
                }
                return;
            }
            m21999Q0(m22004L0().indexOf(C13850j.f34958a));
            BaseViewModel.m119C(this, C13835g.f34943a, null, 2, null);
        }
    }

    /* renamed from: n0 */
    protected Object m3002n0(InterfaceC1886d interfaceC1886d) {
        m3001n1(this, null, 1, null);
        return C13195u.f34156a;
    }
}
