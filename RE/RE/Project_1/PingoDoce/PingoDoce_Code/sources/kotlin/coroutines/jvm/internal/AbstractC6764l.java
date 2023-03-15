package kotlin.coroutines.jvm.internal;

import bd.InterfaceC1886d;
import p181jd.C6450z;
import p181jd.InterfaceC6433g;
import p181jd.Intrinsics;

/* renamed from: kotlin.coroutines.jvm.internal.l */
/* loaded from: classes2.dex */
public abstract class AbstractC6764l extends AbstractC6757d implements InterfaceC6433g {

    /* renamed from: w */
    private final int f18127w;

    public AbstractC6764l(int i, InterfaceC1886d interfaceC1886d) {
        super(interfaceC1886d);
        this.f18127w = i;
    }

    public int getArity() {
        return this.f18127w;
    }

    public String toString() {
        if (getCompletion() == null) {
            String m20902f = C6450z.m20902f(this);
            Intrinsics.checkIfNull(m20902f, "renderLambdaToString(this)");
            return m20902f;
        }
        return super.toString();
    }
}
