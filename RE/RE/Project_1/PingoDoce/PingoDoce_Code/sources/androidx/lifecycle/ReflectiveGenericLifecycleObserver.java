package androidx.lifecycle;

import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.C1432d;

/* JADX INFO: Access modifiers changed from: package-private */
@Deprecated
/* loaded from: classes.dex */
public class ReflectiveGenericLifecycleObserver implements InterfaceC1485s {

    /* renamed from: w */
    private final Object f4248w;

    /* renamed from: x */
    private final C1432d.C1433a f4249x;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ReflectiveGenericLifecycleObserver(Object obj) {
        this.f4248w = obj;
        this.f4249x = C1432d.f4284c.m37050c(obj.getClass());
    }

    @Override // androidx.lifecycle.InterfaceC1485s
    /* renamed from: n */
    public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
        this.f4249x.m37047a(interfaceC1491v, enumC1471b, this.f4248w);
    }
}
