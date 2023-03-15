package p189k;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* renamed from: k.b */
/* loaded from: classes.dex */
public abstract class AbstractC6541b {

    /* renamed from: w */
    private Object f17712w;

    /* renamed from: x */
    private boolean f17713x;

    /* compiled from: ActionMode.java */
    /* renamed from: k.b$a */
    /* loaded from: classes.dex */
    public interface InterfaceC6542a {
        /* renamed from: a */
        boolean mo20632a(AbstractC6541b abstractC6541b, MenuItem menuItem);

        /* renamed from: b */
        boolean mo20631b(AbstractC6541b abstractC6541b, Menu menu);

        /* renamed from: c */
        boolean mo20630c(AbstractC6541b abstractC6541b, Menu menu);

        /* renamed from: d */
        void mo20629d(AbstractC6541b abstractC6541b);
    }

    /* renamed from: c */
    public abstract void mo20646c();

    /* renamed from: d */
    public abstract View mo20645d();

    /* renamed from: e */
    public abstract Menu mo20644e();

    /* renamed from: f */
    public abstract MenuInflater mo20643f();

    /* renamed from: g */
    public abstract CharSequence mo20642g();

    /* renamed from: h */
    public Object m20656h() {
        return this.f17712w;
    }

    /* renamed from: i */
    public abstract CharSequence mo20641i();

    /* renamed from: j */
    public boolean m20655j() {
        return this.f17713x;
    }

    /* renamed from: k */
    public abstract void mo20640k();

    /* renamed from: l */
    public abstract boolean mo20639l();

    /* renamed from: m */
    public abstract void mo20638m(View view);

    /* renamed from: n */
    public abstract void mo20637n(int i);

    /* renamed from: o */
    public abstract void mo20636o(CharSequence charSequence);

    /* renamed from: p */
    public void m20654p(Object obj) {
        this.f17712w = obj;
    }

    /* renamed from: q */
    public abstract void mo20635q(int i);

    /* renamed from: r */
    public abstract void mo20634r(CharSequence charSequence);

    /* renamed from: s */
    public void mo20633s(boolean z) {
        this.f17713x = z;
    }
}
