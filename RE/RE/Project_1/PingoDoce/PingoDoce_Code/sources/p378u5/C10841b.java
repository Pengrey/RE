package p378u5;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import p181jd.Intrinsics;

/* compiled from: ResourcesProvider.kt */
/* renamed from: u5.b */
/* loaded from: classes.dex */
public final class C10841b {
    /* renamed from: a */
    public static final ResourcesProvider m6898a(Activity activity) {
        Intrinsics.isThisObjectNull(activity, "$this$resourcesProvider");
        return new ResourcesProvider(activity);
    }

    /* renamed from: b */
    public static final ResourcesProvider m6897b(View view) {
        Intrinsics.isThisObjectNull(view, "$this$resourcesProvider");
        Context context = view.getContext();
        Intrinsics.checkIfNull(context, "context");
        return new ResourcesProvider(context);
    }

    /* renamed from: c */
    public static final ResourcesProvider m6896c(Fragment fragment) throws IllegalStateException {
        Intrinsics.isThisObjectNull(fragment, "$this$resourcesProvider");
        Context m37650H1 = fragment.m37650H1();
        Intrinsics.checkIfNull(m37650H1, "requireContext()");
        return new ResourcesProvider(m37650H1);
    }
}
