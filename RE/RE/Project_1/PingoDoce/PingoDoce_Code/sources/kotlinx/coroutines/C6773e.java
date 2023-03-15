package kotlinx.coroutines;

import bd.CoroutineContext;
import bd.CoroutineContextImpl;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import p181jd.Intrinsics;
import sd.C10171u;
import td.C10519h0;
import td.InterfaceC10553o2;

@IgnoreJRERequirement
/* renamed from: kotlinx.coroutines.e */
/* loaded from: classes2.dex */
public final class C6773e extends CoroutineContextImpl implements InterfaceC10553o2 {

    /* renamed from: y */
    public static final C6774a f18142y = new C6774a(null);

    /* renamed from: x */
    private final long f18143x;

    /* compiled from: CoroutineContext.kt */
    /* renamed from: kotlinx.coroutines.e$a */
    /* loaded from: classes2.dex */
    public static final class C6774a implements CoroutineContext.InterfaceC1893c {
        private C6774a() {
        }

        public /* synthetic */ C6774a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C6773e(long j) {
        super(f18142y);
        this.f18143x = j;
    }

    /* renamed from: D0 */
    public final long m20156D0() {
        return this.f18143x;
    }

    /* renamed from: E0 */
    public void mo7691v0(CoroutineContext coroutineContext, String str) {
        Thread.currentThread().setName(str);
    }

    /* renamed from: F0 */
    public String mo7692a0(CoroutineContext coroutineContext) {
        int m8900Z;
        C10519h0 c10519h0 = (C10519h0) coroutineContext.mo4546c(C10519h0.f27241y);
        String str = (c10519h0 == null || (str = c10519h0.m7785D0()) == null) ? "coroutine" : "coroutine";
        Thread currentThread = Thread.currentThread();
        String name = currentThread.getName();
        m8900Z = C10171u.m8900Z(name, " @", 0, false, 6, null);
        if (m8900Z < 0) {
            m8900Z = name.length();
        }
        StringBuilder sb2 = new StringBuilder(str.length() + m8900Z + 10);
        String substring = name.substring(0, m8900Z);
        Intrinsics.checkIfNull(substring, "this as java.lang.String…ing(startIndex, endIndex)");
        sb2.append(substring);
        sb2.append(" @");
        sb2.append(str);
        sb2.append('#');
        sb2.append(this.f18143x);
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder(capacity).…builderAction).toString()");
        currentThread.setName(sb3);
        return name;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6773e) && this.f18143x == ((C6773e) obj).f18143x;
    }

    public int hashCode() {
        return Long.hashCode(this.f18143x);
    }

    public String toString() {
        return "CoroutineId(" + this.f18143x + ')';
    }
}
