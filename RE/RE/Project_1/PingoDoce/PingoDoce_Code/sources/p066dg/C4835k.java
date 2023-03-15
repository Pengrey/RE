package p066dg;

import android.content.SharedPreferences;
import java.util.HashSet;
import p181jd.C6450z;
import p398v5.SharedPrefsKtx;

/* renamed from: dg.k */
/* loaded from: classes2.dex */
public final class C4835k {
    /* renamed from: a */
    public static final /* synthetic */ HashSet m26511a(SharedPreferences sharedPreferences) {
        return m26510b(sharedPreferences);
    }

    /* renamed from: b */
    public static final HashSet<String> m26510b(SharedPreferences sharedPreferences) {
        HashSet<String> hashSet = new HashSet<>();
        for (String str : C4848u.f13267a.m26475a()) {
            if (((Boolean) SharedPrefsKtx.m6043d(sharedPreferences, str, C6450z.m20906b(Boolean.TYPE), Boolean.FALSE, null, 8, null)).booleanValue()) {
                hashSet.add(str);
            }
        }
        return hashSet;
    }
}
