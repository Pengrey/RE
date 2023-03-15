package androidx.core.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.core.view.C1162g;
import androidx.lifecycle.AbstractC1469p;
import androidx.lifecycle.C1493x;
import androidx.lifecycle.FragmentC1454k0;
import androidx.lifecycle.InterfaceC1491v;
import p301q.C9558g;

/* renamed from: androidx.core.app.g */
/* loaded from: classes.dex */
public class ActivityC0904g extends Activity implements InterfaceC1491v, C1162g.InterfaceC1163a {

    /* renamed from: w */
    private C1493x f3089w;

    public ActivityC0904g() {
        new C9558g();
        this.f3089w = new C1493x(this);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C1162g.m38176d(decorView, keyEvent)) {
            return C1162g.m38175e(this, decorView, this, keyEvent);
        }
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
        View decorView = getWindow().getDecorView();
        if (decorView == null || !C1162g.m38176d(decorView, keyEvent)) {
            return super.dispatchKeyShortcutEvent(keyEvent);
        }
        return true;
    }

    @Override // androidx.core.view.C1162g.InterfaceC1163a
    /* renamed from: k */
    public boolean mo25551k(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    @SuppressLint({"RestrictedApi"})
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FragmentC1454k0.m37013g(this);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        this.f3089w.m36958j(AbstractC1469p.EnumC1472c.CREATED);
        super.onSaveInstanceState(bundle);
    }
}
