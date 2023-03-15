package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.os.Parcel;
import android.os.SystemClock;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.a3 */
/* loaded from: classes.dex */
public final class C3131a3 extends AbstractC3380x3 {

    /* renamed from: c */
    private final C3389y2 f8297c;

    /* renamed from: d */
    private boolean f8298d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3131a3(C3242k4 c3242k4) {
        super(c3242k4);
        Context mo31117c = this.f8410a.mo31117c();
        this.f8410a.m31094z();
        this.f8297c = new C3389y2(this, mo31117c, "google_app_measurement_local.db");
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0129  */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* renamed from: x */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final boolean m31517x(int r17, byte[] r18) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3131a3.m31517x(int, byte[]):boolean");
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3380x3
    /* renamed from: n */
    protected final boolean mo30840n() {
        return false;
    }

    /* renamed from: o */
    final SQLiteDatabase m31526o() throws SQLiteException {
        if (this.f8298d) {
            return null;
        }
        SQLiteDatabase writableDatabase = this.f8297c.getWritableDatabase();
        if (writableDatabase == null) {
            this.f8298d = true;
            return null;
        }
        return writableDatabase;
    }

    /* JADX WARN: Removed duplicated region for block: B:143:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0250  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x01fb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:191:0x01d6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0248 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0248 A[SYNTHETIC] */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m31525p(int r23) {
        /*
            Method dump skipped, instructions count: 618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3131a3.m31525p(int):java.util.List");
    }

    /* renamed from: q */
    public final void m31524q() {
        int delete;
        mo30825h();
        try {
            SQLiteDatabase m31526o = m31526o();
            if (m31526o == null || (delete = m31526o.delete("messages", null, null)) <= 0) {
                return;
            }
            this.f8410a.mo31116d().m31328v().m31397b("Reset local analytics data. records", Integer.valueOf(delete));
        } catch (SQLiteException e) {
            this.f8410a.mo31116d().m31332r().m31397b("Error resetting local analytics data. error", e);
        }
    }

    /* renamed from: r */
    public final boolean m31523r() {
        return m31517x(3, new byte[0]);
    }

    /* renamed from: s */
    final boolean m31522s() {
        Context mo31117c = this.f8410a.mo31117c();
        this.f8410a.m31094z();
        return mo31117c.getDatabasePath("google_app_measurement_local.db").exists();
    }

    /* renamed from: t */
    public final boolean m31521t() {
        int i;
        mo30825h();
        if (!this.f8298d && m31522s()) {
            int i2 = 5;
            for (i = 0; i < 5; i = i + 1) {
                SQLiteDatabase sQLiteDatabase = null;
                try {
                    SQLiteDatabase m31526o = m31526o();
                    if (m31526o == null) {
                        this.f8298d = true;
                        return false;
                    }
                    m31526o.beginTransaction();
                    m31526o.delete("messages", "type == ?", new String[]{Integer.toString(3)});
                    m31526o.setTransactionSuccessful();
                    m31526o.endTransaction();
                    m31526o.close();
                    return true;
                } catch (SQLiteDatabaseLockedException unused) {
                    SystemClock.sleep(i2);
                    i2 += 20;
                    i = 0 == 0 ? i + 1 : 0;
                    sQLiteDatabase.close();
                } catch (SQLiteFullException e) {
                    this.f8410a.mo31116d().m31332r().m31397b("Error deleting app launch break from local database", e);
                    this.f8298d = true;
                    if (0 == 0) {
                    }
                    sQLiteDatabase.close();
                } catch (SQLiteException e2) {
                    if (0 != 0) {
                        try {
                            if (sQLiteDatabase.inTransaction()) {
                                sQLiteDatabase.endTransaction();
                            }
                        } catch (Throwable th2) {
                            if (0 != 0) {
                                sQLiteDatabase.close();
                            }
                            throw th2;
                        }
                    }
                    this.f8410a.mo31116d().m31332r().m31397b("Error deleting app launch break from local database", e2);
                    this.f8298d = true;
                    if (0 != 0) {
                        sQLiteDatabase.close();
                    }
                }
            }
            this.f8410a.mo31116d().m31327w().m31398a("Error deleting app launch break from local database in reasonable time");
        }
        return false;
    }

    /* renamed from: u */
    public final boolean m31520u(zzab zzabVar) {
        byte[] m31295c0 = this.f8410a.m31124N().m31295c0(zzabVar);
        if (m31295c0.length > 131072) {
            this.f8410a.mo31116d().m31330t().m31398a("Conditional user property too long for local database. Sending directly to service");
            return false;
        }
        return m31517x(2, m31295c0);
    }

    /* renamed from: v */
    public final boolean m31519v(zzau zzauVar) {
        Parcel obtain = Parcel.obtain();
        C3325s.m31019a(zzauVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.f8410a.mo31116d().m31330t().m31398a("Event is too long for local database. Sending event directly to service");
            return false;
        }
        return m31517x(0, marshall);
    }

    /* renamed from: w */
    public final boolean m31518w(zzks zzksVar) {
        Parcel obtain = Parcel.obtain();
        C3170d9.m31399a(zzksVar, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        if (marshall.length > 131072) {
            this.f8410a.mo31116d().m31330t().m31398a("User property too long for local database. Sending directly to service");
            return false;
        }
        return m31517x(1, marshall);
    }
}
