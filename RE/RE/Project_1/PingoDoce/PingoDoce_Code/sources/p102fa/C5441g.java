package p102fa;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: fa.g */
/* loaded from: classes.dex */
public class C5441g {

    /* renamed from: b */
    private static C5441g f15323b;

    /* renamed from: c */
    private static final SimpleDateFormat f15324c = new SimpleDateFormat("dd/MM/yyyy z");

    /* renamed from: a */
    private final SharedPreferences f15325a;

    private C5441g(Context context) {
        this.f15325a = context.getSharedPreferences("FirebaseAppHeartBeat", 0);
        context.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static synchronized C5441g m24358a(Context context) {
        C5441g c5441g;
        synchronized (C5441g.class) {
            if (f15323b == null) {
                f15323b = new C5441g(context);
            }
            c5441g = f15323b;
        }
        return c5441g;
    }

    /* renamed from: b */
    static boolean m24357b(long j, long j2) {
        Date date = new Date(j);
        Date date2 = new Date(j2);
        SimpleDateFormat simpleDateFormat = f15324c;
        return !simpleDateFormat.format(date).equals(simpleDateFormat.format(date2));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public synchronized boolean m24356c(long j) {
        return m24355d("fire-global", j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized boolean m24355d(String str, long j) {
        if (this.f15325a.contains(str)) {
            if (m24357b(this.f15325a.getLong(str, -1L), j)) {
                this.f15325a.edit().putLong(str, j).apply();
                return true;
            }
            return false;
        }
        this.f15325a.edit().putLong(str, j).apply();
        return true;
    }
}
