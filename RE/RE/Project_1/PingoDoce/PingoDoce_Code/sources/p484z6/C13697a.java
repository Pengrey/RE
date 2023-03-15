package p484z6;

import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.ResolvableApiException;
import com.google.android.gms.common.api.Status;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* renamed from: z6.a */
/* loaded from: classes.dex */
public class C13697a {
    /* renamed from: a */
    public static ApiException m580a(Status status) {
        if (status.m33506y()) {
            return new ResolvableApiException(status);
        }
        return new ApiException(status);
    }
}
