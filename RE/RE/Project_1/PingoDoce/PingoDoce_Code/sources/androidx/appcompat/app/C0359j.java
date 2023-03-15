package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.core.content.C0939c;
import java.util.Calendar;

/* renamed from: androidx.appcompat.app.j */
/* loaded from: classes.dex */
class C0359j {

    /* renamed from: d */
    private static C0359j f925d;

    /* renamed from: a */
    private final Context f926a;

    /* renamed from: b */
    private final LocationManager f927b;

    /* renamed from: c */
    private final C0360a f928c = new C0360a();

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TwilightManager.java */
    /* renamed from: androidx.appcompat.app.j$a */
    /* loaded from: classes.dex */
    public static class C0360a {

        /* renamed from: a */
        boolean f929a;

        /* renamed from: b */
        long f930b;

        C0360a() {
        }
    }

    C0359j(Context context, LocationManager locationManager) {
        this.f926a = context;
        this.f927b = locationManager;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static C0359j m41113a(Context context) {
        if (f925d == null) {
            Context applicationContext = context.getApplicationContext();
            f925d = new C0359j(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f925d;
    }

    @SuppressLint({"MissingPermission"})
    /* renamed from: b */
    private Location m41112b() {
        Location m41111c = C0939c.m39078b(this.f926a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? m41111c("network") : null;
        Location m41111c2 = C0939c.m39078b(this.f926a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? m41111c("gps") : null;
        return (m41111c2 == null || m41111c == null) ? m41111c2 != null ? m41111c2 : m41111c : m41111c2.getTime() > m41111c.getTime() ? m41111c2 : m41111c;
    }

    /* renamed from: c */
    private Location m41111c(String str) {
        try {
            if (this.f927b.isProviderEnabled(str)) {
                return this.f927b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e) {
            Log.d("TwilightManager", "Failed to get last known location", e);
            return null;
        }
    }

    /* renamed from: e */
    private boolean m41109e() {
        return this.f928c.f930b > System.currentTimeMillis();
    }

    /* renamed from: f */
    private void m41108f(Location location) {
        long j;
        C0360a c0360a = this.f928c;
        long currentTimeMillis = System.currentTimeMillis();
        C0358i m41114b = C0358i.m41114b();
        m41114b.m41115a(currentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        m41114b.m41115a(currentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = m41114b.f924c == 1;
        long j2 = m41114b.f923b;
        long j3 = m41114b.f922a;
        m41114b.m41115a(currentTimeMillis + 86400000, location.getLatitude(), location.getLongitude());
        long j4 = m41114b.f923b;
        if (j2 == -1 || j3 == -1) {
            j = 43200000 + currentTimeMillis;
        } else {
            j = (currentTimeMillis > j3 ? j4 + 0 : currentTimeMillis > j2 ? j3 + 0 : j2 + 0) + 60000;
        }
        c0360a.f929a = z;
        c0360a.f930b = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m41110d() {
        C0360a c0360a = this.f928c;
        if (m41109e()) {
            return c0360a.f929a;
        }
        Location m41112b = m41112b();
        if (m41112b != null) {
            m41108f(m41112b);
            return c0360a.f929a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i = Calendar.getInstance().get(11);
        return i < 6 || i >= 22;
    }
}
