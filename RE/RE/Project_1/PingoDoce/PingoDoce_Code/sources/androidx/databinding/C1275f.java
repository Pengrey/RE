package androidx.databinding;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: androidx.databinding.f */
/* loaded from: classes.dex */
public class C1275f {

    /* renamed from: a */
    private static AbstractC1273d f3706a = new DataBinderMapperImpl();

    /* renamed from: b */
    private static InterfaceC1274e f3707b = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static <T extends ViewDataBinding> T m37768a(InterfaceC1274e interfaceC1274e, View view, int i) {
        return (T) f3706a.mo14799b(interfaceC1274e, view, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static <T extends ViewDataBinding> T m37767b(InterfaceC1274e interfaceC1274e, View[] viewArr, int i) {
        return (T) f3706a.mo14798c(interfaceC1274e, viewArr, i);
    }

    /* renamed from: c */
    private static <T extends ViewDataBinding> T m37766c(InterfaceC1274e interfaceC1274e, ViewGroup viewGroup, int i, int i2) {
        int childCount = viewGroup.getChildCount();
        int i3 = childCount - i;
        if (i3 == 1) {
            return (T) m37768a(interfaceC1274e, viewGroup.getChildAt(childCount - 1), i2);
        }
        View[] viewArr = new View[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            viewArr[i4] = viewGroup.getChildAt(i4 + i);
        }
        return (T) m37767b(interfaceC1274e, viewArr, i2);
    }

    /* renamed from: d */
    public static InterfaceC1274e m37765d() {
        return f3707b;
    }

    /* renamed from: e */
    public static <T extends ViewDataBinding> T m37764e(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z) {
        return (T) m37763f(layoutInflater, i, viewGroup, z, f3707b);
    }

    /* renamed from: f */
    public static <T extends ViewDataBinding> T m37763f(LayoutInflater layoutInflater, int i, ViewGroup viewGroup, boolean z, InterfaceC1274e interfaceC1274e) {
        boolean z2 = viewGroup != null && z;
        int childCount = z2 ? viewGroup.getChildCount() : 0;
        View inflate = layoutInflater.inflate(i, viewGroup, z);
        if (z2) {
            return (T) m37766c(interfaceC1274e, viewGroup, childCount, i);
        }
        return (T) m37768a(interfaceC1274e, inflate, i);
    }

    /* renamed from: g */
    public static <T extends ViewDataBinding> T m37762g(Activity activity, int i) {
        return (T) m37761h(activity, i, f3707b);
    }

    /* renamed from: h */
    public static <T extends ViewDataBinding> T m37761h(Activity activity, int i, InterfaceC1274e interfaceC1274e) {
        activity.setContentView(i);
        return (T) m37766c(interfaceC1274e, (ViewGroup) activity.getWindow().getDecorView().findViewById(16908290), 0, i);
    }
}
