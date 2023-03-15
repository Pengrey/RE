package vg;

import af.ApiError;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import p181jd.Intrinsics;
import p339rg.UserNotFoundException;
import p378u5.ResourcesProvider;
import p425we.ApiBaseException;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.endpoints.DeviceApi;
import pt.pingodoce.app.data.remote.models.request.DeviceTokenRequest;
import retrofit2.Retrofit;
import ve.NoAccessException;

/* renamed from: vg.m */
/* loaded from: classes2.dex */
public final class DeviceService extends BaseService {

    /* renamed from: d */
    private final DeviceApi f29026d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DeviceService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.DeviceService$sendDeviceToken$2", m20196f = "DeviceService.kt", m20195l = {22}, m20194m = "invokeSuspend")
    /* renamed from: vg.m$a */
    /* loaded from: classes2.dex */
    public static final class C11320a extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29027x;

        /* renamed from: z */
        final /* synthetic */ DeviceTokenRequest f29029z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11320a(DeviceTokenRequest deviceTokenRequest, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f29029z = deviceTokenRequest;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11320a(this.f29029z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11320a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29027x;
            if (i == 0) {
                C13186n.m1453b(obj);
                DeviceApi m5448l = DeviceService.m5448l(DeviceService.this);
                DeviceTokenRequest deviceTokenRequest = this.f29029z;
                this.f29027x = 1;
                obj = m5448l.sendDeviceToken(deviceTokenRequest, this);
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
    public DeviceService(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        super(resourcesProvider);
        Intrinsics.isThisObjectNull(retrofit, "retrofit");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        this.f29026d = (DeviceApi) retrofit.create(DeviceApi.class);
    }

    /* renamed from: l */
    public static final /* synthetic */ DeviceApi m5448l(DeviceService deviceService) {
        return deviceService.f29026d;
    }

    /* renamed from: k */
    protected ApiBaseException m5449k(String str, int i) {
        ApiBaseException noAccessException;
        Intrinsics.isThisObjectNull(str, "message");
        if (i == 2000) {
            noAccessException = new NoAccessException(new ApiError(str));
        } else if (i != 5000) {
            return super.m5556k(str, i);
        } else {
            noAccessException = new UserNotFoundException(new ApiError(str));
        }
        return noAccessException;
    }

    /* renamed from: m */
    public final Object m5447m(DeviceTokenRequest deviceTokenRequest, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11320a(deviceTokenRequest, null), interfaceC1886d);
    }
}
