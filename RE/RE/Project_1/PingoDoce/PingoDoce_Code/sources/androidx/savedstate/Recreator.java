package androidx.savedstate;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.InterfaceC1485s;
import androidx.lifecycle.InterfaceC1491v;
import androidx.savedstate.SavedStateRegistry;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public final class Recreator implements InterfaceC1485s {

    /* renamed from: w */
    private final InterfaceC1663c f5025w;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.savedstate.Recreator$a */
    /* loaded from: classes.dex */
    public static final class C1657a implements SavedStateRegistry.InterfaceC1660b {

        /* renamed from: a */
        final Set<String> f5026a = new HashSet();

        /* JADX INFO: Access modifiers changed from: package-private */
        public C1657a(SavedStateRegistry savedStateRegistry) {
            savedStateRegistry.m35793d("androidx.savedstate.Restarter", this);
        }

        @Override // androidx.savedstate.SavedStateRegistry.InterfaceC1660b
        /* renamed from: a */
        public Bundle mo35789a() {
            Bundle bundle = new Bundle();
            bundle.putStringArrayList("classes_to_restore", new ArrayList<>(this.f5026a));
            return bundle;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public void m35797b(String str) {
            this.f5026a.add(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Recreator(InterfaceC1663c interfaceC1663c) {
        this.f5025w = interfaceC1663c;
    }

    /* renamed from: b */
    private void m35798b(String str) {
        Class cls;
        try {
            try {
                Constructor declaredConstructor = Class.forName(str, false, Recreator.class.getClassLoader()).asSubclass(SavedStateRegistry.InterfaceC1659a.class).getDeclaredConstructor(new Class[0]);
                declaredConstructor.setAccessible(true);
                try {
                    ((SavedStateRegistry.InterfaceC1659a) declaredConstructor.newInstance(new Object[0])).mo35790a(this.f5025w);
                } catch (Exception e) {
                    throw new RuntimeException("Failed to instantiate " + str, e);
                }
            } catch (NoSuchMethodException e2) {
                throw new IllegalStateException("Class" + cls.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
            }
        } catch (ClassNotFoundException e3) {
            throw new RuntimeException("Class " + str + " wasn't found", e3);
        }
    }

    @Override // androidx.lifecycle.InterfaceC1485s
    /* renamed from: n */
    public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
        if (enumC1471b == AbstractC1469p.EnumC1471b.ON_CREATE) {
            interfaceC1491v.mo137b().mo10400c(this);
            Bundle m35796a = this.f5025w.mo35784i().m35796a("androidx.savedstate.Restarter");
            if (m35796a == null) {
                return;
            }
            ArrayList<String> stringArrayList = m35796a.getStringArrayList("classes_to_restore");
            if (stringArrayList != null) {
                Iterator<String> it = stringArrayList.iterator();
                while (it.hasNext()) {
                    m35798b(it.next());
                }
                return;
            }
            throw new IllegalStateException("Bundle with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
