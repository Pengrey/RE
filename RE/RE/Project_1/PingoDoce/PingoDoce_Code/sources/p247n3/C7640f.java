package p247n3;

import android.content.res.Resources;
import android.net.Uri;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.List;
import p181jd.Intrinsics;
import p305q3.C9635k;
import sd.StringsJVM;

/* renamed from: n3.f */
/* loaded from: classes.dex */
public final class C7640f implements InterfaceC7638d {
    /* renamed from: b */
    private final boolean m17868b(Uri uri) {
        boolean z;
        boolean m8942r;
        if (Intrinsics.equals(uri.getScheme(), "android.resource")) {
            String authority = uri.getAuthority();
            if (authority != null) {
                m8942r = StringsJVM.m8942r(authority);
                if (!m8942r) {
                    z = false;
                    if (!z && uri.getPathSegments().size() == 2) {
                        return true;
                    }
                }
            }
            z = true;
            if (!z) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public Uri mo17877b(Uri uri, C9635k c9635k) {
        if (m17868b(uri)) {
            String authority = uri.getAuthority();
            if (authority == null) {
                authority = BuildConfig.VERSION_NAME;
            }
            Resources resourcesForApplication = c9635k.m10324g().getPackageManager().getResourcesForApplication(authority);
            List<String> pathSegments = uri.getPathSegments();
            int identifier = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
            if (identifier != 0) {
                Uri parse = Uri.parse("android.resource://" + authority + '/' + identifier);
                Intrinsics.checkIfNull(parse, "parse(this)");
                return parse;
            }
            throw new IllegalStateException(("Invalid android.resource URI: " + uri).toString());
        }
        return null;
    }
}
