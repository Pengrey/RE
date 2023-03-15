package vg;

import af.ApiError;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.Intrinsics;
import p339rg.PolicyNotFoundException;
import p378u5.ResourcesProvider;
import p425we.ApiBaseException;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.local.models.clubs.Club;
import pt.pingodoce.app.data.remote.endpoints.ClubsApi;
import retrofit2.Retrofit;

/* renamed from: vg.i */
/* loaded from: classes2.dex */
public final class ClubService extends BaseService {

    /* renamed from: d */
    private final ClubsApi f28940d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClubService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.ClubService$clubSubscribedCodes$2", m20196f = "ClubService.kt", m20195l = {24}, m20194m = "invokeSuspend")
    /* renamed from: vg.i$a */
    /* loaded from: classes2.dex */
    public static final class C11291a extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28941x;

        C11291a(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11291a(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11291a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28941x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ClubsApi m5515l = ClubService.m5515l(ClubService.this);
                this.f28941x = 1;
                obj = m5515l.clubSubscribedCodes(this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClubService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.ClubService", m20196f = "ClubService.kt", m20195l = {20}, m20194m = "clubs")
    /* renamed from: vg.i$b */
    /* loaded from: classes2.dex */
    public static final class C11292b extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f28943w;

        /* renamed from: y */
        int f28945y;

        C11292b(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f28943w = obj;
            this.f28945y |= Integer.MIN_VALUE;
            return ClubService.this.m5513n(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClubService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.ClubService$clubs$2", m20196f = "ClubService.kt", m20195l = {20}, m20194m = "invokeSuspend")
    /* renamed from: vg.i$c */
    /* loaded from: classes2.dex */
    public static final class C11293c extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28946x;

        C11293c(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11293c(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11293c) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28946x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ClubsApi m5515l = ClubService.m5515l(ClubService.this);
                this.f28946x = 1;
                obj = m5515l.clubs(this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClubService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.ClubService$removeSubscription$2", m20196f = "ClubService.kt", m20195l = {36}, m20194m = "invokeSuspend")
    /* renamed from: vg.i$d */
    /* loaded from: classes2.dex */
    public static final class C11294d extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28948x;

        /* renamed from: z */
        final /* synthetic */ String f28950z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11294d(String str, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28950z = str;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11294d(this.f28950z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11294d) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28948x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ClubsApi m5515l = ClubService.m5515l(ClubService.this);
                String str = this.f28950z;
                this.f28948x = 1;
                obj = m5515l.deleteSubscription(str, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClubService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.ClubService$subscribe$2", m20196f = "ClubService.kt", m20195l = {28}, m20194m = "invokeSuspend")
    /* renamed from: vg.i$e */
    /* loaded from: classes2.dex */
    public static final class C11295e extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28951x;

        /* renamed from: z */
        final /* synthetic */ Club f28953z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11295e(Club club, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28953z = club;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11295e(this.f28953z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11295e) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28951x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ClubsApi m5515l = ClubService.m5515l(ClubService.this);
                String m14646m = this.f28953z.m14646m();
                Club club = this.f28953z;
                this.f28951x = 1;
                obj = m5515l.addSubscription(m14646m, club, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ClubService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.ClubService$updateSubscription$2", m20196f = "ClubService.kt", m20195l = {32}, m20194m = "invokeSuspend")
    /* renamed from: vg.i$f */
    /* loaded from: classes2.dex */
    public static final class C11296f extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28954x;

        /* renamed from: z */
        final /* synthetic */ Club f28956z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11296f(Club club, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28956z = club;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11296f(this.f28956z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11296f) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28954x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ClubsApi m5515l = ClubService.m5515l(ClubService.this);
                String m14646m = this.f28956z.m14646m();
                Club club = this.f28956z;
                this.f28954x = 1;
                obj = m5515l.updateSubscription(m14646m, club, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ClubService(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        super(resourcesProvider);
        Intrinsics.isThisObjectNull(retrofit, "retrofit");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        this.f28940d = (ClubsApi) retrofit.create(ClubsApi.class);
    }

    /* renamed from: l */
    public static final /* synthetic */ ClubsApi m5515l(ClubService clubService) {
        return clubService.f28940d;
    }

    /* renamed from: k */
    protected ApiBaseException m5516k(String str, int i) {
        Intrinsics.isThisObjectNull(str, "message");
        if (i == 5002) {
            return new PolicyNotFoundException(new ApiError(str));
        }
        return super.m5556k(str, i);
    }

    /* renamed from: m */
    public final Object m5514m(InterfaceC1886d interfaceC1886d) {
        return m26603b(new C11291a(null), interfaceC1886d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m5513n(bd.InterfaceC1886d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof vg.ClubService.C11292b
            if (r0 == 0) goto L13
            r0 = r5
            vg.i$b r0 = (vg.ClubService.C11292b) r0
            int r1 = r0.f28945y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f28945y = r1
            goto L18
        L13:
            vg.i$b r0 = new vg.i$b
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f28943w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f28945y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r5)
            goto L43
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r5)
            vg.i$c r5 = new vg.i$c
            r2 = 0
            r5.<init>(r2)
            r0.f28945y = r3
            java.lang.Object r5 = r4.m26603b(r5, r0)
            if (r5 != r1) goto L43
            return r1
        L43:
            pt.pingodoce.app.data.remote.models.response.ClubListResponse r5 = (pt.pingodoce.app.data.remote.models.response.ClubListResponse) r5
            java.util.List r5 = r5.m13873a()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: vg.ClubService.m5513n(bd.d):java.lang.Object");
    }

    /* renamed from: o */
    public final Object m5512o(String str, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m26603b = m26603b(new C11294d(str, null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m26603b == m34636d ? m26603b : C13195u.f34156a;
    }

    /* renamed from: p */
    public final Object m5511p(Club club, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m26603b = m26603b(new C11295e(club, null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m26603b == m34636d ? m26603b : C13195u.f34156a;
    }

    /* renamed from: q */
    public final Object m5510q(Club club, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m26603b = m26603b(new C11296f(club, null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m26603b == m34636d ? m26603b : C13195u.f34156a;
    }
}
