package ck;

import android.content.Intent;
import android.os.Parcelable;
import androidx.appcompat.app.ActivityC0325c;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.remote.models.response.LoyaltyCard;

/* renamed from: ck.a */
/* loaded from: classes2.dex */
public final class CardRegistrationStatusActivity {
    /* renamed from: a */
    public static final void m34539a(ActivityC0325c activityC0325c, String str, LoyaltyCard.PoupaMaisStatus poupaMaisStatus, boolean z) {
        Intrinsics.isThisObjectNull(activityC0325c, "<this>");
        Intrinsics.isThisObjectNull(str, "maskedNumber");
        Intrinsics.isThisObjectNull(poupaMaisStatus, "status");
        Intent intent = new Intent(activityC0325c, pt.pingodoce.app.presentation.home.loyaltycard.status.CardRegistrationStatusActivity.class);
        intent.putExtra("EXTRA_FOR_PPLUS_STATUS", (Parcelable) poupaMaisStatus);
        intent.putExtra("EXTRA_FOR_MASKED_NUMBER", str);
        intent.putExtra("EXTRA_FOR_UNKNOWN_OWNER", poupaMaisStatus == LoyaltyCard.PoupaMaisStatus.UnknownOwner);
        intent.putExtra("EXTRA_FOR_IS_OWNER", poupaMaisStatus == LoyaltyCard.PoupaMaisStatus.OwnerNoRequests || poupaMaisStatus == LoyaltyCard.PoupaMaisStatus.OwnerWithRequests);
        intent.putExtra("EXTRA_FOR_WAITING", poupaMaisStatus == LoyaltyCard.PoupaMaisStatus.Pending);
        intent.putExtra("EXTRA_FOR_LAUNCH_FOR_RESUME", z);
        activityC0325c.startActivity(intent);
    }

    /* renamed from: b */
    public static /* synthetic */ void m34538b(ActivityC0325c activityC0325c, String str, LoyaltyCard.PoupaMaisStatus poupaMaisStatus, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        m34539a(activityC0325c, str, poupaMaisStatus, z);
    }
}
