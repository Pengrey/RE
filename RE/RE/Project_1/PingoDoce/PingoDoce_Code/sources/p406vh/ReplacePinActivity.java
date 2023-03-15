package p406vh;

import android.content.Intent;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;

/* renamed from: vh.f */
/* loaded from: classes2.dex */
public final class ReplacePinActivity {
    /* renamed from: a */
    public static final void m5350a(ActivityC0325c activityC0325c, String str) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(str, "token");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.account.loggedAccount.settings.pin.ReplacePinActivity.class);
        intent.putExtra("EXTRA_FOR_TOKEN", str);
        activityC0325c.startActivity(intent);
    }
}
