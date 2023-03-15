package p091f;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AbstractC0328d;
import androidx.core.view.C1162g;
import p070e.C4897a;
import p189k.AbstractC6541b;

/* renamed from: f.b */
/* loaded from: classes.dex */
public class DialogC5147b extends Dialog implements InterfaceC5146a {

    /* renamed from: w */
    private AbstractC0328d f14228w;

    /* renamed from: x */
    private final C1162g.InterfaceC1163a f14229x;

    /* compiled from: AppCompatDialog.java */
    /* renamed from: f.b$a */
    /* loaded from: classes.dex */
    class C5148a implements C1162g.InterfaceC1163a {
        C5148a() {
        }

        @Override // androidx.core.view.C1162g.InterfaceC1163a
        /* renamed from: k */
        public boolean mo25551k(KeyEvent keyEvent) {
            return DialogC5147b.this.m25556c(keyEvent);
        }
    }

    public DialogC5147b(Context context, int i) {
        super(context, m25557b(context, i));
        this.f14229x = new C5148a();
        AbstractC0328d m25558a = m25558a();
        m25558a.mo41235D(m25557b(context, i));
        m25558a.mo41177q(null);
    }

    /* renamed from: b */
    private static int m25557b(Context context, int i) {
        if (i == 0) {
            TypedValue typedValue = new TypedValue();
            context.getTheme().resolveAttribute(C4897a.dialogTheme, typedValue, true);
            return typedValue.resourceId;
        }
        return i;
    }

    /* renamed from: a */
    public AbstractC0328d m25558a() {
        if (this.f14228w == null) {
            this.f14228w = AbstractC0328d.m41245h(this, this);
        }
        return this.f14228w;
    }

    @Override // android.app.Dialog
    public void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m25558a().mo41199d(view, layoutParams);
    }

    /* renamed from: c */
    boolean m25556c(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p091f.InterfaceC5146a
    /* renamed from: d */
    public void mo25555d(AbstractC6541b abstractC6541b) {
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        super.dismiss();
        m25558a().mo41175r();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return C1162g.m38175e(this.f14229x, getWindow().getDecorView(), this, keyEvent);
    }

    /* renamed from: e */
    public boolean m25554e(int i) {
        return m25558a().mo41161z(i);
    }

    @Override // android.app.Dialog
    public <T extends View> T findViewById(int i) {
        return (T) m25558a().mo41192i(i);
    }

    @Override // android.app.Dialog
    public void invalidateOptionsMenu() {
        m25558a().mo41181o();
    }

    @Override // p091f.InterfaceC5146a
    /* renamed from: o */
    public AbstractC6541b mo25553o(AbstractC6541b.InterfaceC6542a interfaceC6542a) {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.app.Dialog
    public void onCreate(Bundle bundle) {
        m25558a().mo41183n();
        super.onCreate(bundle);
        m25558a().mo41177q(bundle);
    }

    @Override // android.app.Dialog
    protected void onStop() {
        super.onStop();
        m25558a().mo41165w();
    }

    @Override // android.app.Dialog
    public void setContentView(int i) {
        m25558a().mo41241A(i);
    }

    @Override // android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        m25558a().mo41233E(charSequence);
    }

    @Override // p091f.InterfaceC5146a
    /* renamed from: y */
    public void mo25552y(AbstractC6541b abstractC6541b) {
    }

    @Override // android.app.Dialog
    public void setContentView(View view) {
        m25558a().mo41239B(view);
    }

    @Override // android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        m25558a().mo41237C(view, layoutParams);
    }

    @Override // android.app.Dialog
    public void setTitle(int i) {
        super.setTitle(i);
        m25558a().mo41233E(getContext().getString(i));
    }
}
