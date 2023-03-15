package p484z6;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.C2597i;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: z6.a0 */
/* loaded from: classes.dex */
public final class C13698a0 {

    /* renamed from: f */
    private static final Uri f34811f = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a */
    private final String f34812a;

    /* renamed from: b */
    private final String f34813b;

    /* renamed from: c */
    private final ComponentName f34814c;

    /* renamed from: d */
    private final int f34815d;

    /* renamed from: e */
    private final boolean f34816e;

    public C13698a0(String str, String str2, int i, boolean z) {
        C2597i.m33080f(str);
        this.f34812a = str;
        C2597i.m33080f(str2);
        this.f34813b = str2;
        this.f34814c = null;
        this.f34815d = i;
        this.f34816e = z;
    }

    /* renamed from: a */
    public final int m579a() {
        return this.f34815d;
    }

    /* renamed from: b */
    public final ComponentName m578b() {
        return this.f34814c;
    }

    /* renamed from: c */
    public final Intent m577c(Context context) {
        Bundle bundle;
        if (this.f34812a != null) {
            if (this.f34816e) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", this.f34812a);
                try {
                    bundle = context.getContentResolver().call(f34811f, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e) {
                    Log.w("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e.toString()));
                    bundle = null;
                }
                r2 = bundle != null ? (Intent) bundle.getParcelable("serviceResponseIntentKey") : null;
                if (r2 == null) {
                    String valueOf = String.valueOf(this.f34812a);
                    Log.w("ConnectionStatusConfig", valueOf.length() != 0 ? "Dynamic lookup for intent failed for action: ".concat(valueOf) : new String("Dynamic lookup for intent failed for action: "));
                }
            }
            return r2 != null ? r2 : new Intent(this.f34812a).setPackage(this.f34813b);
        }
        return new Intent().setComponent(this.f34814c);
    }

    /* renamed from: d */
    public final String m576d() {
        return this.f34813b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C13698a0) {
            C13698a0 c13698a0 = (C13698a0) obj;
            return C13701c.m575a(this.f34812a, c13698a0.f34812a) && C13701c.m575a(this.f34813b, c13698a0.f34813b) && C13701c.m575a(this.f34814c, c13698a0.f34814c) && this.f34815d == c13698a0.f34815d && this.f34816e == c13698a0.f34816e;
        }
        return false;
    }

    public final int hashCode() {
        return C13701c.m574b(this.f34812a, this.f34813b, this.f34814c, Integer.valueOf(this.f34815d), Boolean.valueOf(this.f34816e));
    }

    public final String toString() {
        String str = this.f34812a;
        if (str == null) {
            C2597i.m33076j(this.f34814c);
            return this.f34814c.flattenToString();
        }
        return str;
    }
}
