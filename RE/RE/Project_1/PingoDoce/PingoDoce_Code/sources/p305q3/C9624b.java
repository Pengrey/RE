package p305q3;

import android.graphics.Bitmap;
import androidx.lifecycle.AbstractC1469p;
import coil.request.EnumC2188a;
import p181jd.Intrinsics;
import p327r3.EnumC9801e;
import p327r3.EnumC9804h;
import p327r3.InterfaceC9807j;
import p376u3.InterfaceC10823c;
import td.AbstractC10505e0;

/* renamed from: q3.b */
/* loaded from: classes.dex */
public final class C9624b {

    /* renamed from: a */
    private final AbstractC1469p f25315a;

    /* renamed from: b */
    private final InterfaceC9807j f25316b;

    /* renamed from: c */
    private final EnumC9804h f25317c;

    /* renamed from: d */
    private final AbstractC10505e0 f25318d;

    /* renamed from: e */
    private final AbstractC10505e0 f25319e;

    /* renamed from: f */
    private final AbstractC10505e0 f25320f;

    /* renamed from: g */
    private final AbstractC10505e0 f25321g;

    /* renamed from: h */
    private final InterfaceC10823c.InterfaceC10824a f25322h;

    /* renamed from: i */
    private final EnumC9801e f25323i;

    /* renamed from: j */
    private final Bitmap.Config f25324j;

    /* renamed from: k */
    private final Boolean f25325k;

    /* renamed from: l */
    private final Boolean f25326l;

    /* renamed from: m */
    private final EnumC2188a f25327m;

    /* renamed from: n */
    private final EnumC2188a f25328n;

    /* renamed from: o */
    private final EnumC2188a f25329o;

    public C9624b(AbstractC1469p abstractC1469p, InterfaceC9807j interfaceC9807j, EnumC9804h enumC9804h, AbstractC10505e0 abstractC10505e0, AbstractC10505e0 abstractC10505e02, AbstractC10505e0 abstractC10505e03, AbstractC10505e0 abstractC10505e04, InterfaceC10823c.InterfaceC10824a interfaceC10824a, EnumC9801e enumC9801e, Bitmap.Config config, Boolean bool, Boolean bool2, EnumC2188a enumC2188a, EnumC2188a enumC2188a2, EnumC2188a enumC2188a3) {
        this.f25315a = abstractC1469p;
        this.f25316b = interfaceC9807j;
        this.f25317c = enumC9804h;
        this.f25318d = abstractC10505e0;
        this.f25319e = abstractC10505e02;
        this.f25320f = abstractC10505e03;
        this.f25321g = abstractC10505e04;
        this.f25322h = interfaceC10824a;
        this.f25323i = enumC9801e;
        this.f25324j = config;
        this.f25325k = bool;
        this.f25326l = bool2;
        this.f25327m = enumC2188a;
        this.f25328n = enumC2188a2;
        this.f25329o = enumC2188a3;
    }

    /* renamed from: a */
    public final Boolean m10418a() {
        return this.f25325k;
    }

    /* renamed from: b */
    public final Boolean m10417b() {
        return this.f25326l;
    }

    /* renamed from: c */
    public final Bitmap.Config m10416c() {
        return this.f25324j;
    }

    /* renamed from: d */
    public final AbstractC10505e0 m10415d() {
        return this.f25320f;
    }

    /* renamed from: e */
    public final EnumC2188a m10414e() {
        return this.f25328n;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9624b) {
            C9624b c9624b = (C9624b) obj;
            if (Intrinsics.equals(this.f25315a, c9624b.f25315a) && Intrinsics.equals(this.f25316b, c9624b.f25316b) && this.f25317c == c9624b.f25317c && Intrinsics.equals(this.f25318d, c9624b.f25318d) && Intrinsics.equals(this.f25319e, c9624b.f25319e) && Intrinsics.equals(this.f25320f, c9624b.f25320f) && Intrinsics.equals(this.f25321g, c9624b.f25321g) && Intrinsics.equals(this.f25322h, c9624b.f25322h) && this.f25323i == c9624b.f25323i && this.f25324j == c9624b.f25324j && Intrinsics.equals(this.f25325k, c9624b.f25325k) && Intrinsics.equals(this.f25326l, c9624b.f25326l) && this.f25327m == c9624b.f25327m && this.f25328n == c9624b.f25328n && this.f25329o == c9624b.f25329o) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public final AbstractC10505e0 m10413f() {
        return this.f25319e;
    }

    /* renamed from: g */
    public final AbstractC10505e0 m10412g() {
        return this.f25318d;
    }

    /* renamed from: h */
    public final AbstractC1469p m10411h() {
        return this.f25315a;
    }

    public int hashCode() {
        AbstractC1469p abstractC1469p = this.f25315a;
        int hashCode = (abstractC1469p != null ? abstractC1469p.hashCode() : 0) * 31;
        InterfaceC9807j interfaceC9807j = this.f25316b;
        int hashCode2 = (hashCode + (interfaceC9807j != null ? interfaceC9807j.hashCode() : 0)) * 31;
        EnumC9804h enumC9804h = this.f25317c;
        int hashCode3 = (hashCode2 + (enumC9804h != null ? enumC9804h.hashCode() : 0)) * 31;
        AbstractC10505e0 abstractC10505e0 = this.f25318d;
        int hashCode4 = (hashCode3 + (abstractC10505e0 != null ? abstractC10505e0.hashCode() : 0)) * 31;
        AbstractC10505e0 abstractC10505e02 = this.f25319e;
        int hashCode5 = (hashCode4 + (abstractC10505e02 != null ? abstractC10505e02.hashCode() : 0)) * 31;
        AbstractC10505e0 abstractC10505e03 = this.f25320f;
        int hashCode6 = (hashCode5 + (abstractC10505e03 != null ? abstractC10505e03.hashCode() : 0)) * 31;
        AbstractC10505e0 abstractC10505e04 = this.f25321g;
        int hashCode7 = (hashCode6 + (abstractC10505e04 != null ? abstractC10505e04.hashCode() : 0)) * 31;
        InterfaceC10823c.InterfaceC10824a interfaceC10824a = this.f25322h;
        int hashCode8 = (hashCode7 + (interfaceC10824a != null ? interfaceC10824a.hashCode() : 0)) * 31;
        EnumC9801e enumC9801e = this.f25323i;
        int hashCode9 = (hashCode8 + (enumC9801e != null ? enumC9801e.hashCode() : 0)) * 31;
        Bitmap.Config config = this.f25324j;
        int hashCode10 = (hashCode9 + (config != null ? config.hashCode() : 0)) * 31;
        Boolean bool = this.f25325k;
        int hashCode11 = (hashCode10 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.f25326l;
        int hashCode12 = (hashCode11 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        EnumC2188a enumC2188a = this.f25327m;
        int hashCode13 = (hashCode12 + (enumC2188a != null ? enumC2188a.hashCode() : 0)) * 31;
        EnumC2188a enumC2188a2 = this.f25328n;
        int hashCode14 = (hashCode13 + (enumC2188a2 != null ? enumC2188a2.hashCode() : 0)) * 31;
        EnumC2188a enumC2188a3 = this.f25329o;
        return hashCode14 + (enumC2188a3 != null ? enumC2188a3.hashCode() : 0);
    }

    /* renamed from: i */
    public final EnumC2188a m10410i() {
        return this.f25327m;
    }

    /* renamed from: j */
    public final EnumC2188a m10409j() {
        return this.f25329o;
    }

    /* renamed from: k */
    public final EnumC9801e m10408k() {
        return this.f25323i;
    }

    /* renamed from: l */
    public final EnumC9804h m10407l() {
        return this.f25317c;
    }

    /* renamed from: m */
    public final InterfaceC9807j m10406m() {
        return this.f25316b;
    }

    /* renamed from: n */
    public final AbstractC10505e0 m10405n() {
        return this.f25321g;
    }

    /* renamed from: o */
    public final InterfaceC10823c.InterfaceC10824a m10404o() {
        return this.f25322h;
    }
}
