package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.InterfaceC1485s;
import androidx.lifecycle.InterfaceC1491v;
import androidx.savedstate.Recreator;
import java.util.Map;
import p243n.C7547b;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class SavedStateRegistry {

    /* renamed from: b */
    private Bundle f5027b;

    /* renamed from: c */
    private boolean f5028c;

    /* renamed from: d */
    private Recreator.C1657a f5029d;

    /* renamed from: a */
    private C7547b<String, InterfaceC1660b> f5030a = new C7547b<>();

    /* renamed from: e */
    boolean f5031e = true;

    /* renamed from: androidx.savedstate.SavedStateRegistry$a */
    /* loaded from: classes.dex */
    public interface InterfaceC1659a {
        /* renamed from: a */
        void mo35790a(InterfaceC1663c interfaceC1663c);
    }

    /* renamed from: androidx.savedstate.SavedStateRegistry$b */
    /* loaded from: classes.dex */
    public interface InterfaceC1660b {
        /* renamed from: a */
        Bundle mo35789a();
    }

    /* renamed from: a */
    public Bundle m35796a(String str) {
        if (this.f5028c) {
            Bundle bundle = this.f5027b;
            if (bundle != null) {
                Bundle bundle2 = bundle.getBundle(str);
                this.f5027b.remove(str);
                if (this.f5027b.isEmpty()) {
                    this.f5027b = null;
                }
                return bundle2;
            }
            return null;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m35795b(AbstractC1469p abstractC1469p, Bundle bundle) {
        if (!this.f5028c) {
            if (bundle != null) {
                this.f5027b = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            }
            abstractC1469p.mo10402a(new InterfaceC1485s() { // from class: androidx.savedstate.SavedStateRegistry.1
                @Override // androidx.lifecycle.InterfaceC1485s
                /* renamed from: n */
                public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
                    if (enumC1471b == AbstractC1469p.EnumC1471b.ON_START) {
                        SavedStateRegistry.this.f5031e = true;
                    } else if (enumC1471b == AbstractC1469p.EnumC1471b.ON_STOP) {
                        SavedStateRegistry.this.f5031e = false;
                    }
                }
            });
            this.f5028c = true;
            return;
        }
        throw new IllegalStateException("SavedStateRegistry was already restored.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m35794c(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = this.f5027b;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        C7547b<String, InterfaceC1660b>.C7551d m18165g = this.f5030a.m18165g();
        while (m18165g.hasNext()) {
            Map.Entry next = m18165g.next();
            bundle2.putBundle((String) next.getKey(), ((InterfaceC1660b) next.getValue()).mo35789a());
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundle2);
    }

    /* renamed from: d */
    public void m35793d(String str, InterfaceC1660b interfaceC1660b) {
        if (this.f5030a.mo18162o(str, interfaceC1660b) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    /* renamed from: e */
    public void m35792e(Class<? extends InterfaceC1659a> cls) {
        if (this.f5031e) {
            if (this.f5029d == null) {
                this.f5029d = new Recreator.C1657a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                this.f5029d.m35797b(cls.getName());
                return;
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }

    /* renamed from: f */
    public void m35791f(String str) {
        this.f5030a.mo18161p(str);
    }
}
