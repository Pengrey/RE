package androidx.core.view;

import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;

/* renamed from: androidx.core.view.f0 */
/* loaded from: classes.dex */
public final class C1160f0 {

    /* compiled from: ViewParentCompat.java */
    /* renamed from: androidx.core.view.f0$a */
    /* loaded from: classes.dex */
    static class C1161a {
        /* renamed from: a */
        static boolean m38186a(ViewParent viewParent, View view, float f, float f2, boolean z) {
            return viewParent.onNestedFling(view, f, f2, z);
        }

        /* renamed from: b */
        static boolean m38185b(ViewParent viewParent, View view, float f, float f2) {
            return viewParent.onNestedPreFling(view, f, f2);
        }

        /* renamed from: c */
        static void m38184c(ViewParent viewParent, View view, int i, int i2, int[] iArr) {
            viewParent.onNestedPreScroll(view, i, i2, iArr);
        }

        /* renamed from: d */
        static void m38183d(ViewParent viewParent, View view, int i, int i2, int i3, int i4) {
            viewParent.onNestedScroll(view, i, i2, i3, i4);
        }

        /* renamed from: e */
        static void m38182e(ViewParent viewParent, View view, View view2, int i) {
            viewParent.onNestedScrollAccepted(view, view2, i);
        }

        /* renamed from: f */
        static boolean m38181f(ViewParent viewParent, View view, View view2, int i) {
            return viewParent.onStartNestedScroll(view, view2, i);
        }

        /* renamed from: g */
        static void m38180g(ViewParent viewParent, View view) {
            viewParent.onStopNestedScroll(view);
        }
    }

    /* renamed from: a */
    public static boolean m38193a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return C1161a.m38186a(viewParent, view, f, f2, z);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedFling", e);
                return false;
            }
        } else if (viewParent instanceof InterfaceC1209s) {
            return ((InterfaceC1209s) viewParent).onNestedFling(view, f, f2, z);
        } else {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m38192b(ViewParent viewParent, View view, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 21) {
            try {
                return C1161a.m38185b(viewParent, view, f, f2);
            } catch (AbstractMethodError e) {
                Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreFling", e);
                return false;
            }
        } else if (viewParent instanceof InterfaceC1209s) {
            return ((InterfaceC1209s) viewParent).onNestedPreFling(view, f, f2);
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public static void m38191c(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof InterfaceC1207q) {
            ((InterfaceC1207q) viewParent).mo37980j(view, i, i2, iArr, i3);
        } else if (i3 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    C1161a.m38184c(viewParent, view, i, i2, iArr);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedPreScroll", e);
                }
            } else if (viewParent instanceof InterfaceC1209s) {
                ((InterfaceC1209s) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    /* renamed from: d */
    public static void m38190d(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5, int[] iArr) {
        if (viewParent instanceof InterfaceC1208r) {
            ((InterfaceC1208r) viewParent).mo37977m(view, i, i2, i3, i4, i5, iArr);
            return;
        }
        iArr[0] = iArr[0] + i3;
        iArr[1] = iArr[1] + i4;
        if (viewParent instanceof InterfaceC1207q) {
            ((InterfaceC1207q) viewParent).mo37976n(view, i, i2, i3, i4, i5);
        } else if (i5 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    C1161a.m38183d(viewParent, view, i, i2, i3, i4);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScroll", e);
                }
            } else if (viewParent instanceof InterfaceC1209s) {
                ((InterfaceC1209s) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }
    }

    /* renamed from: e */
    public static void m38189e(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof InterfaceC1207q) {
            ((InterfaceC1207q) viewParent).mo37982h(view, view2, i, i2);
        } else if (i2 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    C1161a.m38182e(viewParent, view, view2, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onNestedScrollAccepted", e);
                }
            } else if (viewParent instanceof InterfaceC1209s) {
                ((InterfaceC1209s) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    /* renamed from: f */
    public static boolean m38188f(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof InterfaceC1207q) {
            return ((InterfaceC1207q) viewParent).mo37975o(view, view2, i, i2);
        }
        if (i2 == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    return C1161a.m38181f(viewParent, view, view2, i);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStartNestedScroll", e);
                    return false;
                }
            } else if (viewParent instanceof InterfaceC1209s) {
                return ((InterfaceC1209s) viewParent).onStartNestedScroll(view, view2, i);
            } else {
                return false;
            }
        }
        return false;
    }

    /* renamed from: g */
    public static void m38187g(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof InterfaceC1207q) {
            ((InterfaceC1207q) viewParent).mo37981i(view, i);
        } else if (i == 0) {
            if (Build.VERSION.SDK_INT >= 21) {
                try {
                    C1161a.m38180g(viewParent, view);
                } catch (AbstractMethodError e) {
                    Log.e("ViewParentCompat", "ViewParent " + viewParent + " does not implement interface method onStopNestedScroll", e);
                }
            } else if (viewParent instanceof InterfaceC1209s) {
                ((InterfaceC1209s) viewParent).onStopNestedScroll(view);
            }
        }
    }
}
