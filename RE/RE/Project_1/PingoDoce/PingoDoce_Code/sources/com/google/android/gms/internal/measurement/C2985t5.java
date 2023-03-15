package com.google.android.gms.internal.measurement;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.StrictMode;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import p301q.C9545a;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.t5 */
/* loaded from: classes.dex */
public final class C2985t5 implements InterfaceC3045x5 {

    /* renamed from: g */
    private static final Map f8003g = new C9545a();

    /* renamed from: h */
    public static final String[] f8004h = {"key", "value"};

    /* renamed from: a */
    private final ContentResolver f8005a;

    /* renamed from: b */
    private final Uri f8006b;

    /* renamed from: c */
    private final ContentObserver f8007c;

    /* renamed from: d */
    private final Object f8008d;

    /* renamed from: e */
    private volatile Map f8009e;

    /* renamed from: f */
    private final List f8010f;

    private C2985t5(ContentResolver contentResolver, Uri uri) {
        C2953r5 c2953r5 = new C2953r5(this, null);
        this.f8007c = c2953r5;
        this.f8008d = new Object();
        this.f8010f = new ArrayList();
        Objects.requireNonNull(contentResolver);
        Objects.requireNonNull(uri);
        this.f8005a = contentResolver;
        this.f8006b = uri;
        contentResolver.registerContentObserver(uri, false, c2953r5);
    }

    /* renamed from: b */
    public static C2985t5 m32070b(ContentResolver contentResolver, Uri uri) {
        C2985t5 c2985t5;
        synchronized (C2985t5.class) {
            Map map = f8003g;
            c2985t5 = (C2985t5) map.get(uri);
            if (c2985t5 == null) {
                try {
                    C2985t5 c2985t52 = new C2985t5(contentResolver, uri);
                    try {
                        map.put(uri, c2985t52);
                    } catch (SecurityException unused) {
                    }
                    c2985t5 = c2985t52;
                } catch (SecurityException unused2) {
                }
            }
        }
        return c2985t5;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static synchronized void m32067e() {
        synchronized (C2985t5.class) {
            for (C2985t5 c2985t5 : f8003g.values()) {
                c2985t5.f8005a.unregisterContentObserver(c2985t5.f8007c);
            }
            f8003g.clear();
        }
    }

    @Override // com.google.android.gms.internal.measurement.InterfaceC3045x5
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo31832a(String str) {
        return (String) m32069c().get(str);
    }

    /* renamed from: c */
    public final Map m32069c() {
        Map map;
        Map map2 = this.f8009e;
        if (map2 == null) {
            synchronized (this.f8008d) {
                map2 = this.f8009e;
                if (map2 == null) {
                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        map = (Map) C3015v5.m31960a(new InterfaceC3030w5() { // from class: com.google.android.gms.internal.measurement.q5
                            @Override // com.google.android.gms.internal.measurement.InterfaceC3030w5
                            public final Object zza() {
                                return C2985t5.this.m32068d();
                            }
                        });
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                    } catch (SQLiteException | IllegalStateException | SecurityException unused) {
                        Log.e("ConfigurationContentLoader", "PhenotypeFlag unable to load ContentProvider, using default values");
                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                        map = null;
                    }
                    this.f8009e = map;
                    map2 = map;
                }
            }
        }
        return map2 != null ? map2 : Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ Map m32068d() {
        Map hashMap;
        Cursor query = this.f8005a.query(this.f8006b, f8004h, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                return Collections.emptyMap();
            }
            if (count <= 256) {
                hashMap = new C9545a(count);
            } else {
                hashMap = new HashMap(count, 1.0f);
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            return hashMap;
        } finally {
            query.close();
        }
    }

    /* renamed from: f */
    public final void m32066f() {
        synchronized (this.f8008d) {
            this.f8009e = null;
            AbstractC2890n6.m32436d();
        }
        synchronized (this) {
            for (InterfaceC3000u5 interfaceC3000u5 : this.f8010f) {
                interfaceC3000u5.zza();
            }
        }
    }
}
