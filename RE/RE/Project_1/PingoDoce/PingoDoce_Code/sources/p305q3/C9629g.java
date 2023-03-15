package p305q3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.View;
import android.widget.ImageView;
import androidx.lifecycle.AbstractC1469p;
import coil.memory.MemoryCache;
import coil.request.EnumC2188a;
import coil.target.ImageViewTarget;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p107ff.Headers;
import p129h3.InterfaceC5830g;
import p181jd.Intrinsics;
import p305q3.C9636l;
import p327r3.C9800d;
import p327r3.C9805i;
import p327r3.C9808k;
import p327r3.C9813m;
import p327r3.EnumC9801e;
import p327r3.EnumC9804h;
import p327r3.InterfaceC9807j;
import p327r3.InterfaceC9809l;
import p349s3.InterfaceC10041a;
import p349s3.InterfaceC10042b;
import p361t3.InterfaceC10379c;
import p376u3.C10819a;
import p376u3.InterfaceC10823c;
import p396v3.C11091c;
import p396v3.C11092d;
import p396v3.C11096h;
import p396v3.C11098i;
import p468yc.C13182l;
import p489zc.C13769l0;
import p489zc.C13780s;
import p489zc._Arrays;
import td.AbstractC10505e0;

/* renamed from: q3.g */
/* loaded from: classes.dex */
public final class C9629g {

    /* renamed from: A */
    private final AbstractC1469p f25336A;

    /* renamed from: B */
    private final InterfaceC9807j f25337B;

    /* renamed from: C */
    private final EnumC9804h f25338C;

    /* renamed from: D */
    private final C9636l f25339D;

    /* renamed from: E */
    private final MemoryCache.Key f25340E;

    /* renamed from: F */
    private final Integer f25341F;

    /* renamed from: G */
    private final Drawable f25342G;

    /* renamed from: H */
    private final Integer f25343H;

    /* renamed from: I */
    private final Drawable f25344I;

    /* renamed from: J */
    private final Integer f25345J;

    /* renamed from: K */
    private final Drawable f25346K;

    /* renamed from: L */
    private final C9624b f25347L;

    /* renamed from: M */
    private final C9623a f25348M;

    /* renamed from: a */
    private final Context f25349a;

    /* renamed from: b */
    private final Object f25350b;

    /* renamed from: c */
    private final InterfaceC10041a f25351c;

    /* renamed from: d */
    private final InterfaceC9631b f25352d;

    /* renamed from: e */
    private final MemoryCache.Key f25353e;

    /* renamed from: f */
    private final String f25354f;

    /* renamed from: g */
    private final Bitmap.Config f25355g;

    /* renamed from: h */
    private final ColorSpace f25356h;

    /* renamed from: i */
    private final EnumC9801e f25357i;

    /* renamed from: j */
    private final C13182l f25358j;

    /* renamed from: k */
    private final InterfaceC5830g.InterfaceC5831a f25359k;

    /* renamed from: l */
    private final List f25360l;

    /* renamed from: m */
    private final InterfaceC10823c.InterfaceC10824a f25361m;

    /* renamed from: n */
    private final Headers f25362n;

    /* renamed from: o */
    private final C9642o f25363o;

    /* renamed from: p */
    private final boolean f25364p;

    /* renamed from: q */
    private final boolean f25365q;

    /* renamed from: r */
    private final boolean f25366r;

    /* renamed from: s */
    private final boolean f25367s;

    /* renamed from: t */
    private final EnumC2188a f25368t;

    /* renamed from: u */
    private final EnumC2188a f25369u;

    /* renamed from: v */
    private final EnumC2188a f25370v;

    /* renamed from: w */
    private final AbstractC10505e0 f25371w;

    /* renamed from: x */
    private final AbstractC10505e0 f25372x;

    /* renamed from: y */
    private final AbstractC10505e0 f25373y;

    /* renamed from: z */
    private final AbstractC10505e0 f25374z;

    /* compiled from: ImageRequest.kt */
    /* renamed from: q3.g$b */
    /* loaded from: classes.dex */
    public interface InterfaceC9631b {
        /* renamed from: a */
        void mo24529a(C9629g c9629g);

        /* renamed from: b */
        void mo24528b(C9629g c9629g, C9626d c9626d);

        /* renamed from: c */
        void mo24527c(C9629g c9629g);

        /* renamed from: d */
        void mo24526d(C9629g c9629g, C9641n c9641n);
    }

    private C9629g(Context context, Object obj, InterfaceC10041a interfaceC10041a, InterfaceC9631b interfaceC9631b, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, EnumC9801e enumC9801e, C13182l c13182l, InterfaceC5830g.InterfaceC5831a interfaceC5831a, List list, InterfaceC10823c.InterfaceC10824a interfaceC10824a, Headers headers, C9642o c9642o, boolean z, boolean z2, boolean z3, boolean z4, EnumC2188a enumC2188a, EnumC2188a enumC2188a2, EnumC2188a enumC2188a3, AbstractC10505e0 abstractC10505e0, AbstractC10505e0 abstractC10505e02, AbstractC10505e0 abstractC10505e03, AbstractC10505e0 abstractC10505e04, AbstractC1469p abstractC1469p, InterfaceC9807j interfaceC9807j, EnumC9804h enumC9804h, C9636l c9636l, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, C9624b c9624b, C9623a c9623a) {
        this.f25349a = context;
        this.f25350b = obj;
        this.f25351c = interfaceC10041a;
        this.f25352d = interfaceC9631b;
        this.f25353e = key;
        this.f25354f = str;
        this.f25355g = config;
        this.f25356h = colorSpace;
        this.f25357i = enumC9801e;
        this.f25358j = c13182l;
        this.f25359k = interfaceC5831a;
        this.f25360l = list;
        this.f25361m = interfaceC10824a;
        this.f25362n = headers;
        this.f25363o = c9642o;
        this.f25364p = z;
        this.f25365q = z2;
        this.f25366r = z3;
        this.f25367s = z4;
        this.f25368t = enumC2188a;
        this.f25369u = enumC2188a2;
        this.f25370v = enumC2188a3;
        this.f25371w = abstractC10505e0;
        this.f25372x = abstractC10505e02;
        this.f25373y = abstractC10505e03;
        this.f25374z = abstractC10505e04;
        this.f25336A = abstractC1469p;
        this.f25337B = interfaceC9807j;
        this.f25338C = enumC9804h;
        this.f25339D = c9636l;
        this.f25340E = key2;
        this.f25341F = num;
        this.f25342G = drawable;
        this.f25343H = num2;
        this.f25344I = drawable2;
        this.f25345J = num3;
        this.f25346K = drawable3;
        this.f25347L = c9624b;
        this.f25348M = c9623a;
    }

    public /* synthetic */ C9629g(Context context, Object obj, InterfaceC10041a interfaceC10041a, InterfaceC9631b interfaceC9631b, MemoryCache.Key key, String str, Bitmap.Config config, ColorSpace colorSpace, EnumC9801e enumC9801e, C13182l c13182l, InterfaceC5830g.InterfaceC5831a interfaceC5831a, List list, InterfaceC10823c.InterfaceC10824a interfaceC10824a, Headers headers, C9642o c9642o, boolean z, boolean z2, boolean z3, boolean z4, EnumC2188a enumC2188a, EnumC2188a enumC2188a2, EnumC2188a enumC2188a3, AbstractC10505e0 abstractC10505e0, AbstractC10505e0 abstractC10505e02, AbstractC10505e0 abstractC10505e03, AbstractC10505e0 abstractC10505e04, AbstractC1469p abstractC1469p, InterfaceC9807j interfaceC9807j, EnumC9804h enumC9804h, C9636l c9636l, MemoryCache.Key key2, Integer num, Drawable drawable, Integer num2, Drawable drawable2, Integer num3, Drawable drawable3, C9624b c9624b, C9623a c9623a, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, obj, interfaceC10041a, interfaceC9631b, key, str, config, colorSpace, enumC9801e, c13182l, interfaceC5831a, list, interfaceC10824a, headers, c9642o, z, z2, z3, z4, enumC2188a, enumC2188a2, enumC2188a3, abstractC10505e0, abstractC10505e02, abstractC10505e03, abstractC10505e04, abstractC1469p, interfaceC9807j, enumC9804h, c9636l, key2, num, drawable, num2, drawable2, num3, drawable3, c9624b, c9623a);
    }

    /* renamed from: R */
    public static /* synthetic */ C9630a m10380R(C9629g c9629g, Context context, int i, Object obj) {
        if ((i & 1) != 0) {
            context = c9629g.f25349a;
        }
        return c9629g.m10381Q(context);
    }

    /* renamed from: a */
    public static final /* synthetic */ Drawable m10379a(C9629g c9629g) {
        return c9629g.f25344I;
    }

    /* renamed from: b */
    public static final /* synthetic */ Integer m10378b(C9629g c9629g) {
        return c9629g.f25343H;
    }

    /* renamed from: c */
    public static final /* synthetic */ Drawable m10377c(C9629g c9629g) {
        return c9629g.f25346K;
    }

    /* renamed from: d */
    public static final /* synthetic */ Integer m10376d(C9629g c9629g) {
        return c9629g.f25345J;
    }

    /* renamed from: e */
    public static final /* synthetic */ Drawable m10375e(C9629g c9629g) {
        return c9629g.f25342G;
    }

    /* renamed from: f */
    public static final /* synthetic */ Integer m10374f(C9629g c9629g) {
        return c9629g.f25341F;
    }

    /* renamed from: A */
    public final InterfaceC9631b m10397A() {
        return this.f25352d;
    }

    /* renamed from: B */
    public final MemoryCache.Key m10396B() {
        return this.f25353e;
    }

    /* renamed from: C */
    public final EnumC2188a m10395C() {
        return this.f25368t;
    }

    /* renamed from: D */
    public final EnumC2188a m10394D() {
        return this.f25370v;
    }

    /* renamed from: E */
    public final C9636l m10393E() {
        return this.f25339D;
    }

    /* renamed from: F */
    public final Drawable m10392F() {
        return C11096h.m6157c(this, this.f25342G, this.f25341F, this.f25348M.m10422l());
    }

    /* renamed from: G */
    public final MemoryCache.Key m10391G() {
        return this.f25340E;
    }

    /* renamed from: H */
    public final EnumC9801e m10390H() {
        return this.f25357i;
    }

    /* renamed from: I */
    public final boolean m10389I() {
        return this.f25367s;
    }

    /* renamed from: J */
    public final EnumC9804h m10388J() {
        return this.f25338C;
    }

    /* renamed from: K */
    public final InterfaceC9807j m10387K() {
        return this.f25337B;
    }

    /* renamed from: L */
    public final C9642o m10386L() {
        return this.f25363o;
    }

    /* renamed from: M */
    public final InterfaceC10041a m10385M() {
        return this.f25351c;
    }

    /* renamed from: N */
    public final AbstractC10505e0 m10384N() {
        return this.f25374z;
    }

    /* renamed from: O */
    public final List m10383O() {
        return this.f25360l;
    }

    /* renamed from: P */
    public final InterfaceC10823c.InterfaceC10824a m10382P() {
        return this.f25361m;
    }

    /* renamed from: Q */
    public final C9630a m10381Q(Context context) {
        return new C9630a(this, context);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9629g) {
            C9629g c9629g = (C9629g) obj;
            if (Intrinsics.equals(this.f25349a, c9629g.f25349a) && Intrinsics.equals(this.f25350b, c9629g.f25350b) && Intrinsics.equals(this.f25351c, c9629g.f25351c) && Intrinsics.equals(this.f25352d, c9629g.f25352d) && Intrinsics.equals(this.f25353e, c9629g.f25353e) && Intrinsics.equals(this.f25354f, c9629g.f25354f) && this.f25355g == c9629g.f25355g && ((Build.VERSION.SDK_INT < 26 || Intrinsics.equals(this.f25356h, c9629g.f25356h)) && this.f25357i == c9629g.f25357i && Intrinsics.equals(this.f25358j, c9629g.f25358j) && Intrinsics.equals(this.f25359k, c9629g.f25359k) && Intrinsics.equals(this.f25360l, c9629g.f25360l) && Intrinsics.equals(this.f25361m, c9629g.f25361m) && Intrinsics.equals(this.f25362n, c9629g.f25362n) && Intrinsics.equals(this.f25363o, c9629g.f25363o) && this.f25364p == c9629g.f25364p && this.f25365q == c9629g.f25365q && this.f25366r == c9629g.f25366r && this.f25367s == c9629g.f25367s && this.f25368t == c9629g.f25368t && this.f25369u == c9629g.f25369u && this.f25370v == c9629g.f25370v && Intrinsics.equals(this.f25371w, c9629g.f25371w) && Intrinsics.equals(this.f25372x, c9629g.f25372x) && Intrinsics.equals(this.f25373y, c9629g.f25373y) && Intrinsics.equals(this.f25374z, c9629g.f25374z) && Intrinsics.equals(this.f25340E, c9629g.f25340E) && Intrinsics.equals(this.f25341F, c9629g.f25341F) && Intrinsics.equals(this.f25342G, c9629g.f25342G) && Intrinsics.equals(this.f25343H, c9629g.f25343H) && Intrinsics.equals(this.f25344I, c9629g.f25344I) && Intrinsics.equals(this.f25345J, c9629g.f25345J) && Intrinsics.equals(this.f25346K, c9629g.f25346K) && Intrinsics.equals(this.f25336A, c9629g.f25336A) && Intrinsics.equals(this.f25337B, c9629g.f25337B) && this.f25338C == c9629g.f25338C && Intrinsics.equals(this.f25339D, c9629g.f25339D) && Intrinsics.equals(this.f25347L, c9629g.f25347L) && Intrinsics.equals(this.f25348M, c9629g.f25348M))) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: g */
    public final boolean m10373g() {
        return this.f25364p;
    }

    /* renamed from: h */
    public final boolean m10372h() {
        return this.f25365q;
    }

    public int hashCode() {
        int hashCode = ((this.f25349a.hashCode() * 31) + this.f25350b.hashCode()) * 31;
        InterfaceC10041a interfaceC10041a = this.f25351c;
        int hashCode2 = (hashCode + (interfaceC10041a != null ? interfaceC10041a.hashCode() : 0)) * 31;
        InterfaceC9631b interfaceC9631b = this.f25352d;
        int hashCode3 = (hashCode2 + (interfaceC9631b != null ? interfaceC9631b.hashCode() : 0)) * 31;
        MemoryCache.Key key = this.f25353e;
        int hashCode4 = (hashCode3 + (key != null ? key.hashCode() : 0)) * 31;
        String str = this.f25354f;
        int hashCode5 = (((hashCode4 + (str != null ? str.hashCode() : 0)) * 31) + this.f25355g.hashCode()) * 31;
        ColorSpace colorSpace = this.f25356h;
        int hashCode6 = (((hashCode5 + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.f25357i.hashCode()) * 31;
        C13182l c13182l = this.f25358j;
        int hashCode7 = (hashCode6 + (c13182l != null ? c13182l.hashCode() : 0)) * 31;
        InterfaceC5830g.InterfaceC5831a interfaceC5831a = this.f25359k;
        int hashCode8 = (((((((((((((((((((((((((((((((((((((((hashCode7 + (interfaceC5831a != null ? interfaceC5831a.hashCode() : 0)) * 31) + this.f25360l.hashCode()) * 31) + this.f25361m.hashCode()) * 31) + this.f25362n.hashCode()) * 31) + this.f25363o.hashCode()) * 31) + Boolean.hashCode(this.f25364p)) * 31) + Boolean.hashCode(this.f25365q)) * 31) + Boolean.hashCode(this.f25366r)) * 31) + Boolean.hashCode(this.f25367s)) * 31) + this.f25368t.hashCode()) * 31) + this.f25369u.hashCode()) * 31) + this.f25370v.hashCode()) * 31) + this.f25371w.hashCode()) * 31) + this.f25372x.hashCode()) * 31) + this.f25373y.hashCode()) * 31) + this.f25374z.hashCode()) * 31) + this.f25336A.hashCode()) * 31) + this.f25337B.hashCode()) * 31) + this.f25338C.hashCode()) * 31) + this.f25339D.hashCode()) * 31;
        MemoryCache.Key key2 = this.f25340E;
        int hashCode9 = (hashCode8 + (key2 != null ? key2.hashCode() : 0)) * 31;
        Integer num = this.f25341F;
        int hashCode10 = (hashCode9 + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.f25342G;
        int hashCode11 = (hashCode10 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.f25343H;
        int hashCode12 = (hashCode11 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f25344I;
        int hashCode13 = (hashCode12 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Integer num3 = this.f25345J;
        int hashCode14 = (hashCode13 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f25346K;
        return ((((hashCode14 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.f25347L.hashCode()) * 31) + this.f25348M.hashCode();
    }

    /* renamed from: i */
    public final boolean m10371i() {
        return this.f25366r;
    }

    /* renamed from: j */
    public final Bitmap.Config m10370j() {
        return this.f25355g;
    }

    /* renamed from: k */
    public final ColorSpace m10369k() {
        return this.f25356h;
    }

    /* renamed from: l */
    public final Context m10368l() {
        return this.f25349a;
    }

    /* renamed from: m */
    public final Object m10367m() {
        return this.f25350b;
    }

    /* renamed from: n */
    public final AbstractC10505e0 m10366n() {
        return this.f25373y;
    }

    /* renamed from: o */
    public final InterfaceC5830g.InterfaceC5831a m10365o() {
        return this.f25359k;
    }

    /* renamed from: p */
    public final C9623a m10364p() {
        return this.f25348M;
    }

    /* renamed from: q */
    public final C9624b m10363q() {
        return this.f25347L;
    }

    /* renamed from: r */
    public final String m10362r() {
        return this.f25354f;
    }

    /* renamed from: s */
    public final EnumC2188a m10361s() {
        return this.f25369u;
    }

    /* renamed from: t */
    public final Drawable m10360t() {
        return C11096h.m6157c(this, this.f25344I, this.f25343H, this.f25348M.m10428f());
    }

    /* renamed from: u */
    public final Drawable m10359u() {
        return C11096h.m6157c(this, this.f25346K, this.f25345J, this.f25348M.m10427g());
    }

    /* renamed from: v */
    public final AbstractC10505e0 m10358v() {
        return this.f25372x;
    }

    /* renamed from: w */
    public final C13182l m10357w() {
        return this.f25358j;
    }

    /* renamed from: x */
    public final Headers m10356x() {
        return this.f25362n;
    }

    /* renamed from: y */
    public final AbstractC10505e0 m10355y() {
        return this.f25371w;
    }

    /* renamed from: z */
    public final AbstractC1469p m10354z() {
        return this.f25336A;
    }

    /* compiled from: ImageRequest.kt */
    /* renamed from: q3.g$a */
    /* loaded from: classes.dex */
    public static final class C9630a {

        /* renamed from: A */
        private AbstractC10505e0 f25375A;

        /* renamed from: B */
        private C9636l.C9637a f25376B;

        /* renamed from: C */
        private MemoryCache.Key f25377C;

        /* renamed from: D */
        private Integer f25378D;

        /* renamed from: E */
        private Drawable f25379E;

        /* renamed from: F */
        private Integer f25380F;

        /* renamed from: G */
        private Drawable f25381G;

        /* renamed from: H */
        private Integer f25382H;

        /* renamed from: I */
        private Drawable f25383I;

        /* renamed from: J */
        private AbstractC1469p f25384J;

        /* renamed from: K */
        private InterfaceC9807j f25385K;

        /* renamed from: L */
        private EnumC9804h f25386L;

        /* renamed from: M */
        private AbstractC1469p f25387M;

        /* renamed from: N */
        private InterfaceC9807j f25388N;

        /* renamed from: O */
        private EnumC9804h f25389O;

        /* renamed from: a */
        private final Context f25390a;

        /* renamed from: b */
        private C9623a f25391b;

        /* renamed from: c */
        private Object f25392c;

        /* renamed from: d */
        private InterfaceC10041a f25393d;

        /* renamed from: e */
        private InterfaceC9631b f25394e;

        /* renamed from: f */
        private MemoryCache.Key f25395f;

        /* renamed from: g */
        private String f25396g;

        /* renamed from: h */
        private Bitmap.Config f25397h;

        /* renamed from: i */
        private ColorSpace f25398i;

        /* renamed from: j */
        private EnumC9801e f25399j;

        /* renamed from: k */
        private C13182l f25400k;

        /* renamed from: l */
        private InterfaceC5830g.InterfaceC5831a f25401l;

        /* renamed from: m */
        private List f25402m;

        /* renamed from: n */
        private InterfaceC10823c.InterfaceC10824a f25403n;

        /* renamed from: o */
        private Headers.C5498a f25404o;

        /* renamed from: p */
        private Map f25405p;

        /* renamed from: q */
        private boolean f25406q;

        /* renamed from: r */
        private Boolean f25407r;

        /* renamed from: s */
        private Boolean f25408s;

        /* renamed from: t */
        private boolean f25409t;

        /* renamed from: u */
        private EnumC2188a f25410u;

        /* renamed from: v */
        private EnumC2188a f25411v;

        /* renamed from: w */
        private EnumC2188a f25412w;

        /* renamed from: x */
        private AbstractC10505e0 f25413x;

        /* renamed from: y */
        private AbstractC10505e0 f25414y;

        /* renamed from: z */
        private AbstractC10505e0 f25415z;

        public C9630a(Context context) {
            List m197g;
            this.f25390a = context;
            this.f25391b = C11096h.m6158b();
            this.f25392c = null;
            this.f25393d = null;
            this.f25394e = null;
            this.f25395f = null;
            this.f25396g = null;
            this.f25397h = null;
            if (Build.VERSION.SDK_INT >= 26) {
                this.f25398i = null;
            }
            this.f25399j = null;
            this.f25400k = null;
            this.f25401l = null;
            m197g = C13780s.m197g();
            this.f25402m = m197g;
            this.f25403n = null;
            this.f25404o = null;
            this.f25405p = null;
            this.f25406q = true;
            this.f25407r = null;
            this.f25408s = null;
            this.f25409t = true;
            this.f25410u = null;
            this.f25411v = null;
            this.f25412w = null;
            this.f25413x = null;
            this.f25414y = null;
            this.f25415z = null;
            this.f25375A = null;
            this.f25376B = null;
            this.f25377C = null;
            this.f25378D = null;
            this.f25379E = null;
            this.f25380F = null;
            this.f25381G = null;
            this.f25382H = null;
            this.f25383I = null;
            this.f25384J = null;
            this.f25385K = null;
            this.f25386L = null;
            this.f25387M = null;
            this.f25388N = null;
            this.f25389O = null;
        }

        /* renamed from: h */
        private final void m10346h() {
            this.f25389O = null;
        }

        /* renamed from: i */
        private final void m10345i() {
            this.f25387M = null;
            this.f25388N = null;
            this.f25389O = null;
        }

        /* renamed from: j */
        private final AbstractC1469p m10344j() {
            InterfaceC10041a interfaceC10041a = this.f25393d;
            AbstractC1469p m6166c = C11092d.m6166c(interfaceC10041a instanceof InterfaceC10042b ? ((InterfaceC10042b) interfaceC10041a).mo9340j().getContext() : this.f25390a);
            return m6166c == null ? C9628f.f25334b : m6166c;
        }

        /* renamed from: k */
        private final EnumC9804h m10343k() {
            View mo9939j;
            InterfaceC9807j interfaceC9807j = this.f25385K;
            View view = null;
            InterfaceC9809l interfaceC9809l = interfaceC9807j instanceof InterfaceC9809l ? (InterfaceC9809l) interfaceC9807j : null;
            if (interfaceC9809l == null || (mo9939j = interfaceC9809l.mo9939j()) == null) {
                InterfaceC10041a interfaceC10041a = this.f25393d;
                InterfaceC10042b interfaceC10042b = interfaceC10041a instanceof InterfaceC10042b ? (InterfaceC10042b) interfaceC10041a : null;
                if (interfaceC10042b != null) {
                    view = interfaceC10042b.mo9340j();
                }
            } else {
                view = mo9939j;
            }
            if (view instanceof ImageView) {
                return C11098i.m6141o((ImageView) view);
            }
            return EnumC9804h.FIT;
        }

        /* renamed from: l */
        private final InterfaceC9807j m10342l() {
            InterfaceC10041a interfaceC10041a = this.f25393d;
            if (interfaceC10041a instanceof InterfaceC10042b) {
                View mo9340j = ((InterfaceC10042b) interfaceC10041a).mo9340j();
                if (mo9340j instanceof ImageView) {
                    ImageView.ScaleType scaleType = ((ImageView) mo9340j).getScaleType();
                    if (scaleType == ImageView.ScaleType.CENTER || scaleType == ImageView.ScaleType.MATRIX) {
                        return C9808k.m9940a(C9805i.f25744c);
                    }
                }
                return C9813m.m9928b(mo9340j, false, 2, null);
            }
            return new C9800d(this.f25390a);
        }

        /* renamed from: a */
        public final C9629g m10353a() {
            Context context = this.f25390a;
            Object obj = this.f25392c;
            if (obj == null) {
                obj = C9633i.f25416a;
            }
            Object obj2 = obj;
            InterfaceC10041a interfaceC10041a = this.f25393d;
            InterfaceC9631b interfaceC9631b = this.f25394e;
            MemoryCache.Key key = this.f25395f;
            String str = this.f25396g;
            Bitmap.Config config = this.f25397h;
            if (config == null) {
                config = this.f25391b.m10431c();
            }
            Bitmap.Config config2 = config;
            ColorSpace colorSpace = this.f25398i;
            EnumC9801e enumC9801e = this.f25399j;
            if (enumC9801e == null) {
                enumC9801e = this.f25391b.m10421m();
            }
            EnumC9801e enumC9801e2 = enumC9801e;
            C13182l c13182l = this.f25400k;
            InterfaceC5830g.InterfaceC5831a interfaceC5831a = this.f25401l;
            List list = this.f25402m;
            InterfaceC10823c.InterfaceC10824a interfaceC10824a = this.f25403n;
            if (interfaceC10824a == null) {
                interfaceC10824a = this.f25391b.m10419o();
            }
            InterfaceC10823c.InterfaceC10824a interfaceC10824a2 = interfaceC10824a;
            Headers.C5498a c5498a = this.f25404o;
            Headers m6133w = C11098i.m6133w(c5498a != null ? c5498a.m24002f() : null);
            Map map = this.f25405p;
            C9642o m6131y = C11098i.m6131y(map != null ? C9642o.f25448b.m10298a(map) : null);
            boolean z = this.f25406q;
            Boolean bool = this.f25407r;
            boolean booleanValue = bool != null ? bool.booleanValue() : this.f25391b.m10433a();
            Boolean bool2 = this.f25408s;
            boolean booleanValue2 = bool2 != null ? bool2.booleanValue() : this.f25391b.m10432b();
            boolean z2 = this.f25409t;
            EnumC2188a enumC2188a = this.f25410u;
            if (enumC2188a == null) {
                enumC2188a = this.f25391b.m10424j();
            }
            EnumC2188a enumC2188a2 = enumC2188a;
            EnumC2188a enumC2188a3 = this.f25411v;
            if (enumC2188a3 == null) {
                enumC2188a3 = this.f25391b.m10429e();
            }
            EnumC2188a enumC2188a4 = enumC2188a3;
            EnumC2188a enumC2188a5 = this.f25412w;
            if (enumC2188a5 == null) {
                enumC2188a5 = this.f25391b.m10423k();
            }
            EnumC2188a enumC2188a6 = enumC2188a5;
            AbstractC10505e0 abstractC10505e0 = this.f25413x;
            if (abstractC10505e0 == null) {
                abstractC10505e0 = this.f25391b.m10425i();
            }
            AbstractC10505e0 abstractC10505e02 = abstractC10505e0;
            AbstractC10505e0 abstractC10505e03 = this.f25414y;
            if (abstractC10505e03 == null) {
                abstractC10505e03 = this.f25391b.m10426h();
            }
            AbstractC10505e0 abstractC10505e04 = abstractC10505e03;
            AbstractC10505e0 abstractC10505e05 = this.f25415z;
            if (abstractC10505e05 == null) {
                abstractC10505e05 = this.f25391b.m10430d();
            }
            AbstractC10505e0 abstractC10505e06 = abstractC10505e05;
            AbstractC10505e0 abstractC10505e07 = this.f25375A;
            if (abstractC10505e07 == null) {
                abstractC10505e07 = this.f25391b.m10420n();
            }
            AbstractC10505e0 abstractC10505e08 = abstractC10505e07;
            AbstractC1469p abstractC1469p = this.f25384J;
            if (abstractC1469p == null && (abstractC1469p = this.f25387M) == null) {
                abstractC1469p = m10344j();
            }
            AbstractC1469p abstractC1469p2 = abstractC1469p;
            InterfaceC9807j interfaceC9807j = this.f25385K;
            if (interfaceC9807j == null && (interfaceC9807j = this.f25388N) == null) {
                interfaceC9807j = m10342l();
            }
            InterfaceC9807j interfaceC9807j2 = interfaceC9807j;
            EnumC9804h enumC9804h = this.f25386L;
            if (enumC9804h == null && (enumC9804h = this.f25389O) == null) {
                enumC9804h = m10343k();
            }
            EnumC9804h enumC9804h2 = enumC9804h;
            C9636l.C9637a c9637a = this.f25376B;
            return new C9629g(context, obj2, interfaceC10041a, interfaceC9631b, key, str, config2, colorSpace, enumC9801e2, c13182l, interfaceC5831a, list, interfaceC10824a2, m6133w, m6131y, z, booleanValue, booleanValue2, z2, enumC2188a2, enumC2188a4, enumC2188a6, abstractC10505e02, abstractC10505e04, abstractC10505e06, abstractC10505e08, abstractC1469p2, interfaceC9807j2, enumC9804h2, C11098i.m6132x(c9637a != null ? c9637a.m10312a() : null), this.f25377C, this.f25378D, this.f25379E, this.f25380F, this.f25381G, this.f25382H, this.f25383I, new C9624b(this.f25384J, this.f25385K, this.f25386L, this.f25413x, this.f25414y, this.f25415z, this.f25375A, this.f25403n, this.f25399j, this.f25397h, this.f25407r, this.f25408s, this.f25410u, this.f25411v, this.f25412w), this.f25391b, null);
        }

        /* renamed from: b */
        public final C9630a m10352b(int i) {
            InterfaceC10823c.InterfaceC10824a interfaceC10824a;
            if (i > 0) {
                interfaceC10824a = new C10819a.C10820a(i, false, 2, null);
            } else {
                interfaceC10824a = InterfaceC10823c.InterfaceC10824a.f27978a;
            }
            m10337q(interfaceC10824a);
            return this;
        }

        /* renamed from: c */
        public final C9630a m10351c(boolean z) {
            return m10352b(z ? 100 : 0);
        }

        /* renamed from: d */
        public final C9630a m10350d(Object obj) {
            this.f25392c = obj;
            return this;
        }

        /* renamed from: e */
        public final C9630a m10349e(C9623a c9623a) {
            this.f25391b = c9623a;
            m10346h();
            return this;
        }

        /* renamed from: f */
        public final C9630a m10348f(Drawable drawable) {
            this.f25383I = drawable;
            this.f25382H = 0;
            return this;
        }

        /* renamed from: g */
        public final C9630a m10347g(Drawable drawable) {
            this.f25379E = drawable;
            this.f25378D = 0;
            return this;
        }

        /* renamed from: m */
        public final C9630a m10341m(ImageView imageView) {
            return m10340n(new ImageViewTarget(imageView));
        }

        /* renamed from: n */
        public final C9630a m10340n(InterfaceC10041a interfaceC10041a) {
            this.f25393d = interfaceC10041a;
            m10345i();
            return this;
        }

        /* renamed from: o */
        public final C9630a m10339o(List list) {
            this.f25402m = C11091c.m6170a(list);
            return this;
        }

        /* renamed from: p */
        public final C9630a m10338p(InterfaceC10379c... interfaceC10379cArr) {
            List m276R;
            m276R = _Arrays.m276R(interfaceC10379cArr);
            return m10339o(m276R);
        }

        /* renamed from: q */
        public final C9630a m10337q(InterfaceC10823c.InterfaceC10824a interfaceC10824a) {
            this.f25403n = interfaceC10824a;
            return this;
        }

        public C9630a(C9629g c9629g, Context context) {
            Map m322q;
            this.f25390a = context;
            this.f25391b = c9629g.m10364p();
            this.f25392c = c9629g.m10367m();
            this.f25393d = c9629g.m10385M();
            this.f25394e = c9629g.m10397A();
            this.f25395f = c9629g.m10396B();
            this.f25396g = c9629g.m10362r();
            this.f25397h = c9629g.m10363q().m10416c();
            if (Build.VERSION.SDK_INT >= 26) {
                this.f25398i = c9629g.m10369k();
            }
            this.f25399j = c9629g.m10363q().m10408k();
            this.f25400k = c9629g.m10357w();
            this.f25401l = c9629g.m10365o();
            this.f25402m = c9629g.m10383O();
            this.f25403n = c9629g.m10363q().m10404o();
            this.f25404o = c9629g.m10356x().m24011l();
            m322q = C13769l0.m322q(c9629g.m10386L().m10299a());
            this.f25405p = m322q;
            this.f25406q = c9629g.m10373g();
            this.f25407r = c9629g.m10363q().m10418a();
            this.f25408s = c9629g.m10363q().m10417b();
            this.f25409t = c9629g.m10389I();
            this.f25410u = c9629g.m10363q().m10410i();
            this.f25411v = c9629g.m10363q().m10414e();
            this.f25412w = c9629g.m10363q().m10409j();
            this.f25413x = c9629g.m10363q().m10412g();
            this.f25414y = c9629g.m10363q().m10413f();
            this.f25415z = c9629g.m10363q().m10415d();
            this.f25375A = c9629g.m10363q().m10405n();
            this.f25376B = c9629g.m10393E().m10313h();
            this.f25377C = c9629g.m10391G();
            this.f25378D = C9629g.m10374f(c9629g);
            this.f25379E = C9629g.m10375e(c9629g);
            this.f25380F = C9629g.m10378b(c9629g);
            this.f25381G = C9629g.m10379a(c9629g);
            this.f25382H = C9629g.m10376d(c9629g);
            this.f25383I = C9629g.m10377c(c9629g);
            this.f25384J = c9629g.m10363q().m10411h();
            this.f25385K = c9629g.m10363q().m10406m();
            this.f25386L = c9629g.m10363q().m10407l();
            if (c9629g.m10368l() == context) {
                this.f25387M = c9629g.m10354z();
                this.f25388N = c9629g.m10387K();
                this.f25389O = c9629g.m10388J();
                return;
            }
            this.f25387M = null;
            this.f25388N = null;
            this.f25389O = null;
        }
    }
}
