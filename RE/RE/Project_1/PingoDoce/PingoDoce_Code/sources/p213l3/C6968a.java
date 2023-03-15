package p213l3;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import bd.InterfaceC1886d;
import cd.C2116d;
import coil.memory.MemoryCache;
import id.InterfaceC6112p;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6757d;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.C6769b;
import p070e.C4906j;
import p095f3.C5349b;
import p095f3.InterfaceC5351c;
import p095f3.InterfaceC5359e;
import p129h3.EnumC5826d;
import p181jd.C6449y;
import p193k3.AbstractC6579g;
import p193k3.C6592l;
import p213l3.InterfaceC6978b;
import p263o3.C8003c;
import p305q3.C9629g;
import p305q3.C9635k;
import p305q3.C9640m;
import p305q3.C9641n;
import p361t3.InterfaceC10379c;
import p396v3.C11089a;
import p396v3.C11098i;
import p396v3.C11101k;
import p396v3.InterfaceC11108q;
import p468yc.C13186n;
import p468yc.C13195u;
import p489zc._Arrays;
import td.InterfaceC10524i0;

/* renamed from: l3.a */
/* loaded from: classes.dex */
public final class C6968a implements InterfaceC6978b {

    /* renamed from: a */
    private final InterfaceC5359e f18511a;

    /* renamed from: b */
    private final C9640m f18512b;

    /* renamed from: c */
    private final InterfaceC11108q f18513c;

    /* renamed from: d */
    private final C8003c f18514d;

    /* compiled from: EngineInterceptor.kt */
    /* renamed from: l3.a$a */
    /* loaded from: classes.dex */
    public static final class C6969a {
        private C6969a() {
        }

        public /* synthetic */ C6969a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: EngineInterceptor.kt */
    /* renamed from: l3.a$b */
    /* loaded from: classes.dex */
    public static final class C6970b {

        /* renamed from: a */
        private final Drawable f18515a;

        /* renamed from: b */
        private final boolean f18516b;

        /* renamed from: c */
        private final EnumC5826d f18517c;

        /* renamed from: d */
        private final String f18518d;

        public C6970b(Drawable drawable, boolean z, EnumC5826d enumC5826d, String str) {
            this.f18515a = drawable;
            this.f18516b = z;
            this.f18517c = enumC5826d;
            this.f18518d = str;
        }

        /* renamed from: b */
        public static /* synthetic */ C6970b m19679b(C6970b c6970b, Drawable drawable, boolean z, EnumC5826d enumC5826d, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                drawable = c6970b.f18515a;
            }
            if ((i & 2) != 0) {
                z = c6970b.f18516b;
            }
            if ((i & 4) != 0) {
                enumC5826d = c6970b.f18517c;
            }
            if ((i & 8) != 0) {
                str = c6970b.f18518d;
            }
            return c6970b.m19680a(drawable, z, enumC5826d, str);
        }

        /* renamed from: a */
        public final C6970b m19680a(Drawable drawable, boolean z, EnumC5826d enumC5826d, String str) {
            return new C6970b(drawable, z, enumC5826d, str);
        }

        /* renamed from: c */
        public final EnumC5826d m19678c() {
            return this.f18517c;
        }

        /* renamed from: d */
        public final String m19677d() {
            return this.f18518d;
        }

        /* renamed from: e */
        public final Drawable m19676e() {
            return this.f18515a;
        }

        /* renamed from: f */
        public final boolean m19675f() {
            return this.f18516b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineInterceptor.kt */
    @InterfaceC6759f(m20197c = "coil.intercept.EngineInterceptor", m20196f = "EngineInterceptor.kt", m20195l = {199}, m20194m = "decode")
    /* renamed from: l3.a$c */
    /* loaded from: classes.dex */
    public static final class C6971c extends AbstractC6757d {

        /* renamed from: A */
        Object f18519A;

        /* renamed from: B */
        Object f18520B;

        /* renamed from: C */
        Object f18521C;

        /* renamed from: D */
        Object f18522D;

        /* renamed from: E */
        int f18523E;

        /* renamed from: F */
        /* synthetic */ Object f18524F;

        /* renamed from: H */
        int f18526H;

        /* renamed from: w */
        Object f18527w;

        /* renamed from: x */
        Object f18528x;

        /* renamed from: y */
        Object f18529y;

        /* renamed from: z */
        Object f18530z;

        C6971c(InterfaceC1886d<? super C6971c> interfaceC1886d) {
            super(interfaceC1886d);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18524F = obj;
            this.f18526H |= Integer.MIN_VALUE;
            return C6968a.this.m19684h(null, null, null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineInterceptor.kt */
    @InterfaceC6759f(m20197c = "coil.intercept.EngineInterceptor", m20196f = "EngineInterceptor.kt", m20195l = {C4906j.f13400E0, C4906j.f13420I0, 144}, m20194m = "execute")
    /* renamed from: l3.a$d */
    /* loaded from: classes.dex */
    public static final class C6972d extends AbstractC6757d {

        /* renamed from: A */
        Object f18531A;

        /* renamed from: B */
        Object f18532B;

        /* renamed from: C */
        Object f18533C;

        /* renamed from: D */
        Object f18534D;

        /* renamed from: E */
        /* synthetic */ Object f18535E;

        /* renamed from: G */
        int f18537G;

        /* renamed from: w */
        Object f18538w;

        /* renamed from: x */
        Object f18539x;

        /* renamed from: y */
        Object f18540y;

        /* renamed from: z */
        Object f18541z;

        C6972d(InterfaceC1886d<? super C6972d> interfaceC1886d) {
            super(interfaceC1886d);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18535E = obj;
            this.f18537G |= Integer.MIN_VALUE;
            return C6968a.this.m19683i(null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineInterceptor.kt */
    @InterfaceC6759f(m20197c = "coil.intercept.EngineInterceptor$execute$executeResult$1", m20196f = "EngineInterceptor.kt", m20195l = {127}, m20194m = "invokeSuspend")
    /* renamed from: l3.a$e */
    /* loaded from: classes.dex */
    public static final class C6973e extends AbstractC6764l implements InterfaceC6112p<InterfaceC10524i0, InterfaceC1886d<? super C6970b>, Object> {

        /* renamed from: A */
        final /* synthetic */ C6449y<C5349b> f18542A;

        /* renamed from: B */
        final /* synthetic */ C9629g f18543B;

        /* renamed from: C */
        final /* synthetic */ Object f18544C;

        /* renamed from: D */
        final /* synthetic */ C6449y<C9635k> f18545D;

        /* renamed from: E */
        final /* synthetic */ InterfaceC5351c f18546E;

        /* renamed from: x */
        int f18547x;

        /* renamed from: z */
        final /* synthetic */ C6449y<AbstractC6579g> f18549z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6973e(C6449y<AbstractC6579g> c6449y, C6449y<C5349b> c6449y2, C9629g c9629g, Object obj, C6449y<C9635k> c6449y3, InterfaceC5351c interfaceC5351c, InterfaceC1886d<? super C6973e> interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f18549z = c6449y;
            this.f18542A = c6449y2;
            this.f18543B = c9629g;
            this.f18544C = obj;
            this.f18545D = c6449y3;
            this.f18546E = interfaceC5351c;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
            return new C6973e(this.f18549z, this.f18542A, this.f18543B, this.f18544C, this.f18545D, this.f18546E, interfaceC1886d);
        }

        @Override // id.InterfaceC6112p
        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d<? super C6970b> interfaceC1886d) {
            return ((C6973e) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f18547x;
            if (i == 0) {
                C13186n.m1453b(obj);
                InterfaceC5351c interfaceC5351c = this.f18546E;
                this.f18547x = 1;
                obj = C6968a.this.m19684h((C6592l) this.f18549z.f17533w, this.f18542A.f17533w, this.f18543B, this.f18544C, this.f18545D.f17533w, interfaceC5351c, this);
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
    /* compiled from: EngineInterceptor.kt */
    @InterfaceC6759f(m20197c = "coil.intercept.EngineInterceptor", m20196f = "EngineInterceptor.kt", m20195l = {165}, m20194m = "fetch")
    /* renamed from: l3.a$f */
    /* loaded from: classes.dex */
    public static final class C6974f extends AbstractC6757d {

        /* renamed from: A */
        Object f18550A;

        /* renamed from: B */
        Object f18551B;

        /* renamed from: C */
        Object f18552C;

        /* renamed from: D */
        int f18553D;

        /* renamed from: E */
        /* synthetic */ Object f18554E;

        /* renamed from: G */
        int f18556G;

        /* renamed from: w */
        Object f18557w;

        /* renamed from: x */
        Object f18558x;

        /* renamed from: y */
        Object f18559y;

        /* renamed from: z */
        Object f18560z;

        C6974f(InterfaceC1886d<? super C6974f> interfaceC1886d) {
            super(interfaceC1886d);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18554E = obj;
            this.f18556G |= Integer.MIN_VALUE;
            return C6968a.this.m19682j(null, null, null, null, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineInterceptor.kt */
    @InterfaceC6759f(m20197c = "coil.intercept.EngineInterceptor", m20196f = "EngineInterceptor.kt", m20195l = {73}, m20194m = "intercept")
    /* renamed from: l3.a$g */
    /* loaded from: classes.dex */
    public static final class C6975g extends AbstractC6757d {

        /* renamed from: A */
        int f18561A;

        /* renamed from: w */
        Object f18562w;

        /* renamed from: x */
        Object f18563x;

        /* renamed from: y */
        /* synthetic */ Object f18564y;

        C6975g(InterfaceC1886d<? super C6975g> interfaceC1886d) {
            super(interfaceC1886d);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f18564y = obj;
            this.f18561A |= Integer.MIN_VALUE;
            return C6968a.this.mo19671a(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineInterceptor.kt */
    @InterfaceC6759f(m20197c = "coil.intercept.EngineInterceptor$intercept$2", m20196f = "EngineInterceptor.kt", m20195l = {75}, m20194m = "invokeSuspend")
    /* renamed from: l3.a$h */
    /* loaded from: classes.dex */
    public static final class C6976h extends AbstractC6764l implements InterfaceC6112p<InterfaceC10524i0, InterfaceC1886d<? super C9641n>, Object> {

        /* renamed from: A */
        final /* synthetic */ Object f18566A;

        /* renamed from: B */
        final /* synthetic */ C9635k f18567B;

        /* renamed from: C */
        final /* synthetic */ InterfaceC5351c f18568C;

        /* renamed from: D */
        final /* synthetic */ MemoryCache.Key f18569D;

        /* renamed from: E */
        final /* synthetic */ InterfaceC6978b.InterfaceC6979a f18570E;

        /* renamed from: x */
        int f18571x;

        /* renamed from: z */
        final /* synthetic */ C9629g f18573z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C6976h(C9629g c9629g, Object obj, C9635k c9635k, InterfaceC5351c interfaceC5351c, MemoryCache.Key key, InterfaceC6978b.InterfaceC6979a interfaceC6979a, InterfaceC1886d<? super C6976h> interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f18573z = c9629g;
            this.f18566A = obj;
            this.f18567B = c9635k;
            this.f18568C = interfaceC5351c;
            this.f18569D = key;
            this.f18570E = interfaceC6979a;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
            return new C6976h(this.f18573z, this.f18566A, this.f18567B, this.f18568C, this.f18569D, this.f18570E, interfaceC1886d);
        }

        @Override // id.InterfaceC6112p
        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d<? super C9641n> interfaceC1886d) {
            return ((C6976h) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f18571x;
            if (i == 0) {
                C13186n.m1453b(obj);
                C6968a c6968a = C6968a.this;
                C9629g c9629g = this.f18573z;
                Object obj2 = this.f18566A;
                C9635k c9635k = this.f18567B;
                InterfaceC5351c interfaceC5351c = this.f18568C;
                this.f18571x = 1;
                obj = c6968a.m19683i(c9629g, obj2, c9635k, interfaceC5351c, this);
                if (obj == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            C6970b c6970b = (C6970b) obj;
            return new C9641n(c6970b.m19676e(), this.f18573z, c6970b.m19678c(), C6968a.this.f18514d.m17197h(this.f18569D, this.f18573z, c6970b) ? this.f18569D : null, c6970b.m19677d(), c6970b.m19675f(), C11098i.m6135u(this.f18570E));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EngineInterceptor.kt */
    @InterfaceC6759f(m20197c = "coil.intercept.EngineInterceptor$transform$3", m20196f = "EngineInterceptor.kt", m20195l = {242}, m20194m = "invokeSuspend")
    /* renamed from: l3.a$i */
    /* loaded from: classes.dex */
    public static final class C6977i extends AbstractC6764l implements InterfaceC6112p<InterfaceC10524i0, InterfaceC1886d<? super C6970b>, Object> {

        /* renamed from: A */
        int f18574A;

        /* renamed from: B */
        int f18575B;

        /* renamed from: C */
        private /* synthetic */ Object f18576C;

        /* renamed from: E */
        final /* synthetic */ C6970b f18578E;

        /* renamed from: F */
        final /* synthetic */ C9635k f18579F;

        /* renamed from: G */
        final /* synthetic */ List<InterfaceC10379c> f18580G;

        /* renamed from: H */
        final /* synthetic */ InterfaceC5351c f18581H;

        /* renamed from: I */
        final /* synthetic */ C9629g f18582I;

        /* renamed from: x */
        Object f18583x;

        /* renamed from: y */
        Object f18584y;

        /* renamed from: z */
        int f18585z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C6977i(C6970b c6970b, C9635k c9635k, List<? extends InterfaceC10379c> list, InterfaceC5351c interfaceC5351c, C9629g c9629g, InterfaceC1886d<? super C6977i> interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f18578E = c6970b;
            this.f18579F = c9635k;
            this.f18580G = list;
            this.f18581H = interfaceC5351c;
            this.f18582I = c9629g;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        public final InterfaceC1886d<C13195u> create(Object obj, InterfaceC1886d<?> interfaceC1886d) {
            C6977i c6977i = new C6977i(this.f18578E, this.f18579F, this.f18580G, this.f18581H, this.f18582I, interfaceC1886d);
            c6977i.f18576C = obj;
            return c6977i;
        }

        @Override // id.InterfaceC6112p
        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d<? super C6970b> interfaceC1886d) {
            return ((C6977i) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0064  */
        /* JADX WARN: Removed duplicated region for block: B:14:0x0088  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x007e -> B:13:0x0081). Please submit an issue!!! */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r20) {
            /*
                r19 = this;
                r0 = r19
                java.lang.Object r1 = cd.C2111b.m34640d()
                int r2 = r0.f18575B
                r3 = 1
                if (r2 == 0) goto L2f
                if (r2 != r3) goto L27
                int r2 = r0.f18574A
                int r4 = r0.f18585z
                java.lang.Object r5 = r0.f18584y
                q3.k r5 = (p305q3.C9635k) r5
                java.lang.Object r6 = r0.f18583x
                java.util.List r6 = (java.util.List) r6
                java.lang.Object r7 = r0.f18576C
                td.i0 r7 = (td.InterfaceC10524i0) r7
                p468yc.C13186n.m1453b(r20)
                r9 = r0
                r8 = r7
                r7 = r6
                r6 = r5
                r5 = r20
                goto L81
            L27:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L2f:
                p468yc.C13186n.m1453b(r20)
                java.lang.Object r2 = r0.f18576C
                td.i0 r2 = (td.InterfaceC10524i0) r2
                l3.a r4 = p213l3.C6968a.this
                l3.a$b r5 = r0.f18578E
                android.graphics.drawable.Drawable r5 = r5.m19676e()
                q3.k r6 = r0.f18579F
                java.util.List<t3.c> r7 = r0.f18580G
                android.graphics.Bitmap r4 = p213l3.C6968a.m19690b(r4, r5, r6, r7)
                f3.c r5 = r0.f18581H
                q3.g r6 = r0.f18582I
                r5.mo24516n(r6, r4)
                java.util.List<t3.c> r5 = r0.f18580G
                q3.k r6 = r0.f18579F
                r7 = 0
                int r8 = r5.size()
                r9 = r0
                r17 = r8
                r8 = r2
                r2 = r17
                r18 = r5
                r5 = r4
                r4 = r7
                r7 = r18
            L62:
                if (r4 >= r2) goto L88
                java.lang.Object r10 = r7.get(r4)
                t3.c r10 = (p361t3.InterfaceC10379c) r10
                r3.i r11 = r6.m10317n()
                r9.f18576C = r8
                r9.f18583x = r7
                r9.f18584y = r6
                r9.f18585z = r4
                r9.f18574A = r2
                r9.f18575B = r3
                java.lang.Object r5 = r10.mo8090a(r5, r11, r9)
                if (r5 != r1) goto L81
                return r1
            L81:
                android.graphics.Bitmap r5 = (android.graphics.Bitmap) r5
                td.C10531j0.m7767e(r8)
                int r4 = r4 + r3
                goto L62
            L88:
                f3.c r1 = r9.f18581H
                q3.g r2 = r9.f18582I
                r1.mo24517m(r2, r5)
                l3.a$b r10 = r9.f18578E
                q3.g r1 = r9.f18582I
                android.content.Context r1 = r1.m10368l()
                android.content.res.Resources r1 = r1.getResources()
                android.graphics.drawable.BitmapDrawable r11 = new android.graphics.drawable.BitmapDrawable
                r11.<init>(r1, r5)
                r12 = 0
                r13 = 0
                r14 = 0
                r15 = 14
                r16 = 0
                l3.a$b r1 = p213l3.C6968a.C6970b.m19679b(r10, r11, r12, r13, r14, r15, r16)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p213l3.C6968a.C6977i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static {
        new C6969a(null);
    }

    public C6968a(InterfaceC5359e interfaceC5359e, C9640m c9640m, InterfaceC11108q interfaceC11108q) {
        this.f18511a = interfaceC5359e;
        this.f18512b = c9640m;
        this.f18513c = interfaceC11108q;
        this.f18514d = new C8003c(interfaceC5359e, c9640m, interfaceC11108q);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public final Bitmap m19685g(Drawable drawable, C9635k c9635k, List<? extends InterfaceC10379c> list) {
        boolean m272z;
        if (drawable instanceof BitmapDrawable) {
            Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
            Bitmap.Config m6174c = C11089a.m6174c(bitmap);
            m272z = _Arrays.m272z(C11098i.m6140p(), m6174c);
            if (m272z) {
                return bitmap;
            }
            InterfaceC11108q interfaceC11108q = this.f18513c;
            if (interfaceC11108q != null && interfaceC11108q.m6116a() <= 4) {
                interfaceC11108q.m6115b("EngineInterceptor", 4, "Converting bitmap with config " + m6174c + " to apply transformations: " + list + '.', null);
            }
        } else {
            InterfaceC11108q interfaceC11108q2 = this.f18513c;
            if (interfaceC11108q2 != null && interfaceC11108q2.m6116a() <= 4) {
                interfaceC11108q2.m6115b("EngineInterceptor", 4, "Converting drawable of type " + drawable.getClass().getCanonicalName() + " to apply transformations: " + list + '.', null);
            }
        }
        return C11101k.f28493a.m6128a(drawable, c9635k.m10325f(), c9635k.m10317n(), c9635k.m10318m(), c9635k.m10328c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00e6  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x00ab -> B:21:0x00b4). Please submit an issue!!! */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m19684h(p193k3.C6592l r17, p095f3.C5349b r18, p305q3.C9629g r19, java.lang.Object r20, p305q3.C9635k r21, p095f3.InterfaceC5351c r22, bd.InterfaceC1886d<? super p213l3.C6968a.C6970b> r23) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p213l3.C6968a.m19684h(k3.l, f3.b, q3.g, java.lang.Object, q3.k, f3.c, bd.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x015c A[Catch: all -> 0x0212, TRY_LEAVE, TryCatch #0 {all -> 0x0212, blocks: (B:45:0x0151, B:47:0x015c, B:53:0x019c, B:55:0x01a0, B:76:0x020c, B:77:0x0211, B:27:0x00a5, B:29:0x00b1, B:30:0x00df, B:32:0x00e5, B:41:0x0114, B:34:0x00eb, B:36:0x00fa, B:37:0x0101, B:39:0x0107, B:40:0x010e), top: B:88:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x019c A[Catch: all -> 0x0212, TRY_ENTER, TryCatch #0 {all -> 0x0212, blocks: (B:45:0x0151, B:47:0x015c, B:53:0x019c, B:55:0x01a0, B:76:0x020c, B:77:0x0211, B:27:0x00a5, B:29:0x00b1, B:30:0x00df, B:32:0x00e5, B:41:0x0114, B:34:0x00eb, B:36:0x00fa, B:37:0x0101, B:39:0x0107, B:40:0x010e), top: B:88:0x00a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01f2 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x021f  */
    /* JADX WARN: Type inference failed for: r1v13, types: [T, f3.b] */
    /* JADX WARN: Type inference failed for: r1v20, types: [T, q3.k] */
    /* JADX WARN: Type inference failed for: r1v6, types: [T, f3.b] */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m19683i(p305q3.C9629g r36, java.lang.Object r37, p305q3.C9635k r38, p095f3.InterfaceC5351c r39, bd.InterfaceC1886d<? super p213l3.C6968a.C6970b> r40) {
        /*
            Method dump skipped, instructions count: 553
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p213l3.C6968a.m19683i(q3.g, java.lang.Object, q3.k, f3.c, bd.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x009e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0092 -> B:21:0x0097). Please submit an issue!!! */
    /* renamed from: j */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object m19682j(p095f3.C5349b r10, p305q3.C9629g r11, java.lang.Object r12, p305q3.C9635k r13, p095f3.InterfaceC5351c r14, bd.InterfaceC1886d<? super p193k3.AbstractC6579g> r15) {
        /*
            Method dump skipped, instructions count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p213l3.C6968a.m19682j(f3.b, q3.g, java.lang.Object, q3.k, f3.c, bd.d):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ad  */
    @Override // p213l3.InterfaceC6978b
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object mo19671a(p213l3.InterfaceC6978b.InterfaceC6979a r14, bd.InterfaceC1886d<? super p305q3.AbstractC9632h> r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof p213l3.C6968a.C6975g
            if (r0 == 0) goto L13
            r0 = r15
            l3.a$g r0 = (p213l3.C6968a.C6975g) r0
            int r1 = r0.f18561A
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f18561A = r1
            goto L18
        L13:
            l3.a$g r0 = new l3.a$g
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f18564y
            java.lang.Object r1 = cd.C2111b.m34640d()
            int r2 = r0.f18561A
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r14 = r0.f18563x
            l3.b$a r14 = (p213l3.InterfaceC6978b.InterfaceC6979a) r14
            java.lang.Object r0 = r0.f18562w
            l3.a r0 = (p213l3.C6968a) r0
            p468yc.C13186n.m1453b(r15)     // Catch: java.lang.Throwable -> L31
            goto L9b
        L31:
            r15 = move-exception
            goto L9e
        L33:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L3b:
            p468yc.C13186n.m1453b(r15)
            q3.g r6 = r14.mo19669b()     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r15 = r6.m10367m()     // Catch: java.lang.Throwable -> L9c
            r3.i r2 = r14.mo19670a()     // Catch: java.lang.Throwable -> L9c
            f3.c r9 = p396v3.C11098i.m6148h(r14)     // Catch: java.lang.Throwable -> L9c
            q3.m r4 = r13.f18512b     // Catch: java.lang.Throwable -> L9c
            q3.k r8 = r4.m10305f(r6, r2)     // Catch: java.lang.Throwable -> L9c
            r3.h r4 = r8.m10318m()     // Catch: java.lang.Throwable -> L9c
            r9.mo24520j(r6, r15)     // Catch: java.lang.Throwable -> L9c
            f3.e r5 = r13.f18511a     // Catch: java.lang.Throwable -> L9c
            f3.b r5 = r5.getComponents()     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r7 = r5.m24540g(r15, r8)     // Catch: java.lang.Throwable -> L9c
            r9.mo24512r(r6, r7)     // Catch: java.lang.Throwable -> L9c
            o3.c r15 = r13.f18514d     // Catch: java.lang.Throwable -> L9c
            coil.memory.MemoryCache$Key r10 = r15.m17199f(r6, r7, r8, r9)     // Catch: java.lang.Throwable -> L9c
            if (r10 == 0) goto L77
            o3.c r15 = r13.f18514d     // Catch: java.lang.Throwable -> L9c
            coil.memory.MemoryCache$b r15 = r15.m17204a(r6, r10, r2, r4)     // Catch: java.lang.Throwable -> L9c
            goto L78
        L77:
            r15 = 0
        L78:
            if (r15 == 0) goto L81
            o3.c r0 = r13.f18514d     // Catch: java.lang.Throwable -> L9c
            q3.n r14 = r0.m17198g(r14, r6, r10, r15)     // Catch: java.lang.Throwable -> L9c
            return r14
        L81:
            td.e0 r15 = r6.m10358v()     // Catch: java.lang.Throwable -> L9c
            l3.a$h r2 = new l3.a$h     // Catch: java.lang.Throwable -> L9c
            r12 = 0
            r4 = r2
            r5 = r13
            r11 = r14
            r4.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L9c
            r0.f18562w = r13     // Catch: java.lang.Throwable -> L9c
            r0.f18563x = r14     // Catch: java.lang.Throwable -> L9c
            r0.f18561A = r3     // Catch: java.lang.Throwable -> L9c
            java.lang.Object r15 = kotlinx.coroutines.C6769b.m20164g(r15, r2, r0)     // Catch: java.lang.Throwable -> L9c
            if (r15 != r1) goto L9b
            return r1
        L9b:
            return r15
        L9c:
            r15 = move-exception
            r0 = r13
        L9e:
            boolean r1 = r15 instanceof java.util.concurrent.CancellationException
            if (r1 != 0) goto Lad
            q3.m r0 = r0.f18512b
            q3.g r14 = r14.mo19669b()
            q3.d r14 = r0.m10309b(r14, r15)
            return r14
        Lad:
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: p213l3.C6968a.mo19671a(l3.b$a, bd.d):java.lang.Object");
    }

    /* renamed from: k */
    public final Object m19681k(C6970b c6970b, C9629g c9629g, C9635k c9635k, InterfaceC5351c interfaceC5351c, InterfaceC1886d<? super C6970b> interfaceC1886d) {
        List<InterfaceC10379c> m10383O = c9629g.m10383O();
        if (m10383O.isEmpty()) {
            return c6970b;
        }
        if (!(c6970b.m19676e() instanceof BitmapDrawable) && !c9629g.m10373g()) {
            InterfaceC11108q interfaceC11108q = this.f18513c;
            if (interfaceC11108q != null && interfaceC11108q.m6116a() <= 4) {
                String canonicalName = c6970b.m19676e().getClass().getCanonicalName();
                interfaceC11108q.m6115b("EngineInterceptor", 4, "allowConversionToBitmap=false, skipping transformations for type " + canonicalName + '.', null);
            }
            return c6970b;
        }
        return C6769b.m20164g(c9629g.m10384N(), new C6977i(c6970b, c9635k, m10383O, interfaceC5351c, c9629g, null), interfaceC1886d);
    }
}
