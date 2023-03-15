package p181jd;

import java.io.Serializable;

/* renamed from: jd.m */
/* loaded from: classes2.dex */
public abstract class AbstractC6438m<R> implements InterfaceC6433g, Serializable {
    private final int arity;

    public AbstractC6438m(int i) {
        this.arity = i;
    }

    public int getArity() {
        return this.arity;
    }

    public String toString() {
        String m20901g = C6450z.m20901g(this);
        Intrinsics.checkIfNull(m20901g, "renderLambdaToString(this)");
        return m20901g;
    }
}
