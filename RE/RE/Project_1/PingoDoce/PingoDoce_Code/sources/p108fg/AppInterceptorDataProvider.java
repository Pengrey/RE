package p108fg;

import bd.InterfaceC1886d;
import cd.C2116d;
import com.github.aachartmodel.aainfographics.BuildConfig;
import gg.C5655e;
import gg.C5664k;
import gg.C5670o;
import gg.C5682w;
import id.InterfaceC6112p;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6770c;
import module.network.data.remote.models.user.User;
import p181jd.Intrinsics;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc.C13780s;
import p489zc._Collections;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;
import pt.pingodoce.app.data.remote.models.response.Store;
import se.OAuthSharedPrefs;
import td.InterfaceC10524i0;

/* renamed from: fg.a */
/* loaded from: classes2.dex */
public final class AppInterceptorDataProvider {

    /* renamed from: a */
    private final OAuthSharedPrefs f15649a;

    /* renamed from: b */
    private final C5664k f15650b;

    /* renamed from: c */
    private final C5670o f15651c;

    /* renamed from: d */
    private final C5655e f15652d;

    /* renamed from: e */
    private final C5682w f15653e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppInterceptorDataProvider.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.local.AppInterceptorDataProvider$clubCodes$1", m20196f = "AppInterceptorDataProvider.kt", m20195l = {31}, m20194m = "invokeSuspend")
    /* renamed from: fg.a$a */
    /* loaded from: classes2.dex */
    public static final class C5512a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f15654x;

        C5512a(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C5512a(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C5512a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            String m474U;
            m34636d = C2116d.m34636d();
            int i = this.f15654x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C5655e m23816a = AppInterceptorDataProvider.m23816a(AppInterceptorDataProvider.this);
                this.f15654x = 1;
                obj = m23816a.mo22688c(this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            List list = (List) obj;
            if (list == null) {
                list = C13780s.m197g();
            }
            m474U = _Collections.m474U(list, null, null, null, 0, null, null, 63, null);
            return m474U;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppInterceptorDataProvider.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.local.AppInterceptorDataProvider$houseHoldId$1", m20196f = "AppInterceptorDataProvider.kt", m20195l = {38}, m20194m = "invokeSuspend")
    /* renamed from: fg.a$b */
    /* loaded from: classes2.dex */
    public static final class C5513b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f15656x;

        C5513b(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C5513b(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C5513b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            String m18183j;
            m34636d = C2116d.m34636d();
            int i = this.f15656x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C5682w m23813d = AppInterceptorDataProvider.m23813d(AppInterceptorDataProvider.this);
                this.f15656x = 1;
                obj = m23813d.mo22688c(this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            User user = (User) obj;
            return (user == null || (m18183j = user.m18183j()) == null) ? BuildConfig.VERSION_NAME : m18183j;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppInterceptorDataProvider.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.local.AppInterceptorDataProvider$loyaltyCardId$1", m20196f = "AppInterceptorDataProvider.kt", m20195l = {35}, m20194m = "invokeSuspend")
    /* renamed from: fg.a$c */
    /* loaded from: classes2.dex */
    public static final class C5514c extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f15658x;

        C5514c(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C5514c(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C5514c) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            String m18180n;
            m34636d = C2116d.m34636d();
            int i = this.f15658x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C5682w m23813d = AppInterceptorDataProvider.m23813d(AppInterceptorDataProvider.this);
                this.f15658x = 1;
                obj = m23813d.mo22688c(this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            User user = (User) obj;
            return (user == null || (m18180n = user.m18180n()) == null) ? BuildConfig.VERSION_NAME : m18180n;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppInterceptorDataProvider.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.local.AppInterceptorDataProvider$loyaltyCardNumber$1", m20196f = "AppInterceptorDataProvider.kt", m20195l = {27}, m20194m = "invokeSuspend")
    /* renamed from: fg.a$d */
    /* loaded from: classes2.dex */
    public static final class C5515d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f15660x;

        C5515d(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C5515d(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C5515d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            String m13799m;
            m34636d = C2116d.m34636d();
            int i = this.f15660x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C5670o m23815b = AppInterceptorDataProvider.m23815b(AppInterceptorDataProvider.this);
                this.f15660x = 1;
                obj = m23815b.mo22688c(this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            LoyaltyCard loyaltyCard = (LoyaltyCard) obj;
            return (loyaltyCard == null || (m13799m = loyaltyCard.m13799m()) == null) ? BuildConfig.VERSION_NAME : m13799m;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: AppInterceptorDataProvider.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.local.AppInterceptorDataProvider$storeId$1", m20196f = "AppInterceptorDataProvider.kt", m20195l = {24}, m20194m = "invokeSuspend")
    /* renamed from: fg.a$e */
    /* loaded from: classes2.dex */
    public static final class C5516e extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f15662x;

        C5516e(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C5516e(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C5516e) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            String num;
            m34636d = C2116d.m34636d();
            int i = this.f15662x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C5664k m23814c = AppInterceptorDataProvider.m23814c(AppInterceptorDataProvider.this);
                this.f15662x = 1;
                obj = m23814c.mo22688c(this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            Store store = (Store) obj;
            return (store == null || (num = C6755b.m20199c(store.m13711f()).toString()) == null) ? "-1" : num;
        }
    }

    public AppInterceptorDataProvider(OAuthSharedPrefs oAuthSharedPrefs, C5664k c5664k, C5670o c5670o, C5655e c5655e, C5682w c5682w) {
        Intrinsics.isThisObjectNull(oAuthSharedPrefs, "oAuthSharedPrefs");
        Intrinsics.isThisObjectNull(c5664k, "storeLocalDataProvider");
        Intrinsics.isThisObjectNull(c5670o, "loyaltyCardLocalDataProvider");
        Intrinsics.isThisObjectNull(c5655e, "clubsCodesLocalDataProvider");
        Intrinsics.isThisObjectNull(c5682w, "userProfileLocalDataProvider");
        this.f15649a = oAuthSharedPrefs;
        this.f15650b = c5664k;
        this.f15651c = c5670o;
        this.f15652d = c5655e;
        this.f15653e = c5682w;
    }

    /* renamed from: a */
    public static final /* synthetic */ C5655e m23816a(AppInterceptorDataProvider appInterceptorDataProvider) {
        return appInterceptorDataProvider.f15652d;
    }

    /* renamed from: b */
    public static final /* synthetic */ C5670o m23815b(AppInterceptorDataProvider appInterceptorDataProvider) {
        return appInterceptorDataProvider.f15651c;
    }

    /* renamed from: c */
    public static final /* synthetic */ C5664k m23814c(AppInterceptorDataProvider appInterceptorDataProvider) {
        return appInterceptorDataProvider.f15650b;
    }

    /* renamed from: d */
    public static final /* synthetic */ C5682w m23813d(AppInterceptorDataProvider appInterceptorDataProvider) {
        return appInterceptorDataProvider.f15653e;
    }

    /* renamed from: e */
    public final String m23812e() {
        Object m20162b;
        m20162b = C6770c.m20162b(null, new C5512a(null), 1, null);
        return (String) m20162b;
    }

    /* renamed from: f */
    public final String m23811f() {
        Object m20162b;
        m20162b = C6770c.m20162b(null, new C5513b(null), 1, null);
        return (String) m20162b;
    }

    /* renamed from: g */
    public final String m23810g() {
        Object m20162b;
        m20162b = C6770c.m20162b(null, new C5514c(null), 1, null);
        return (String) m20162b;
    }

    /* renamed from: h */
    public final String m23809h() {
        Object m20162b;
        m20162b = C6770c.m20162b(null, new C5515d(null), 1, null);
        return (String) m20162b;
    }

    /* renamed from: i */
    public final String m23808i() {
        Object m20162b;
        m20162b = C6770c.m20162b(null, new C5516e(null), 1, null);
        return (String) m20162b;
    }

    /* renamed from: j */
    public final boolean m23807j() {
        return Intrinsics.equals(this.f15649a.m8860e(), Boolean.TRUE);
    }
}
