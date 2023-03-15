package p051d0;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p286p1.TextStyle;
import p359t1.AbstractC10364e;
import p359t1.FontWeight;
import p479z1.C13621q;

/* renamed from: d0.i1 */
/* loaded from: classes.dex */
public final class Typography {

    /* renamed from: a */
    private final TextStyle f12461a;

    /* renamed from: b */
    private final TextStyle f12462b;

    /* renamed from: c */
    private final TextStyle f12463c;

    /* renamed from: d */
    private final TextStyle f12464d;

    /* renamed from: e */
    private final TextStyle f12465e;

    /* renamed from: f */
    private final TextStyle f12466f;

    /* renamed from: g */
    private final TextStyle f12467g;

    /* renamed from: h */
    private final TextStyle f12468h;

    /* renamed from: i */
    private final TextStyle f12469i;

    /* renamed from: j */
    private final TextStyle f12470j;

    /* renamed from: k */
    private final TextStyle f12471k;

    /* renamed from: l */
    private final TextStyle f12472l;

    /* renamed from: m */
    private final TextStyle f12473m;

    public Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13) {
        Intrinsics.isThisObjectNull(textStyle, "h1");
        Intrinsics.isThisObjectNull(textStyle2, "h2");
        Intrinsics.isThisObjectNull(textStyle3, "h3");
        Intrinsics.isThisObjectNull(textStyle4, "h4");
        Intrinsics.isThisObjectNull(textStyle5, "h5");
        Intrinsics.isThisObjectNull(textStyle6, "h6");
        Intrinsics.isThisObjectNull(textStyle7, "subtitle1");
        Intrinsics.isThisObjectNull(textStyle8, "subtitle2");
        Intrinsics.isThisObjectNull(textStyle9, "body1");
        Intrinsics.isThisObjectNull(textStyle10, "body2");
        Intrinsics.isThisObjectNull(textStyle11, "button");
        Intrinsics.isThisObjectNull(textStyle12, "caption");
        Intrinsics.isThisObjectNull(textStyle13, "overline");
        this.f12461a = textStyle;
        this.f12462b = textStyle2;
        this.f12463c = textStyle3;
        this.f12464d = textStyle4;
        this.f12465e = textStyle5;
        this.f12466f = textStyle6;
        this.f12467g = textStyle7;
        this.f12468h = textStyle8;
        this.f12469i = textStyle9;
        this.f12470j = textStyle10;
        this.f12471k = textStyle11;
        this.f12472l = textStyle12;
        this.f12473m = textStyle13;
    }

    /* renamed from: a */
    public final TextStyle m27122a() {
        return this.f12469i;
    }

    /* renamed from: b */
    public final TextStyle m27121b() {
        return this.f12470j;
    }

    /* renamed from: c */
    public final TextStyle m27120c() {
        return this.f12471k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Typography) {
            Typography typography = (Typography) obj;
            return Intrinsics.equals(this.f12461a, typography.f12461a) && Intrinsics.equals(this.f12462b, typography.f12462b) && Intrinsics.equals(this.f12463c, typography.f12463c) && Intrinsics.equals(this.f12464d, typography.f12464d) && Intrinsics.equals(this.f12465e, typography.f12465e) && Intrinsics.equals(this.f12466f, typography.f12466f) && Intrinsics.equals(this.f12467g, typography.f12467g) && Intrinsics.equals(this.f12468h, typography.f12468h) && Intrinsics.equals(this.f12469i, typography.f12469i) && Intrinsics.equals(this.f12470j, typography.f12470j) && Intrinsics.equals(this.f12471k, typography.f12471k) && Intrinsics.equals(this.f12472l, typography.f12472l) && Intrinsics.equals(this.f12473m, typography.f12473m);
        }
        return false;
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.f12461a.hashCode() * 31) + this.f12462b.hashCode()) * 31) + this.f12463c.hashCode()) * 31) + this.f12464d.hashCode()) * 31) + this.f12465e.hashCode()) * 31) + this.f12466f.hashCode()) * 31) + this.f12467g.hashCode()) * 31) + this.f12468h.hashCode()) * 31) + this.f12469i.hashCode()) * 31) + this.f12470j.hashCode()) * 31) + this.f12471k.hashCode()) * 31) + this.f12472l.hashCode()) * 31) + this.f12473m.hashCode();
    }

    public String toString() {
        return "Typography(h1=" + this.f12461a + ", h2=" + this.f12462b + ", h3=" + this.f12463c + ", h4=" + this.f12464d + ", h5=" + this.f12465e + ", h6=" + this.f12466f + ", subtitle1=" + this.f12467g + ", subtitle2=" + this.f12468h + ", body1=" + this.f12469i + ", body2=" + this.f12470j + ", button=" + this.f12471k + ", caption=" + this.f12472l + ", overline=" + this.f12473m + ')';
    }

    public /* synthetic */ Typography(AbstractC10364e abstractC10364e, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? AbstractC10364e.f26951w.m8150a() : abstractC10364e, (i & 2) != 0 ? new TextStyle(0L, C13621q.m803c(96), FontWeight.f26976x.m8104b(), null, null, null, null, C13621q.m804b(-1.5d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : textStyle, (i & 4) != 0 ? new TextStyle(0L, C13621q.m803c(60), FontWeight.f26976x.m8104b(), null, null, null, null, C13621q.m804b(-0.5d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : textStyle2, (i & 8) != 0 ? new TextStyle(0L, C13621q.m803c(48), FontWeight.f26976x.m8102d(), null, null, null, null, C13621q.m803c(0), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : textStyle3, (i & 16) != 0 ? new TextStyle(0L, C13621q.m803c(34), FontWeight.f26976x.m8102d(), null, null, null, null, C13621q.m804b(0.25d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : textStyle4, (i & 32) != 0 ? new TextStyle(0L, C13621q.m803c(24), FontWeight.f26976x.m8102d(), null, null, null, null, C13621q.m803c(0), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : textStyle5, (i & 64) != 0 ? new TextStyle(0L, C13621q.m803c(20), FontWeight.f26976x.m8103c(), null, null, null, null, C13621q.m804b(0.15d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : textStyle6, (i & 128) != 0 ? new TextStyle(0L, C13621q.m803c(16), FontWeight.f26976x.m8102d(), null, null, null, null, C13621q.m804b(0.15d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : textStyle7, (i & 256) != 0 ? new TextStyle(0L, C13621q.m803c(14), FontWeight.f26976x.m8103c(), null, null, null, null, C13621q.m804b(0.1d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : textStyle8, (i & 512) != 0 ? new TextStyle(0L, C13621q.m803c(16), FontWeight.f26976x.m8102d(), null, null, null, null, C13621q.m804b(0.5d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : textStyle9, (i & 1024) != 0 ? new TextStyle(0L, C13621q.m803c(14), FontWeight.f26976x.m8102d(), null, null, null, null, C13621q.m804b(0.25d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : textStyle10, (i & 2048) != 0 ? new TextStyle(0L, C13621q.m803c(14), FontWeight.f26976x.m8103c(), null, null, null, null, C13621q.m804b(1.25d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : textStyle11, (i & 4096) != 0 ? new TextStyle(0L, C13621q.m803c(12), FontWeight.f26976x.m8102d(), null, null, null, null, C13621q.m804b(0.4d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : textStyle12, (i & 8192) != 0 ? new TextStyle(0L, C13621q.m803c(10), FontWeight.f26976x.m8102d(), null, null, null, null, C13621q.m804b(1.5d), null, null, null, 0L, null, null, null, null, 0L, null, 262009, null) : textStyle13);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Typography(AbstractC10364e abstractC10364e, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13) {
        this(C4592j1.m27114a(textStyle, abstractC10364e), C4592j1.m27114a(textStyle2, abstractC10364e), C4592j1.m27114a(textStyle3, abstractC10364e), C4592j1.m27114a(textStyle4, abstractC10364e), C4592j1.m27114a(textStyle5, abstractC10364e), C4592j1.m27114a(textStyle6, abstractC10364e), C4592j1.m27114a(textStyle7, abstractC10364e), C4592j1.m27114a(textStyle8, abstractC10364e), C4592j1.m27114a(textStyle9, abstractC10364e), C4592j1.m27114a(textStyle10, abstractC10364e), C4592j1.m27114a(textStyle11, abstractC10364e), C4592j1.m27114a(textStyle12, abstractC10364e), C4592j1.m27114a(textStyle13, abstractC10364e));
        Intrinsics.isThisObjectNull(abstractC10364e, "defaultFontFamily");
        Intrinsics.isThisObjectNull(textStyle, "h1");
        Intrinsics.isThisObjectNull(textStyle2, "h2");
        Intrinsics.isThisObjectNull(textStyle3, "h3");
        Intrinsics.isThisObjectNull(textStyle4, "h4");
        Intrinsics.isThisObjectNull(textStyle5, "h5");
        Intrinsics.isThisObjectNull(textStyle6, "h6");
        Intrinsics.isThisObjectNull(textStyle7, "subtitle1");
        Intrinsics.isThisObjectNull(textStyle8, "subtitle2");
        Intrinsics.isThisObjectNull(textStyle9, "body1");
        Intrinsics.isThisObjectNull(textStyle10, "body2");
        Intrinsics.isThisObjectNull(textStyle11, "button");
        Intrinsics.isThisObjectNull(textStyle12, "caption");
        Intrinsics.isThisObjectNull(textStyle13, "overline");
    }
}
