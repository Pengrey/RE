package kotlinx.coroutines.internal;

import td.C10543m0;

/* renamed from: kotlinx.coroutines.internal.a0 */
/* loaded from: classes2.dex */
public abstract class AbstractC6852a0 {
    /* renamed from: a */
    public abstract AbstractC6855c<?> mo20009a();

    /* renamed from: b */
    public final boolean m20010b(AbstractC6852a0 abstractC6852a0) {
        AbstractC6855c<?> mo20009a;
        AbstractC6855c<?> mo20009a2 = mo20009a();
        return (mo20009a2 == null || (mo20009a = abstractC6852a0.mo20009a()) == null || mo20009a2.m20006f() >= mo20009a.m20006f()) ? false : true;
    }

    /* renamed from: c */
    public abstract Object mo20008c(Object obj);

    public String toString() {
        return C10543m0.m7712a(this) + '@' + C10543m0.m7711b(this);
    }
}
