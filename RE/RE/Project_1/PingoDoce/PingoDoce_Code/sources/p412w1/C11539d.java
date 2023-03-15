package p412w1;

import java.util.List;
import p181jd.Intrinsics;
import p286p1.AnnotatedString;
import p286p1.C8391r;
import p286p1.InterfaceC8348k;
import p286p1.TextStyle;
import p303q1.LayoutIntrinsics;
import p434x1.C12254f;
import p479z1.Density;
import p489zc.CollectionsJVM;
import p489zc._Collections;

/* compiled from: AndroidParagraphIntrinsics.android.kt */
/* renamed from: w1.d */
/* loaded from: classes.dex */
public final class C11539d implements InterfaceC8348k {

    /* renamed from: a */
    private final String f29547a;

    /* renamed from: b */
    private final TextStyle f29548b;

    /* renamed from: c */
    private final List f29549c;

    /* renamed from: d */
    private final List f29550d;

    /* renamed from: e */
    private final C11545j f29551e;

    /* renamed from: f */
    private final Density f29552f;

    /* renamed from: g */
    private final C11542g f29553g;

    /* renamed from: h */
    private final CharSequence f29554h;

    /* renamed from: i */
    private final LayoutIntrinsics f29555i;

    /* renamed from: j */
    private final int f29556j;

    public C11539d(String str, TextStyle textStyle, List list, List list2, C11545j c11545j, Density density) {
        List m202b;
        List m467b0;
        Intrinsics.isThisObjectNull(str, "text");
        Intrinsics.isThisObjectNull(textStyle, "style");
        Intrinsics.isThisObjectNull(list, "spanStyles");
        Intrinsics.isThisObjectNull(list2, "placeholders");
        Intrinsics.isThisObjectNull(c11545j, "typefaceAdapter");
        Intrinsics.isThisObjectNull(density, "density");
        this.f29547a = str;
        this.f29548b = textStyle;
        this.f29549c = list;
        this.f29550d = list2;
        this.f29551e = c11545j;
        this.f29552f = density;
        C11542g c11542g = new C11542g(1, density.getDensity());
        this.f29553g = c11542g;
        int m4766b = C11540e.m4766b(textStyle.m15508s(), textStyle.m15512o());
        this.f29556j = m4766b;
        C8391r m3188a = C12254f.m3188a(c11542g, textStyle.m15502y(), c11545j, density);
        float textSize = c11542g.getTextSize();
        m202b = CollectionsJVM.m202b(new AnnotatedString.C8337a(m3188a, 0, str.length()));
        m467b0 = _Collections.m467b0(m202b, list);
        CharSequence m4775a = C11538c.m4775a(str, textSize, textStyle, m467b0, list2, density, c11545j);
        this.f29554h = m4775a;
        this.f29555i = new LayoutIntrinsics(m4775a, c11542g, m4766b);
    }

    /* renamed from: a */
    public float mo15684a() {
        return this.f29555i.m10562c();
    }

    /* renamed from: b */
    public float mo15683b() {
        return this.f29555i.m10563b();
    }

    /* renamed from: c */
    public final CharSequence m4772c() {
        return this.f29554h;
    }

    /* renamed from: d */
    public final LayoutIntrinsics m4771d() {
        return this.f29555i;
    }

    /* renamed from: e */
    public final TextStyle m4770e() {
        return this.f29548b;
    }

    /* renamed from: f */
    public final int m4769f() {
        return this.f29556j;
    }

    /* renamed from: g */
    public final C11542g m4768g() {
        return this.f29553g;
    }
}
