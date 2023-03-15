package com.google.android.play.core.assetpacks;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.play.core.assetpacks.b */
/* loaded from: classes.dex */
public abstract class AbstractC3824b {
    /* renamed from: a */
    public static AbstractC3824b m28765a(long j, Map<String, AssetPackState> map) {
        return new C3845f0(j, map);
    }

    /* renamed from: b */
    public static AbstractC3824b m28764b(Bundle bundle, C3909v0 c3909v0) {
        return m28763c(bundle, c3909v0, new ArrayList());
    }

    /* renamed from: c */
    public static AbstractC3824b m28763c(Bundle bundle, C3909v0 c3909v0, List<String> list) {
        return m28762d(bundle, c3909v0, list, C3920y.f11215a);
    }

    /* renamed from: d */
    private static AbstractC3824b m28762d(Bundle bundle, C3909v0 c3909v0, List<String> list, InterfaceC3912w interfaceC3912w) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("pack_names");
        HashMap hashMap = new HashMap();
        int size = stringArrayList.size();
        for (int i = 0; i < size; i++) {
            String str = stringArrayList.get(i);
            hashMap.put(str, AssetPackState.m28769a(bundle, str, c3909v0, interfaceC3912w));
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str2 = list.get(i2);
            hashMap.put(str2, AssetPackState.m28768b(str2, 4, 0, 0L, 0L, 0.0d));
        }
        return m28765a(bundle.getLong("total_bytes_to_download"), hashMap);
    }

    /* renamed from: e */
    public abstract Map<String, AssetPackState> mo28748e();

    /* renamed from: f */
    public abstract long mo28747f();
}
