package hk;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.AbstractC1469p;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;
import p299pj.WalkThroughStepsAdapter;

/* renamed from: hk.c */
/* loaded from: classes2.dex */
public final class AppWalkThroughAdapter extends WalkThroughStepsAdapter {

    /* compiled from: AppWalkThroughAdapter.kt */
    /* renamed from: hk.c$a */
    /* loaded from: classes2.dex */
    public static final class C5959a {
        private C5959a() {
        }

        public /* synthetic */ C5959a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5959a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppWalkThroughAdapter(FragmentManager fragmentManager, AbstractC1469p abstractC1469p) {
        super(fragmentManager, abstractC1469p);
        Intrinsics.isThisObjectNull(fragmentManager, "fragmentManager");
        Intrinsics.isThisObjectNull(abstractC1469p, "lifecycle");
    }

    /* renamed from: F */
    public Fragment mo35530F(int i) {
        if (i != 0) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return new AppWalkThroughStep5Fragment();
                    }
                    return new AppWalkThroughStep4Fragment();
                }
                return new AppWalkThroughStep3Fragment();
            }
            return new AppWalkThroughStep2Fragment();
        }
        return new AppWalkThroughStep1Fragment();
    }

    /* renamed from: f */
    public int mo29834f() {
        return 5;
    }
}
