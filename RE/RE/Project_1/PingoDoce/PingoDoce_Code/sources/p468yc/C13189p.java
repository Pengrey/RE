package p468yc;

import id.InterfaceC6097a;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: LazyJVM.kt */
/* renamed from: yc.p */
/* loaded from: classes2.dex */
public final class C13189p<T> implements InterfaceC13178g, Serializable {

    /* renamed from: w */
    private InterfaceC6097a f34148w;

    /* renamed from: x */
    private volatile Object f34149x;

    /* renamed from: y */
    private final Object f34150y;

    public C13189p(InterfaceC6097a interfaceC6097a, Object obj) {
        Intrinsics.isThisObjectNull(interfaceC6097a, "initializer");
        this.f34148w = interfaceC6097a;
        this.f34149x = C13194t.f34155a;
        this.f34150y = obj == null ? this : obj;
    }

    private final Object writeReplace() {
        return new C13175d(getValue());
    }

    /* renamed from: a */
    public boolean m1451a() {
        return this.f34149x != C13194t.f34155a;
    }

    public Object getValue() {
        Object obj;
        Object obj2 = this.f34149x;
        C13194t c13194t = C13194t.f34155a;
        if (obj2 != c13194t) {
            return obj2;
        }
        synchronized (this.f34150y) {
            obj = this.f34149x;
            if (obj == c13194t) {
                InterfaceC6097a interfaceC6097a = this.f34148w;
                Intrinsics.ifNullDoSomething(interfaceC6097a);
                obj = interfaceC6097a.mo42214q();
                this.f34149x = obj;
                this.f34148w = null;
            }
        }
        return obj;
    }

    public String toString() {
        return m1451a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ C13189p(InterfaceC6097a interfaceC6097a, Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC6097a, (i & 2) != 0 ? null : obj);
    }
}
