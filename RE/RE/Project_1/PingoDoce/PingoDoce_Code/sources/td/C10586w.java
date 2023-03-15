package td;

import id.InterfaceC6108l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: td.w */
/* loaded from: classes2.dex */
public final class C10586w {

    /* renamed from: a */
    public final Object f27294a;

    /* renamed from: b */
    public final AbstractC10518h f27295b;

    /* renamed from: c */
    public final InterfaceC6108l f27296c;

    /* renamed from: d */
    public final Object f27297d;

    /* renamed from: e */
    public final Throwable f27298e;

    public C10586w(Object obj, AbstractC10518h abstractC10518h, InterfaceC6108l interfaceC6108l, Object obj2, Throwable th2) {
        this.f27294a = obj;
        this.f27295b = abstractC10518h;
        this.f27296c = interfaceC6108l;
        this.f27297d = obj2;
        this.f27298e = th2;
    }

    /* renamed from: b */
    public static /* synthetic */ C10586w m7624b(C10586w c10586w, Object obj, AbstractC10518h abstractC10518h, InterfaceC6108l interfaceC6108l, Object obj2, Throwable th2, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = c10586w.f27294a;
        }
        if ((i & 2) != 0) {
            abstractC10518h = c10586w.f27295b;
        }
        AbstractC10518h abstractC10518h2 = abstractC10518h;
        if ((i & 4) != 0) {
            interfaceC6108l = c10586w.f27296c;
        }
        InterfaceC6108l interfaceC6108l2 = interfaceC6108l;
        if ((i & 8) != 0) {
            obj2 = c10586w.f27297d;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th2 = c10586w.f27298e;
        }
        return c10586w.m7625a(obj, abstractC10518h2, interfaceC6108l2, obj4, th2);
    }

    /* renamed from: a */
    public final C10586w m7625a(Object obj, AbstractC10518h abstractC10518h, InterfaceC6108l interfaceC6108l, Object obj2, Throwable th2) {
        return new C10586w(obj, abstractC10518h, interfaceC6108l, obj2, th2);
    }

    /* renamed from: c */
    public final boolean m7623c() {
        return this.f27298e != null;
    }

    /* renamed from: d */
    public final void m7622d(C10534k c10534k, Throwable th2) {
        AbstractC10518h abstractC10518h = this.f27295b;
        if (abstractC10518h != null) {
            c10534k.m7739i(abstractC10518h, th2);
        }
        InterfaceC6108l interfaceC6108l = this.f27296c;
        if (interfaceC6108l != null) {
            c10534k.m7738j(interfaceC6108l, th2);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10586w) {
            C10586w c10586w = (C10586w) obj;
            return Intrinsics.equals(this.f27294a, c10586w.f27294a) && Intrinsics.equals(this.f27295b, c10586w.f27295b) && Intrinsics.equals(this.f27296c, c10586w.f27296c) && Intrinsics.equals(this.f27297d, c10586w.f27297d) && Intrinsics.equals(this.f27298e, c10586w.f27298e);
        }
        return false;
    }

    public int hashCode() {
        Object obj = this.f27294a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        AbstractC10518h abstractC10518h = this.f27295b;
        int hashCode2 = (hashCode + (abstractC10518h == null ? 0 : abstractC10518h.hashCode())) * 31;
        InterfaceC6108l interfaceC6108l = this.f27296c;
        int hashCode3 = (hashCode2 + (interfaceC6108l == null ? 0 : interfaceC6108l.hashCode())) * 31;
        Object obj2 = this.f27297d;
        int hashCode4 = (hashCode3 + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Throwable th2 = this.f27298e;
        return hashCode4 + (th2 != null ? th2.hashCode() : 0);
    }

    public String toString() {
        return "CompletedContinuation(result=" + this.f27294a + ", cancelHandler=" + this.f27295b + ", onCancellation=" + this.f27296c + ", idempotentResume=" + this.f27297d + ", cancelCause=" + this.f27298e + ')';
    }

    public /* synthetic */ C10586w(Object obj, AbstractC10518h abstractC10518h, InterfaceC6108l interfaceC6108l, Object obj2, Throwable th2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? null : abstractC10518h, (i & 4) != 0 ? null : interfaceC6108l, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th2);
    }
}
