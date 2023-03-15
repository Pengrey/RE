package p245n1;

import id.InterfaceC6112p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.AbstractC6438m;
import p181jd.Intrinsics;
import p314qd.InterfaceC9724h;

/* compiled from: SemanticsProperties.kt */
/* renamed from: n1.u */
/* loaded from: classes.dex */
public final class C7619u<T> {

    /* renamed from: a */
    private final String f20181a;

    /* renamed from: b */
    private final InterfaceC6112p f20182b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SemanticsProperties.kt */
    /* renamed from: n1.u$a */
    /* loaded from: classes.dex */
    public static final class C7620a extends AbstractC6438m implements InterfaceC6112p {

        /* renamed from: w */
        public static final C7620a f20183w = new C7620a();

        C7620a() {
            super(2);
        }

        /* renamed from: F */
        public final Object mo39856d(Object obj, Object obj2) {
            return obj == null ? obj2 : obj;
        }
    }

    public C7619u(String str, InterfaceC6112p interfaceC6112p) {
        Intrinsics.isThisObjectNull(str, "name");
        Intrinsics.isThisObjectNull(interfaceC6112p, "mergePolicy");
        this.f20181a = str;
        this.f20182b = interfaceC6112p;
    }

    /* renamed from: a */
    public final String m17913a() {
        return this.f20181a;
    }

    /* renamed from: b */
    public final Object m17912b(Object obj, Object obj2) {
        return this.f20182b.mo39856d(obj, obj2);
    }

    /* renamed from: c */
    public final void m17911c(InterfaceC7621v interfaceC7621v, InterfaceC9724h interfaceC9724h, Object obj) {
        Intrinsics.isThisObjectNull(interfaceC7621v, "thisRef");
        Intrinsics.isThisObjectNull(interfaceC9724h, "property");
        interfaceC7621v.mo17910b(this, obj);
    }

    public String toString() {
        return Intrinsics.addStrAndObj("SemanticsPropertyKey: ", this.f20181a);
    }

    public /* synthetic */ C7619u(String str, InterfaceC6112p interfaceC6112p, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? C7620a.f20183w : interfaceC6112p);
    }
}
