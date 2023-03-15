package androidx.profileinstaller;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.profileinstaller.C1511d;
import p458y2.ExecutorC13073b;

/* loaded from: classes.dex */
public class ProfileInstallReceiver extends BroadcastReceiver {

    /* renamed from: androidx.profileinstaller.ProfileInstallReceiver$a */
    /* loaded from: classes.dex */
    class C1504a implements C1511d.InterfaceC1514c {
        C1504a() {
        }

        @Override // androidx.profileinstaller.C1511d.InterfaceC1514c
        /* renamed from: a */
        public void mo36860a(int i, Object obj) {
            C1511d.f4423b.mo36860a(i, obj);
            ProfileInstallReceiver.this.setResultCode(i);
        }
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent != null && "androidx.profileinstaller.action.INSTALL_PROFILE".equals(intent.getAction())) {
            C1511d.m36861i(context, ExecutorC13073b.f33999w, new C1504a(), true);
        }
    }
}
