package androidx.fragment.app;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.core.util.C1076h;
import androidx.lifecycle.InterfaceC1488t0;

/* renamed from: androidx.fragment.app.g */
/* loaded from: classes.dex */
public class C1366g {

    /* renamed from: a */
    private final AbstractC1368i<?> f4067a;

    private C1366g(AbstractC1368i<?> abstractC1368i) {
        this.f4067a = abstractC1368i;
    }

    /* renamed from: b */
    public static C1366g m37304b(AbstractC1368i<?> abstractC1368i) {
        return new C1366g((AbstractC1368i) C1076h.m38618g(abstractC1368i, "callbacks == null"));
    }

    /* renamed from: a */
    public void m37305a(Fragment fragment) {
        AbstractC1368i<?> abstractC1368i = this.f4067a;
        abstractC1368i.f4072z.m37453k(abstractC1368i, abstractC1368i, fragment);
    }

    /* renamed from: c */
    public void m37303c() {
        this.f4067a.f4072z.m37410z();
    }

    /* renamed from: d */
    public void m37302d(Configuration configuration) {
        this.f4067a.f4072z.m37533B(configuration);
    }

    /* renamed from: e */
    public boolean m37301e(MenuItem menuItem) {
        return this.f4067a.f4072z.m37531C(menuItem);
    }

    /* renamed from: f */
    public void m37300f() {
        this.f4067a.f4072z.m37529D();
    }

    /* renamed from: g */
    public boolean m37299g(Menu menu, MenuInflater menuInflater) {
        return this.f4067a.f4072z.m37527E(menu, menuInflater);
    }

    /* renamed from: h */
    public void m37298h() {
        this.f4067a.f4072z.m37525F();
    }

    /* renamed from: i */
    public void m37297i() {
        this.f4067a.f4072z.m37521H();
    }

    /* renamed from: j */
    public void m37296j(boolean z) {
        this.f4067a.f4072z.m37519I(z);
    }

    /* renamed from: k */
    public boolean m37295k(MenuItem menuItem) {
        return this.f4067a.f4072z.m37515K(menuItem);
    }

    /* renamed from: l */
    public void m37294l(Menu menu) {
        this.f4067a.f4072z.m37513L(menu);
    }

    /* renamed from: m */
    public void m37293m() {
        this.f4067a.f4072z.m37509N();
    }

    /* renamed from: n */
    public void m37292n(boolean z) {
        this.f4067a.f4072z.m37507O(z);
    }

    /* renamed from: o */
    public boolean m37291o(Menu menu) {
        return this.f4067a.f4072z.m37505P(menu);
    }

    /* renamed from: p */
    public void m37290p() {
        this.f4067a.f4072z.m37501R();
    }

    /* renamed from: q */
    public void m37289q() {
        this.f4067a.f4072z.m37499S();
    }

    /* renamed from: r */
    public void m37288r() {
        this.f4067a.f4072z.m37495U();
    }

    /* renamed from: s */
    public boolean m37287s() {
        return this.f4067a.f4072z.m37479b0(true);
    }

    /* renamed from: t */
    public FragmentManager m37286t() {
        return this.f4067a.f4072z;
    }

    /* renamed from: u */
    public void m37285u() {
        this.f4067a.f4072z.m37494U0();
    }

    /* renamed from: v */
    public View m37284v(View view, String str, Context context, AttributeSet attributeSet) {
        return this.f4067a.f4072z.m37416w0().onCreateView(view, str, context, attributeSet);
    }

    /* renamed from: w */
    public void m37283w(Parcelable parcelable) {
        AbstractC1368i<?> abstractC1368i = this.f4067a;
        if (abstractC1368i instanceof InterfaceC1488t0) {
            abstractC1368i.f4072z.m37454j1(parcelable);
            return;
        }
        throw new IllegalStateException("Your FragmentHostCallback must implement ViewModelStoreOwner to call restoreSaveState(). Call restoreAllState()  if you're still using retainNestedNonConfig().");
    }

    /* renamed from: x */
    public Parcelable m37282x() {
        return this.f4067a.f4072z.m37448l1();
    }
}
