package pt.pingodoce.app.presentation.clubs.baby;

import android.view.View;
import androidx.lifecycle.C1459l0;
import androidx.lifecycle.C1465n0;
import androidx.lifecycle.C1473p0;
import androidx.lifecycle.LiveData;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6772d;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import mg.AnalyticsManager;
import mg.ClubManager;
import ng.AnalyticEvents;
import ng.EnumC7884b;
import ng.EnumC7885c;
import ng.InterfaceC7886d;
import p070e.C4906j;
import p144hi.ClubViewModel;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p259o.InterfaceC7946a;
import p276og.Result;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13780s;
import p489zc._Collections;
import p494zh.BaseViewModel;
import p494zh.C13883o0;
import pt.pingodoce.app.data.local.models.clubs.Club;
import pt.pingodoce.app.data.local.models.clubs.ClubBaby;
import pt.pingodoce.app.data.local.models.clubs.ClubData;
import pt.pingodoce.app.data.local.models.clubs.EnumC8691a;
import pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeViewModel;
import td.InterfaceC10524i0;

/* renamed from: pt.pingodoce.app.presentation.clubs.baby.d */
/* loaded from: classes2.dex */
public final class BabyClubHomeViewModel extends ClubViewModel {

    /* renamed from: A */
    private final LiveData f23704A;

    /* renamed from: B */
    private final LiveData f23705B;

    /* renamed from: C */
    private final InterfaceC6108l f23706C;

    /* renamed from: v */
    private final ClubManager f23707v;

    /* renamed from: w */
    private final AnalyticsManager f23708w;

    /* renamed from: x */
    private final LiveData f23709x;

    /* renamed from: y */
    private final LiveData f23710y;

    /* renamed from: z */
    private final LiveData f23711z;

    /* compiled from: BabyClubHomeViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.d$a */
    /* loaded from: classes2.dex */
    public enum EnumC8987a {
        EDIT,
        REMOVE
    }

    /* compiled from: BabyClubHomeViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.d$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class C8988b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f23712a;

        static {
            int[] iArr = new int[EnumC8987a.values().length];
            iArr[EnumC8987a.EDIT.ordinal()] = 1;
            iArr[EnumC8987a.REMOVE.ordinal()] = 2;
            f23712a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BabyClubHomeViewModel.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.d$c */
    /* loaded from: classes2.dex */
    public static final class C8989c extends AbstractC6438m implements InterfaceC6108l {
        C8989c() {
            super(1);
        }

        /* renamed from: a */
        public final void m12888a(C13195u c13195u) {
            Intrinsics.isThisObjectNull(c13195u, "it");
            BaseViewModel.m119C(BabyClubHomeViewModel.this, C13883o0.f35005a, null, 2, null);
        }

        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Object mo9587d(Object obj) {
            m12888a((C13195u) obj);
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BabyClubHomeViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeViewModel$removeBaby$3$1", m20196f = "BabyClubHomeViewModel.kt", m20195l = {115}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.d$d */
    /* loaded from: classes2.dex */
    public static final class C8990d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23714x;

        /* renamed from: z */
        final /* synthetic */ Club f23716z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BabyClubHomeViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeViewModel$removeBaby$3$1$1", m20196f = "BabyClubHomeViewModel.kt", m20195l = {C4906j.f13612y0}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.clubs.baby.d$d$a */
        /* loaded from: classes2.dex */
        public static final class C8991a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f23717x;

            /* renamed from: y */
            final /* synthetic */ BabyClubHomeViewModel f23718y;

            /* renamed from: z */
            final /* synthetic */ Club f23719z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8991a(BabyClubHomeViewModel babyClubHomeViewModel, Club club, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f23718y = babyClubHomeViewModel;
                this.f23719z = club;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C8991a(this.f23718y, this.f23719z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C8991a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f23717x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    ClubManager m12905b0 = BabyClubHomeViewModel.m12905b0(this.f23718y);
                    Club club = this.f23719z;
                    this.f23717x = 1;
                    obj = m12905b0.m18641m(club, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                Result result = (Result) obj;
                if (!(result instanceof Result.C8078c) && (result instanceof Result.C8077b)) {
                    BabyClubHomeViewModel.m12904c0(this.f23718y, ((Result.C8077b) result).m16964b());
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8990d(Club club, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f23716z = club;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8990d(this.f23716z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8990d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23714x;
            if (i == 0) {
                C13186n.m1453b(obj);
                BabyClubHomeViewModel babyClubHomeViewModel = BabyClubHomeViewModel.this;
                C8991a c8991a = new C8991a(babyClubHomeViewModel, this.f23716z, null);
                this.f23714x = 1;
                if (BabyClubHomeViewModel.m12903d0(babyClubHomeViewModel, true, c8991a, this) == m34636d) {
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
    /* compiled from: BabyClubHomeViewModel.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeViewModel$removeBaby$3$2", m20196f = "BabyClubHomeViewModel.kt", m20195l = {128}, m20194m = "invokeSuspend")
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.d$e */
    /* loaded from: classes2.dex */
    public static final class C8992e extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f23720x;

        /* renamed from: z */
        final /* synthetic */ Club f23722z;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* compiled from: BabyClubHomeViewModel.kt */
        @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeViewModel$removeBaby$3$2$1", m20196f = "BabyClubHomeViewModel.kt", m20195l = {129}, m20194m = "invokeSuspend")
        /* renamed from: pt.pingodoce.app.presentation.clubs.baby.d$e$a */
        /* loaded from: classes2.dex */
        public static final class C8993a extends AbstractC6764l implements InterfaceC6108l {

            /* renamed from: x */
            int f23723x;

            /* renamed from: y */
            final /* synthetic */ BabyClubHomeViewModel f23724y;

            /* renamed from: z */
            final /* synthetic */ Club f23725z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C8993a(BabyClubHomeViewModel babyClubHomeViewModel, Club club, InterfaceC1886d interfaceC1886d) {
                super(1, interfaceC1886d);
                this.f23724y = babyClubHomeViewModel;
                this.f23725z = club;
            }

            public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
                return new C8993a(this.f23724y, this.f23725z, interfaceC1886d);
            }

            /* renamed from: d */
            public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
                return ((C8993a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
            }

            public final Object invokeSuspend(Object obj) {
                Object m34636d;
                m34636d = C2116d.m34636d();
                int i = this.f23723x;
                if (i == 0) {
                    C13186n.m1453b(obj);
                    ClubManager m12905b0 = BabyClubHomeViewModel.m12905b0(this.f23724y);
                    Club club = this.f23725z;
                    this.f23723x = 1;
                    obj = m12905b0.m18642l(club, this);
                    if (obj == m34636d) {
                        return m34636d;
                    }
                } else if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                } else {
                    C13186n.m1453b(obj);
                }
                Result result = (Result) obj;
                if (!(result instanceof Result.C8078c) && (result instanceof Result.C8077b)) {
                    BabyClubHomeViewModel.m12904c0(this.f23724y, ((Result.C8077b) result).m16964b());
                }
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C8992e(Club club, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f23722z = club;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C8992e(this.f23722z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C8992e) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f23720x;
            if (i == 0) {
                C13186n.m1453b(obj);
                BabyClubHomeViewModel babyClubHomeViewModel = BabyClubHomeViewModel.this;
                C8993a c8993a = new C8993a(babyClubHomeViewModel, this.f23722z, null);
                this.f23720x = 1;
                if (BabyClubHomeViewModel.m12903d0(babyClubHomeViewModel, true, c8993a, this) == m34636d) {
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

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.d$f */
    /* loaded from: classes2.dex */
    public static final class C8994f implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f23726w;

        /* compiled from: Emitters.kt */
        /* renamed from: pt.pingodoce.app.presentation.clubs.baby.d$f$a */
        /* loaded from: classes2.dex */
        public static final class C8995a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f23727w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeViewModel$special$$inlined$filterNot$1$2", m20196f = "BabyClubHomeViewModel.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: pt.pingodoce.app.presentation.clubs.baby.d$f$a$a */
            /* loaded from: classes2.dex */
            public static final class C8996a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f23728w;

                /* renamed from: x */
                int f23729x;

                public C8996a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f23728w = obj;
                    this.f23729x |= Integer.MIN_VALUE;
                    return C8995a.this.mo4529a(null, this);
                }
            }

            public C8995a(InterfaceC6787d interfaceC6787d) {
                this.f23727w = interfaceC6787d;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object mo4529a(java.lang.Object r5, bd.InterfaceC1886d r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeViewModel.C8994f.C8995a.C8996a
                    if (r0 == 0) goto L13
                    r0 = r6
                    pt.pingodoce.app.presentation.clubs.baby.d$f$a$a r0 = (pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeViewModel.C8994f.C8995a.C8996a) r0
                    int r1 = r0.f23729x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f23729x = r1
                    goto L18
                L13:
                    pt.pingodoce.app.presentation.clubs.baby.d$f$a$a r0 = new pt.pingodoce.app.presentation.clubs.baby.d$f$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f23728w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f23729x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r6)
                    goto L48
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    p468yc.C13186n.m1453b(r6)
                    kotlinx.coroutines.flow.d r6 = r4.f23727w
                    r2 = r5
                    java.util.List r2 = (java.util.List) r2
                    boolean r2 = r2.isEmpty()
                    if (r2 != 0) goto L48
                    r0.f23729x = r3
                    java.lang.Object r5 = r6.mo4529a(r5, r0)
                    if (r5 != r1) goto L48
                    return r1
                L48:
                    yc.u r5 = p468yc.C13195u.f34156a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeViewModel.C8994f.C8995a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C8994f(InterfaceC6785c interfaceC6785c) {
            this.f23726w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f23726w.mo20086d(new C8995a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* compiled from: SafeCollector.common.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.d$g */
    /* loaded from: classes2.dex */
    public static final class C8997g implements InterfaceC6785c {

        /* renamed from: w */
        final /* synthetic */ InterfaceC6785c f23731w;

        /* compiled from: Emitters.kt */
        /* renamed from: pt.pingodoce.app.presentation.clubs.baby.d$g$a */
        /* loaded from: classes2.dex */
        public static final class C8998a<T> implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ InterfaceC6787d f23732w;

            /* compiled from: Emitters.kt */
            @InterfaceC6759f(m20197c = "pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeViewModel$special$$inlined$map$1$2", m20196f = "BabyClubHomeViewModel.kt", m20195l = {224}, m20194m = "emit")
            /* renamed from: pt.pingodoce.app.presentation.clubs.baby.d$g$a$a */
            /* loaded from: classes2.dex */
            public static final class C8999a extends AbstractC6757d {

                /* renamed from: w */
                /* synthetic */ Object f23733w;

                /* renamed from: x */
                int f23734x;

                public C8999a(InterfaceC1886d interfaceC1886d) {
                    super(interfaceC1886d);
                }

                public final Object invokeSuspend(Object obj) {
                    this.f23733w = obj;
                    this.f23734x |= Integer.MIN_VALUE;
                    return C8998a.this.mo4529a(null, this);
                }
            }

            public C8998a(InterfaceC6787d interfaceC6787d) {
                this.f23732w = interfaceC6787d;
            }

            /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
            /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
            /* renamed from: a */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object mo4529a(java.lang.Object r7, bd.InterfaceC1886d r8) {
                /*
                    r6 = this;
                    boolean r0 = r8 instanceof pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeViewModel.C8997g.C8998a.C8999a
                    if (r0 == 0) goto L13
                    r0 = r8
                    pt.pingodoce.app.presentation.clubs.baby.d$g$a$a r0 = (pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeViewModel.C8997g.C8998a.C8999a) r0
                    int r1 = r0.f23734x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f23734x = r1
                    goto L18
                L13:
                    pt.pingodoce.app.presentation.clubs.baby.d$g$a$a r0 = new pt.pingodoce.app.presentation.clubs.baby.d$g$a$a
                    r0.<init>(r8)
                L18:
                    java.lang.Object r8 = r0.f23733w
                    java.lang.Object r1 = cd.C2111b.m34640d()
                    int r2 = r0.f23734x
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    p468yc.C13186n.m1453b(r8)
                    goto L5f
                L29:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r8)
                    throw r7
                L31:
                    p468yc.C13186n.m1453b(r8)
                    kotlinx.coroutines.flow.d r8 = r6.f23732w
                    java.util.List r7 = (java.util.List) r7
                    java.util.Iterator r7 = r7.iterator()
                L3c:
                    boolean r2 = r7.hasNext()
                    if (r2 == 0) goto L62
                    java.lang.Object r2 = r7.next()
                    r4 = r2
                    pt.pingodoce.app.data.local.models.clubs.Club r4 = (pt.pingodoce.app.data.local.models.clubs.Club) r4
                    pt.pingodoce.app.data.local.models.clubs.a r4 = r4.m14653d()
                    pt.pingodoce.app.data.local.models.clubs.a r5 = pt.pingodoce.app.data.local.models.clubs.EnumC8691a.Baby
                    if (r4 != r5) goto L53
                    r4 = r3
                    goto L54
                L53:
                    r4 = 0
                L54:
                    if (r4 == 0) goto L3c
                    r0.f23734x = r3
                    java.lang.Object r7 = r8.mo4529a(r2, r0)
                    if (r7 != r1) goto L5f
                    return r1
                L5f:
                    yc.u r7 = p468yc.C13195u.f34156a
                    return r7
                L62:
                    java.util.NoSuchElementException r7 = new java.util.NoSuchElementException
                    java.lang.String r8 = "Collection contains no element matching the predicate."
                    r7.<init>(r8)
                    throw r7
                */
                throw new UnsupportedOperationException("Method not decompiled: pt.pingodoce.app.presentation.clubs.baby.BabyClubHomeViewModel.C8997g.C8998a.mo4529a(java.lang.Object, bd.d):java.lang.Object");
            }
        }

        public C8997g(InterfaceC6785c interfaceC6785c) {
            this.f23731w = interfaceC6785c;
        }

        /* renamed from: d */
        public Object mo20086d(InterfaceC6787d interfaceC6787d, InterfaceC1886d interfaceC1886d) {
            Object m34636d;
            Object mo20086d = this.f23731w.mo20086d(new C8998a(interfaceC6787d), interfaceC1886d);
            m34636d = C2116d.m34636d();
            return mo20086d == m34636d ? mo20086d : C13195u.f34156a;
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.d$h */
    /* loaded from: classes2.dex */
    public static final class C9000h<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return ((Club) obj).m14645n();
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.d$i */
    /* loaded from: classes2.dex */
    public static final class C9001i<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            return Boolean.valueOf(((Club) obj).m14640w());
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.d$j */
    /* loaded from: classes2.dex */
    public static final class C9002j<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            List m197g;
            List m14625a = ((Club) obj).m14651f().m14625a();
            if (m14625a == null) {
                m197g = C13780s.m197g();
                return m197g;
            }
            return m14625a;
        }
    }

    /* compiled from: Transformations.kt */
    /* renamed from: pt.pingodoce.app.presentation.clubs.baby.d$k */
    /* loaded from: classes2.dex */
    public static final class C9003k<I, O> implements InterfaceC7946a {
        /* renamed from: a */
        public final Object mo37540b(Object obj) {
            Club club = (Club) obj;
            boolean z = false;
            if (club.m14640w()) {
                List m14625a = club.m14651f().m14625a();
                if ((m14625a != null ? m14625a.size() : 0) < 3) {
                    z = true;
                }
            }
            return Boolean.valueOf(z);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BabyClubHomeViewModel(C1459l0 c1459l0, ResourcesProvider resourcesProvider, ClubManager clubManager, AnalyticsManager analyticsManager) {
        super(c1459l0, resourcesProvider, clubManager, analyticsManager);
        Intrinsics.isThisObjectNull(c1459l0, "stateHandle");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        Intrinsics.isThisObjectNull(clubManager, "clubManager");
        Intrinsics.isThisObjectNull(analyticsManager, "analyticsManager");
        this.f23707v = clubManager;
        this.f23708w = analyticsManager;
        LiveData m106t = m106t(new C8997g(new C8994f(clubManager.m18645i())));
        this.f23709x = m106t;
        LiveData m36993a = C1465n0.m36993a(m106t, new C9000h());
        Intrinsics.checkIfNull(m36993a, "Transformations.map(this) { transform(it) }");
        this.f23710y = m36993a;
        LiveData m36993a2 = C1465n0.m36993a(m106t, new C9001i());
        Intrinsics.checkIfNull(m36993a2, "Transformations.map(this) { transform(it) }");
        this.f23711z = m36993a2;
        LiveData m36993a3 = C1465n0.m36993a(m106t, new C9002j());
        Intrinsics.checkIfNull(m36993a3, "Transformations.map(this) { transform(it) }");
        this.f23704A = m36993a3;
        LiveData m36993a4 = C1465n0.m36993a(m106t, new C9003k());
        Intrinsics.checkIfNull(m36993a4, "Transformations.map(this) { transform(it) }");
        this.f23705B = m36993a4;
        this.f23706C = BaseViewModel.m113I(this, 0L, new C8989c(), 1, null);
    }

    /* renamed from: a0 */
    public static /* synthetic */ void m12906a0(BabyClubHomeViewModel babyClubHomeViewModel, View view) {
        m12897j0(babyClubHomeViewModel, view);
    }

    /* renamed from: b0 */
    public static final /* synthetic */ ClubManager m12905b0(BabyClubHomeViewModel babyClubHomeViewModel) {
        return babyClubHomeViewModel.f23707v;
    }

    /* renamed from: c0 */
    public static final /* synthetic */ void m12904c0(BabyClubHomeViewModel babyClubHomeViewModel, Throwable th2) {
        babyClubHomeViewModel.m109l(th2);
    }

    /* renamed from: d0 */
    public static final /* synthetic */ Object m12903d0(BabyClubHomeViewModel babyClubHomeViewModel, boolean z, InterfaceC6108l interfaceC6108l, InterfaceC1886d interfaceC1886d) {
        return babyClubHomeViewModel.m20384m(z, interfaceC6108l, interfaceC1886d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j0 */
    public static final void m12897j0(BabyClubHomeViewModel babyClubHomeViewModel, View view) {
        Intrinsics.isThisObjectNull(babyClubHomeViewModel, "this$0");
        if (Intrinsics.equals(babyClubHomeViewModel.f23711z.mo172f(), Boolean.TRUE)) {
            InterfaceC7886d.C7887a.m17629a(babyClubHomeViewModel.f23708w, AnalyticEvents.AbstractC7709b.C7710a.f20336b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
        } else {
            InterfaceC7886d.C7887a.m17629a(babyClubHomeViewModel.f23708w, AnalyticEvents.AbstractC7709b.C7714d.f20340b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
        }
        babyClubHomeViewModel.f23706C.mo9587d(C13195u.f34156a);
    }

    /* renamed from: e0 */
    public final LiveData m12902e0() {
        return this.f23704A;
    }

    /* renamed from: f0 */
    public final LiveData m12901f0() {
        return this.f23710y;
    }

    /* renamed from: g0 */
    public final LiveData m12900g0() {
        return this.f23705B;
    }

    /* renamed from: h0 */
    public final LiveData m12899h0() {
        return this.f23711z;
    }

    /* renamed from: i0 */
    public final View.OnClickListener m12898i0() {
        return new View.OnClickListener() { // from class: ii.h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BabyClubHomeViewModel.m12897j0(BabyClubHomeViewModel.this, view);
            }
        };
    }

    /* renamed from: k0 */
    public final void m12896k0() {
        InterfaceC7886d.C7887a.m17629a(this.f23708w, AnalyticEvents.AbstractC7709b.C7713c.f20339b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
    }

    /* renamed from: l0 */
    public final void m12895l0() {
        InterfaceC7886d.C7887a.m17629a(this.f23708w, AnalyticEvents.AbstractC7709b.C7728r.f20354b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
    }

    /* renamed from: m0 */
    public final void m12894m0() {
        InterfaceC7886d.C7887a.m17629a(this.f23708w, AnalyticEvents.AbstractC7709b.C7727q.f20353b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
    }

    /* renamed from: n0 */
    public final void m12893n0() {
        InterfaceC7886d.C7887a.m17629a(this.f23708w, AnalyticEvents.AbstractC7709b.C7726p.f20352b, EnumC7885c.Screen, EnumC7884b.View, null, 8, null);
    }

    /* renamed from: o0 */
    public final void m12892o0() {
        InterfaceC7886d.C7887a.m17629a(this.f23708w, AnalyticEvents.AbstractC7709b.C7735y.f20361b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
    }

    /* renamed from: p0 */
    public final void m12891p0() {
        InterfaceC7886d.C7887a.m17629a(this.f23708w, AnalyticEvents.AbstractC7709b.C7734x.f20360b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
    }

    /* renamed from: q0 */
    public final void m12890q0() {
        InterfaceC7886d.C7887a.m17629a(this.f23708w, AnalyticEvents.AbstractC7709b.C7736z.f20362b, EnumC7885c.Button, EnumC7884b.Click, null, 8, null);
    }

    /* renamed from: r0 */
    public final void m12889r0(String str) {
        EnumC8987a enumC8987a;
        Object obj;
        Club club;
        List m453p0;
        Object obj2;
        boolean z;
        Intrinsics.isThisObjectNull(str, "babyIdNumber");
        List list = (List) this.f23704A.mo172f();
        if (list != null && list.size() == 1) {
            enumC8987a = EnumC8987a.REMOVE;
        } else {
            enumC8987a = EnumC8987a.EDIT;
        }
        Iterator it = this.f23707v.m18644j().iterator();
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
        Club club2 = (Club) obj;
        if (club2 != null) {
            List m14625a = club2.m14651f().m14625a();
            Intrinsics.ifNullDoSomething(m14625a);
            m453p0 = _Collections.m453p0(m14625a);
            Iterator it2 = m453p0.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (Intrinsics.equals(((ClubBaby) obj2).m14632d(), str)) {
                    break;
                }
            }
            ClubBaby clubBaby = (ClubBaby) obj2;
            if (clubBaby != null) {
                m453p0.remove(clubBaby);
            }
            club = Club.m14655b(club2, null, null, null, null, null, null, null, null, null, null, null, null, !m453p0.isEmpty(), null, new ClubData(m453p0, null, null, null, 14, null), club2.m14644r(), 12287, null);
        } else {
            club = null;
        }
        if (club != null) {
            int i = C8988b.f23712a[enumC8987a.ordinal()];
            if (i == 1) {
                C6772d.m20158d(C1473p0.m36987a(this), null, null, new C8990d(club, null), 3, null);
            } else if (i != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                C6772d.m20158d(C1473p0.m36987a(this), null, null, new C8992e(club, null), 3, null);
            }
        }
    }
}
