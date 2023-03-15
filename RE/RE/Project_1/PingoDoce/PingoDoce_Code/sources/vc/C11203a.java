package vc;

import android.util.Log;
import androidx.fragment.app.ActivityC1354d;
import androidx.fragment.app.Fragment;
import dagger.android.InterfaceC4768a;
import p384uc.InterfaceC10866b;
import p423wc.C11617f;

/* renamed from: vc.a */
/* loaded from: classes2.dex */
public final class C11203a {
    /* renamed from: a */
    private static InterfaceC10866b m5754a(Fragment fragment) {
        Fragment fragment2 = fragment;
        do {
            fragment2 = fragment2.m37623S();
            if (fragment2 == null) {
                ActivityC1354d m37547y = fragment.m37547y();
                if (m37547y instanceof InterfaceC10866b) {
                    return (InterfaceC10866b) m37547y;
                }
                if (m37547y.getApplication() instanceof InterfaceC10866b) {
                    return (InterfaceC10866b) m37547y.getApplication();
                }
                throw new IllegalArgumentException(String.format("No injector was found for %s", fragment.getClass().getCanonicalName()));
            }
        } while (!(fragment2 instanceof InterfaceC10866b));
        return (InterfaceC10866b) fragment2;
    }

    /* renamed from: b */
    public static void m5753b(Fragment fragment) {
        C11617f.m4589b(fragment, "fragment");
        InterfaceC10866b m5754a = m5754a(fragment);
        if (Log.isLoggable("dagger.android.support", 3)) {
            Log.d("dagger.android.support", String.format("An injector for %s was found in %s", fragment.getClass().getCanonicalName(), m5754a.getClass().getCanonicalName()));
        }
        m5752c(fragment, m5754a);
    }

    /* renamed from: c */
    private static void m5752c(Object obj, InterfaceC10866b interfaceC10866b) {
        InterfaceC4768a<Object> mo5749j = interfaceC10866b.mo5749j();
        C11617f.m4588c(mo5749j, "%s.androidInjector() returned null", interfaceC10866b.getClass());
        mo5749j.mo2889c(obj);
    }
}
