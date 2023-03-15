package androidx.lifecycle;

import android.os.Bundle;
import androidx.lifecycle.AbstractC1469p;
import androidx.savedstate.InterfaceC1663c;
import androidx.savedstate.SavedStateRegistry;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class SavedStateHandleController implements InterfaceC1485s {

    /* renamed from: w */
    private final String f4250w;

    /* renamed from: x */
    private boolean f4251x = false;

    /* renamed from: y */
    private final C1459l0 f4252y;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.lifecycle.SavedStateHandleController$a */
    /* loaded from: classes.dex */
    public static final class C1422a implements SavedStateRegistry.InterfaceC1659a {
        C1422a() {
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC1659a
        /* renamed from: a */
        public void mo35790a(InterfaceC1663c interfaceC1663c) {
            if (interfaceC1663c instanceof InterfaceC1488t0) {
                C1486s0 mo36970z = ((InterfaceC1488t0) interfaceC1663c).mo36970z();
                SavedStateRegistry mo35784i = interfaceC1663c.mo35784i();
                for (String str : mo36970z.m36973c()) {
                    SavedStateHandleController.m37073b(mo36970z.m36974b(str), mo35784i, interfaceC1663c.mo137b());
                }
                if (mo36970z.m36973c().isEmpty()) {
                    return;
                }
                mo35784i.m35792e(C1422a.class);
                return;
            }
            throw new IllegalStateException("Internal error: OnRecreation should be registered only on componentsthat implement ViewModelStoreOwner");
        }
    }

    SavedStateHandleController(String str, C1459l0 c1459l0) {
        this.f4250w = str;
        this.f4252y = c1459l0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m37073b(AbstractC1468o0 abstractC1468o0, SavedStateRegistry savedStateRegistry, AbstractC1469p abstractC1469p) {
        SavedStateHandleController savedStateHandleController = (SavedStateHandleController) abstractC1468o0.m36989d("androidx.lifecycle.savedstate.vm.tag");
        if (savedStateHandleController == null || savedStateHandleController.m37069k()) {
            return;
        }
        savedStateHandleController.m37072h(savedStateRegistry, abstractC1469p);
        m37068l(savedStateRegistry, abstractC1469p);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public static SavedStateHandleController m37071i(SavedStateRegistry savedStateRegistry, AbstractC1469p abstractC1469p, String str, Bundle bundle) {
        SavedStateHandleController savedStateHandleController = new SavedStateHandleController(str, C1459l0.m37006a(savedStateRegistry.m35796a(str), bundle));
        savedStateHandleController.m37072h(savedStateRegistry, abstractC1469p);
        m37068l(savedStateRegistry, abstractC1469p);
        return savedStateHandleController;
    }

    /* renamed from: l */
    private static void m37068l(final SavedStateRegistry savedStateRegistry, final AbstractC1469p abstractC1469p) {
        AbstractC1469p.EnumC1472c mo10401b = abstractC1469p.mo10401b();
        if (mo10401b != AbstractC1469p.EnumC1472c.INITIALIZED && !mo10401b.isAtLeast(AbstractC1469p.EnumC1472c.STARTED)) {
            abstractC1469p.mo10402a(new InterfaceC1485s() { // from class: androidx.lifecycle.SavedStateHandleController.1
                @Override // androidx.lifecycle.InterfaceC1485s
                /* renamed from: n */
                public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
                    if (enumC1471b == AbstractC1469p.EnumC1471b.ON_START) {
                        AbstractC1469p.this.mo10400c(this);
                        savedStateRegistry.m35792e(C1422a.class);
                    }
                }
            });
        } else {
            savedStateRegistry.m35792e(C1422a.class);
        }
    }

    /* renamed from: h */
    void m37072h(SavedStateRegistry savedStateRegistry, AbstractC1469p abstractC1469p) {
        if (!this.f4251x) {
            this.f4251x = true;
            abstractC1469p.mo10402a(this);
            savedStateRegistry.m35793d(this.f4250w, this.f4252y.m37001f());
            return;
        }
        throw new IllegalStateException("Already attached to lifecycleOwner");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public C1459l0 m37070j() {
        return this.f4252y;
    }

    /* renamed from: k */
    boolean m37069k() {
        return this.f4251x;
    }

    @Override // androidx.lifecycle.InterfaceC1485s
    /* renamed from: n */
    public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
        if (enumC1471b == AbstractC1469p.EnumC1471b.ON_DESTROY) {
            this.f4251x = false;
            interfaceC1491v.mo137b().mo10400c(this);
        }
    }
}
