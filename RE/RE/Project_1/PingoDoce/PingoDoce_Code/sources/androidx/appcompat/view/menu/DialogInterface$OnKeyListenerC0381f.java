package androidx.appcompat.view.menu;

import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.appcompat.app.DialogC0323b;
import androidx.appcompat.view.menu.InterfaceC0387j;
import p070e.C4903g;

/* renamed from: androidx.appcompat.view.menu.f */
/* loaded from: classes.dex */
class DialogInterface$OnKeyListenerC0381f implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, InterfaceC0387j.InterfaceC0388a {

    /* renamed from: w */
    private C0378e f1091w;

    /* renamed from: x */
    private DialogC0323b f1092x;

    /* renamed from: y */
    C0375c f1093y;

    /* renamed from: z */
    private InterfaceC0387j.InterfaceC0388a f1094z;

    public DialogInterface$OnKeyListenerC0381f(C0378e c0378e) {
        this.f1091w = c0378e;
    }

    /* renamed from: a */
    public void m40997a() {
        DialogC0323b dialogC0323b = this.f1092x;
        if (dialogC0323b != null) {
            dialogC0323b.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j.InterfaceC0388a
    /* renamed from: b */
    public void mo40856b(C0378e c0378e, boolean z) {
        if (z || c0378e == this.f1091w) {
            m40997a();
        }
        InterfaceC0387j.InterfaceC0388a interfaceC0388a = this.f1094z;
        if (interfaceC0388a != null) {
            interfaceC0388a.mo40856b(c0378e, z);
        }
    }

    @Override // androidx.appcompat.view.menu.InterfaceC0387j.InterfaceC0388a
    /* renamed from: c */
    public boolean mo40855c(C0378e c0378e) {
        InterfaceC0387j.InterfaceC0388a interfaceC0388a = this.f1094z;
        if (interfaceC0388a != null) {
            return interfaceC0388a.mo40855c(c0378e);
        }
        return false;
    }

    /* renamed from: d */
    public void m40996d(IBinder iBinder) {
        C0378e c0378e = this.f1091w;
        DialogC0323b.C0324a c0324a = new DialogC0323b.C0324a(c0378e.m41001w());
        C0375c c0375c = new C0375c(c0324a.m41278b(), C4903g.abc_list_menu_item_layout);
        this.f1093y = c0375c;
        c0375c.mo40949m(this);
        this.f1091w.m41025b(this.f1093y);
        c0324a.m41277c(this.f1093y.m41057a(), this);
        View m41047A = c0378e.m41047A();
        if (m41047A != null) {
            c0324a.m41275e(m41047A);
        } else {
            c0324a.m41274f(c0378e.m40999y()).m41263q(c0378e.m40998z());
        }
        c0324a.m41268l(this);
        DialogC0323b m41279a = c0324a.m41279a();
        this.f1092x = m41279a;
        m41279a.setOnDismissListener(this);
        WindowManager.LayoutParams attributes = this.f1092x.getWindow().getAttributes();
        attributes.type = 1003;
        if (iBinder != null) {
            attributes.token = iBinder;
        }
        attributes.flags |= 131072;
        this.f1092x.show();
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(DialogInterface dialogInterface, int i) {
        this.f1091w.m41038N((C0382g) this.f1093y.m41057a().getItem(i), 0);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        this.f1093y.mo29480b(this.f1091w, true);
    }

    @Override // android.content.DialogInterface.OnKeyListener
    public boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        Window window;
        View decorView;
        KeyEvent.DispatcherState keyDispatcherState;
        View decorView2;
        KeyEvent.DispatcherState keyDispatcherState2;
        if (i == 82 || i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                Window window2 = this.f1092x.getWindow();
                if (window2 != null && (decorView2 = window2.getDecorView()) != null && (keyDispatcherState2 = decorView2.getKeyDispatcherState()) != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                    return true;
                }
            } else if (keyEvent.getAction() == 1 && !keyEvent.isCanceled() && (window = this.f1092x.getWindow()) != null && (decorView = window.getDecorView()) != null && (keyDispatcherState = decorView.getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent)) {
                this.f1091w.m41019e(true);
                dialogInterface.dismiss();
                return true;
            }
        }
        return this.f1091w.performShortcut(i, keyEvent, 0);
    }
}
