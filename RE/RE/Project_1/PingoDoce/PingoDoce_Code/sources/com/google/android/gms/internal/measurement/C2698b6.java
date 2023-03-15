package com.google.android.gms.internal.measurement;

import android.net.Uri;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Map;
import javax.annotation.Nullable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.b6 */
/* loaded from: classes.dex */
public final class C2698b6 {

    /* renamed from: a */
    private final Map f7662a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2698b6(Map map) {
        this.f7662a = map;
    }

    @Nullable
    /* renamed from: a */
    public final String m32867a(@Nullable Uri uri, @Nullable String str, @Nullable String str2, String str3) {
        if (uri != null) {
            Map map = (Map) this.f7662a.get(uri.toString());
            if (map == null) {
                return null;
            }
            String valueOf = String.valueOf(str3);
            return (String) map.get(valueOf.length() != 0 ? BuildConfig.VERSION_NAME.concat(valueOf) : new String(BuildConfig.VERSION_NAME));
        }
        return null;
    }
}
