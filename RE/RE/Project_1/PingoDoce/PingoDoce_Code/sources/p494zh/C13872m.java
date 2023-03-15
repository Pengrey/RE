package p494zh;

import androidx.databinding.ViewDataBinding;
import com.google.android.play.core.review.InterfaceC3954c;
import hm.SnackBarWidget;
import mg.AppRatingManager;
import mg.AuthManager;
import p494zh.BaseViewModel;

/* renamed from: zh.m */
/* loaded from: classes2.dex */
public final class C13872m<ViewBinding extends ViewDataBinding, ViewModel extends BaseViewModel> {
    /* renamed from: a */
    public static <ViewBinding extends ViewDataBinding, ViewModel extends BaseViewModel> void m126a(BaseActivity<ViewBinding, ViewModel> baseActivity, AppRatingManager appRatingManager) {
        baseActivity.f34970Z = appRatingManager;
    }

    /* renamed from: b */
    public static <ViewBinding extends ViewDataBinding, ViewModel extends BaseViewModel> void m125b(BaseActivity<ViewBinding, ViewModel> baseActivity, AuthManager authManager) {
        baseActivity.f34969Y = authManager;
    }

    /* renamed from: c */
    public static <ViewBinding extends ViewDataBinding, ViewModel extends BaseViewModel> void m124c(BaseActivity<ViewBinding, ViewModel> baseActivity, InterfaceC3954c interfaceC3954c) {
        baseActivity.f34971a0 = interfaceC3954c;
    }

    /* renamed from: d */
    public static <ViewBinding extends ViewDataBinding, ViewModel extends BaseViewModel> void m123d(BaseActivity<ViewBinding, ViewModel> baseActivity, SnackBarWidget snackBarWidget) {
        baseActivity.f34968X = snackBarWidget;
    }
}
