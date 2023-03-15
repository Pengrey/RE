package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.content.C0928a;
import androidx.core.util.C1076h;
import java.io.FileDescriptor;
import java.io.PrintWriter;

/* renamed from: androidx.fragment.app.i */
/* loaded from: classes.dex */
public abstract class AbstractC1368i<E> extends AbstractC1365f {

    /* renamed from: w */
    private final Activity f4069w;

    /* renamed from: x */
    private final Context f4070x;

    /* renamed from: y */
    private final Handler f4071y;

    /* renamed from: z */
    final FragmentManager f4072z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC1368i(ActivityC1354d activityC1354d) {
        this(activityC1354d, activityC1354d, new Handler(), 0);
    }

    @Override // androidx.fragment.app.AbstractC1365f
    /* renamed from: d */
    public View mo37277d(int i) {
        return null;
    }

    @Override // androidx.fragment.app.AbstractC1365f
    /* renamed from: e */
    public boolean mo37276e() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public Activity m37275f() {
        return this.f4069w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public Context m37274g() {
        return this.f4070x;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: j */
    public Handler m37273j() {
        return this.f4071y;
    }

    /* renamed from: k */
    public void mo37272k(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    /* renamed from: l */
    public abstract E mo37312s();

    /* renamed from: m */
    public LayoutInflater mo37270m() {
        return LayoutInflater.from(this.f4070x);
    }

    @Deprecated
    /* renamed from: n */
    public void m37269n(Fragment fragment, String[] strArr, int i) {
    }

    /* renamed from: o */
    public boolean mo37268o(Fragment fragment) {
        return true;
    }

    /* renamed from: p */
    public boolean mo37267p(String str) {
        return false;
    }

    /* renamed from: q */
    public void m37266q(Fragment fragment, @SuppressLint({"UnknownNullness"}) Intent intent, int i, Bundle bundle) {
        if (i == -1) {
            C0928a.m39104m(this.f4070x, intent, bundle);
            return;
        }
        throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
    }

    /* renamed from: r */
    public void mo37265r() {
    }

    AbstractC1368i(Activity activity, Context context, Handler handler, int i) {
        this.f4072z = new C1373l();
        this.f4069w = activity;
        this.f4070x = (Context) C1076h.m38618g(context, "context == null");
        this.f4071y = (Handler) C1076h.m38618g(handler, "handler == null");
    }
}
