package p206kk;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.github.aachartmodel.aainfographics.C2336R;
import p181jd.Intrinsics;

/* renamed from: kk.d */
/* loaded from: classes2.dex */
public final class TermsAndConditionsActivity {
    /* renamed from: a */
    public static final void m20277a(ActivityC0325c activityC0325c, String str, String str2, boolean z) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(str, "title");
        activityC0325c.startActivity(new Intent(activityC0325c, pt.pingodoce.app.presentation.login.phone.terms.TermsAndConditionsActivity.class).putExtra("EXTRA_FOR_TITLE", str).putExtra("EXTRA_FOR_URL", str2).putExtra("EXTRA_FOR_TRANSITION", z));
    }

    /* renamed from: b */
    public static /* synthetic */ void m20276b(ActivityC0325c activityC0325c, String str, String str2, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = activityC0325c.getString(C2336R.string.lbl_consents_title);
            Intrinsics.checkIfNull(str, "getString(R.string.lbl_consents_title)");
        }
        if ((i & 2) != 0) {
            str2 = BuildConfig.VERSION_NAME;
        }
        if ((i & 4) != 0) {
            z = true;
        }
        m20277a(activityC0325c, str, str2, z);
    }
}
