package p327r3;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p327r3.AbstractC9797c;

/* renamed from: r3.i */
/* loaded from: classes.dex */
public final class C9805i {

    /* renamed from: c */
    public static final C9805i f25744c;

    /* renamed from: a */
    private final AbstractC9797c f25745a;

    /* renamed from: b */
    private final AbstractC9797c f25746b;

    /* compiled from: Size.kt */
    /* renamed from: r3.i$a */
    /* loaded from: classes.dex */
    public static final class C9806a {
        private C9806a() {
        }

        public /* synthetic */ C9806a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C9806a(null);
        AbstractC9797c.C9799b c9799b = AbstractC9797c.C9799b.f25739a;
        f25744c = new C9805i(c9799b, c9799b);
    }

    public C9805i(AbstractC9797c abstractC9797c, AbstractC9797c abstractC9797c2) {
        this.f25745a = abstractC9797c;
        this.f25746b = abstractC9797c2;
    }

    /* renamed from: a */
    public final AbstractC9797c m9945a() {
        return this.f25745a;
    }

    /* renamed from: b */
    public final AbstractC9797c m9944b() {
        return this.f25746b;
    }

    /* renamed from: c */
    public final AbstractC9797c m9943c() {
        return this.f25746b;
    }

    /* renamed from: d */
    public final AbstractC9797c m9942d() {
        return this.f25745a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9805i) {
            C9805i c9805i = (C9805i) obj;
            return Intrinsics.equals(this.f25745a, c9805i.f25745a) && Intrinsics.equals(this.f25746b, c9805i.f25746b);
        }
        return false;
    }

    public int hashCode() {
        return (this.f25745a.hashCode() * 31) + this.f25746b.hashCode();
    }

    public String toString() {
        return "Size(width=" + this.f25745a + ", height=" + this.f25746b + ')';
    }
}
