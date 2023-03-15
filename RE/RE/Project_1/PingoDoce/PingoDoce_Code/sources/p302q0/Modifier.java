package p302q0;

import com.github.aachartmodel.aainfographics.BuildConfig;
import id.InterfaceC6108l;
import id.InterfaceC6112p;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;

/* renamed from: q0.c */
/* loaded from: classes.dex */
public final class Modifier implements InterfaceC9570f {

    /* renamed from: w */
    private final InterfaceC9570f f25158w;

    /* renamed from: x */
    private final InterfaceC9570f f25159x;

    /* compiled from: Modifier.kt */
    /* renamed from: q0.c$a */
    /* loaded from: classes.dex */
    static final class C9566a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C9566a f25160w = new C9566a();

        C9566a() {
            super(2);
        }

        /* renamed from: a */
        public final String mo39856d(String str, InterfaceC9570f.InterfaceC9573c interfaceC9573c) {
            Intrinsics.isThisObjectNull(str, "acc");
            Intrinsics.isThisObjectNull(interfaceC9573c, "element");
            if (str.length() == 0) {
                return interfaceC9573c.toString();
            }
            return str + ", " + interfaceC9573c;
        }
    }

    public Modifier(InterfaceC9570f interfaceC9570f, InterfaceC9570f interfaceC9570f2) {
        Intrinsics.isThisObjectNull(interfaceC9570f, "outer");
        Intrinsics.isThisObjectNull(interfaceC9570f2, "inner");
        this.f25158w = interfaceC9570f;
        this.f25159x = interfaceC9570f2;
    }

    /* renamed from: C */
    public boolean mo7209C(InterfaceC6108l interfaceC6108l) {
        Intrinsics.isThisObjectNull(interfaceC6108l, "predicate");
        return this.f25158w.mo7209C(interfaceC6108l) && this.f25159x.mo7209C(interfaceC6108l);
    }

    /* renamed from: V */
    public Object mo7208V(Object obj, InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC6112p, "operation");
        return this.f25158w.mo7208V(this.f25159x.mo7208V(obj, interfaceC6112p), interfaceC6112p);
    }

    public boolean equals(Object obj) {
        if (obj instanceof Modifier) {
            Modifier modifier = (Modifier) obj;
            if (Intrinsics.equals(this.f25158w, modifier.f25158w) && Intrinsics.equals(this.f25159x, modifier.f25159x)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.f25158w.hashCode() + (this.f25159x.hashCode() * 31);
    }

    /* renamed from: o */
    public Object mo7206o(Object obj, InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(interfaceC6112p, "operation");
        return this.f25159x.mo7206o(this.f25158w.mo7206o(obj, interfaceC6112p), interfaceC6112p);
    }

    public String toString() {
        return '[' + ((String) mo7206o(BuildConfig.VERSION_NAME, C9566a.f25160w)) + ']';
    }

    /* renamed from: u */
    public InterfaceC9570f mo7205u(InterfaceC9570f interfaceC9570f) {
        return InterfaceC9570f.C9572b.m10577a(this, interfaceC9570f);
    }
}
