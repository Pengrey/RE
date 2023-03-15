package p247n3;

import android.net.Uri;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.io.File;
import p181jd.Intrinsics;
import p305q3.C9635k;
import p396v3.C11098i;
import sd.C10171u;

/* renamed from: n3.b */
/* loaded from: classes.dex */
public final class C7636b implements InterfaceC7638d {
    /* renamed from: b */
    private final boolean m17876b(Uri uri) {
        boolean m8878v0;
        if (!C11098i.m6138r(uri)) {
            String scheme = uri.getScheme();
            if (scheme == null || Intrinsics.equals(scheme, "file")) {
                String path = uri.getPath();
                if (path == null) {
                    path = BuildConfig.VERSION_NAME;
                }
                m8878v0 = C10171u.m8878v0(path, '/', false, 2, null);
                if (m8878v0 && C11098i.m6147i(uri) != null) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public File mo17877b(Uri uri, C9635k c9635k) {
        if (m17876b(uri)) {
            if (uri.getScheme() != null) {
                uri = uri.buildUpon().scheme(null).build();
            }
            return new File(uri.toString());
        }
        return null;
    }
}
