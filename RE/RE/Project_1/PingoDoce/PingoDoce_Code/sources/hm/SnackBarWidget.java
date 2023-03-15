package hm;

import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import p181jd.Intrinsics;
import p378u5.ResourcesProvider;
import p470yf.SnackBarAction;

/* renamed from: hm.b */
/* loaded from: classes2.dex */
public final class SnackBarWidget {
    public SnackBarWidget(ResourcesProvider resourcesProvider) {
        Intrinsics.isThisObjectNull(resourcesProvider, "resourcesProvider");
    }

    /* renamed from: a */
    public static /* synthetic */ void m22547a(SnackBarAction snackBarAction, View view) {
        m22545c(snackBarAction, view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static final void m22545c(SnackBarAction snackBarAction, View view) {
        Intrinsics.isThisObjectNull(snackBarAction, "$action");
        snackBarAction.m1413a().mo42214q();
    }

    /* renamed from: b */
    public final void m22546b(View view, String str, final SnackBarAction snackBarAction, int i, int i2) {
        Intrinsics.isThisObjectNull(view, "view");
        Intrinsics.isThisObjectNull(str, "message");
        Snackbar m29240d0 = Snackbar.m29240d0(view, str, i);
        m29240d0.m29299L(i2);
        if (snackBarAction != null) {
            m29240d0.m29238f0(snackBarAction.m1412b(), new View.OnClickListener() { // from class: hm.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    SnackBarWidget.m22545c(SnackBarAction.this, view2);
                }
            });
        }
        m29240d0.mo29246Q();
    }
}
