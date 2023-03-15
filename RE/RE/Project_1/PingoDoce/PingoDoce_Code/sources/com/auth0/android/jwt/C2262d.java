package com.auth0.android.jwt;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.auth0.android.jwt.d */
/* loaded from: classes.dex */
public class C2262d {

    /* renamed from: a */
    final Date f6564a;

    /* renamed from: b */
    final Date f6565b;

    /* renamed from: c */
    final List<String> f6566c;

    /* renamed from: d */
    final Map<String, Object> f6567d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2262d(String str, String str2, Date date, Date date2, Date date3, String str3, List<String> list, Map<String, Object> map) {
        this.f6564a = date;
        this.f6565b = date3;
        this.f6566c = list;
        this.f6567d = Collections.unmodifiableMap(map);
    }
}
