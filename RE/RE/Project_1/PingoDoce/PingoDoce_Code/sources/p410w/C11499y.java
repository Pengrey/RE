package p410w;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p479z1.C13605g;
import p479z1.EnumC13618o;

/* compiled from: Padding.kt */
/* renamed from: w.y */
/* loaded from: classes.dex */
public final class C11499y implements InterfaceC11498x {

    /* renamed from: a */
    private final float f29439a;

    /* renamed from: b */
    private final float f29440b;

    /* renamed from: c */
    private final float f29441c;

    /* renamed from: d */
    private final float f29442d;

    private C11499y(float f, float f2, float f3, float f4) {
        this.f29439a = f;
        this.f29440b = f2;
        this.f29441c = f3;
        this.f29442d = f4;
    }

    public /* synthetic */ C11499y(float f, float f2, float f3, float f4, DefaultConstructorMarker defaultConstructorMarker) {
        this(f, f2, f3, f4);
    }

    /* renamed from: a */
    public float mo4960a(EnumC13618o enumC13618o) {
        Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
        return enumC13618o == EnumC13618o.Ltr ? m4951f() : m4950g();
    }

    /* renamed from: b */
    public float mo4959b() {
        return m4952e();
    }

    /* renamed from: c */
    public float mo4958c() {
        return m4949h();
    }

    /* renamed from: d */
    public float mo4957d(EnumC13618o enumC13618o) {
        Intrinsics.isThisObjectNull(enumC13618o, "layoutDirection");
        return enumC13618o == EnumC13618o.Ltr ? m4950g() : m4951f();
    }

    /* renamed from: e */
    public final float m4952e() {
        return this.f29442d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C11499y) {
            C11499y c11499y = (C11499y) obj;
            return C13605g.m873i(m4950g(), c11499y.m4950g()) && C13605g.m873i(m4949h(), c11499y.m4949h()) && C13605g.m873i(m4951f(), c11499y.m4951f()) && C13605g.m873i(m4952e(), c11499y.m4952e());
        }
        return false;
    }

    /* renamed from: f */
    public final float m4951f() {
        return this.f29441c;
    }

    /* renamed from: g */
    public final float m4950g() {
        return this.f29439a;
    }

    /* renamed from: h */
    public final float m4949h() {
        return this.f29440b;
    }

    public int hashCode() {
        return (((((C13605g.m872j(m4950g()) * 31) + C13605g.m872j(m4949h())) * 31) + C13605g.m872j(m4951f())) * 31) + C13605g.m872j(m4952e());
    }

    public String toString() {
        return "PaddingValues(start=" + ((Object) C13605g.m871k(m4950g())) + ", top=" + ((Object) C13605g.m871k(m4949h())) + ", end=" + ((Object) C13605g.m871k(m4951f())) + ", bottom=" + ((Object) C13605g.m871k(m4952e())) + ')';
    }
}
