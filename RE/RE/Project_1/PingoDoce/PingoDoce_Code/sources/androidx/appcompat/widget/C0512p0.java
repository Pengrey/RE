package androidx.appcompat.widget;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.os.Build;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: androidx.appcompat.widget.p0 */
/* loaded from: classes.dex */
public class C0512p0 extends ContextWrapper {

    /* renamed from: c */
    private static final Object f1716c = new Object();

    /* renamed from: d */
    private static ArrayList<WeakReference<C0512p0>> f1717d;

    /* renamed from: a */
    private final Resources f1718a;

    /* renamed from: b */
    private final Resources.Theme f1719b;

    private C0512p0(Context context) {
        super(context);
        if (C0539x0.m40332c()) {
            C0539x0 c0539x0 = new C0539x0(this, context.getResources());
            this.f1718a = c0539x0;
            Resources.Theme newTheme = c0539x0.newTheme();
            this.f1719b = newTheme;
            newTheme.setTo(context.getTheme());
            return;
        }
        this.f1718a = new C0516r0(this, context.getResources());
        this.f1719b = null;
    }

    /* renamed from: a */
    private static boolean m40483a(Context context) {
        if ((context instanceof C0512p0) || (context.getResources() instanceof C0516r0) || (context.getResources() instanceof C0539x0)) {
            return false;
        }
        return Build.VERSION.SDK_INT < 21 || C0539x0.m40332c();
    }

    /* renamed from: b */
    public static Context m40482b(Context context) {
        if (m40483a(context)) {
            synchronized (f1716c) {
                ArrayList<WeakReference<C0512p0>> arrayList = f1717d;
                if (arrayList == null) {
                    f1717d = new ArrayList<>();
                } else {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        WeakReference<C0512p0> weakReference = f1717d.get(size);
                        if (weakReference == null || weakReference.get() == null) {
                            f1717d.remove(size);
                        }
                    }
                    for (int size2 = f1717d.size() - 1; size2 >= 0; size2--) {
                        WeakReference<C0512p0> weakReference2 = f1717d.get(size2);
                        C0512p0 c0512p0 = weakReference2 != null ? weakReference2.get() : null;
                        if (c0512p0 != null && c0512p0.getBaseContext() == context) {
                            return c0512p0;
                        }
                    }
                }
                C0512p0 c0512p02 = new C0512p0(context);
                f1717d.add(new WeakReference<>(c0512p02));
                return c0512p02;
            }
        }
        return context;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public AssetManager getAssets() {
        return this.f1718a.getAssets();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        return this.f1718a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public Resources.Theme getTheme() {
        Resources.Theme theme = this.f1719b;
        return theme == null ? super.getTheme() : theme;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public void setTheme(int i) {
        Resources.Theme theme = this.f1719b;
        if (theme == null) {
            super.setTheme(i);
        } else {
            theme.applyStyle(i, true);
        }
    }
}
