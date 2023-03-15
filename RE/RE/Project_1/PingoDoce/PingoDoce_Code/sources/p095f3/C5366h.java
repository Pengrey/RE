package p095f3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import bd.CoroutineContext;
import bd.CoroutineContextImpl;
import bd.InterfaceC1886d;
import cd.C2116d;
import coil.memory.MemoryCache;
import id.InterfaceC6112p;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C6772d;
import kotlinx.coroutines.CoroutineExceptionHandler;
import p070e.C4906j;
import p095f3.InterfaceC5351c;
import p107ff.HttpUrl;
import p129h3.C5819b;
import p193k3.C6568a;
import p193k3.C6570b;
import p193k3.C6572c;
import p193k3.C6574d;
import p193k3.C6576e;
import p193k3.C6582i;
import p193k3.C6584j;
import p193k3.C6589k;
import p213l3.C6968a;
import p213l3.C6980c;
import p232m3.C7112a;
import p232m3.C7114c;
import p247n3.C7635a;
import p247n3.C7636b;
import p247n3.C7637c;
import p247n3.C7639e;
import p247n3.C7640f;
import p247n3.C7641g;
import p305q3.AbstractC9632h;
import p305q3.C9623a;
import p305q3.C9626d;
import p305q3.C9629g;
import p305q3.C9634j;
import p305q3.C9640m;
import p305q3.InterfaceC9625c;
import p327r3.C9805i;
import p349s3.InterfaceC10042b;
import p396v3.C11095g;
import p396v3.C11098i;
import p396v3.C11104n;
import p396v3.ComponentCallbacks2C11110s;
import p396v3.InterfaceC11108q;
import p468yc.C13186n;
import p468yc.C13195u;
import p468yc.InterfaceC13178g;
import p489zc._Collections;
import td.C10531j0;
import td.C10549n2;
import td.C10587w0;
import td.InterfaceC10524i0;
import td.InterfaceC10555p0;

/* renamed from: f3.h */
/* loaded from: classes.dex */
public final class C5366h implements InterfaceC5359e {

    /* renamed from: a */
    private final Context f14786a;

    /* renamed from: b */
    private final C9623a f14787b;

    /* renamed from: c */
    private final InterfaceC13178g f14788c;

    /* renamed from: d */
    private final InterfaceC13178g f14789d;

    /* renamed from: e */
    private final InterfaceC13178g f14790e;

    /* renamed from: f */
    private final InterfaceC5351c.InterfaceC5355d f14791f;

    /* renamed from: g */
    private final C5349b f14792g;

    /* renamed from: h */
    private final C11104n f14793h;

    /* renamed from: i */
    private final InterfaceC11108q f14794i;

    /* renamed from: j */
    private final InterfaceC10524i0 f14795j = C10531j0.m7771a(C10549n2.m7695b(null, 1, null).mo4545f0(C10587w0.m7619c().mo7830H0()).mo4545f0(new C5371e(CoroutineExceptionHandler.f18136q, this)));

    /* renamed from: k */
    private final ComponentCallbacks2C11110s f14796k;

    /* renamed from: l */
    private final C9640m f14797l;

    /* renamed from: m */
    private final InterfaceC13178g f14798m;

    /* renamed from: n */
    private final InterfaceC13178g f14799n;

    /* renamed from: o */
    private final C5349b f14800o;

    /* renamed from: p */
    private final List f14801p;

    /* compiled from: RealImageLoader.kt */
    /* renamed from: f3.h$a */
    /* loaded from: classes.dex */
    public static final class C5367a {
        private C5367a() {
        }

        public /* synthetic */ C5367a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: RealImageLoader.kt */
    @InterfaceC6759f(m20197c = "coil.RealImageLoader$enqueue$job$1", m20196f = "RealImageLoader.kt", m20195l = {C4906j.f13405F0}, m20194m = "invokeSuspend")
    /* renamed from: f3.h$b */
    /* loaded from: classes.dex */
    static final class C5368b extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f14802x;

        /* renamed from: z */
        final /* synthetic */ C9629g f14804z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5368b(C9629g c9629g, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f14804z = c9629g;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C5368b(this.f14804z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C5368b) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            InterfaceC11108q m24475g;
            m34636d = C2116d.m34636d();
            int i = this.f14802x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C5366h c5366h = C5366h.this;
                C9629g c9629g = this.f14804z;
                this.f14802x = 1;
                obj = C5366h.m24479c(c5366h, c9629g, 0, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            C5366h c5366h2 = C5366h.this;
            AbstractC9632h abstractC9632h = (AbstractC9632h) obj;
            if ((abstractC9632h instanceof C9626d) && (m24475g = c5366h2.m24475g()) != null) {
                C11095g.m6160a(m24475g, "RealImageLoader", ((C9626d) abstractC9632h).m10403c());
            }
            return obj;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealImageLoader.kt */
    @InterfaceC6759f(m20197c = "coil.RealImageLoader", m20196f = "RealImageLoader.kt", m20195l = {169, 180, 184}, m20194m = "executeMain")
    /* renamed from: f3.h$c */
    /* loaded from: classes.dex */
    public static final class C5369c extends AbstractC6757d {

        /* renamed from: A */
        Object f14805A;

        /* renamed from: B */
        /* synthetic */ Object f14806B;

        /* renamed from: D */
        int f14808D;

        /* renamed from: w */
        Object f14809w;

        /* renamed from: x */
        Object f14810x;

        /* renamed from: y */
        Object f14811y;

        /* renamed from: z */
        Object f14812z;

        C5369c(InterfaceC1886d interfaceC1886d) {
            super(interfaceC1886d);
        }

        public final Object invokeSuspend(Object obj) {
            this.f14806B = obj;
            this.f14808D |= Integer.MIN_VALUE;
            return C5366h.m24479c(C5366h.this, null, 0, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RealImageLoader.kt */
    @InterfaceC6759f(m20197c = "coil.RealImageLoader$executeMain$result$1", m20196f = "RealImageLoader.kt", m20195l = {193}, m20194m = "invokeSuspend")
    /* renamed from: f3.h$d */
    /* loaded from: classes.dex */
    public static final class C5370d extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: A */
        final /* synthetic */ C9805i f14813A;

        /* renamed from: B */
        final /* synthetic */ InterfaceC5351c f14814B;

        /* renamed from: C */
        final /* synthetic */ Bitmap f14815C;

        /* renamed from: x */
        int f14816x;

        /* renamed from: y */
        final /* synthetic */ C9629g f14817y;

        /* renamed from: z */
        final /* synthetic */ C5366h f14818z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5370d(C9629g c9629g, C5366h c5366h, C9805i c9805i, InterfaceC5351c interfaceC5351c, Bitmap bitmap, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f14817y = c9629g;
            this.f14818z = c5366h;
            this.f14813A = c9805i;
            this.f14814B = interfaceC5351c;
            this.f14815C = bitmap;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C5370d(this.f14817y, this.f14818z, this.f14813A, this.f14814B, this.f14815C, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C5370d) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f14816x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C6980c c6980c = new C6980c(this.f14817y, C5366h.m24478d(this.f14818z), 0, this.f14817y, this.f14813A, this.f14814B, this.f14815C != null);
                C9629g c9629g = this.f14817y;
                this.f14816x = 1;
                obj = c6980c.m19663h(c9629g, this);
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

    /* compiled from: CoroutineExceptionHandler.kt */
    /* renamed from: f3.h$e */
    /* loaded from: classes.dex */
    public static final class C5371e extends CoroutineContextImpl implements CoroutineExceptionHandler {

        /* renamed from: x */
        final /* synthetic */ C5366h f14819x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C5371e(CoroutineExceptionHandler.C6767a c6767a, C5366h c5366h) {
            super(c6767a);
            this.f14819x = c5366h;
        }

        /* renamed from: q0 */
        public void mo20171q0(CoroutineContext coroutineContext, Throwable th2) {
            InterfaceC11108q m24475g = this.f14819x.m24475g();
            if (m24475g != null) {
                C11095g.m6160a(m24475g, "RealImageLoader", th2);
            }
        }
    }

    static {
        new C5367a(null);
    }

    public C5366h(Context context, C9623a c9623a, InterfaceC13178g interfaceC13178g, InterfaceC13178g interfaceC13178g2, InterfaceC13178g interfaceC13178g3, InterfaceC5351c.InterfaceC5355d interfaceC5355d, C5349b c5349b, C11104n c11104n, InterfaceC11108q interfaceC11108q) {
        List m466c0;
        this.f14786a = context;
        this.f14787b = c9623a;
        this.f14788c = interfaceC13178g;
        this.f14789d = interfaceC13178g2;
        this.f14790e = interfaceC13178g3;
        this.f14791f = interfaceC5355d;
        this.f14792g = c5349b;
        this.f14793h = c11104n;
        this.f14794i = interfaceC11108q;
        ComponentCallbacks2C11110s componentCallbacks2C11110s = new ComponentCallbacks2C11110s(this, context, c11104n.m6120d());
        this.f14796k = componentCallbacks2C11110s;
        C9640m c9640m = new C9640m(this, componentCallbacks2C11110s, interfaceC11108q);
        this.f14797l = c9640m;
        this.f14798m = interfaceC13178g;
        this.f14799n = interfaceC13178g2;
        this.f14800o = c5349b.m24539h().m24533d(new C7637c(), HttpUrl.class).m24533d(new C7641g(), String.class).m24533d(new C7636b(), Uri.class).m24533d(new C7640f(), Uri.class).m24533d(new C7639e(), Integer.class).m24533d(new C7635a(), byte[].class).m24534c(new C7114c(), Uri.class).m24534c(new C7112a(c11104n.m6123a()), File.class).m24535b(new C6584j.C6586b(interfaceC13178g3, interfaceC13178g2, c11104n.m6119e()), Uri.class).m24535b(new C6582i.C6583a(), File.class).m24535b(new C6568a.C6569a(), Uri.class).m24535b(new C6574d.C6575a(), Uri.class).m24535b(new C6589k.C6591b(), Uri.class).m24535b(new C6576e.C6577a(), Drawable.class).m24535b(new C6570b.C6571a(), Bitmap.class).m24535b(new C6572c.C6573a(), ByteBuffer.class).m24536a(new C5819b.C5822c(c11104n.m6121c(), c11104n.m6122b())).m24532e();
        m466c0 = _Collections.m466c0(getComponents().m24544c(), new C6968a(this, c9640m, interfaceC11108q));
        this.f14801p = m466c0;
        new AtomicBoolean(false);
        componentCallbacks2C11110s.m6111c();
    }

    /* renamed from: c */
    public static final /* synthetic */ Object m24479c(C5366h c5366h, C9629g c9629g, int i, InterfaceC1886d interfaceC1886d) {
        return c5366h.m24477e(c9629g, i, interfaceC1886d);
    }

    /* renamed from: d */
    public static final /* synthetic */ List m24478d(C5366h c5366h) {
        return c5366h.f14801p;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6 A[Catch: all -> 0x01a6, TryCatch #3 {all -> 0x01a6, blocks: (B:42:0x00f0, B:44:0x00f6, B:46:0x00fc, B:49:0x0104, B:52:0x010c, B:54:0x011e, B:56:0x0124, B:57:0x0127, B:59:0x0130, B:60:0x0133, B:53:0x011a), top: B:97:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010c A[Catch: all -> 0x01a6, TryCatch #3 {all -> 0x01a6, blocks: (B:42:0x00f0, B:44:0x00f6, B:46:0x00fc, B:49:0x0104, B:52:0x010c, B:54:0x011e, B:56:0x0124, B:57:0x0127, B:59:0x0130, B:60:0x0133, B:53:0x011a), top: B:97:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x011a A[Catch: all -> 0x01a6, TryCatch #3 {all -> 0x01a6, blocks: (B:42:0x00f0, B:44:0x00f6, B:46:0x00fc, B:49:0x0104, B:52:0x010c, B:54:0x011e, B:56:0x0124, B:57:0x0127, B:59:0x0130, B:60:0x0133, B:53:0x011a), top: B:97:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0124 A[Catch: all -> 0x01a6, TryCatch #3 {all -> 0x01a6, blocks: (B:42:0x00f0, B:44:0x00f6, B:46:0x00fc, B:49:0x0104, B:52:0x010c, B:54:0x011e, B:56:0x0124, B:57:0x0127, B:59:0x0130, B:60:0x0133, B:53:0x011a), top: B:97:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0130 A[Catch: all -> 0x01a6, TryCatch #3 {all -> 0x01a6, blocks: (B:42:0x00f0, B:44:0x00f6, B:46:0x00fc, B:49:0x0104, B:52:0x010c, B:54:0x011e, B:56:0x0124, B:57:0x0127, B:59:0x0130, B:60:0x0133, B:53:0x011a), top: B:97:0x00f0 }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x014c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x017e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0189 A[Catch: all -> 0x004b, TryCatch #4 {all -> 0x004b, blocks: (B:14:0x0046, B:68:0x0183, B:70:0x0189, B:71:0x0194, B:73:0x0198), top: B:99:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0194 A[Catch: all -> 0x004b, TryCatch #4 {all -> 0x004b, blocks: (B:14:0x0046, B:68:0x0183, B:70:0x0189, B:71:0x0194, B:73:0x0198), top: B:99:0x0046 }] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01ba A[Catch: all -> 0x01cf, TRY_LEAVE, TryCatch #5 {all -> 0x01cf, blocks: (B:82:0x01b6, B:84:0x01ba, B:87:0x01cb, B:88:0x01ce), top: B:100:0x01b6 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01cb A[Catch: all -> 0x01cf, TRY_ENTER, TryCatch #5 {all -> 0x01cf, blocks: (B:82:0x01b6, B:84:0x01ba, B:87:0x01cb, B:88:0x01ce), top: B:100:0x01b6 }] */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final java.lang.Object m24477e(p305q3.C9629g r21, int r22, bd.InterfaceC1886d r23) {
        /*
            Method dump skipped, instructions count: 468
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p095f3.C5366h.m24477e(q3.g, int, bd.d):java.lang.Object");
    }

    /* renamed from: h */
    private final void m24474h(C9629g c9629g, InterfaceC5351c interfaceC5351c) {
        InterfaceC11108q interfaceC11108q = this.f14794i;
        if (interfaceC11108q != null && interfaceC11108q.m6116a() <= 4) {
            interfaceC11108q.m6115b("RealImageLoader", 4, "🏗  Cancelled - " + c9629g.m10367m(), null);
        }
        interfaceC5351c.mo24529a(c9629g);
        C9629g.InterfaceC9631b m10397A = c9629g.m10397A();
        if (m10397A != null) {
            m10397A.mo24529a(c9629g);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
        if (r8 != null) goto L15;
     */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m24473i(p305q3.C9626d r7, p349s3.InterfaceC10041a r8, p095f3.InterfaceC5351c r9) {
        /*
            r6 = this;
            q3.g r0 = r7.mo10331b()
            v3.q r1 = r6.f14794i
            if (r1 == 0) goto L36
            r2 = 4
            int r3 = r1.m6116a()
            if (r3 > r2) goto L36
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "🚨 Failed - "
            r3.append(r4)
            java.lang.Object r4 = r0.m10367m()
            r3.append(r4)
            java.lang.String r4 = " - "
            r3.append(r4)
            java.lang.Throwable r4 = r7.m10403c()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r4 = 0
            java.lang.String r5 = "RealImageLoader"
            r1.m6115b(r5, r2, r3, r4)
        L36:
            boolean r1 = r8 instanceof p376u3.InterfaceC10826d
            if (r1 != 0) goto L3d
            if (r8 == 0) goto L69
            goto L50
        L3d:
            q3.g r1 = r7.mo10331b()
            u3.c$a r1 = r1.m10382P()
            r2 = r8
            u3.d r2 = (p376u3.InterfaceC10826d) r2
            u3.c r1 = r1.mo6974a(r2, r7)
            boolean r2 = r1 instanceof p376u3.C10821b
            if (r2 == 0) goto L58
        L50:
            android.graphics.drawable.Drawable r1 = r7.mo10332a()
            r8.mo9341k(r1)
            goto L69
        L58:
            q3.g r8 = r7.mo10331b()
            r9.mo24514p(r8, r1)
            r1.mo6975a()
            q3.g r8 = r7.mo10331b()
            r9.mo24523g(r8, r1)
        L69:
            r9.mo24528b(r0, r7)
            q3.g$b r8 = r0.m10397A()
            if (r8 == 0) goto L75
            r8.mo24528b(r0, r7)
        L75:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p095f3.C5366h.m24473i(q3.d, s3.a, f3.c):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0045, code lost:
        if (r8 != null) goto L15;
     */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void m24472j(p305q3.C9641n r7, p349s3.InterfaceC10041a r8, p095f3.InterfaceC5351c r9) {
        /*
            r6 = this;
            q3.g r0 = r7.mo10331b()
            h3.d r1 = r7.m10301c()
            v3.q r2 = r6.f14794i
            if (r2 == 0) goto L41
            r3 = 4
            int r4 = r2.m6116a()
            if (r4 > r3) goto L41
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = p396v3.C11098i.m6149g(r1)
            r4.append(r5)
            java.lang.String r5 = " Successful ("
            r4.append(r5)
            java.lang.String r1 = r1.name()
            r4.append(r1)
            java.lang.String r1 = ") - "
            r4.append(r1)
            java.lang.Object r1 = r0.m10367m()
            r4.append(r1)
            java.lang.String r1 = r4.toString()
            r4 = 0
            java.lang.String r5 = "RealImageLoader"
            r2.m6115b(r5, r3, r1, r4)
        L41:
            boolean r1 = r8 instanceof p376u3.InterfaceC10826d
            if (r1 != 0) goto L48
            if (r8 == 0) goto L74
            goto L5b
        L48:
            q3.g r1 = r7.mo10331b()
            u3.c$a r1 = r1.m10382P()
            r2 = r8
            u3.d r2 = (p376u3.InterfaceC10826d) r2
            u3.c r1 = r1.mo6974a(r2, r7)
            boolean r2 = r1 instanceof p376u3.C10821b
            if (r2 == 0) goto L63
        L5b:
            android.graphics.drawable.Drawable r1 = r7.mo10332a()
            r8.mo9342h(r1)
            goto L74
        L63:
            q3.g r8 = r7.mo10331b()
            r9.mo24514p(r8, r1)
            r1.mo6975a()
            q3.g r8 = r7.mo10331b()
            r9.mo24523g(r8, r1)
        L74:
            r9.mo24526d(r0, r7)
            q3.g$b r8 = r0.m10397A()
            if (r8 == 0) goto L80
            r8.mo24526d(r0, r7)
        L80:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p095f3.C5366h.m24472j(q3.n, s3.a, f3.c):void");
    }

    /* renamed from: a */
    public MemoryCache mo24490a() {
        return (MemoryCache) this.f14798m.getValue();
    }

    /* renamed from: b */
    public InterfaceC9625c mo24489b(C9629g c9629g) {
        InterfaceC10555p0<? extends AbstractC9632h> m20160b;
        m20160b = C6772d.m20160b(this.f14795j, null, null, new C5368b(c9629g, null), 3, null);
        if (c9629g.m10385M() instanceof InterfaceC10042b) {
            return C11098i.m6143m(((InterfaceC10042b) c9629g.m10385M()).mo9340j()).m10295b(m20160b);
        }
        return new C9634j(m20160b);
    }

    /* renamed from: f */
    public C9623a m24476f() {
        return this.f14787b;
    }

    /* renamed from: g */
    public final InterfaceC11108q m24475g() {
        return this.f14794i;
    }

    public C5349b getComponents() {
        return this.f14800o;
    }

    /* renamed from: k */
    public final void m24471k(int i) {
        MemoryCache memoryCache;
        InterfaceC13178g interfaceC13178g = this.f14788c;
        if (interfaceC13178g == null || (memoryCache = (MemoryCache) interfaceC13178g.getValue()) == null) {
            return;
        }
        memoryCache.mo17195b(i);
    }
}
