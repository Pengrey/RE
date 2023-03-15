package mg;

import android.graphics.Bitmap;
import androidx.constraintlayout.widget.C0868i;
import bd.InterfaceC1886d;
import cd.C2116d;
import eg.NullableValueAgent;
import gg.C5682w;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.C6770c;
import kotlinx.coroutines.flow.C6788e;
import kotlinx.coroutines.flow.InterfaceC6785c;
import module.network.data.remote.models.user.User;
import org.joda.time.DateTimeConstants;
import p066dg.UserProfileAgent;
import p070e.C4906j;
import p181jd.Intrinsics;
import p276og.C8079b;
import p468yc.C13186n;
import p468yc.C13195u;
import td.InterfaceC10524i0;
import vg.UserService;

/* compiled from: UserManager.kt */
/* renamed from: mg.s1 */
/* loaded from: classes2.dex */
public final class C7405s1 {

    /* renamed from: a */
    private final UserService f19648a;

    /* renamed from: b */
    private final PrefsManager f19649b;

    /* renamed from: c */
    private final UserProfileAgent f19650c;

    /* renamed from: d */
    private final C5682w f19651d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.UserManager", m20196f = "UserManager.kt", m20195l = {DateTimeConstants.HOURS_PER_WEEK}, m20194m = "deleteAccount")
    /* renamed from: mg.s1$a */
    /* loaded from: classes2.dex */
    public static final class C7406a extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19652w;

        /* renamed from: y */
        int f19654y;

        C7406a(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19652w = obj;
            this.f19654y |= Integer.MIN_VALUE;
            return C7405s1.this.m18507c(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.UserManager$deletePicture$2", m20196f = "UserManager.kt", m20195l = {C4906j.f13420I0}, m20194m = "invokeSuspend")
    /* renamed from: mg.s1$b */
    /* loaded from: classes2.dex */
    public static final class C7407b extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19655x;

        C7407b(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7407b(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7407b) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19655x;
            if (i == 0) {
                C13186n.m1453b(obj);
                UserProfileAgent m18509a = C7405s1.m18509a(C7405s1.this);
                this.f19655x = 1;
                if (m18509a.m26576K(this) == m34636d) {
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
    /* compiled from: UserManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.UserManager$forceFetchUser$2", m20196f = "UserManager.kt", m20195l = {134}, m20194m = "invokeSuspend")
    /* renamed from: mg.s1$c */
    /* loaded from: classes2.dex */
    public static final class C7408c extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19657x;

        C7408c(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7408c(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7408c) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19657x;
            if (i == 0) {
                C13186n.m1453b(obj);
                UserProfileAgent m18509a = C7405s1.m18509a(C7405s1.this);
                this.f19657x = 1;
                if (m18509a.m25773B(false, this) == m34636d) {
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
    /* compiled from: UserManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.UserManager", m20196f = "UserManager.kt", m20195l = {91}, m20194m = "getAppMadeForYou")
    /* renamed from: mg.s1$d */
    /* loaded from: classes2.dex */
    public static final class C7409d extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19659w;

        /* renamed from: y */
        int f19661y;

        C7409d(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19659w = obj;
            this.f19661y |= Integer.MIN_VALUE;
            return C7405s1.this.m18504f(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.UserManager", m20196f = "UserManager.kt", m20195l = {83}, m20194m = "getAppNotifications")
    /* renamed from: mg.s1$e */
    /* loaded from: classes2.dex */
    public static final class C7410e extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19662w;

        /* renamed from: y */
        int f19664y;

        C7410e(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19662w = obj;
            this.f19664y |= Integer.MIN_VALUE;
            return C7405s1.this.m18503g(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.UserManager$getCachedProfile$1", m20196f = "UserManager.kt", m20195l = {34}, m20194m = "invokeSuspend")
    /* renamed from: mg.s1$f */
    /* loaded from: classes2.dex */
    public static final class C7411f extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f19665x;

        C7411f(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C7411f(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C7411f) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19665x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C5682w m18508b = C7405s1.m18508b(C7405s1.this);
                this.f19665x = 1;
                obj = m18508b.mo22688c(this);
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
    /* compiled from: UserManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.UserManager$getUser$2", m20196f = "UserManager.kt", m20195l = {130}, m20194m = "invokeSuspend")
    /* renamed from: mg.s1$g */
    /* loaded from: classes2.dex */
    public static final class C7412g extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19667x;

        C7412g(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7412g(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7412g) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19667x;
            if (i == 0) {
                C13186n.m1453b(obj);
                UserProfileAgent m18509a = C7405s1.m18509a(C7405s1.this);
                this.f19667x = 1;
                obj = m18509a.m25771D(this);
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
    /* compiled from: UserManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.UserManager$getUserId$1", m20196f = "UserManager.kt", m20195l = {140}, m20194m = "invokeSuspend")
    /* renamed from: mg.s1$h */
    /* loaded from: classes2.dex */
    public static final class C7413h extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f19669x;

        C7413h(InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C7413h(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C7413h) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19669x;
            if (i == 0) {
                C13186n.m1453b(obj);
                UserProfileAgent m18509a = C7405s1.m18509a(C7405s1.this);
                this.f19669x = 1;
                obj = m18509a.m25771D(this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            User user = (User) obj;
            if (user != null) {
                return user.m18174y();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.UserManager$invalidateCacheAndFetchUser$2", m20196f = "UserManager.kt", m20195l = {39, 40}, m20194m = "invokeSuspend")
    /* renamed from: mg.s1$i */
    /* loaded from: classes2.dex */
    public static final class C7414i extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19671x;

        C7414i(InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7414i(interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7414i) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19671x;
            if (i == 0) {
                C13186n.m1453b(obj);
                UserProfileAgent m18509a = C7405s1.m18509a(C7405s1.this);
                this.f19671x = 1;
                if (m18509a.m25801g(this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C13186n.m1453b(obj);
                return C13195u.f34156a;
            } else {
                C13186n.m1453b(obj);
            }
            UserProfileAgent m18509a2 = C7405s1.m18509a(C7405s1.this);
            this.f19671x = 2;
            if (NullableValueAgent.m25772C(m18509a2, false, this, 1, null) == m34636d) {
                return m34636d;
            }
            return C13195u.f34156a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.UserManager", m20196f = "UserManager.kt", m20195l = {64}, m20194m = "updateAppNotifications")
    /* renamed from: mg.s1$j */
    /* loaded from: classes2.dex */
    public static final class C7415j extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19673w;

        /* renamed from: y */
        int f19675y;

        C7415j(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19673w = obj;
            this.f19675y |= Integer.MIN_VALUE;
            return C7405s1.this.m18489u(false, false, false, false, false, false, false, false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.UserManager$updateBirthDate$2", m20196f = "UserManager.kt", m20195l = {C4906j.f13380A0}, m20194m = "invokeSuspend")
    /* renamed from: mg.s1$k */
    /* loaded from: classes2.dex */
    public static final class C7416k extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19676x;

        /* renamed from: z */
        final /* synthetic */ String f19678z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7416k(String str, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19678z = str;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7416k(this.f19678z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7416k) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19676x;
            if (i == 0) {
                C13186n.m1453b(obj);
                UserProfileAgent m18509a = C7405s1.m18509a(C7405s1.this);
                String str = this.f19678z;
                this.f19676x = 1;
                if (m18509a.m26566U(str, this) == m34636d) {
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
    /* compiled from: UserManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.UserManager$updateEmail$2", m20196f = "UserManager.kt", m20195l = {112}, m20194m = "invokeSuspend")
    /* renamed from: mg.s1$l */
    /* loaded from: classes2.dex */
    public static final class C7417l extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19679x;

        /* renamed from: z */
        final /* synthetic */ String f19681z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7417l(String str, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19681z = str;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7417l(this.f19681z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7417l) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19679x;
            if (i == 0) {
                C13186n.m1453b(obj);
                UserProfileAgent m18509a = C7405s1.m18509a(C7405s1.this);
                String str = this.f19681z;
                this.f19679x = 1;
                if (m18509a.m26565V(str, false, this) == m34636d) {
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
    /* compiled from: UserManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.UserManager", m20196f = "UserManager.kt", m20195l = {C0868i.f2738A0}, m20194m = "updateMadeForYou")
    /* renamed from: mg.s1$m */
    /* loaded from: classes2.dex */
    public static final class C7418m extends AbstractC6757d {

        /* renamed from: w */
        /* synthetic */ Object f19682w;

        /* renamed from: y */
        int f19684y;

        C7418m(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f19682w = obj;
            this.f19684y |= Integer.MIN_VALUE;
            return C7405s1.this.m18486x(false, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.UserManager$updateName$2", m20196f = "UserManager.kt", m20195l = {C0868i.f2773H0}, m20194m = "invokeSuspend")
    /* renamed from: mg.s1$n */
    /* loaded from: classes2.dex */
    public static final class C7419n extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: A */
        final /* synthetic */ String f19685A;

        /* renamed from: x */
        int f19686x;

        /* renamed from: z */
        final /* synthetic */ String f19688z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7419n(String str, String str2, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19688z = str;
            this.f19685A = str2;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7419n(this.f19688z, this.f19685A, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7419n) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19686x;
            if (i == 0) {
                C13186n.m1453b(obj);
                UserProfileAgent m18509a = C7405s1.m18509a(C7405s1.this);
                String str = this.f19688z;
                String str2 = this.f19685A;
                this.f19686x = 1;
                if (m18509a.m26564W(str, str2, this) == m34636d) {
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
    /* compiled from: UserManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.UserManager$updateNif$2", m20196f = "UserManager.kt", m20195l = {115}, m20194m = "invokeSuspend")
    /* renamed from: mg.s1$o */
    /* loaded from: classes2.dex */
    public static final class C7420o extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19689x;

        /* renamed from: z */
        final /* synthetic */ String f19691z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7420o(String str, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19691z = str;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7420o(this.f19691z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7420o) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19689x;
            if (i == 0) {
                C13186n.m1453b(obj);
                UserProfileAgent m18509a = C7405s1.m18509a(C7405s1.this);
                String str = this.f19691z;
                this.f19689x = 1;
                if (m18509a.m26563X(str, this) == m34636d) {
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
    /* compiled from: UserManager.kt */
    @InterfaceC6759f(m20197c = "pt.pingodoce.app.data.managers.UserManager$uploadPicture$2", m20196f = "UserManager.kt", m20195l = {C4906j.f13400E0}, m20194m = "invokeSuspend")
    /* renamed from: mg.s1$p */
    /* loaded from: classes2.dex */
    public static final class C7421p extends AbstractC6764l implements InterfaceC6108l {

        /* renamed from: x */
        int f19692x;

        /* renamed from: z */
        final /* synthetic */ Bitmap f19694z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C7421p(Bitmap bitmap, InterfaceC1886d interfaceC1886d) {
            super(1, interfaceC1886d);
            this.f19694z = bitmap;
        }

        public final InterfaceC1886d create(InterfaceC1886d interfaceC1886d) {
            return new C7421p(this.f19694z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo9587d(InterfaceC1886d interfaceC1886d) {
            return ((C7421p) create(interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f19692x;
            if (i == 0) {
                C13186n.m1453b(obj);
                UserProfileAgent m18509a = C7405s1.m18509a(C7405s1.this);
                Bitmap bitmap = this.f19694z;
                this.f19692x = 1;
                if (m18509a.m26562Y(bitmap, this) == m34636d) {
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

    public C7405s1(UserService userService, PrefsManager prefsManager, UserProfileAgent userProfileAgent, C5682w c5682w) {
        Intrinsics.isThisObjectNull(userService, "service");
        Intrinsics.isThisObjectNull(prefsManager, "prefsManager");
        Intrinsics.isThisObjectNull(userProfileAgent, "userProfileAgent");
        Intrinsics.isThisObjectNull(c5682w, "userProfileLocalDataProvider");
        this.f19648a = userService;
        this.f19649b = prefsManager;
        this.f19650c = userProfileAgent;
        this.f19651d = c5682w;
    }

    /* renamed from: a */
    public static final /* synthetic */ UserProfileAgent m18509a(C7405s1 c7405s1) {
        return c7405s1.f19650c;
    }

    /* renamed from: b */
    public static final /* synthetic */ C5682w m18508b(C7405s1 c7405s1) {
        return c7405s1.f19651d;
    }

    /* renamed from: A */
    public final Object m18510A(Bitmap bitmap, InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7421p(bitmap, null), interfaceC1886d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18507c(java.lang.String r5, bd.InterfaceC1886d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mg.C7405s1.C7406a
            if (r0 == 0) goto L13
            r0 = r6
            mg.s1$a r0 = (mg.C7405s1.C7406a) r0
            int r1 = r0.f19654y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19654y = r1
            goto L18
        L13:
            mg.s1$a r0 = new mg.s1$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19652w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19654y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r6)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r6)
            vg.k0 r6 = r4.f19648a
            r0.f19654y = r3
            java.lang.Object r6 = r6.m5474m(r5, r0)
            if (r6 != r1) goto L3f
            return r1
        L3f:
            df.d r6 = (p065df.NetworkResult) r6
            boolean r5 = r6 instanceof p065df.NetworkResult.C4792b
            if (r5 != 0) goto L56
            boolean r5 = r6 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L50
            df.d$a r6 = (p065df.NetworkResult.C4791a) r6
            we.b r5 = r6.m26591a()
            throw r5
        L50:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        L56:
            yc.u r5 = p468yc.C13195u.f34156a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7405s1.m18507c(java.lang.String, bd.d):java.lang.Object");
    }

    /* renamed from: d */
    public final Object m18506d(InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7407b(null), interfaceC1886d);
    }

    /* renamed from: e */
    public final Object m18505e(InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7408c(null), interfaceC1886d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18504f(bd.InterfaceC1886d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof mg.C7405s1.C7409d
            if (r0 == 0) goto L13
            r0 = r5
            mg.s1$d r0 = (mg.C7405s1.C7409d) r0
            int r1 = r0.f19661y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19661y = r1
            goto L18
        L13:
            mg.s1$d r0 = new mg.s1$d
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19659w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19661y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r5)
            vg.k0 r5 = r4.f19648a
            r0.f19661y = r3
            java.lang.Object r5 = r5.m5471p(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            df.d r5 = (p065df.NetworkResult) r5
            boolean r0 = r5 instanceof p065df.NetworkResult.C4792b
            if (r0 == 0) goto L53
            mg.e0$b r0 = new mg.e0$b
            df.d$b r5 = (p065df.NetworkResult.C4792b) r5
            java.lang.Object r5 = r5.m26590a()
            pt.pingodoce.app.data.remote.models.request.MadeForYou r5 = (pt.pingodoce.app.data.remote.models.request.MadeForYou) r5
            r0.<init>(r5)
            goto L62
        L53:
            boolean r0 = r5 instanceof p065df.NetworkResult.C4791a
            if (r0 == 0) goto L63
            mg.e0$a r0 = new mg.e0$a
            df.d$a r5 = (p065df.NetworkResult.C4791a) r5
            we.b r5 = r5.m26591a()
            r0.<init>(r5)
        L62:
            return r0
        L63:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7405s1.m18504f(bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0053  */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18503g(bd.InterfaceC1886d r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof mg.C7405s1.C7410e
            if (r0 == 0) goto L13
            r0 = r5
            mg.s1$e r0 = (mg.C7405s1.C7410e) r0
            int r1 = r0.f19664y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19664y = r1
            goto L18
        L13:
            mg.s1$e r0 = new mg.s1$e
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f19662w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19664y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r5)
            goto L3f
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r5)
            vg.k0 r5 = r4.f19648a
            r0.f19664y = r3
            java.lang.Object r5 = r5.m5472o(r0)
            if (r5 != r1) goto L3f
            return r1
        L3f:
            df.d r5 = (p065df.NetworkResult) r5
            boolean r0 = r5 instanceof p065df.NetworkResult.C4792b
            if (r0 == 0) goto L53
            mg.b$b r0 = new mg.b$b
            df.d$b r5 = (p065df.NetworkResult.C4792b) r5
            java.lang.Object r5 = r5.m26590a()
            pt.pingodoce.app.data.remote.models.request.AppNotifications r5 = (pt.pingodoce.app.data.remote.models.request.AppNotifications) r5
            r0.<init>(r5)
            goto L62
        L53:
            boolean r0 = r5 instanceof p065df.NetworkResult.C4791a
            if (r0 == 0) goto L63
            mg.b$a r0 = new mg.b$a
            df.d$a r5 = (p065df.NetworkResult.C4791a) r5
            we.b r5 = r5.m26591a()
            r0.<init>(r5)
        L62:
            return r0
        L63:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7405s1.m18503g(bd.d):java.lang.Object");
    }

    /* renamed from: h */
    public final User m18502h() {
        Object m20162b;
        m20162b = C6770c.m20162b(null, new C7411f(null), 1, null);
        return (User) m20162b;
    }

    /* renamed from: i */
    public final Object m18501i(InterfaceC1886d interfaceC1886d) {
        return C8079b.m16961a(new C7412g(null), interfaceC1886d);
    }

    /* renamed from: j */
    public final InterfaceC6785c m18500j() {
        return C6788e.m20137k(this.f19650c.m25769F());
    }

    /* renamed from: k */
    public final String m18499k() {
        Object m20162b;
        m20162b = C6770c.m20162b(null, new C7413h(null), 1, null);
        return (String) m20162b;
    }

    /* renamed from: l */
    public final boolean m18498l() {
        return this.f19650c.m26572O();
    }

    /* renamed from: m */
    public final InterfaceC6785c m18497m() {
        return this.f19650c.m26571P();
    }

    /* renamed from: n */
    public final boolean m18496n() {
        return this.f19650c.m26570Q();
    }

    /* renamed from: o */
    public final boolean m18495o() {
        return this.f19650c.m26569R();
    }

    /* renamed from: p */
    public final InterfaceC6785c m18494p() {
        return this.f19650c.m26568S();
    }

    /* renamed from: q */
    public final Object m18493q(InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7414i(null), interfaceC1886d);
    }

    /* renamed from: r */
    public final boolean m18492r() {
        return this.f19649b.m18524m();
    }

    /* renamed from: s */
    public final void m18491s(boolean z) {
        this.f19649b.m18546N(z);
    }

    /* renamed from: t */
    public final Object m18490t(InterfaceC1886d interfaceC1886d) {
        Object m34636d;
        Object m26567T = this.f19650c.m26567T(interfaceC1886d);
        m34636d = C2116d.m34636d();
        return m26567T == m34636d ? m26567T : C13195u.f34156a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* renamed from: u */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18489u(boolean r16, boolean r17, boolean r18, boolean r19, boolean r20, boolean r21, boolean r22, boolean r23, bd.InterfaceC1886d r24) {
        /*
            r15 = this;
            r0 = r15
            r1 = r24
            boolean r2 = r1 instanceof mg.C7405s1.C7415j
            if (r2 == 0) goto L16
            r2 = r1
            mg.s1$j r2 = (mg.C7405s1.C7415j) r2
            int r3 = r2.f19675y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.f19675y = r3
            goto L1b
        L16:
            mg.s1$j r2 = new mg.s1$j
            r2.<init>(r1)
        L1b:
            java.lang.Object r1 = r2.f19673w
            java.lang.Object r3 = cd.C2111b.m34640d()
            int r4 = r2.f19675y
            r5 = 1
            if (r4 == 0) goto L34
            if (r4 != r5) goto L2c
            p468yc.C13186n.m1453b(r1)
            goto L58
        L2c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L34:
            p468yc.C13186n.m1453b(r1)
            vg.k0 r1 = r0.f19648a
            pt.pingodoce.app.data.remote.models.request.AppNotifications r4 = new pt.pingodoce.app.data.remote.models.request.AppNotifications
            r6 = r4
            r7 = r16
            r8 = r19
            r9 = r17
            r10 = r18
            r11 = r20
            r12 = r21
            r13 = r22
            r14 = r23
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r2.f19675y = r5
            java.lang.Object r1 = r1.m5468s(r4, r2)
            if (r1 != r3) goto L58
            return r3
        L58:
            df.d r1 = (p065df.NetworkResult) r1
            boolean r2 = r1 instanceof p065df.NetworkResult.C4792b
            if (r2 == 0) goto L61
            mg.b$c r1 = mg.UserManager.C7202c.f19044a
            goto L71
        L61:
            boolean r2 = r1 instanceof p065df.NetworkResult.C4791a
            if (r2 == 0) goto L72
            mg.b$a r2 = new mg.b$a
            df.d$a r1 = (p065df.NetworkResult.C4791a) r1
            we.b r1 = r1.m26591a()
            r2.<init>(r1)
            r1 = r2
        L71:
            return r1
        L72:
            kotlin.NoWhenBranchMatchedException r1 = new kotlin.NoWhenBranchMatchedException
            r1.<init>()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7405s1.m18489u(boolean, boolean, boolean, boolean, boolean, boolean, boolean, boolean, bd.d):java.lang.Object");
    }

    /* renamed from: v */
    public final Object m18488v(String str, InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7416k(str, null), interfaceC1886d);
    }

    /* renamed from: w */
    public final Object m18487w(String str, InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7417l(str, null), interfaceC1886d);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m18486x(boolean r5, bd.InterfaceC1886d r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof mg.C7405s1.C7418m
            if (r0 == 0) goto L13
            r0 = r6
            mg.s1$m r0 = (mg.C7405s1.C7418m) r0
            int r1 = r0.f19684y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f19684y = r1
            goto L18
        L13:
            mg.s1$m r0 = new mg.s1$m
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f19682w
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f19684y
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            p468yc.C13186n.m1453b(r6)
            goto L44
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            p468yc.C13186n.m1453b(r6)
            vg.k0 r6 = r4.f19648a
            pt.pingodoce.app.data.remote.models.request.MadeForYou r2 = new pt.pingodoce.app.data.remote.models.request.MadeForYou
            r2.<init>(r5)
            r0.f19684y = r3
            java.lang.Object r6 = r6.m5467t(r2, r0)
            if (r6 != r1) goto L44
            return r1
        L44:
            df.d r6 = (p065df.NetworkResult) r6
            boolean r5 = r6 instanceof p065df.NetworkResult.C4792b
            if (r5 == 0) goto L4d
            mg.e0$c r5 = mg.AbstractC7249e0.C7252c.f19180a
            goto L5c
        L4d:
            boolean r5 = r6 instanceof p065df.NetworkResult.C4791a
            if (r5 == 0) goto L5d
            mg.e0$a r5 = new mg.e0$a
            df.d$a r6 = (p065df.NetworkResult.C4791a) r6
            we.b r6 = r6.m26591a()
            r5.<init>(r6)
        L5c:
            return r5
        L5d:
            kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: mg.C7405s1.m18486x(boolean, bd.d):java.lang.Object");
    }

    /* renamed from: y */
    public final Object m18485y(String str, String str2, InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7419n(str, str2, null), interfaceC1886d);
    }

    /* renamed from: z */
    public final Object m18484z(String str, InterfaceC1886d interfaceC1886d) {
        return C8079b.m16960b(new C7420o(str, null), interfaceC1886d);
    }
}
