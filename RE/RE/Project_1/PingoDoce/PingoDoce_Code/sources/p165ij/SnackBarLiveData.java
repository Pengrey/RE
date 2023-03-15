package p165ij;

import androidx.lifecycle.C1436e0;
import androidx.lifecycle.LiveData;
import im.SnackBarEvent;
import im.SnackBarObject;
import p181jd.Intrinsics;
import p470yf.SnackBarAction;

/* renamed from: ij.a */
/* loaded from: classes2.dex */
public final class SnackBarLiveData {

    /* renamed from: a */
    public static final SnackBarLiveData f16957a = new SnackBarLiveData();

    /* renamed from: b */
    private static final C1436e0 f16958b;

    /* renamed from: c */
    private static final LiveData f16959c;

    static {
        C1436e0 c1436e0 = new C1436e0();
        f16958b = c1436e0;
        f16959c = c1436e0;
    }

    private SnackBarLiveData() {
    }

    /* renamed from: c */
    public static /* synthetic */ void m21968c(SnackBarLiveData snackBarLiveData, String str, SnackBarAction snackBarAction, int i, int i2, int i3, Object obj) {
        if ((i3 & 2) != 0) {
            snackBarAction = null;
        }
        if ((i3 & 4) != 0) {
            i = -1;
        }
        if ((i3 & 8) != 0) {
            i2 = 1;
        }
        snackBarLiveData.m21969b(str, snackBarAction, i, i2);
    }

    /* renamed from: a */
    public final LiveData m21970a() {
        return f16959c;
    }

    /* renamed from: b */
    public final void m21969b(String str, SnackBarAction snackBarAction, int i, int i2) {
        Intrinsics.isThisObjectNull(str, "message");
        if (str.length() > 0) {
            f16958b.mo169m(new SnackBarEvent(new SnackBarObject(str, snackBarAction, i, i2)));
        }
    }
}
