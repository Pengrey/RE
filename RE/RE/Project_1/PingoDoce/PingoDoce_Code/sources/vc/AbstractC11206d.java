package vc;

import android.content.Context;
import androidx.fragment.app.Fragment;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.InterfaceC4768a;
import p384uc.InterfaceC10866b;

/* renamed from: vc.d */
/* loaded from: classes2.dex */
public abstract class AbstractC11206d extends Fragment implements InterfaceC10866b {

    /* renamed from: w0 */
    DispatchingAndroidInjector<Object> f28773w0;

    @Override // androidx.fragment.app.Fragment
    /* renamed from: A0 */
    public void mo5750A0(Context context) {
        C11203a.m5753b(this);
        super.mo5750A0(context);
    }

    @Override // p384uc.InterfaceC10866b
    /* renamed from: j */
    public InterfaceC4768a<Object> mo5749j() {
        return this.f28773w0;
    }
}
