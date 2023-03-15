package p299pj;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.airbnb.lottie.LottieAnimationView;
import p181jd.Intrinsics;

/* renamed from: pj.c */
/* loaded from: classes2.dex */
public abstract class WalkThroughFragment extends Fragment {
    /* renamed from: c1 */
    public void mo37596c1(View view, Bundle bundle) {
        Intrinsics.isThisObjectNull(view, "view");
        super.mo37596c1(view, bundle);
        LottieAnimationView lottieAnimationView = (LottieAnimationView) view.findViewById(m14950g2());
        if (lottieAnimationView != null) {
            lottieAnimationView.setRepeatCount(-1);
        }
        m37624R1(false);
    }

    /* renamed from: g2 */
    public abstract int m14950g2();
}
