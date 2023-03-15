package p324r0;

import id.InterfaceC6108l;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p373u0.Rect;

/* renamed from: r0.h */
/* loaded from: classes.dex */
public final class C9788h {

    /* renamed from: a */
    private final List f25725a;

    /* renamed from: b */
    private Rect f25726b;

    /* renamed from: c */
    private final InterfaceC6108l f25727c;

    /* compiled from: Autofill.kt */
    /* renamed from: r0.h$a */
    /* loaded from: classes.dex */
    public static final class C9789a {
        private C9789a() {
        }

        public /* synthetic */ C9789a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C9789a(null);
    }

    /* renamed from: a */
    public final List m9952a() {
        return this.f25725a;
    }

    /* renamed from: b */
    public final Rect m9951b() {
        return this.f25726b;
    }

    /* renamed from: c */
    public final InterfaceC6108l m9950c() {
        return this.f25727c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C9788h) {
            C9788h c9788h = (C9788h) obj;
            return Intrinsics.equals(this.f25725a, c9788h.f25725a) && Intrinsics.equals(this.f25726b, c9788h.f25726b) && Intrinsics.equals(this.f25727c, c9788h.f25727c);
        }
        return false;
    }

    public int hashCode() {
        int hashCode = this.f25725a.hashCode() * 31;
        Rect rect = this.f25726b;
        int hashCode2 = (hashCode + (rect == null ? 0 : rect.hashCode())) * 31;
        InterfaceC6108l interfaceC6108l = this.f25727c;
        return hashCode2 + (interfaceC6108l != null ? interfaceC6108l.hashCode() : 0);
    }
}
