package p177j9;

import java.util.Set;
import p136ha.InterfaceC5882b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j9.a */
/* loaded from: classes.dex */
public abstract class AbstractC6373a implements InterfaceC6381e {
    @Override // p177j9.InterfaceC6381e
    /* renamed from: a */
    public <T> T mo21096a(Class<T> cls) {
        InterfaceC5882b<T> mo21086c = mo21086c(cls);
        if (mo21086c == null) {
            return null;
        }
        return mo21086c.get();
    }

    @Override // p177j9.InterfaceC6381e
    /* renamed from: b */
    public <T> Set<T> mo21095b(Class<T> cls) {
        return mo21085d(cls).get();
    }
}
