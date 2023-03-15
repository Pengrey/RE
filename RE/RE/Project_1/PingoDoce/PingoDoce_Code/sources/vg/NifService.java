package vg;

import af.ApiError;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.Intrinsics;
import p339rg.UserEmailAlreadyExistsException;
import p378u5.ResourcesProvider;
import p425we.ApiBaseException;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.endpoints.NifApi;
import pt.pingodoce.app.data.remote.models.request.NifRequest;
import retrofit2.Retrofit;

/* renamed from: vg.s */
/* loaded from: classes2.dex */
public final class NifService extends BaseService {

    /* renamed from: d */
    private final NifApi f29077d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: NifService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.NifService$validateNif$2", m20196f = "NifService.kt", m20195l = {21}, m20194m = "invokeSuspend")
    /* renamed from: vg.s$a */
    /* loaded from: classes2.dex */
    public static final class C11338a extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29078x;

        /* renamed from: z */
        final /* synthetic */ NifRequest f29080z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11338a(NifRequest nifRequest, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f29080z = nifRequest;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11338a(this.f29080z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11338a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29078x;
            if (i == 0) {
                C13186n.m1453b(obj);
                NifApi m5403l = NifService.m5403l(NifService.this);
                NifRequest nifRequest = this.f29080z;
                this.f29078x = 1;
                obj = m5403l.validateNif(nifRequest, this);
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
    public NifService(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        super(resourcesProvider);
        Intrinsics.isThisObjectNull(retrofit, "retrofit");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        this.f29077d = (NifApi) retrofit.create(NifApi.class);
    }

    /* renamed from: l */
    public static final /* synthetic */ NifApi m5403l(NifService nifService) {
        return nifService.f29077d;
    }

    /* renamed from: k */
    protected ApiBaseException m5404k(String str, int i) {
        Intrinsics.isThisObjectNull(str, "message");
        if (i == 5016) {
            return new UserEmailAlreadyExistsException(new ApiError(str));
        }
        return super.m5556k(str, i);
    }

    /* renamed from: m */
    public final Object m5402m(NifRequest nifRequest, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11338a(nifRequest, null), interfaceC1886d);
    }
}
