package td;

import kotlinx.coroutines.internal.C6894r;
import kotlinx.coroutines.internal.C6896t;
import p181jd.Intrinsics;

/* renamed from: td.d2 */
/* loaded from: classes2.dex */
public final class C10503d2 extends C6894r implements InterfaceC10548n1 {
    /* renamed from: D */
    public final String m7798D(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("List{");
        sb2.append(str);
        sb2.append("}[");
        boolean z = true;
        for (C6896t c6896t = (C6896t) m19875o(); !Intrinsics.equals(c6896t, this); c6896t = c6896t.m19874p()) {
            if (c6896t instanceof AbstractC10601z1) {
                AbstractC10601z1 abstractC10601z1 = (AbstractC10601z1) c6896t;
                if (z) {
                    z = false;
                } else {
                    sb2.append(", ");
                }
                sb2.append(abstractC10601z1);
            }
        }
        sb2.append("]");
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "StringBuilder().apply(builderAction).toString()");
        return sb3;
    }

    /* renamed from: a */
    public boolean mo7698a() {
        return true;
    }

    /* renamed from: g */
    public C10503d2 mo7697g() {
        return this;
    }

    public String toString() {
        return C10539l0.m7718c() ? m7798D("Active") : super.toString();
    }
}
