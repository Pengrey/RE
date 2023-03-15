package vg;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.endpoints.BannerApi;
import retrofit2.Retrofit;

/* renamed from: vg.c */
/* loaded from: classes2.dex */
public final class BannerService extends BaseService {

    /* renamed from: d */
    private final BannerApi f28848d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: BannerService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.BannerService$dismiss$2", m20196f = "BannerService.kt", m20195l = {22}, m20194m = "invokeSuspend")
    /* renamed from: vg.c$a */
    /* loaded from: classes2.dex */
    public static final class C11260a extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28849x;

        /* renamed from: z */
        final /* synthetic */ int f28851z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11260a(int i, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28851z = i;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11260a(this.f28851z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11260a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28849x;
            if (i == 0) {
                C13186n.m1453b(obj);
                BannerApi m5593l = BannerService.m5593l(BannerService.this);
                int i2 = this.f28851z;
                this.f28849x = 1;
                obj = m5593l.dismiss(i2, this);
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
    /* compiled from: BannerService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.BannerService$getBannerList$2", m20196f = "BannerService.kt", m20195l = {18}, m20194m = "invokeSuspend")
    /* renamed from: vg.c$b */
    /* loaded from: classes2.dex */
    public static final class C11261b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28852x;

        /* renamed from: z */
        final /* synthetic */ int f28854z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11261b(int i, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28854z = i;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11261b(this.f28854z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11261b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28852x;
            if (i == 0) {
                C13186n.m1453b(obj);
                BannerApi m5593l = BannerService.m5593l(BannerService.this);
                int i2 = this.f28854z;
                this.f28852x = 1;
                obj = m5593l.getBanners(i2, this);
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
    public BannerService(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        super(resourcesProvider);
        Intrinsics.isThisObjectNull(retrofit, "retrofit");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        this.f28848d = (BannerApi) retrofit.create(BannerApi.class);
    }

    /* renamed from: l */
    public static final /* synthetic */ BannerApi m5593l(BannerService bannerService) {
        return bannerService.f28848d;
    }

    /* renamed from: m */
    public final Object m5592m(int i, InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m26603b = m26603b(new C11260a(i, null), interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m26603b == m34636d ? m26603b : C13195u.f34156a;
    }

    /* renamed from: n */
    public final Object m5591n(int i, InterfaceC1886d interfaceC1886d) {
        return m26603b(new C11261b(i, null), interfaceC1886d);
    }
}
