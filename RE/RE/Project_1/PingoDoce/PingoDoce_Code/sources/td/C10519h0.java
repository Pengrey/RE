package td;

import bd.CoroutineContext;
import bd.CoroutineContextImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* renamed from: td.h0 */
/* loaded from: classes2.dex */
public final class C10519h0 extends CoroutineContextImpl {

    /* renamed from: y */
    public static final C10520a f27241y = new C10520a(null);

    /* renamed from: x */
    private final String f27242x;

    /* compiled from: CoroutineName.kt */
    /* renamed from: td.h0$a */
    /* loaded from: classes2.dex */
    public static final class C10520a implements CoroutineContext.InterfaceC1893c {
        private C10520a() {
        }

        public /* synthetic */ C10520a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: D0 */
    public final String m7785D0() {
        return this.f27242x;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10519h0) && Intrinsics.equals(this.f27242x, ((C10519h0) obj).f27242x);
    }

    public int hashCode() {
        return this.f27242x.hashCode();
    }

    public String toString() {
        return "CoroutineName(" + this.f27242x + ')';
    }
}
