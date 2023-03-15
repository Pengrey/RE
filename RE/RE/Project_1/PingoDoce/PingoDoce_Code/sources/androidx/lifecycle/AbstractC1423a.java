package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.C1479r0;
import androidx.savedstate.InterfaceC1663c;
import androidx.savedstate.SavedStateRegistry;

/* renamed from: androidx.lifecycle.a */
/* loaded from: classes.dex */
public abstract class AbstractC1423a extends C1479r0.AbstractC1482c {

    /* renamed from: a */
    private final SavedStateRegistry f4260a;

    /* renamed from: b */
    private final AbstractC1469p f4261b;

    /* renamed from: c */
    private final Bundle f4262c;

    public AbstractC1423a(InterfaceC1663c interfaceC1663c, Bundle bundle) {
        this.f4260a = interfaceC1663c.mo35784i();
        this.f4261b = interfaceC1663c.mo137b();
        this.f4262c = bundle;
    }

    @Override // androidx.lifecycle.C1479r0.AbstractC1482c, androidx.lifecycle.C1479r0.InterfaceC1481b
    /* renamed from: a */
    public final <T extends AbstractC1468o0> T mo36919a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) mo36978c(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.C1479r0.C1484e
    /* renamed from: b */
    void mo36976b(AbstractC1468o0 abstractC1468o0) {
        SavedStateHandleController.m37073b(abstractC1468o0, this.f4260a, this.f4261b);
    }

    @Override // androidx.lifecycle.C1479r0.AbstractC1482c
    /* renamed from: c */
    public final <T extends AbstractC1468o0> T mo36978c(String str, Class<T> cls) {
        SavedStateHandleController m37071i = SavedStateHandleController.m37071i(this.f4260a, this.f4261b, str, this.f4262c);
        T t = (T) mo37067d(str, cls, m37071i.m37070j());
        t.m36988f("androidx.lifecycle.savedstate.vm.tag", m37071i);
        return t;
    }

    /* renamed from: d */
    protected abstract <T extends AbstractC1468o0> T mo37067d(String str, Class<T> cls, C1459l0 c1459l0);
}
