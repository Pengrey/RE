package p450xh;

import android.app.Activity;
import android.content.Intent;
import android.view.View;
import androidx.activity.result.AbstractC0304b;
import androidx.core.app.C0890c;
import androidx.core.util.C1072d;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.remote.models.response.Banner;

/* renamed from: xh.b */
/* loaded from: classes2.dex */
public final class BannerDetailActivity {
    /* renamed from: a */
    public static final void m2021a(AbstractC0304b abstractC0304b, Activity activity, Banner banner, View view) {
        Intrinsics.isThisObjectNull(abstractC0304b, "<this>");
        Intrinsics.isThisObjectNull(activity, "context");
        Intrinsics.isThisObjectNull(banner, "banner");
        Intent intent = new Intent(activity, pt.pingodoce.app.presentation.banner.BannerDetailActivity.class);
        intent.putExtra("EXTRA_FOR_BANNER_DETAIL", banner);
        if (view == null) {
            abstractC0304b.m41324a(intent);
        } else {
            abstractC0304b.mo37539b(intent, C0890c.m39251a(activity, new C1072d(view, "TRANSITION_IMAGE")));
        }
    }
}
