package com.google.android.datatransport.cct;

import androidx.annotation.Keep;
import com.google.android.datatransport.runtime.backends.AbstractC2399f;
import p028b6.InterfaceC1824a;
import p028b6.InterfaceC1831g;

@Keep
/* loaded from: classes.dex */
public class CctBackendFactory implements InterfaceC1824a {
    @Override // p028b6.InterfaceC1824a
    public InterfaceC1831g create(AbstractC2399f abstractC2399f) {
        return new C2386d(abstractC2399f.mo33683b(), abstractC2399f.mo33680e(), abstractC2399f.mo33681d());
    }
}
