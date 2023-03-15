package p305q3;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.os.Build;
import coil.request.EnumC2188a;
import p107ff.Headers;
import p181jd.Intrinsics;
import p327r3.C9805i;
import p327r3.EnumC9804h;

/* renamed from: q3.k */
/* loaded from: classes.dex */
public final class C9635k {

    /* renamed from: a */
    private final Context f25418a;

    /* renamed from: b */
    private final Bitmap.Config f25419b;

    /* renamed from: c */
    private final ColorSpace f25420c;

    /* renamed from: d */
    private final C9805i f25421d;

    /* renamed from: e */
    private final EnumC9804h f25422e;

    /* renamed from: f */
    private final boolean f25423f;

    /* renamed from: g */
    private final boolean f25424g;

    /* renamed from: h */
    private final boolean f25425h;

    /* renamed from: i */
    private final String f25426i;

    /* renamed from: j */
    private final Headers f25427j;

    /* renamed from: k */
    private final C9642o f25428k;

    /* renamed from: l */
    private final C9636l f25429l;

    /* renamed from: m */
    private final EnumC2188a f25430m;

    /* renamed from: n */
    private final EnumC2188a f25431n;

    /* renamed from: o */
    private final EnumC2188a f25432o;

    public C9635k(Context context, Bitmap.Config config, ColorSpace colorSpace, C9805i c9805i, EnumC9804h enumC9804h, boolean z, boolean z2, boolean z3, String str, Headers headers, C9642o c9642o, C9636l c9636l, EnumC2188a enumC2188a, EnumC2188a enumC2188a2, EnumC2188a enumC2188a3) {
        this.f25418a = context;
        this.f25419b = config;
        this.f25420c = colorSpace;
        this.f25421d = c9805i;
        this.f25422e = enumC9804h;
        this.f25423f = z;
        this.f25424g = z2;
        this.f25425h = z3;
        this.f25426i = str;
        this.f25427j = headers;
        this.f25428k = c9642o;
        this.f25429l = c9636l;
        this.f25430m = enumC2188a;
        this.f25431n = enumC2188a2;
        this.f25432o = enumC2188a3;
    }

    /* renamed from: b */
    public static /* synthetic */ C9635k m10329b(C9635k c9635k, Context context, Bitmap.Config config, ColorSpace colorSpace, C9805i c9805i, EnumC9804h enumC9804h, boolean z, boolean z2, boolean z3, String str, Headers headers, C9642o c9642o, C9636l c9636l, EnumC2188a enumC2188a, EnumC2188a enumC2188a2, EnumC2188a enumC2188a3, int i, Object obj) {
        return c9635k.m10330a((i & 1) != 0 ? c9635k.f25418a : context, (i & 2) != 0 ? c9635k.f25419b : config, (i & 4) != 0 ? c9635k.f25420c : colorSpace, (i & 8) != 0 ? c9635k.f25421d : c9805i, (i & 16) != 0 ? c9635k.f25422e : enumC9804h, (i & 32) != 0 ? c9635k.f25423f : z, (i & 64) != 0 ? c9635k.f25424g : z2, (i & 128) != 0 ? c9635k.f25425h : z3, (i & 256) != 0 ? c9635k.f25426i : str, (i & 512) != 0 ? c9635k.f25427j : headers, (i & 1024) != 0 ? c9635k.f25428k : c9642o, (i & 2048) != 0 ? c9635k.f25429l : c9636l, (i & 4096) != 0 ? c9635k.f25430m : enumC2188a, (i & 8192) != 0 ? c9635k.f25431n : enumC2188a2, (i & 16384) != 0 ? c9635k.f25432o : enumC2188a3);
    }

    /* renamed from: a */
    public final C9635k m10330a(Context context, Bitmap.Config config, ColorSpace colorSpace, C9805i c9805i, EnumC9804h enumC9804h, boolean z, boolean z2, boolean z3, String str, Headers headers, C9642o c9642o, C9636l c9636l, EnumC2188a enumC2188a, EnumC2188a enumC2188a2, EnumC2188a enumC2188a3) {
        return new C9635k(context, config, colorSpace, c9805i, enumC9804h, z, z2, z3, str, headers, c9642o, c9636l, enumC2188a, enumC2188a2, enumC2188a3);
    }

    /* renamed from: c */
    public final boolean m10328c() {
        return this.f25423f;
    }

    /* renamed from: d */
    public final boolean m10327d() {
        return this.f25424g;
    }

    /* renamed from: e */
    public final ColorSpace m10326e() {
        return this.f25420c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9635k) {
            C9635k c9635k = (C9635k) obj;
            if (Intrinsics.equals(this.f25418a, c9635k.f25418a) && this.f25419b == c9635k.f25419b && ((Build.VERSION.SDK_INT < 26 || Intrinsics.equals(this.f25420c, c9635k.f25420c)) && Intrinsics.equals(this.f25421d, c9635k.f25421d) && this.f25422e == c9635k.f25422e && this.f25423f == c9635k.f25423f && this.f25424g == c9635k.f25424g && this.f25425h == c9635k.f25425h && Intrinsics.equals(this.f25426i, c9635k.f25426i) && Intrinsics.equals(this.f25427j, c9635k.f25427j) && Intrinsics.equals(this.f25428k, c9635k.f25428k) && Intrinsics.equals(this.f25429l, c9635k.f25429l) && this.f25430m == c9635k.f25430m && this.f25431n == c9635k.f25431n && this.f25432o == c9635k.f25432o)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final Bitmap.Config m10325f() {
        return this.f25419b;
    }

    /* renamed from: g */
    public final Context m10324g() {
        return this.f25418a;
    }

    /* renamed from: h */
    public final String m10323h() {
        return this.f25426i;
    }

    public int hashCode() {
        int hashCode = ((this.f25418a.hashCode() * 31) + this.f25419b.hashCode()) * 31;
        ColorSpace colorSpace = this.f25420c;
        int hashCode2 = (((((((((((hashCode + (colorSpace != null ? colorSpace.hashCode() : 0)) * 31) + this.f25421d.hashCode()) * 31) + this.f25422e.hashCode()) * 31) + Boolean.hashCode(this.f25423f)) * 31) + Boolean.hashCode(this.f25424g)) * 31) + Boolean.hashCode(this.f25425h)) * 31;
        String str = this.f25426i;
        return ((((((((((((hashCode2 + (str != null ? str.hashCode() : 0)) * 31) + this.f25427j.hashCode()) * 31) + this.f25428k.hashCode()) * 31) + this.f25429l.hashCode()) * 31) + this.f25430m.hashCode()) * 31) + this.f25431n.hashCode()) * 31) + this.f25432o.hashCode();
    }

    /* renamed from: i */
    public final EnumC2188a m10322i() {
        return this.f25431n;
    }

    /* renamed from: j */
    public final Headers m10321j() {
        return this.f25427j;
    }

    /* renamed from: k */
    public final EnumC2188a m10320k() {
        return this.f25432o;
    }

    /* renamed from: l */
    public final boolean m10319l() {
        return this.f25425h;
    }

    /* renamed from: m */
    public final EnumC9804h m10318m() {
        return this.f25422e;
    }

    /* renamed from: n */
    public final C9805i m10317n() {
        return this.f25421d;
    }

    /* renamed from: o */
    public final C9642o m10316o() {
        return this.f25428k;
    }
}
