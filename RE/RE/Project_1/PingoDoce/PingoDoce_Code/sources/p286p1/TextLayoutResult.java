package p286p1;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p359t1.InterfaceC10362d;
import p457y1.C13070h;
import p479z1.C13599b;
import p479z1.Density;
import p479z1.EnumC13618o;

/* renamed from: p1.t */
/* loaded from: classes.dex */
public final class TextLayoutResult {

    /* renamed from: a */
    private final AnnotatedString f21701a;

    /* renamed from: b */
    private final TextStyle f21702b;

    /* renamed from: c */
    private final List f21703c;

    /* renamed from: d */
    private final int f21704d;

    /* renamed from: e */
    private final boolean f21705e;

    /* renamed from: f */
    private final int f21706f;

    /* renamed from: g */
    private final Density f21707g;

    /* renamed from: h */
    private final EnumC13618o f21708h;

    /* renamed from: i */
    private final InterfaceC10362d.InterfaceC10363a f21709i;

    /* renamed from: j */
    private final long f21710j;

    private TextLayoutResult(AnnotatedString annotatedString, TextStyle textStyle, List list, int i, boolean z, int i2, Density density, EnumC13618o enumC13618o, InterfaceC10362d.InterfaceC10363a interfaceC10363a, long j) {
        this.f21701a = annotatedString;
        this.f21702b = textStyle;
        this.f21703c = list;
        this.f21704d = i;
        this.f21705e = z;
        this.f21706f = i2;
        this.f21707g = density;
        this.f21708h = enumC13618o;
        this.f21709i = interfaceC10363a;
        this.f21710j = j;
    }

    public /* synthetic */ TextLayoutResult(AnnotatedString annotatedString, TextStyle textStyle, List list, int i, boolean z, int i2, Density density, EnumC13618o enumC13618o, InterfaceC10362d.InterfaceC10363a interfaceC10363a, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this(annotatedString, textStyle, list, i, z, i2, density, enumC13618o, interfaceC10363a, j);
    }

    /* renamed from: b */
    public static /* synthetic */ TextLayoutResult m15576b(TextLayoutResult textLayoutResult, AnnotatedString annotatedString, TextStyle textStyle, List list, int i, boolean z, int i2, Density density, EnumC13618o enumC13618o, InterfaceC10362d.InterfaceC10363a interfaceC10363a, long j, int i3, Object obj) {
        return textLayoutResult.m15577a((i3 & 1) != 0 ? textLayoutResult.f21701a : annotatedString, (i3 & 2) != 0 ? textLayoutResult.f21702b : textStyle, (i3 & 4) != 0 ? textLayoutResult.f21703c : list, (i3 & 8) != 0 ? textLayoutResult.f21704d : i, (i3 & 16) != 0 ? textLayoutResult.f21705e : z, (i3 & 32) != 0 ? textLayoutResult.m15571g() : i2, (i3 & 64) != 0 ? textLayoutResult.f21707g : density, (i3 & 128) != 0 ? textLayoutResult.f21708h : enumC13618o, (i3 & 256) != 0 ? textLayoutResult.f21709i : interfaceC10363a, (i3 & 512) != 0 ? textLayoutResult.m15575c() : j);
    }

    /* renamed from: a */
    public final TextLayoutResult m15577a(AnnotatedString annotatedString, TextStyle textStyle, List list, int i, boolean z, int i2, Density density, EnumC13618o enumC13618o, InterfaceC10362d.InterfaceC10363a interfaceC10363a, long j) {
        Intrinsics.isThisObjectNull(annotatedString, "text");
        Intrinsics.isThisObjectNull(textStyle, "style");
        Intrinsics.isThisObjectNull(list, "placeholders");
        Intrinsics.isThisObjectNull(density, "density");
        Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
        Intrinsics.isThisObjectNull(interfaceC10363a, "resourceLoader");
        return new TextLayoutResult(annotatedString, textStyle, list, i, z, i2, density, enumC13618o, interfaceC10363a, j, null);
    }

    /* renamed from: c */
    public final long m15575c() {
        return this.f21710j;
    }

    /* renamed from: d */
    public final Density m15574d() {
        return this.f21707g;
    }

    /* renamed from: e */
    public final EnumC13618o m15573e() {
        return this.f21708h;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof TextLayoutResult) {
            TextLayoutResult textLayoutResult = (TextLayoutResult) obj;
            return Intrinsics.equals(this.f21701a, textLayoutResult.f21701a) && Intrinsics.equals(this.f21702b, textLayoutResult.f21702b) && Intrinsics.equals(this.f21703c, textLayoutResult.f21703c) && this.f21704d == textLayoutResult.f21704d && this.f21705e == textLayoutResult.f21705e && C13070h.m1692d(m15571g(), textLayoutResult.m15571g()) && Intrinsics.equals(this.f21707g, textLayoutResult.f21707g) && this.f21708h == textLayoutResult.f21708h && Intrinsics.equals(this.f21709i, textLayoutResult.f21709i) && C13599b.m923g(m15575c(), textLayoutResult.m15575c());
        }
        return false;
    }

    /* renamed from: f */
    public final int m15572f() {
        return this.f21704d;
    }

    /* renamed from: g */
    public final int m15571g() {
        return this.f21706f;
    }

    /* renamed from: h */
    public final List m15570h() {
        return this.f21703c;
    }

    public int hashCode() {
        return (((((((((((((((((this.f21701a.hashCode() * 31) + this.f21702b.hashCode()) * 31) + this.f21703c.hashCode()) * 31) + this.f21704d) * 31) + Boolean.hashCode(this.f21705e)) * 31) + C13070h.m1691e(m15571g())) * 31) + this.f21707g.hashCode()) * 31) + this.f21708h.hashCode()) * 31) + this.f21709i.hashCode()) * 31) + C13599b.m913q(m15575c());
    }

    /* renamed from: i */
    public final InterfaceC10362d.InterfaceC10363a m15569i() {
        return this.f21709i;
    }

    /* renamed from: j */
    public final boolean m15568j() {
        return this.f21705e;
    }

    /* renamed from: k */
    public final TextStyle m15567k() {
        return this.f21702b;
    }

    /* renamed from: l */
    public final AnnotatedString m15566l() {
        return this.f21701a;
    }

    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.f21701a) + ", style=" + this.f21702b + ", placeholders=" + this.f21703c + ", maxLines=" + this.f21704d + ", softWrap=" + this.f21705e + ", overflow=" + ((Object) C13070h.m1690f(m15571g())) + ", density=" + this.f21707g + ", layoutDirection=" + this.f21708h + ", resourceLoader=" + this.f21709i + ", constraints=" + ((Object) C13599b.m912r(m15575c())) + ')';
    }
}
