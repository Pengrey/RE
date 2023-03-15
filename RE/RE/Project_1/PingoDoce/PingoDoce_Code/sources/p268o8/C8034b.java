package p268o8;

import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* renamed from: o8.b */
/* loaded from: classes.dex */
public final class C8034b {

    /* renamed from: a */
    private final View f20773a;

    /* renamed from: b */
    private boolean f20774b = false;

    /* renamed from: c */
    private int f20775c = 0;

    public C8034b(InterfaceC8033a interfaceC8033a) {
        this.f20773a = (View) interfaceC8033a;
    }

    /* renamed from: a */
    private void m17124a() {
        ViewParent parent = this.f20773a.getParent();
        if (parent instanceof CoordinatorLayout) {
            ((CoordinatorLayout) parent).m39333f(this.f20773a);
        }
    }

    /* renamed from: b */
    public int m17123b() {
        return this.f20775c;
    }

    /* renamed from: c */
    public boolean m17122c() {
        return this.f20774b;
    }

    /* renamed from: d */
    public void m17121d(Bundle bundle) {
        this.f20774b = bundle.getBoolean("expanded", false);
        this.f20775c = bundle.getInt("expandedComponentIdHint", 0);
        if (this.f20774b) {
            m17124a();
        }
    }

    /* renamed from: e */
    public Bundle m17120e() {
        Bundle bundle = new Bundle();
        bundle.putBoolean("expanded", this.f20774b);
        bundle.putInt("expandedComponentIdHint", this.f20775c);
        return bundle;
    }

    /* renamed from: f */
    public void m17119f(int i) {
        this.f20775c = i;
    }
}
