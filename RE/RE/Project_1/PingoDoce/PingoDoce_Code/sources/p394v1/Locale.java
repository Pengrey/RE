package p394v1;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: v1.e */
/* loaded from: classes.dex */
public final class Locale {

    /* renamed from: b */
    public static final C11083a f28476b = new C11083a(null);

    /* renamed from: a */
    private final InterfaceC11085g f28477a;

    /* compiled from: Locale.kt */
    /* renamed from: v1.e$a */
    /* loaded from: classes.dex */
    public static final class C11083a {
        private C11083a() {
        }

        public /* synthetic */ C11083a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final Locale m6187a() {
            return new Locale(C11087i.m6177a().mo6179a().get(0));
        }
    }

    public Locale(InterfaceC11085g interfaceC11085g) {
        Intrinsics.isThisObjectNull(interfaceC11085g, "platformLocale");
        this.f28477a = interfaceC11085g;
    }

    /* renamed from: a */
    public final InterfaceC11085g m6189a() {
        return this.f28477a;
    }

    /* renamed from: b */
    public final String m6188b() {
        return this.f28477a.mo6180a();
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof Locale)) {
            if (this == obj) {
                return true;
            }
            return Intrinsics.equals(m6188b(), ((Locale) obj).m6188b());
        }
        return false;
    }

    public int hashCode() {
        return m6188b().hashCode();
    }

    public String toString() {
        return m6188b();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public Locale(String str) {
        this(C11087i.m6177a().mo6178b(str));
        Intrinsics.isThisObjectNull(str, "languageTag");
    }
}
