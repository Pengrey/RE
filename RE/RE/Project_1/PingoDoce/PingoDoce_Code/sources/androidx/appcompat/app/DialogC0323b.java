package androidx.appcompat.app;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.app.AlertController;
import p070e.C4897a;
import p091f.DialogC5147b;

/* renamed from: androidx.appcompat.app.b */
/* loaded from: classes.dex */
public class DialogC0323b extends DialogC5147b {

    /* renamed from: y */
    final AlertController f796y;

    /* compiled from: AlertDialog.java */
    /* renamed from: androidx.appcompat.app.b$a */
    /* loaded from: classes.dex */
    public static class C0324a {

        /* renamed from: a */
        private final AlertController.C0311f f797a;

        /* renamed from: b */
        private final int f798b;

        public C0324a(Context context) {
            this(context, DialogC0323b.m41281g(context, 0));
        }

        /* renamed from: a */
        public DialogC0323b m41279a() {
            DialogC0323b dialogC0323b = new DialogC0323b(this.f797a.f756a, this.f798b);
            this.f797a.m41296a(dialogC0323b.f796y);
            dialogC0323b.setCancelable(this.f797a.f773r);
            if (this.f797a.f773r) {
                dialogC0323b.setCanceledOnTouchOutside(true);
            }
            dialogC0323b.setOnCancelListener(this.f797a.f774s);
            dialogC0323b.setOnDismissListener(this.f797a.f775t);
            DialogInterface.OnKeyListener onKeyListener = this.f797a.f776u;
            if (onKeyListener != null) {
                dialogC0323b.setOnKeyListener(onKeyListener);
            }
            return dialogC0323b;
        }

        /* renamed from: b */
        public Context m41278b() {
            return this.f797a.f756a;
        }

        /* renamed from: c */
        public C0324a m41277c(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0311f c0311f = this.f797a;
            c0311f.f778w = listAdapter;
            c0311f.f779x = onClickListener;
            return this;
        }

        /* renamed from: d */
        public C0324a m41276d(boolean z) {
            this.f797a.f773r = z;
            return this;
        }

        /* renamed from: e */
        public C0324a m41275e(View view) {
            this.f797a.f762g = view;
            return this;
        }

        /* renamed from: f */
        public C0324a m41274f(Drawable drawable) {
            this.f797a.f759d = drawable;
            return this;
        }

        /* renamed from: g */
        public C0324a m41273g(int i) {
            AlertController.C0311f c0311f = this.f797a;
            c0311f.f763h = c0311f.f756a.getText(i);
            return this;
        }

        /* renamed from: h */
        public C0324a m41272h(CharSequence charSequence) {
            this.f797a.f763h = charSequence;
            return this;
        }

        /* renamed from: i */
        public C0324a m41271i(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0311f c0311f = this.f797a;
            c0311f.f767l = c0311f.f756a.getText(i);
            this.f797a.f769n = onClickListener;
            return this;
        }

        /* renamed from: j */
        public C0324a m41270j(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0311f c0311f = this.f797a;
            c0311f.f767l = charSequence;
            c0311f.f769n = onClickListener;
            return this;
        }

        /* renamed from: k */
        public C0324a m41269k(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0311f c0311f = this.f797a;
            c0311f.f770o = c0311f.f756a.getText(i);
            this.f797a.f772q = onClickListener;
            return this;
        }

        /* renamed from: l */
        public C0324a m41268l(DialogInterface.OnKeyListener onKeyListener) {
            this.f797a.f776u = onKeyListener;
            return this;
        }

        /* renamed from: m */
        public C0324a m41267m(int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0311f c0311f = this.f797a;
            c0311f.f764i = c0311f.f756a.getText(i);
            this.f797a.f766k = onClickListener;
            return this;
        }

        /* renamed from: n */
        public C0324a m41266n(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0311f c0311f = this.f797a;
            c0311f.f764i = charSequence;
            c0311f.f766k = onClickListener;
            return this;
        }

        /* renamed from: o */
        public C0324a m41265o(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
            AlertController.C0311f c0311f = this.f797a;
            c0311f.f778w = listAdapter;
            c0311f.f779x = onClickListener;
            c0311f.f749I = i;
            c0311f.f748H = true;
            return this;
        }

        /* renamed from: p */
        public C0324a m41264p(int i) {
            AlertController.C0311f c0311f = this.f797a;
            c0311f.f761f = c0311f.f756a.getText(i);
            return this;
        }

        /* renamed from: q */
        public C0324a m41263q(CharSequence charSequence) {
            this.f797a.f761f = charSequence;
            return this;
        }

        /* renamed from: r */
        public C0324a m41262r(View view) {
            AlertController.C0311f c0311f = this.f797a;
            c0311f.f781z = view;
            c0311f.f780y = 0;
            c0311f.f745E = false;
            return this;
        }

        /* renamed from: s */
        public DialogC0323b m41261s() {
            DialogC0323b m41279a = m41279a();
            m41279a.show();
            return m41279a;
        }

        public C0324a(Context context, int i) {
            this.f797a = new AlertController.C0311f(new ContextThemeWrapper(context, DialogC0323b.m41281g(context, i)));
            this.f798b = i;
        }
    }

    protected DialogC0323b(Context context, int i) {
        super(context, m41281g(context, i));
        this.f796y = new AlertController(getContext(), this, getWindow());
    }

    /* renamed from: g */
    static int m41281g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(C4897a.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    /* renamed from: f */
    public ListView m41282f() {
        return this.f796y.m41320d();
    }

    /* renamed from: h */
    public void m41280h(View view) {
        this.f796y.m41305s(view);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p091f.DialogC5147b, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f796y.m41319e();
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (this.f796y.m41317g(i, keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (this.f796y.m41316h(i, keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // p091f.DialogC5147b, android.app.Dialog
    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        this.f796y.m41307q(charSequence);
    }
}
