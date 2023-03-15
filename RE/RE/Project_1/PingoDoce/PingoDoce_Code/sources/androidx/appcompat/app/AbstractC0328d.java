package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import p091f.InterfaceC5146a;
import p301q.C9552b;

/* renamed from: androidx.appcompat.app.d */
/* loaded from: classes.dex */
public abstract class AbstractC0328d {

    /* renamed from: w */
    private static int f803w = -100;

    /* renamed from: x */
    private static final C9552b<WeakReference<AbstractC0328d>> f804x = new C9552b<>();

    /* renamed from: y */
    private static final Object f805y = new Object();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m41248c(AbstractC0328d abstractC0328d) {
        synchronized (f805y) {
            m41242y(abstractC0328d);
            f804x.add(new WeakReference<>(abstractC0328d));
        }
    }

    /* renamed from: g */
    public static AbstractC0328d m41246g(Activity activity, InterfaceC5146a interfaceC5146a) {
        return new LayoutInflater$Factory2C0329e(activity, interfaceC5146a);
    }

    /* renamed from: h */
    public static AbstractC0328d m41245h(Dialog dialog, InterfaceC5146a interfaceC5146a) {
        return new LayoutInflater$Factory2C0329e(dialog, interfaceC5146a);
    }

    /* renamed from: j */
    public static int m41244j() {
        return f803w;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: x */
    public static void m41243x(AbstractC0328d abstractC0328d) {
        synchronized (f805y) {
            m41242y(abstractC0328d);
        }
    }

    /* renamed from: y */
    private static void m41242y(AbstractC0328d abstractC0328d) {
        synchronized (f805y) {
            Iterator<WeakReference<AbstractC0328d>> it = f804x.iterator();
            while (it.hasNext()) {
                AbstractC0328d abstractC0328d2 = it.next().get();
                if (abstractC0328d2 == abstractC0328d || abstractC0328d2 == null) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: A */
    public abstract void mo41241A(int i);

    /* renamed from: B */
    public abstract void mo41239B(View view);

    /* renamed from: C */
    public abstract void mo41237C(View view, ViewGroup.LayoutParams layoutParams);

    /* renamed from: D */
    public void mo41235D(int i) {
    }

    /* renamed from: E */
    public abstract void mo41233E(CharSequence charSequence);

    /* renamed from: d */
    public abstract void mo41199d(View view, ViewGroup.LayoutParams layoutParams);

    @Deprecated
    /* renamed from: e */
    public void m41247e(Context context) {
    }

    /* renamed from: f */
    public Context mo41196f(Context context) {
        m41247e(context);
        return context;
    }

    /* renamed from: i */
    public abstract <T extends View> T mo41192i(int i);

    /* renamed from: k */
    public int mo41189k() {
        return -100;
    }

    /* renamed from: l */
    public abstract MenuInflater mo41187l();

    /* renamed from: m */
    public abstract AbstractC0319a mo41185m();

    /* renamed from: n */
    public abstract void mo41183n();

    /* renamed from: o */
    public abstract void mo41181o();

    /* renamed from: p */
    public abstract void mo41179p(Configuration configuration);

    /* renamed from: q */
    public abstract void mo41177q(Bundle bundle);

    /* renamed from: r */
    public abstract void mo41175r();

    /* renamed from: s */
    public abstract void mo41173s(Bundle bundle);

    /* renamed from: t */
    public abstract void mo41171t();

    /* renamed from: u */
    public abstract void mo41169u(Bundle bundle);

    /* renamed from: v */
    public abstract void mo41167v();

    /* renamed from: w */
    public abstract void mo41165w();

    /* renamed from: z */
    public abstract boolean mo41161z(int i);
}
