package androidx.savedstate;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1469p;

/* renamed from: androidx.savedstate.b */
/* loaded from: classes.dex */
public final class C1662b {

    /* renamed from: a */
    private final InterfaceC1663c f5033a;

    /* renamed from: b */
    private final SavedStateRegistry f5034b = new SavedStateRegistry();

    private C1662b(InterfaceC1663c interfaceC1663c) {
        this.f5033a = interfaceC1663c;
    }

    /* renamed from: a */
    public static C1662b m35788a(InterfaceC1663c interfaceC1663c) {
        return new C1662b(interfaceC1663c);
    }

    /* renamed from: b */
    public SavedStateRegistry m35787b() {
        return this.f5034b;
    }

    /* renamed from: c */
    public void m35786c(Bundle bundle) {
        AbstractC1469p mo137b = this.f5033a.mo137b();
        if (mo137b.mo10401b() == AbstractC1469p.EnumC1472c.INITIALIZED) {
            mo137b.mo10402a(new Recreator(this.f5033a));
            this.f5034b.m35795b(mo137b, bundle);
            return;
        }
        throw new IllegalStateException("Restarter must be created only during owner's initialization stage");
    }

    /* renamed from: d */
    public void m35785d(Bundle bundle) {
        this.f5034b.m35794c(bundle);
    }
}
