package vg;

import android.graphics.Bitmap;
import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6108l;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import module.network.data.remote.models.user.User;
import p107ff.MediaType;
import p107ff.MultipartBody;
import p107ff.RequestBody;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p468yc.C13186n;
import p468yc.C13195u;
import pt.pingodoce.app.data.remote.endpoints.UserApi;
import pt.pingodoce.app.data.remote.models.request.AppNotifications;
import pt.pingodoce.app.data.remote.models.request.DeleteAccountRequest;
import pt.pingodoce.app.data.remote.models.request.MadeForYou;
import retrofit2.Retrofit;

/* renamed from: vg.k0 */
/* loaded from: classes2.dex */
public final class UserService extends BaseService {

    /* renamed from: d */
    private final UserApi f28996d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.UserService$deleteAccount$2", m20196f = "UserService.kt", m20195l = {73}, m20194m = "invokeSuspend")
    /* renamed from: vg.k0$a */
    /* loaded from: classes2.dex */
    public static final class C11309a extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f28997x;

        /* renamed from: z */
        final /* synthetic */ String f28999z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11309a(String str, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f28999z = str;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11309a(this.f28999z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11309a) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28997x;
            if (i == 0) {
                C13186n.m1453b(obj);
                UserApi m5475l = UserService.m5475l(UserService.this);
                DeleteAccountRequest deleteAccountRequest = new DeleteAccountRequest(this.f28999z);
                this.f28997x = 1;
                obj = m5475l.deleteUser(deleteAccountRequest, this);
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
    /* compiled from: UserService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.UserService$deletePhoto$2", m20196f = "UserService.kt", m20195l = {69}, m20194m = "invokeSuspend")
    /* renamed from: vg.k0$b */
    /* loaded from: classes2.dex */
    public static final class C11310b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29000x;

        C11310b(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11310b(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11310b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29000x;
            if (i == 0) {
                C13186n.m1453b(obj);
                UserApi m5475l = UserService.m5475l(UserService.this);
                this.f29000x = 1;
                obj = m5475l.deletePhoto(this);
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
    /* compiled from: UserService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.UserService$getAppNotifications$2", m20196f = "UserService.kt", m20195l = {40}, m20194m = "invokeSuspend")
    /* renamed from: vg.k0$c */
    /* loaded from: classes2.dex */
    public static final class C11311c extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29002x;

        C11311c(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11311c(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11311c) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29002x;
            if (i == 0) {
                C13186n.m1453b(obj);
                UserApi m5475l = UserService.m5475l(UserService.this);
                this.f29002x = 1;
                obj = m5475l.getAppNotifications(this);
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
    /* compiled from: UserService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.UserService$getMadeForYou$2", m20196f = "UserService.kt", m20195l = {32}, m20194m = "invokeSuspend")
    /* renamed from: vg.k0$d */
    /* loaded from: classes2.dex */
    public static final class C11312d extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29004x;

        C11312d(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11312d(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11312d) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29004x;
            if (i == 0) {
                C13186n.m1453b(obj);
                UserApi m5475l = UserService.m5475l(UserService.this);
                this.f29004x = 1;
                obj = m5475l.getMadeForYou(this);
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
    /* compiled from: UserService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.UserService$getProfile$2", m20196f = "UserService.kt", m20195l = {44}, m20194m = "invokeSuspend")
    /* renamed from: vg.k0$e */
    /* loaded from: classes2.dex */
    public static final class C11313e extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29006x;

        C11313e(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11313e(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11313e) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29006x;
            if (i == 0) {
                C13186n.m1453b(obj);
                UserApi m5475l = UserService.m5475l(UserService.this);
                this.f29006x = 1;
                obj = m5475l.getProfile(this);
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
    /* compiled from: UserService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.UserService$updateAppNotifications$2", m20196f = "UserService.kt", m20195l = {36}, m20194m = "invokeSuspend")
    /* renamed from: vg.k0$f */
    /* loaded from: classes2.dex */
    public static final class C11314f extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29008x;

        /* renamed from: z */
        final /* synthetic */ AppNotifications f29010z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11314f(AppNotifications appNotifications, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f29010z = appNotifications;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11314f(this.f29010z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11314f) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29008x;
            if (i == 0) {
                C13186n.m1453b(obj);
                UserApi m5475l = UserService.m5475l(UserService.this);
                AppNotifications appNotifications = this.f29010z;
                this.f29008x = 1;
                obj = m5475l.updateAppNotifications(appNotifications, this);
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
    /* compiled from: UserService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.UserService$updateMadeForYou$2", m20196f = "UserService.kt", m20195l = {28}, m20194m = "invokeSuspend")
    /* renamed from: vg.k0$g */
    /* loaded from: classes2.dex */
    public static final class C11315g extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29011x;

        /* renamed from: z */
        final /* synthetic */ MadeForYou f29013z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11315g(MadeForYou madeForYou, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f29013z = madeForYou;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11315g(this.f29013z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11315g) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29011x;
            if (i == 0) {
                C13186n.m1453b(obj);
                UserApi m5475l = UserService.m5475l(UserService.this);
                MadeForYou madeForYou = this.f29013z;
                this.f29011x = 1;
                obj = m5475l.updateMadeForYou(madeForYou, this);
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
    /* compiled from: UserService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.UserService$updateProfile$2", m20196f = "UserService.kt", m20195l = {48}, m20194m = "invokeSuspend")
    /* renamed from: vg.k0$h */
    /* loaded from: classes2.dex */
    public static final class C11316h extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29014x;

        /* renamed from: z */
        final /* synthetic */ User f29016z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11316h(User user, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f29016z = user;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11316h(this.f29016z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11316h) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29014x;
            if (i == 0) {
                C13186n.m1453b(obj);
                UserApi m5475l = UserService.m5475l(UserService.this);
                User user = this.f29016z;
                this.f29014x = 1;
                obj = m5475l.updateProfile(user, this);
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
    /* compiled from: UserService.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.remote.services.UserService$uploadPhoto$2", m20196f = "UserService.kt", m20195l = {54}, m20194m = "invokeSuspend")
    /* renamed from: vg.k0$i */
    /* loaded from: classes2.dex */
    public static final class C11317i extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f29017x;

        /* renamed from: z */
        final /* synthetic */ byte[] f29019z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C11317i(byte[] bArr, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f29019z = bArr;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C11317i(this.f29019z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C11317i) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f29017x;
            if (i == 0) {
                C13186n.m1453b(obj);
                UserApi m5475l = UserService.m5475l(UserService.this);
                MultipartBody.C5508c.C5509a c5509a = MultipartBody.C5508c.f15584c;
                long currentTimeMillis = System.currentTimeMillis();
                MultipartBody.C5508c m23897b = c5509a.m23897b("image", currentTimeMillis + ".jpg", RequestBody.Companion.m24236m(this.f29019z, MediaType.f15564d.m23908b("image/*jpg"), 0, this.f29019z.length));
                this.f29017x = 1;
                obj = m5475l.uploadPhoto(m23897b, this);
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
    public UserService(Retrofit retrofit, ResourcesProvider resourcesProvider) {
        super(resourcesProvider);
        Intrinsics.isThisObjectNull(retrofit, "retrofit");
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
        this.f28996d = (UserApi) retrofit.create(UserApi.class);
    }

    /* renamed from: l */
    public static final /* synthetic */ UserApi m5475l(UserService userService) {
        return userService.f28996d;
    }

    /* renamed from: r */
    private final byte[] m5469r(Bitmap bitmap) {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = null;
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bitmap.compress(Bitmap.CompressFormat.JPEG, 70, byteArrayOutputStream);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkIfNull(byteArray, "{\n            baos = Byt…s.toByteArray()\n        }");
            try {
                byteArrayOutputStream.close();
            } catch (IOException unused) {
            }
            return byteArray;
        } catch (Throwable th3) {
            th = th3;
            byteArrayOutputStream2 = byteArrayOutputStream;
            if (byteArrayOutputStream2 != null) {
                try {
                    byteArrayOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    /* renamed from: m */
    public final Object m5474m(String str, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11309a(str, null), interfaceC1886d);
    }

    /* renamed from: n */
    public final Object m5473n(InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11310b(null), interfaceC1886d);
    }

    /* renamed from: o */
    public final Object m5472o(InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11311c(null), interfaceC1886d);
    }

    /* renamed from: p */
    public final Object m5471p(InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11312d(null), interfaceC1886d);
    }

    /* renamed from: q */
    public final Object m5470q(InterfaceC1886d interfaceC1886d) {
        return m26603b(new C11313e(null), interfaceC1886d);
    }

    /* renamed from: s */
    public final Object m5468s(AppNotifications appNotifications, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11314f(appNotifications, null), interfaceC1886d);
    }

    /* renamed from: t */
    public final Object m5467t(MadeForYou madeForYou, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11315g(madeForYou, null), interfaceC1886d);
    }

    /* renamed from: u */
    public final Object m5466u(User user, InterfaceC1886d interfaceC1886d) {
        return m26602c(new C11316h(user, null), interfaceC1886d);
    }

    /* renamed from: v */
    public final Object m5465v(Bitmap bitmap, InterfaceC1886d interfaceC1886d) {
        return m26603b(new C11317i(m5469r(bitmap), null), interfaceC1886d);
    }
}
