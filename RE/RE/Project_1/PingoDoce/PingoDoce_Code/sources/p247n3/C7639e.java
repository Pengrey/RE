package p247n3;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import p181jd.Intrinsics;
import p305q3.C9635k;

/* renamed from: n3.e */
/* loaded from: classes.dex */
public final class C7639e implements InterfaceC7638d {
    /* renamed from: b */
    private final boolean m17871b(int i, Context context) {
        try {
            return context.getResources().getResourceEntryName(i) != null;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public /* bridge */ /* synthetic */ Object mo17877b(Object obj, C9635k c9635k) {
        return m17870c(((Number) obj).intValue(), c9635k);
    }

    /* renamed from: c */
    public Uri m17870c(int i, C9635k c9635k) {
        if (m17871b(i, c9635k.m10324g())) {
            Uri parse = Uri.parse("android.resource://" + c9635k.m10324g().getPackageName() + '/' + i);
            Intrinsics.checkIfNull(parse, "parse(this)");
            return parse;
        }
        return null;
    }
}
