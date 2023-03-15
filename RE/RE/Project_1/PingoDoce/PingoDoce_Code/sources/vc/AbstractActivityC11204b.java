package vc;

import android.os.Bundle;
import androidx.appcompat.app.ActivityC0325c;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.InterfaceC4768a;
import p384uc.C10865a;
import p384uc.InterfaceC10866b;

/* renamed from: vc.b */
/* loaded from: classes2.dex */
public abstract class AbstractActivityC11204b extends ActivityC0325c implements InterfaceC10866b {

    /* renamed from: O */
    DispatchingAndroidInjector<Object> f28772O;

    @Override // p384uc.InterfaceC10866b
    /* renamed from: j */
    public InterfaceC4768a<Object> mo5749j() {
        return this.f28772O;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // androidx.fragment.app.ActivityC1354d, androidx.activity.ComponentActivity, androidx.core.app.ActivityC0904g, android.app.Activity
    public void onCreate(Bundle bundle) {
        C10865a.m6826a(this);
        super.onCreate(bundle);
    }
}
