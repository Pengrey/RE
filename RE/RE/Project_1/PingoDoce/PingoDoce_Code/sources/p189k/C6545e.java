package p189k;

import android.content.Context;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.C0378e;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
import p189k.AbstractC6541b;

/* renamed from: k.e */
/* loaded from: classes.dex */
public class C6545e extends AbstractC6541b implements C0378e.InterfaceC0379a {

    /* renamed from: A */
    private AbstractC6541b.InterfaceC6542a f17719A;

    /* renamed from: B */
    private WeakReference<View> f17720B;

    /* renamed from: C */
    private boolean f17721C;

    /* renamed from: D */
    private C0378e f17722D;

    /* renamed from: y */
    private Context f17723y;

    /* renamed from: z */
    private ActionBarContextView f17724z;

    public C6545e(Context context, ActionBarContextView actionBarContextView, AbstractC6541b.InterfaceC6542a interfaceC6542a, boolean z) {
        this.f17723y = context;
        this.f17724z = actionBarContextView;
        this.f17719A = interfaceC6542a;
        C0378e m41030W = new C0378e(actionBarContextView.getContext()).m41030W(1);
        this.f17722D = m41030W;
        m41030W.mo40936V(this);
    }

    @Override // androidx.appcompat.view.menu.C0378e.InterfaceC0379a
    /* renamed from: a */
    public boolean mo20648a(C0378e c0378e, MenuItem menuItem) {
        return this.f17719A.mo20632a(this, menuItem);
    }

    @Override // androidx.appcompat.view.menu.C0378e.InterfaceC0379a
    /* renamed from: b */
    public void mo20647b(C0378e c0378e) {
        mo20640k();
        this.f17724z.m40923l();
    }

    @Override // p189k.AbstractC6541b
    /* renamed from: c */
    public void mo20646c() {
        if (this.f17721C) {
            return;
        }
        this.f17721C = true;
        this.f17724z.sendAccessibilityEvent(32);
        this.f17719A.mo20629d(this);
    }

    @Override // p189k.AbstractC6541b
    /* renamed from: d */
    public View mo20645d() {
        WeakReference<View> weakReference = this.f17720B;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // p189k.AbstractC6541b
    /* renamed from: e */
    public Menu mo20644e() {
        return this.f17722D;
    }

    @Override // p189k.AbstractC6541b
    /* renamed from: f */
    public MenuInflater mo20643f() {
        return new C6548g(this.f17724z.getContext());
    }

    @Override // p189k.AbstractC6541b
    /* renamed from: g */
    public CharSequence mo20642g() {
        return this.f17724z.getSubtitle();
    }

    @Override // p189k.AbstractC6541b
    /* renamed from: i */
    public CharSequence mo20641i() {
        return this.f17724z.getTitle();
    }

    @Override // p189k.AbstractC6541b
    /* renamed from: k */
    public void mo20640k() {
        this.f17719A.mo20630c(this, this.f17722D);
    }

    @Override // p189k.AbstractC6541b
    /* renamed from: l */
    public boolean mo20639l() {
        return this.f17724z.m40925j();
    }

    @Override // p189k.AbstractC6541b
    /* renamed from: m */
    public void mo20638m(View view) {
        this.f17724z.setCustomView(view);
        this.f17720B = view != null ? new WeakReference<>(view) : null;
    }

    @Override // p189k.AbstractC6541b
    /* renamed from: n */
    public void mo20637n(int i) {
        mo20636o(this.f17723y.getString(i));
    }

    @Override // p189k.AbstractC6541b
    /* renamed from: o */
    public void mo20636o(CharSequence charSequence) {
        this.f17724z.setSubtitle(charSequence);
    }

    @Override // p189k.AbstractC6541b
    /* renamed from: q */
    public void mo20635q(int i) {
        mo20634r(this.f17723y.getString(i));
    }

    @Override // p189k.AbstractC6541b
    /* renamed from: r */
    public void mo20634r(CharSequence charSequence) {
        this.f17724z.setTitle(charSequence);
    }

    @Override // p189k.AbstractC6541b
    /* renamed from: s */
    public void mo20633s(boolean z) {
        super.mo20633s(z);
        this.f17724z.setTitleOptional(z);
    }
}
