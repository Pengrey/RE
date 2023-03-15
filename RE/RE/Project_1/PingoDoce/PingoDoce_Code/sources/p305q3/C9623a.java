package p305q3;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import coil.request.EnumC2188a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p327r3.EnumC9801e;
import p376u3.InterfaceC10823c;
import p396v3.C11098i;
import td.AbstractC10505e0;
import td.C10587w0;

/* renamed from: q3.a */
/* loaded from: classes.dex */
public final class C9623a {

    /* renamed from: a */
    private final AbstractC10505e0 f25300a;

    /* renamed from: b */
    private final AbstractC10505e0 f25301b;

    /* renamed from: c */
    private final AbstractC10505e0 f25302c;

    /* renamed from: d */
    private final AbstractC10505e0 f25303d;

    /* renamed from: e */
    private final InterfaceC10823c.InterfaceC10824a f25304e;

    /* renamed from: f */
    private final EnumC9801e f25305f;

    /* renamed from: g */
    private final Bitmap.Config f25306g;

    /* renamed from: h */
    private final boolean f25307h;

    /* renamed from: i */
    private final boolean f25308i;

    /* renamed from: j */
    private final Drawable f25309j;

    /* renamed from: k */
    private final Drawable f25310k;

    /* renamed from: l */
    private final Drawable f25311l;

    /* renamed from: m */
    private final EnumC2188a f25312m;

    /* renamed from: n */
    private final EnumC2188a f25313n;

    /* renamed from: o */
    private final EnumC2188a f25314o;

    public C9623a() {
        this(null, null, null, null, null, null, null, false, false, null, null, null, null, null, null, 32767, null);
    }

    public C9623a(AbstractC10505e0 abstractC10505e0, AbstractC10505e0 abstractC10505e02, AbstractC10505e0 abstractC10505e03, AbstractC10505e0 abstractC10505e04, InterfaceC10823c.InterfaceC10824a interfaceC10824a, EnumC9801e enumC9801e, Bitmap.Config config, boolean z, boolean z2, Drawable drawable, Drawable drawable2, Drawable drawable3, EnumC2188a enumC2188a, EnumC2188a enumC2188a2, EnumC2188a enumC2188a3) {
        this.f25300a = abstractC10505e0;
        this.f25301b = abstractC10505e02;
        this.f25302c = abstractC10505e03;
        this.f25303d = abstractC10505e04;
        this.f25304e = interfaceC10824a;
        this.f25305f = enumC9801e;
        this.f25306g = config;
        this.f25307h = z;
        this.f25308i = z2;
        this.f25309j = drawable;
        this.f25310k = drawable2;
        this.f25311l = drawable3;
        this.f25312m = enumC2188a;
        this.f25313n = enumC2188a2;
        this.f25314o = enumC2188a3;
    }

    /* renamed from: a */
    public final boolean m10433a() {
        return this.f25307h;
    }

    /* renamed from: b */
    public final boolean m10432b() {
        return this.f25308i;
    }

    /* renamed from: c */
    public final Bitmap.Config m10431c() {
        return this.f25306g;
    }

    /* renamed from: d */
    public final AbstractC10505e0 m10430d() {
        return this.f25302c;
    }

    /* renamed from: e */
    public final EnumC2188a m10429e() {
        return this.f25313n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9623a) {
            C9623a c9623a = (C9623a) obj;
            if (Intrinsics.equals(this.f25300a, c9623a.f25300a) && Intrinsics.equals(this.f25301b, c9623a.f25301b) && Intrinsics.equals(this.f25302c, c9623a.f25302c) && Intrinsics.equals(this.f25303d, c9623a.f25303d) && Intrinsics.equals(this.f25304e, c9623a.f25304e) && this.f25305f == c9623a.f25305f && this.f25306g == c9623a.f25306g && this.f25307h == c9623a.f25307h && this.f25308i == c9623a.f25308i && Intrinsics.equals(this.f25309j, c9623a.f25309j) && Intrinsics.equals(this.f25310k, c9623a.f25310k) && Intrinsics.equals(this.f25311l, c9623a.f25311l) && this.f25312m == c9623a.f25312m && this.f25313n == c9623a.f25313n && this.f25314o == c9623a.f25314o) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final Drawable m10428f() {
        return this.f25310k;
    }

    /* renamed from: g */
    public final Drawable m10427g() {
        return this.f25311l;
    }

    /* renamed from: h */
    public final AbstractC10505e0 m10426h() {
        return this.f25301b;
    }

    public int hashCode() {
        int hashCode = ((((((((((((((((this.f25300a.hashCode() * 31) + this.f25301b.hashCode()) * 31) + this.f25302c.hashCode()) * 31) + this.f25303d.hashCode()) * 31) + this.f25304e.hashCode()) * 31) + this.f25305f.hashCode()) * 31) + this.f25306g.hashCode()) * 31) + Boolean.hashCode(this.f25307h)) * 31) + Boolean.hashCode(this.f25308i)) * 31;
        Drawable drawable = this.f25309j;
        int hashCode2 = (hashCode + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Drawable drawable2 = this.f25310k;
        int hashCode3 = (hashCode2 + (drawable2 != null ? drawable2.hashCode() : 0)) * 31;
        Drawable drawable3 = this.f25311l;
        return ((((((hashCode3 + (drawable3 != null ? drawable3.hashCode() : 0)) * 31) + this.f25312m.hashCode()) * 31) + this.f25313n.hashCode()) * 31) + this.f25314o.hashCode();
    }

    /* renamed from: i */
    public final AbstractC10505e0 m10425i() {
        return this.f25300a;
    }

    /* renamed from: j */
    public final EnumC2188a m10424j() {
        return this.f25312m;
    }

    /* renamed from: k */
    public final EnumC2188a m10423k() {
        return this.f25314o;
    }

    /* renamed from: l */
    public final Drawable m10422l() {
        return this.f25309j;
    }

    /* renamed from: m */
    public final EnumC9801e m10421m() {
        return this.f25305f;
    }

    /* renamed from: n */
    public final AbstractC10505e0 m10420n() {
        return this.f25303d;
    }

    /* renamed from: o */
    public final InterfaceC10823c.InterfaceC10824a m10419o() {
        return this.f25304e;
    }

    public /* synthetic */ C9623a(AbstractC10505e0 abstractC10505e0, AbstractC10505e0 abstractC10505e02, AbstractC10505e0 abstractC10505e03, AbstractC10505e0 abstractC10505e04, InterfaceC10823c.InterfaceC10824a interfaceC10824a, EnumC9801e enumC9801e, Bitmap.Config config, boolean z, boolean z2, Drawable drawable, Drawable drawable2, Drawable drawable3, EnumC2188a enumC2188a, EnumC2188a enumC2188a2, EnumC2188a enumC2188a3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? C10587w0.m7619c().mo7830H0() : abstractC10505e0, (i & 2) != 0 ? C10587w0.m7620b() : abstractC10505e02, (i & 4) != 0 ? C10587w0.m7620b() : abstractC10505e03, (i & 8) != 0 ? C10587w0.m7620b() : abstractC10505e04, (i & 16) != 0 ? InterfaceC10823c.InterfaceC10824a.f27978a : interfaceC10824a, (i & 32) != 0 ? EnumC9801e.AUTOMATIC : enumC9801e, (i & 64) != 0 ? C11098i.m6150f() : config, (i & 128) != 0 ? true : z, (i & 256) != 0 ? false : z2, (i & 512) != 0 ? null : drawable, (i & 1024) != 0 ? null : drawable2, (i & 2048) == 0 ? drawable3 : null, (i & 4096) != 0 ? EnumC2188a.ENABLED : enumC2188a, (i & 8192) != 0 ? EnumC2188a.ENABLED : enumC2188a2, (i & 16384) != 0 ? EnumC2188a.ENABLED : enumC2188a3);
    }
}
