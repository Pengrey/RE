package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.android.gms.common.internal.C2597i;
import com.google.android.gms.internal.measurement.C2744e4;
import com.google.android.gms.internal.measurement.C2760f4;
import com.google.android.gms.internal.measurement.C2768fc;
import com.google.android.gms.internal.measurement.C2904o4;
import com.google.android.gms.internal.measurement.C2920p4;
import com.google.crypto.tink.shaded.protobuf.Reader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement@@20.1.0 */
/* renamed from: com.google.android.gms.measurement.internal.j */
/* loaded from: classes.dex */
public final class C3226j extends AbstractC3323r8 {

    /* renamed from: f */
    private static final String[] f8541f = {"last_bundled_timestamp", "ALTER TABLE events ADD COLUMN last_bundled_timestamp INTEGER;", "last_bundled_day", "ALTER TABLE events ADD COLUMN last_bundled_day INTEGER;", "last_sampled_complex_event_id", "ALTER TABLE events ADD COLUMN last_sampled_complex_event_id INTEGER;", "last_sampling_rate", "ALTER TABLE events ADD COLUMN last_sampling_rate INTEGER;", "last_exempt_from_sampling", "ALTER TABLE events ADD COLUMN last_exempt_from_sampling INTEGER;", "current_session_count", "ALTER TABLE events ADD COLUMN current_session_count INTEGER;"};

    /* renamed from: g */
    private static final String[] f8542g = {"origin", "ALTER TABLE user_attributes ADD COLUMN origin TEXT;"};

    /* renamed from: h */
    private static final String[] f8543h = {"app_version", "ALTER TABLE apps ADD COLUMN app_version TEXT;", "app_store", "ALTER TABLE apps ADD COLUMN app_store TEXT;", "gmp_version", "ALTER TABLE apps ADD COLUMN gmp_version INTEGER;", "dev_cert_hash", "ALTER TABLE apps ADD COLUMN dev_cert_hash INTEGER;", "measurement_enabled", "ALTER TABLE apps ADD COLUMN measurement_enabled INTEGER;", "last_bundle_start_timestamp", "ALTER TABLE apps ADD COLUMN last_bundle_start_timestamp INTEGER;", "day", "ALTER TABLE apps ADD COLUMN day INTEGER;", "daily_public_events_count", "ALTER TABLE apps ADD COLUMN daily_public_events_count INTEGER;", "daily_events_count", "ALTER TABLE apps ADD COLUMN daily_events_count INTEGER;", "daily_conversions_count", "ALTER TABLE apps ADD COLUMN daily_conversions_count INTEGER;", "remote_config", "ALTER TABLE apps ADD COLUMN remote_config BLOB;", "config_fetched_time", "ALTER TABLE apps ADD COLUMN config_fetched_time INTEGER;", "failed_config_fetch_time", "ALTER TABLE apps ADD COLUMN failed_config_fetch_time INTEGER;", "app_version_int", "ALTER TABLE apps ADD COLUMN app_version_int INTEGER;", "firebase_instance_id", "ALTER TABLE apps ADD COLUMN firebase_instance_id TEXT;", "daily_error_events_count", "ALTER TABLE apps ADD COLUMN daily_error_events_count INTEGER;", "daily_realtime_events_count", "ALTER TABLE apps ADD COLUMN daily_realtime_events_count INTEGER;", "health_monitor_sample", "ALTER TABLE apps ADD COLUMN health_monitor_sample TEXT;", "android_id", "ALTER TABLE apps ADD COLUMN android_id INTEGER;", "adid_reporting_enabled", "ALTER TABLE apps ADD COLUMN adid_reporting_enabled INTEGER;", "ssaid_reporting_enabled", "ALTER TABLE apps ADD COLUMN ssaid_reporting_enabled INTEGER;", "admob_app_id", "ALTER TABLE apps ADD COLUMN admob_app_id TEXT;", "linked_admob_app_id", "ALTER TABLE apps ADD COLUMN linked_admob_app_id TEXT;", "dynamite_version", "ALTER TABLE apps ADD COLUMN dynamite_version INTEGER;", "safelisted_events", "ALTER TABLE apps ADD COLUMN safelisted_events TEXT;", "ga_app_id", "ALTER TABLE apps ADD COLUMN ga_app_id TEXT;", "config_last_modified_time", "ALTER TABLE apps ADD COLUMN config_last_modified_time TEXT;"};

    /* renamed from: i */
    private static final String[] f8544i = {"realtime", "ALTER TABLE raw_events ADD COLUMN realtime INTEGER;"};

    /* renamed from: j */
    private static final String[] f8545j = {"has_realtime", "ALTER TABLE queue ADD COLUMN has_realtime INTEGER;", "retry_count", "ALTER TABLE queue ADD COLUMN retry_count INTEGER;"};

    /* renamed from: k */
    private static final String[] f8546k = {"session_scoped", "ALTER TABLE event_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: l */
    private static final String[] f8547l = {"session_scoped", "ALTER TABLE property_filters ADD COLUMN session_scoped BOOLEAN;"};

    /* renamed from: m */
    private static final String[] f8548m = {"previous_install_count", "ALTER TABLE app2 ADD COLUMN previous_install_count INTEGER;"};

    /* renamed from: d */
    private final C3215i f8549d;

    /* renamed from: e */
    private final C3279n8 f8550e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3226j(C3137a9 c3137a9) {
        super(c3137a9);
        this.f8550e = new C3279n8(this.f8410a.mo31115e());
        this.f8410a.m31094z();
        this.f8549d = new C3215i(this, this.f8410a.mo31117c(), "google_app_measurement.db");
    }

    /* renamed from: H */
    static final void m31231H(ContentValues contentValues, String str, Object obj) {
        C2597i.m33080f("value");
        C2597i.m33076j(obj);
        if (obj instanceof String) {
            contentValues.put("value", (String) obj);
        } else if (obj instanceof Long) {
            contentValues.put("value", (Long) obj);
        } else if (obj instanceof Double) {
            contentValues.put("value", (Double) obj);
        } else {
            throw new IllegalArgumentException("Invalid value type");
        }
    }

    /* renamed from: I */
    private final long m31230I(String str, String[] strArr) {
        Cursor cursor = null;
        try {
            try {
                Cursor rawQuery = m31223P().rawQuery(str, strArr);
                if (rawQuery.moveToFirst()) {
                    long j = rawQuery.getLong(0);
                    rawQuery.close();
                    return j;
                }
                throw new SQLiteException("Database returned empty set");
            } catch (SQLiteException e) {
                this.f8410a.mo31116d().m31332r().m31396c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* renamed from: K */
    private final long m31228K(String str, String[] strArr, long j) {
        Cursor cursor = null;
        try {
            try {
                cursor = m31223P().rawQuery(str, strArr);
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return j;
                }
                long j2 = cursor.getLong(0);
                cursor.close();
                return j2;
            } catch (SQLiteException e) {
                this.f8410a.mo31116d().m31332r().m31396c("Database error", str, e);
                throw e;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x0233: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:98:0x0233 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v15 */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r4v3, types: [boolean] */
    /* renamed from: G */
    public final void m31232G(String str, long j, long j2, C3405z8 c3405z8) {
        ?? r4;
        Cursor cursor;
        Cursor rawQuery;
        String string;
        int i;
        String str2;
        String[] strArr;
        C2597i.m33076j(c3405z8);
        mo30825h();
        m31026i();
        Cursor cursor2 = null;
        r3 = null;
        r3 = null;
        String str3 = null;
        try {
            try {
                SQLiteDatabase m31223P = m31223P();
                r4 = TextUtils.isEmpty(null);
                String str4 = BuildConfig.VERSION_NAME;
                try {
                    if (r4 != 0) {
                        int i2 = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
                        String[] strArr2 = i2 != 0 ? new String[]{String.valueOf(j2), String.valueOf(j)} : new String[]{String.valueOf(j)};
                        if (i2 != 0) {
                            str4 = "rowid <= ? and ";
                        }
                        StringBuilder sb2 = new StringBuilder(str4.length() + 148);
                        sb2.append("select app_id, metadata_fingerprint from raw_events where ");
                        sb2.append(str4);
                        sb2.append("app_id in (select app_id from apps where config_fetched_time >= ?) order by rowid limit 1;");
                        rawQuery = m31223P.rawQuery(sb2.toString(), strArr2);
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        }
                        str3 = rawQuery.getString(0);
                        string = rawQuery.getString(1);
                        rawQuery.close();
                    } else {
                        int i3 = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
                        String[] strArr3 = i3 != 0 ? new String[]{null, String.valueOf(j2)} : new String[]{null};
                        if (i3 != 0) {
                            str4 = " and rowid <= ?";
                        }
                        StringBuilder sb3 = new StringBuilder(str4.length() + 84);
                        sb3.append("select metadata_fingerprint from raw_events where app_id = ?");
                        sb3.append(str4);
                        sb3.append(" order by rowid limit 1;");
                        rawQuery = m31223P.rawQuery(sb3.toString(), strArr3);
                        if (!rawQuery.moveToFirst()) {
                            rawQuery.close();
                            return;
                        } else {
                            string = rawQuery.getString(0);
                            rawQuery.close();
                        }
                    }
                    Cursor cursor3 = rawQuery;
                    String str5 = string;
                    try {
                        Cursor query = m31223P.query("raw_events_metadata", new String[]{"metadata"}, "app_id = ? and metadata_fingerprint = ?", new String[]{str3, str5}, null, null, "rowid", "2");
                        try {
                            if (!query.moveToFirst()) {
                                this.f8410a.mo31116d().m31332r().m31397b("Raw event metadata record is missing. appId", C3197g3.m31324z(str3));
                                query.close();
                                return;
                            }
                            try {
                                try {
                                    C2920p4 c2920p4 = (C2920p4) ((C2904o4) C3159c9.m31436C(C2920p4.m32299H1(), query.getBlob(0))).m32426p();
                                    if (query.moveToNext()) {
                                        this.f8410a.mo31116d().m31327w().m31397b("Get multiple raw event metadata records, expected one. appId", C3197g3.m31324z(str3));
                                    }
                                    query.close();
                                    C2597i.m33076j(c2920p4);
                                    c3405z8.f9158a = c2920p4;
                                    if (j2 != -1) {
                                        i = 1;
                                        str2 = "app_id = ? and metadata_fingerprint = ? and rowid <= ?";
                                        strArr = new String[]{str3, str5, String.valueOf(j2)};
                                    } else {
                                        i = 1;
                                        str2 = "app_id = ? and metadata_fingerprint = ?";
                                        strArr = new String[]{str3, str5};
                                    }
                                    Cursor query2 = m31223P.query("raw_events", new String[]{"rowid", "name", "timestamp", "data"}, str2, strArr, null, null, "rowid", null);
                                    if (query2.moveToFirst()) {
                                        do {
                                            long j3 = query2.getLong(0);
                                            try {
                                                C2744e4 c2744e4 = (C2744e4) C3159c9.m31436C(C2760f4.m32737E(), query2.getBlob(3));
                                                c2744e4.m32775C(query2.getString(i));
                                                c2744e4.m32771H(query2.getLong(2));
                                                if (!c3405z8.m30824a(j3, (C2760f4) c2744e4.m32426p())) {
                                                    query2.close();
                                                    return;
                                                }
                                            } catch (IOException e) {
                                                this.f8410a.mo31116d().m31332r().m31396c("Data loss. Failed to merge raw event. appId", C3197g3.m31324z(str3), e);
                                            }
                                        } while (query2.moveToNext());
                                        query2.close();
                                        return;
                                    }
                                    this.f8410a.mo31116d().m31327w().m31397b("Raw event data disappeared while in transaction. appId", C3197g3.m31324z(str3));
                                    query2.close();
                                } catch (IOException e2) {
                                    this.f8410a.mo31116d().m31332r().m31396c("Data loss. Failed to merge raw event metadata. appId", C3197g3.m31324z(str3), e2);
                                    query.close();
                                }
                            } catch (SQLiteException e3) {
                                e = e3;
                                r4 = str5;
                                this.f8410a.mo31116d().m31332r().m31396c("Data loss. Error selecting raw event. appId", C3197g3.m31324z(str3), e);
                                if (r4 != 0) {
                                    r4.close();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                cursor2 = str5;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                        } catch (SQLiteException e4) {
                            e = e4;
                            str5 = query;
                        } catch (Throwable th3) {
                            th = th3;
                            str5 = query;
                        }
                    } catch (SQLiteException e5) {
                        e = e5;
                        r4 = cursor3;
                    } catch (Throwable th4) {
                        th = th4;
                        cursor2 = cursor3;
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                }
            } catch (SQLiteException e7) {
                e = e7;
                r4 = 0;
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Throwable th6) {
            th = th6;
            cursor2 = cursor;
        }
    }

    /* renamed from: J */
    public final int m31229J(String str, String str2) {
        C2597i.m33080f(str);
        C2597i.m33080f(str2);
        mo30825h();
        m31026i();
        try {
            return m31223P().delete("conditional_properties", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f8410a.mo31116d().m31332r().m31395d("Error deleting conditional property", C3197g3.m31324z(str), this.f8410a.m31134D().m31452f(str2), e);
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: L */
    public final long m31227L(String str, String str2) {
        long j;
        SQLiteException e;
        ContentValues contentValues;
        C2597i.m33080f(str);
        C2597i.m33080f("first_open_count");
        mo30825h();
        m31026i();
        SQLiteDatabase m31223P = m31223P();
        m31223P.beginTransaction();
        try {
            try {
                StringBuilder sb2 = new StringBuilder(48);
                sb2.append("select ");
                sb2.append("first_open_count");
                sb2.append(" from app2 where app_id=?");
                j = m31228K(sb2.toString(), new String[]{str}, -1L);
                if (j == -1) {
                    ContentValues contentValues2 = new ContentValues();
                    contentValues2.put("app_id", str);
                    contentValues2.put("first_open_count", (Integer) 0);
                    contentValues2.put("previous_install_count", (Integer) 0);
                    if (m31223P.insertWithOnConflict("app2", null, contentValues2, 5) == -1) {
                        this.f8410a.mo31116d().m31332r().m31396c("Failed to insert column (got -1). appId", C3197g3.m31324z(str), "first_open_count");
                        return -1L;
                    }
                    j = 0;
                }
                try {
                    contentValues = new ContentValues();
                    contentValues.put("app_id", str);
                    contentValues.put("first_open_count", Long.valueOf(1 + j));
                } catch (SQLiteException e2) {
                    e = e2;
                    this.f8410a.mo31116d().m31332r().m31395d("Error inserting column. appId", C3197g3.m31324z(str), "first_open_count", e);
                    return j;
                }
            } finally {
                m31223P.endTransaction();
            }
        } catch (SQLiteException e3) {
            j = 0;
            e = e3;
        }
        if (m31223P.update("app2", contentValues, "app_id = ?", new String[]{str}) == 0) {
            this.f8410a.mo31116d().m31332r().m31396c("Failed to update column (got 0). appId", C3197g3.m31324z(str), "first_open_count");
            return -1L;
        }
        m31223P.setTransactionSuccessful();
        return j;
    }

    /* renamed from: M */
    public final long m31226M() {
        return m31228K("select max(bundle_end_timestamp) from queue", null, 0L);
    }

    /* renamed from: N */
    public final long m31225N() {
        return m31228K("select max(timestamp) from raw_events", null, 0L);
    }

    /* renamed from: O */
    public final long m31224O(String str) {
        C2597i.m33080f(str);
        return m31228K("select count(1) from events where app_id=? and name not like '!_%' escape '!'", new String[]{str}, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: P */
    public final SQLiteDatabase m31223P() {
        mo30825h();
        try {
            return this.f8549d.getWritableDatabase();
        } catch (SQLiteException e) {
            this.f8410a.mo31116d().m31327w().m31397b("Error opening database", e);
            throw e;
        }
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x00d6: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r1 I:??[OBJECT, ARRAY]), block:B:44:0x00d6 */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00d9  */
    /* renamed from: Q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.os.Bundle m31222Q(java.lang.String r8) {
        /*
            r7 = this;
            r7.mo30825h()
            r7.m31026i()
            r0 = 0
            android.database.sqlite.SQLiteDatabase r1 = r7.m31223P()     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            r2 = 1
            java.lang.String[] r2 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            r3 = 0
            r2[r3] = r8     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            java.lang.String r4 = "select parameters from default_event_params where app_id=?"
            android.database.Cursor r1 = r1.rawQuery(r4, r2)     // Catch: java.lang.Throwable -> Lbc android.database.sqlite.SQLiteException -> Lbe
            boolean r2 = r1.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r2 != 0) goto L30
            com.google.android.gms.measurement.internal.k4 r8 = r7.f8410a     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.g3 r8 = r8.mo31116d()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.e3 r8 = r8.m31328v()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r2 = "Default event parameters not found"
            r8.m31398a(r2)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r1.close()
            return r0
        L30:
            byte[] r2 = r1.getBlob(r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.e4 r3 = com.google.android.gms.internal.measurement.C2760f4.m32737E()     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.r9 r2 = com.google.android.gms.measurement.internal.C3159c9.m31436C(r3, r2)     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.e4 r2 = (com.google.android.gms.internal.measurement.C2744e4) r2     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.q8 r2 = r2.m32426p()     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.f4 r2 = (com.google.android.gms.internal.measurement.C2760f4) r2     // Catch: java.io.IOException -> La2 android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.a9 r8 = r7.f8820b     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r8.m31484f0()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.util.List r8 = r2.m32733I()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            android.os.Bundle r2 = new android.os.Bundle     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.<init>()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.util.Iterator r8 = r8.iterator()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
        L56:
            boolean r3 = r8.hasNext()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r3 == 0) goto L9e
            java.lang.Object r3 = r8.next()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.internal.measurement.j4 r3 = (com.google.android.gms.internal.measurement.C2824j4) r3     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r4 = r3.m32552G()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            boolean r5 = r3.m32539T()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L74
            double r5 = r3.m32558A()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putDouble(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L74:
            boolean r5 = r3.m32538U()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L82
            float r3 = r3.m32557B()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putFloat(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L82:
            boolean r5 = r3.m32535X()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L90
            java.lang.String r3 = r3.m32551H()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putString(r4, r3)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L90:
            boolean r5 = r3.m32537V()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            if (r5 == 0) goto L56
            long r5 = r3.m32555D()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r2.putLong(r4, r5)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            goto L56
        L9e:
            r1.close()
            return r2
        La2:
            r2 = move-exception
            com.google.android.gms.measurement.internal.k4 r3 = r7.f8410a     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.g3 r3 = r3.mo31116d()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.e3 r3 = r3.m31332r()     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            java.lang.String r4 = "Failed to retrieve default event parameters. appId"
            java.lang.Object r8 = com.google.android.gms.measurement.internal.C3197g3.m31324z(r8)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r3.m31396c(r4, r8, r2)     // Catch: android.database.sqlite.SQLiteException -> Lba java.lang.Throwable -> Ld5
            r1.close()
            return r0
        Lba:
            r8 = move-exception
            goto Lc0
        Lbc:
            r8 = move-exception
            goto Ld7
        Lbe:
            r8 = move-exception
            r1 = r0
        Lc0:
            com.google.android.gms.measurement.internal.k4 r2 = r7.f8410a     // Catch: java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.g3 r2 = r2.mo31116d()     // Catch: java.lang.Throwable -> Ld5
            com.google.android.gms.measurement.internal.e3 r2 = r2.m31332r()     // Catch: java.lang.Throwable -> Ld5
            java.lang.String r3 = "Error selecting default event parameters"
            r2.m31397b(r3, r8)     // Catch: java.lang.Throwable -> Ld5
            if (r1 == 0) goto Ld4
            r1.close()
        Ld4:
            return r0
        Ld5:
            r8 = move-exception
            r0 = r1
        Ld7:
            if (r0 == 0) goto Ldc
            r0.close()
        Ldc:
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3226j.m31222Q(java.lang.String):android.os.Bundle");
    }

    /* JADX WARN: Not initialized variable reg: 4, insn: 0x01ee: MOVE  (r3 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]), block:B:55:0x01ee */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x011b A[Catch: SQLiteException -> 0x01ce, all -> 0x01ed, TryCatch #2 {all -> 0x01ed, blocks: (B:4:0x005f, B:8:0x0069, B:10:0x00cc, B:15:0x00d6, B:19:0x0120, B:21:0x0157, B:25:0x0165, B:24:0x0161, B:26:0x0168, B:28:0x0170, B:32:0x0178, B:36:0x0191, B:38:0x019c, B:39:0x01ae, B:41:0x01b7, B:35:0x018d, B:18:0x011b, B:50:0x01d4), top: B:59:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0157 A[Catch: SQLiteException -> 0x01ce, all -> 0x01ed, TryCatch #2 {all -> 0x01ed, blocks: (B:4:0x005f, B:8:0x0069, B:10:0x00cc, B:15:0x00d6, B:19:0x0120, B:21:0x0157, B:25:0x0165, B:24:0x0161, B:26:0x0168, B:28:0x0170, B:32:0x0178, B:36:0x0191, B:38:0x019c, B:39:0x01ae, B:41:0x01b7, B:35:0x018d, B:18:0x011b, B:50:0x01d4), top: B:59:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x018d A[Catch: SQLiteException -> 0x01ce, all -> 0x01ed, TryCatch #2 {all -> 0x01ed, blocks: (B:4:0x005f, B:8:0x0069, B:10:0x00cc, B:15:0x00d6, B:19:0x0120, B:21:0x0157, B:25:0x0165, B:24:0x0161, B:26:0x0168, B:28:0x0170, B:32:0x0178, B:36:0x0191, B:38:0x019c, B:39:0x01ae, B:41:0x01b7, B:35:0x018d, B:18:0x011b, B:50:0x01d4), top: B:59:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x019c A[Catch: SQLiteException -> 0x01ce, all -> 0x01ed, TryCatch #2 {all -> 0x01ed, blocks: (B:4:0x005f, B:8:0x0069, B:10:0x00cc, B:15:0x00d6, B:19:0x0120, B:21:0x0157, B:25:0x0165, B:24:0x0161, B:26:0x0168, B:28:0x0170, B:32:0x0178, B:36:0x0191, B:38:0x019c, B:39:0x01ae, B:41:0x01b7, B:35:0x018d, B:18:0x011b, B:50:0x01d4), top: B:59:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01b7 A[Catch: SQLiteException -> 0x01ce, all -> 0x01ed, TRY_LEAVE, TryCatch #2 {all -> 0x01ed, blocks: (B:4:0x005f, B:8:0x0069, B:10:0x00cc, B:15:0x00d6, B:19:0x0120, B:21:0x0157, B:25:0x0165, B:24:0x0161, B:26:0x0168, B:28:0x0170, B:32:0x0178, B:36:0x0191, B:38:0x019c, B:39:0x01ae, B:41:0x01b7, B:35:0x018d, B:18:0x011b, B:50:0x01d4), top: B:59:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01f1  */
    /* renamed from: R */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C3341t4 m31221R(java.lang.String r34) {
        /*
            Method dump skipped, instructions count: 501
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3226j.m31221R(java.lang.String):com.google.android.gms.measurement.internal.t4");
    }

    /* JADX WARN: Not initialized variable reg: 10, insn: 0x0123: MOVE  (r9 I:??[OBJECT, ARRAY]) = (r10 I:??[OBJECT, ARRAY]), block:B:31:0x0123 */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0126  */
    /* renamed from: S */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.zzab m31220S(java.lang.String r31, java.lang.String r32) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3226j.m31220S(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.zzab");
    }

    /* renamed from: T */
    public final C3204h m31219T(long j, String str, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        return m31218U(j, str, 1L, false, false, z3, false, z5);
    }

    /* renamed from: U */
    public final C3204h m31218U(long j, String str, long j2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        C2597i.m33080f(str);
        mo30825h();
        m31026i();
        String[] strArr = {str};
        C3204h c3204h = new C3204h();
        Cursor cursor = null;
        try {
            try {
                SQLiteDatabase m31223P = m31223P();
                Cursor query = m31223P.query("apps", new String[]{"day", "daily_events_count", "daily_public_events_count", "daily_conversions_count", "daily_error_events_count", "daily_realtime_events_count"}, "app_id=?", new String[]{str}, null, null, null);
                if (!query.moveToFirst()) {
                    this.f8410a.mo31116d().m31327w().m31397b("Not updating daily counts, app is not known. appId", C3197g3.m31324z(str));
                    query.close();
                    return c3204h;
                }
                if (query.getLong(0) == j) {
                    c3204h.f8483b = query.getLong(1);
                    c3204h.f8482a = query.getLong(2);
                    c3204h.f8484c = query.getLong(3);
                    c3204h.f8485d = query.getLong(4);
                    c3204h.f8486e = query.getLong(5);
                }
                if (z) {
                    c3204h.f8483b += j2;
                }
                if (z2) {
                    c3204h.f8482a += j2;
                }
                if (z3) {
                    c3204h.f8484c += j2;
                }
                if (z4) {
                    c3204h.f8485d += j2;
                }
                if (z5) {
                    c3204h.f8486e += j2;
                }
                ContentValues contentValues = new ContentValues();
                contentValues.put("day", Long.valueOf(j));
                contentValues.put("daily_public_events_count", Long.valueOf(c3204h.f8482a));
                contentValues.put("daily_events_count", Long.valueOf(c3204h.f8483b));
                contentValues.put("daily_conversions_count", Long.valueOf(c3204h.f8484c));
                contentValues.put("daily_error_events_count", Long.valueOf(c3204h.f8485d));
                contentValues.put("daily_realtime_events_count", Long.valueOf(c3204h.f8486e));
                m31223P.update("apps", contentValues, "app_id=?", strArr);
                query.close();
                return c3204h;
            } catch (SQLiteException e) {
                this.f8410a.mo31116d().m31332r().m31396c("Error updating daily counts. appId", C3197g3.m31324z(str), e);
                if (0 != 0) {
                    cursor.close();
                }
                return c3204h;
            }
        } catch (Throwable th2) {
            if (0 != 0) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0150  */
    /* renamed from: V */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C3292p m31217V(java.lang.String r28, java.lang.String r29) {
        /*
            Method dump skipped, instructions count: 340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3226j.m31217V(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.p");
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00a3: MOVE  (r10 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:28:0x00a3 */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a6  */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.google.android.gms.measurement.internal.C3181e9 m31215X(java.lang.String r20, java.lang.String r21) {
        /*
            r19 = this;
            r1 = r19
            r9 = r21
            com.google.android.gms.common.internal.C2597i.m33080f(r20)
            com.google.android.gms.common.internal.C2597i.m33080f(r21)
            r19.mo30825h()
            r19.m31026i()
            r10 = 0
            android.database.sqlite.SQLiteDatabase r11 = r19.m31223P()     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r0 = "set_timestamp"
            java.lang.String r2 = "value"
            java.lang.String r3 = "origin"
            java.lang.String[] r13 = new java.lang.String[]{r0, r2, r3}     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r0 = 2
            java.lang.String[] r15 = new java.lang.String[r0]     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r2 = 0
            r15[r2] = r20     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            r3 = 1
            r15[r3] = r9     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            java.lang.String r12 = "user_attributes"
            java.lang.String r14 = "app_id=? and name=?"
            r16 = 0
            r17 = 0
            r18 = 0
            android.database.Cursor r11 = r11.query(r12, r13, r14, r15, r16, r17, r18)     // Catch: java.lang.Throwable -> L7b android.database.sqlite.SQLiteException -> L7d
            boolean r4 = r11.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r4 != 0) goto L40
            r11.close()
            return r10
        L40:
            long r6 = r11.getLong(r2)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            java.lang.Object r8 = r1.m31214Y(r11, r3)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r8 != 0) goto L4e
            r11.close()
            return r10
        L4e:
            java.lang.String r4 = r11.getString(r0)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.e9 r0 = new com.google.android.gms.measurement.internal.e9     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            r2 = r0
            r3 = r20
            r5 = r21
            r2.<init>(r3, r4, r5, r6, r8)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            boolean r2 = r11.moveToNext()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            if (r2 == 0) goto L75
            com.google.android.gms.measurement.internal.k4 r2 = r1.f8410a     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.g3 r2 = r2.mo31116d()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.e3 r2 = r2.m31332r()     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            java.lang.String r3 = "Got multiple records for user property, expected one. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C3197g3.m31324z(r20)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
            r2.m31397b(r3, r4)     // Catch: android.database.sqlite.SQLiteException -> L79 java.lang.Throwable -> La2
        L75:
            r11.close()
            return r0
        L79:
            r0 = move-exception
            goto L7f
        L7b:
            r0 = move-exception
            goto La4
        L7d:
            r0 = move-exception
            r11 = r10
        L7f:
            com.google.android.gms.measurement.internal.k4 r2 = r1.f8410a     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.g3 r2 = r2.mo31116d()     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.e3 r2 = r2.m31332r()     // Catch: java.lang.Throwable -> La2
            java.lang.String r3 = "Error querying user property. appId"
            java.lang.Object r4 = com.google.android.gms.measurement.internal.C3197g3.m31324z(r20)     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.k4 r5 = r1.f8410a     // Catch: java.lang.Throwable -> La2
            com.google.android.gms.measurement.internal.b3 r5 = r5.m31134D()     // Catch: java.lang.Throwable -> La2
            java.lang.String r5 = r5.m31452f(r9)     // Catch: java.lang.Throwable -> La2
            r2.m31395d(r3, r4, r5, r0)     // Catch: java.lang.Throwable -> La2
            if (r11 == 0) goto La1
            r11.close()
        La1:
            return r10
        La2:
            r0 = move-exception
            r10 = r11
        La4:
            if (r10 == 0) goto La9
            r10.close()
        La9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3226j.m31215X(java.lang.String, java.lang.String):com.google.android.gms.measurement.internal.e9");
    }

    /* renamed from: Y */
    final Object m31214Y(Cursor cursor, int i) {
        int type = cursor.getType(i);
        if (type == 0) {
            this.f8410a.mo31116d().m31332r().m31398a("Loaded invalid null value from database");
            return null;
        } else if (type != 1) {
            if (type != 2) {
                if (type != 3) {
                    if (type != 4) {
                        this.f8410a.mo31116d().m31332r().m31397b("Loaded invalid unknown value type, ignoring it", Integer.valueOf(type));
                        return null;
                    }
                    this.f8410a.mo31116d().m31332r().m31398a("Loaded invalid blob type value, ignoring it");
                    return null;
                }
                return cursor.getString(i);
            }
            return Double.valueOf(cursor.getDouble(i));
        } else {
            return Long.valueOf(cursor.getLong(i));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* renamed from: Z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String m31213Z() {
        /*
            r6 = this;
            android.database.sqlite.SQLiteDatabase r0 = r6.m31223P()
            r1 = 0
            java.lang.String r2 = "select app_id from queue order by has_realtime desc, rowid asc limit 1;"
            android.database.Cursor r0 = r0.rawQuery(r2, r1)     // Catch: java.lang.Throwable -> L20 android.database.sqlite.SQLiteException -> L22
            boolean r2 = r0.moveToFirst()     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            if (r2 == 0) goto L1a
            r2 = 0
            java.lang.String r1 = r0.getString(r2)     // Catch: android.database.sqlite.SQLiteException -> L1e java.lang.Throwable -> L3a
            r0.close()
            return r1
        L1a:
            r0.close()
            return r1
        L1e:
            r2 = move-exception
            goto L25
        L20:
            r0 = move-exception
            goto L3e
        L22:
            r0 = move-exception
            r2 = r0
            r0 = r1
        L25:
            com.google.android.gms.measurement.internal.k4 r3 = r6.f8410a     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.g3 r3 = r3.mo31116d()     // Catch: java.lang.Throwable -> L3a
            com.google.android.gms.measurement.internal.e3 r3 = r3.m31332r()     // Catch: java.lang.Throwable -> L3a
            java.lang.String r4 = "Database error getting next bundle app id"
            r3.m31397b(r4, r2)     // Catch: java.lang.Throwable -> L3a
            if (r0 == 0) goto L39
            r0.close()
        L39:
            return r1
        L3a:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L3e:
            if (r1 == 0) goto L43
            r1.close()
        L43:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3226j.m31213Z():java.lang.String");
    }

    /* renamed from: a0 */
    public final List m31212a0(String str, String str2, String str3) {
        C2597i.m33080f(str);
        mo30825h();
        m31026i();
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(str);
        StringBuilder sb2 = new StringBuilder("app_id=?");
        if (!TextUtils.isEmpty(str2)) {
            arrayList.add(str2);
            sb2.append(" and origin=?");
        }
        if (!TextUtils.isEmpty(str3)) {
            arrayList.add(String.valueOf(str3).concat("*"));
            sb2.append(" and name glob ?");
        }
        return m31211b0(sb2.toString(), (String[]) arrayList.toArray(new String[arrayList.size()]));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0058, code lost:
        r2 = r27.f8410a.mo31116d().m31332r();
        r27.f8410a.m31094z();
        r2.m31397b("Read more than the max allowed conditional properties, ignoring extra", java.lang.Integer.valueOf((int) org.joda.time.DateTimeConstants.MILLIS_PER_SECOND));
     */
    /* renamed from: b0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m31211b0(java.lang.String r28, java.lang.String[] r29) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3226j.m31211b0(java.lang.String, java.lang.String[]):java.util.List");
    }

    /* renamed from: c0 */
    public final List m31210c0(String str) {
        C2597i.m33080f(str);
        mo30825h();
        m31026i();
        ArrayList arrayList = new ArrayList();
        Cursor cursor = null;
        try {
            try {
                this.f8410a.m31094z();
                cursor = m31223P().query("user_attributes", new String[]{"name", "origin", "set_timestamp", "value"}, "app_id=?", new String[]{str}, null, null, "rowid", "1000");
                if (!cursor.moveToFirst()) {
                    cursor.close();
                    return arrayList;
                }
                do {
                    String string = cursor.getString(0);
                    String string2 = cursor.getString(1);
                    if (string2 == null) {
                        string2 = BuildConfig.VERSION_NAME;
                    }
                    String str2 = string2;
                    long j = cursor.getLong(2);
                    Object m31214Y = m31214Y(cursor, 3);
                    if (m31214Y == null) {
                        this.f8410a.mo31116d().m31332r().m31397b("Read invalid user property value, ignoring it. appId", C3197g3.m31324z(str));
                    } else {
                        arrayList.add(new C3181e9(str, str2, string, j, m31214Y));
                    }
                } while (cursor.moveToNext());
                cursor.close();
                return arrayList;
            } catch (SQLiteException e) {
                this.f8410a.mo31116d().m31332r().m31396c("Error querying user properties. appId", C3197g3.m31324z(str), e);
                List emptyList = Collections.emptyList();
                if (cursor != null) {
                    cursor.close();
                }
                return emptyList;
            }
        } catch (Throwable th2) {
            if (cursor != null) {
                cursor.close();
            }
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x009c, code lost:
        r2 = r16.f8410a.mo31116d().m31332r();
        r16.f8410a.m31094z();
        r2.m31397b("Read more than the max allowed user properties, ignoring excess", java.lang.Integer.valueOf((int) org.joda.time.DateTimeConstants.MILLIS_PER_SECOND));
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x011d A[DONT_GENERATE] */
    /* renamed from: d0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.List m31209d0(java.lang.String r17, java.lang.String r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 295
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3226j.m31209d0(java.lang.String, java.lang.String, java.lang.String):java.util.List");
    }

    /* renamed from: e0 */
    public final void m31208e0() {
        m31026i();
        m31223P().beginTransaction();
    }

    /* renamed from: f0 */
    public final void m31207f0() {
        m31026i();
        m31223P().endTransaction();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public final void m31206g0(List list) {
        mo30825h();
        m31026i();
        C2597i.m33076j(list);
        C2597i.m33074l(list.size());
        if (m31196u()) {
            String join = TextUtils.join(",", list);
            StringBuilder sb2 = new StringBuilder(String.valueOf(join).length() + 2);
            sb2.append("(");
            sb2.append(join);
            sb2.append(")");
            String sb3 = sb2.toString();
            StringBuilder sb4 = new StringBuilder(sb3.length() + 80);
            sb4.append("SELECT COUNT(1) FROM queue WHERE rowid IN ");
            sb4.append(sb3);
            sb4.append(" AND retry_count =  2147483647 LIMIT 1");
            if (m31230I(sb4.toString(), null) > 0) {
                this.f8410a.mo31116d().m31327w().m31398a("The number of upload retries exceeds the limit. Will remain unchanged.");
            }
            try {
                SQLiteDatabase m31223P = m31223P();
                StringBuilder sb5 = new StringBuilder(sb3.length() + 127);
                sb5.append("UPDATE queue SET retry_count = IFNULL(retry_count, 0) + 1 WHERE rowid IN ");
                sb5.append(sb3);
                sb5.append(" AND (retry_count IS NULL OR retry_count < ");
                sb5.append(Reader.READ_DONE);
                sb5.append(")");
                m31223P.execSQL(sb5.toString());
            } catch (SQLiteException e) {
                this.f8410a.mo31116d().m31332r().m31397b("Error incrementing retry count. error", e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h0 */
    public final void m31205h0() {
        mo30825h();
        m31026i();
        if (m31196u()) {
            long m31039a = this.f8820b.m31486d0().f9134h.m31039a();
            long mo25912c = this.f8410a.mo31115e().mo25912c();
            long abs = Math.abs(mo25912c - m31039a);
            this.f8410a.m31094z();
            if (abs > ((Long) C3339t2.f8957z.m31018a(null)).longValue()) {
                this.f8820b.m31486d0().f9134h.m31038b(mo25912c);
                mo30825h();
                m31026i();
                if (m31196u()) {
                    SQLiteDatabase m31223P = m31223P();
                    this.f8410a.m31094z();
                    int delete = m31223P.delete("queue", "abs(bundle_end_timestamp - ?) > cast(? as integer)", new String[]{String.valueOf(this.f8410a.mo31115e().mo25914a()), String.valueOf(C3182f.m31365i())});
                    if (delete > 0) {
                        this.f8410a.mo31116d().m31328v().m31397b("Deleted stale rows. rowsDeleted", Integer.valueOf(delete));
                    }
                }
            }
        }
    }

    @Override // com.google.android.gms.measurement.internal.AbstractC3323r8
    /* renamed from: l */
    protected final boolean mo30839l() {
        return false;
    }

    /* renamed from: m */
    public final void m31204m(String str, String str2) {
        C2597i.m33080f(str);
        C2597i.m33080f(str2);
        mo30825h();
        m31026i();
        try {
            m31223P().delete("user_attributes", "app_id=? and name=?", new String[]{str, str2});
        } catch (SQLiteException e) {
            this.f8410a.mo31116d().m31332r().m31395d("Error deleting user property. appId", C3197g3.m31324z(str), this.f8410a.m31134D().m31452f(str2), e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x0343, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0344, code lost:
        r11.put("session_scoped", r0);
        r11.put("data", r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0358, code lost:
        if (m31223P().insertWithOnConflict("property_filters", null, r11, 5) != (-1)) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x035a, code lost:
        r23.f8410a.mo31116d().m31332r().m31397b("Failed to insert property filter (got -1). appId", com.google.android.gms.measurement.internal.C3197g3.m31324z(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x036e, code lost:
        r0 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0372, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0373, code lost:
        r23.f8410a.mo31116d().m31332r().m31396c("Error storing property filter. appId", com.google.android.gms.measurement.internal.C3197g3.m31324z(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0386, code lost:
        m31026i();
        mo30825h();
        com.google.android.gms.common.internal.C2597i.m33080f(r24);
        r0 = m31223P();
        r3 = r17;
        r0.delete("property_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r0.delete("event_filters", r3, new java.lang.String[]{r24, java.lang.String.valueOf(r10)});
        r17 = r3;
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x03bd, code lost:
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x018b, code lost:
        r11 = r0.m31846H().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0197, code lost:
        if (r11.hasNext() == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x01a3, code lost:
        if (((com.google.android.gms.internal.measurement.C2807i3) r11.next()).m32581J() != false) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x01a5, code lost:
        r23.f8410a.mo31116d().m31327w().m31396c("Property filter with no ID. Audience definition ignored. appId, audienceId", com.google.android.gms.measurement.internal.C3197g3.m31324z(r24), java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x01be, code lost:
        r11 = r0.m31847G().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01d4, code lost:
        if (r11.hasNext() == false) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01d6, code lost:
        r12 = (com.google.android.gms.internal.measurement.C3072z2) r11.next();
        m31026i();
        mo30825h();
        com.google.android.gms.common.internal.C2597i.m33080f(r24);
        com.google.android.gms.common.internal.C2597i.m33076j(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x01f0, code lost:
        if (android.text.TextUtils.isEmpty(r12.m31722G()) == false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x01f2, code lost:
        r0 = r23.f8410a.mo31116d().m31327w();
        r8 = com.google.android.gms.measurement.internal.C3197g3.m31324z(r24);
        r11 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x020a, code lost:
        if (r12.m31714O() == false) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x020c, code lost:
        r20 = java.lang.Integer.valueOf(r12.m31727B());
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0217, code lost:
        r20 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0219, code lost:
        r0.m31395d("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r8, r11, java.lang.String.valueOf(r20));
        r21 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0224, code lost:
        r3 = r12.m32865k();
        r21 = r4;
        r4 = new android.content.ContentValues();
        r4.put("app_id", r24);
        r4.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x023d, code lost:
        if (r12.m31714O() == false) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x023f, code lost:
        r8 = java.lang.Integer.valueOf(r12.m31727B());
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0248, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0249, code lost:
        r4.put("filter_id", r8);
        r4.put("event_name", r12.m31722G());
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0259, code lost:
        if (r12.m31713P() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x025b, code lost:
        r8 = java.lang.Boolean.valueOf(r12.m31716M());
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0264, code lost:
        r8 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0265, code lost:
        r4.put("session_scoped", r8);
        r4.put("data", r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0279, code lost:
        if (m31223P().insertWithOnConflict("event_filters", null, r4, 5) != (-1)) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x027b, code lost:
        r23.f8410a.mo31116d().m31332r().m31397b("Failed to insert event filter (got -1). appId", com.google.android.gms.measurement.internal.C3197g3.m31324z(r24));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x028e, code lost:
        r4 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0294, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x0295, code lost:
        r23.f8410a.mo31116d().m31332r().m31396c("Error storing event filter. appId", com.google.android.gms.measurement.internal.C3197g3.m31324z(r24), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x02aa, code lost:
        r21 = r4;
        r0 = r0.m31846H().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x02b8, code lost:
        if (r0.hasNext() == false) goto L141;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x02ba, code lost:
        r3 = (com.google.android.gms.internal.measurement.C2807i3) r0.next();
        m31026i();
        mo30825h();
        com.google.android.gms.common.internal.C2597i.m33080f(r24);
        com.google.android.gms.common.internal.C2597i.m33076j(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x02d4, code lost:
        if (android.text.TextUtils.isEmpty(r3.m32586E()) == false) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x02d6, code lost:
        r0 = r23.f8410a.mo31116d().m31327w();
        r7 = com.google.android.gms.measurement.internal.C3197g3.m31324z(r24);
        r8 = java.lang.Integer.valueOf(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x02ee, code lost:
        if (r3.m32581J() == false) goto L140;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x02f0, code lost:
        r3 = java.lang.Integer.valueOf(r3.m32590A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x02f9, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x02fa, code lost:
        r0.m31395d("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r7, r8, java.lang.String.valueOf(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0303, code lost:
        r4 = r3.m32865k();
        r11 = new android.content.ContentValues();
        r11.put("app_id", r24);
        r11.put("audience_id", java.lang.Integer.valueOf(r10));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x031a, code lost:
        if (r3.m32581J() == false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x031c, code lost:
        r12 = java.lang.Integer.valueOf(r3.m32590A());
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0325, code lost:
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0326, code lost:
        r11.put("filter_id", r12);
        r22 = r0;
        r11.put("property_name", r3.m32586E());
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0338, code lost:
        if (r3.m32580K() == false) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x033a, code lost:
        r0 = java.lang.Boolean.valueOf(r3.m32582I());
     */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m31203n(java.lang.String r24, java.util.List r25) {
        /*
            Method dump skipped, instructions count: 1217
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.C3226j.m31203n(java.lang.String, java.util.List):void");
    }

    /* renamed from: o */
    public final void m31202o() {
        m31026i();
        m31223P().setTransactionSuccessful();
    }

    /* renamed from: p */
    public final void m31201p(C3341t4 c3341t4) {
        C2597i.m33076j(c3341t4);
        mo30825h();
        m31026i();
        String m30966c0 = c3341t4.m30966c0();
        C2597i.m33076j(m30966c0);
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", m30966c0);
        contentValues.put("app_instance_id", c3341t4.m30964d0());
        contentValues.put("gmp_app_id", c3341t4.m30956h0());
        contentValues.put("resettable_device_id_hash", c3341t4.m30971a());
        contentValues.put("last_bundle_index", Long.valueOf(c3341t4.m30974X()));
        contentValues.put("last_bundle_start_timestamp", Long.valueOf(c3341t4.m30973Y()));
        contentValues.put("last_bundle_end_timestamp", Long.valueOf(c3341t4.m30975W()));
        contentValues.put("app_version", c3341t4.m30960f0());
        contentValues.put("app_store", c3341t4.m30962e0());
        contentValues.put("gmp_version", Long.valueOf(c3341t4.m30976V()));
        contentValues.put("dev_cert_hash", Long.valueOf(c3341t4.m30979S()));
        contentValues.put("measurement_enabled", Boolean.valueOf(c3341t4.m30989I()));
        contentValues.put("day", Long.valueOf(c3341t4.m30980R()));
        contentValues.put("daily_public_events_count", Long.valueOf(c3341t4.m30982P()));
        contentValues.put("daily_events_count", Long.valueOf(c3341t4.m30983O()));
        contentValues.put("daily_conversions_count", Long.valueOf(c3341t4.m30985M()));
        contentValues.put("config_fetched_time", Long.valueOf(c3341t4.m30986L()));
        contentValues.put("failed_config_fetch_time", Long.valueOf(c3341t4.m30977U()));
        contentValues.put("app_version_int", Long.valueOf(c3341t4.m30987K()));
        contentValues.put("firebase_instance_id", c3341t4.m30958g0());
        contentValues.put("daily_error_events_count", Long.valueOf(c3341t4.m30984N()));
        contentValues.put("daily_realtime_events_count", Long.valueOf(c3341t4.m30981Q()));
        contentValues.put("health_monitor_sample", c3341t4.m30954i0());
        contentValues.put("android_id", Long.valueOf(c3341t4.m30997A()));
        contentValues.put("adid_reporting_enabled", Boolean.valueOf(c3341t4.m30990H()));
        contentValues.put("admob_app_id", c3341t4.m30970a0());
        contentValues.put("dynamite_version", Long.valueOf(c3341t4.m30978T()));
        List m30969b = c3341t4.m30969b();
        if (m30969b != null) {
            if (m30969b.isEmpty()) {
                this.f8410a.mo31116d().m31327w().m31397b("Safelisted events should not be an empty list. appId", m30966c0);
            } else {
                contentValues.put("safelisted_events", TextUtils.join(",", m30969b));
            }
        }
        C2768fc.m32644b();
        if (this.f8410a.m31094z().m31373B(null, C3339t2.f8952v0) && !contentValues.containsKey("safelisted_events")) {
            contentValues.put("safelisted_events", (String) null);
        }
        try {
            SQLiteDatabase m31223P = m31223P();
            if (m31223P.update("apps", contentValues, "app_id = ?", new String[]{m30966c0}) == 0 && m31223P.insertWithOnConflict("apps", null, contentValues, 5) == -1) {
                this.f8410a.mo31116d().m31332r().m31397b("Failed to insert/update app (got -1). appId", C3197g3.m31324z(m30966c0));
            }
        } catch (SQLiteException e) {
            this.f8410a.mo31116d().m31332r().m31396c("Error storing app. appId", C3197g3.m31324z(m30966c0), e);
        }
    }

    /* renamed from: q */
    public final void m31200q(C3292p c3292p) {
        C2597i.m33076j(c3292p);
        mo30825h();
        m31026i();
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c3292p.f8750a);
        contentValues.put("name", c3292p.f8751b);
        contentValues.put("lifetime_count", Long.valueOf(c3292p.f8752c));
        contentValues.put("current_bundle_count", Long.valueOf(c3292p.f8753d));
        contentValues.put("last_fire_timestamp", Long.valueOf(c3292p.f8755f));
        contentValues.put("last_bundled_timestamp", Long.valueOf(c3292p.f8756g));
        contentValues.put("last_bundled_day", c3292p.f8757h);
        contentValues.put("last_sampled_complex_event_id", c3292p.f8758i);
        contentValues.put("last_sampling_rate", c3292p.f8759j);
        contentValues.put("current_session_count", Long.valueOf(c3292p.f8754e));
        Boolean bool = c3292p.f8760k;
        contentValues.put("last_exempt_from_sampling", (bool == null || !bool.booleanValue()) ? null : 1L);
        try {
            if (m31223P().insertWithOnConflict("events", null, contentValues, 5) == -1) {
                this.f8410a.mo31116d().m31332r().m31397b("Failed to insert/update event aggregates (got -1). appId", C3197g3.m31324z(c3292p.f8750a));
            }
        } catch (SQLiteException e) {
            this.f8410a.mo31116d().m31332r().m31396c("Error storing event aggregates. appId", C3197g3.m31324z(c3292p.f8750a), e);
        }
    }

    /* renamed from: r */
    public final boolean m31199r() {
        return m31230I("select count(1) > 0 from raw_events", null) != 0;
    }

    /* renamed from: s */
    public final boolean m31198s() {
        return m31230I("select count(1) > 0 from queue where has_realtime = 1", null) != 0;
    }

    /* renamed from: t */
    public final boolean m31197t() {
        return m31230I("select count(1) > 0 from raw_events where realtime = 1", null) != 0;
    }

    /* renamed from: u */
    protected final boolean m31196u() {
        Context mo31117c = this.f8410a.mo31117c();
        this.f8410a.m31094z();
        return mo31117c.getDatabasePath("google_app_measurement.db").exists();
    }

    /* renamed from: v */
    public final boolean m31195v(String str, Long l, long j, C2760f4 c2760f4) {
        mo30825h();
        m31026i();
        C2597i.m33076j(c2760f4);
        C2597i.m33080f(str);
        C2597i.m33076j(l);
        byte[] m32865k = c2760f4.m32865k();
        this.f8410a.mo31116d().m31328v().m31396c("Saving complex main event, appId, data size", this.f8410a.m31134D().m31454d(str), Integer.valueOf(m32865k.length));
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("event_id", l);
        contentValues.put("children_to_process", Long.valueOf(j));
        contentValues.put("main_event", m32865k);
        try {
            if (m31223P().insertWithOnConflict("main_event_params", null, contentValues, 5) == -1) {
                this.f8410a.mo31116d().m31332r().m31397b("Failed to insert complex main event (got -1). appId", C3197g3.m31324z(str));
                return false;
            }
            return true;
        } catch (SQLiteException e) {
            this.f8410a.mo31116d().m31332r().m31396c("Error storing complex main event. appId", C3197g3.m31324z(str), e);
            return false;
        }
    }

    /* renamed from: w */
    public final boolean m31194w(zzab zzabVar) {
        C2597i.m33076j(zzabVar);
        mo30825h();
        m31026i();
        String str = zzabVar.f9170w;
        C2597i.m33076j(str);
        if (m31215X(str, zzabVar.f9172y.f9183x) == null) {
            long m31230I = m31230I("SELECT COUNT(1) FROM conditional_properties WHERE app_id=?", new String[]{str});
            this.f8410a.m31094z();
            if (m31230I >= 1000) {
                return false;
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", str);
        contentValues.put("origin", zzabVar.f9171x);
        contentValues.put("name", zzabVar.f9172y.f9183x);
        m31231H(contentValues, "value", C2597i.m33076j(zzabVar.f9172y.m30815h()));
        contentValues.put("active", Boolean.valueOf(zzabVar.f9163A));
        contentValues.put("trigger_event_name", zzabVar.f9164B);
        contentValues.put("trigger_timeout", Long.valueOf(zzabVar.f9166D));
        contentValues.put("timed_out_event", this.f8410a.m31124N().m31295c0(zzabVar.f9165C));
        contentValues.put("creation_timestamp", Long.valueOf(zzabVar.f9173z));
        contentValues.put("triggered_event", this.f8410a.m31124N().m31295c0(zzabVar.f9167E));
        contentValues.put("triggered_timestamp", Long.valueOf(zzabVar.f9172y.f9184y));
        contentValues.put("time_to_live", Long.valueOf(zzabVar.f9168F));
        contentValues.put("expired_event", this.f8410a.m31124N().m31295c0(zzabVar.f9169G));
        try {
            if (m31223P().insertWithOnConflict("conditional_properties", null, contentValues, 5) == -1) {
                this.f8410a.mo31116d().m31332r().m31397b("Failed to insert/update conditional user property (got -1)", C3197g3.m31324z(str));
            }
        } catch (SQLiteException e) {
            this.f8410a.mo31116d().m31332r().m31396c("Error storing conditional user property", C3197g3.m31324z(str), e);
        }
        return true;
    }

    /* renamed from: x */
    public final boolean m31193x(C3181e9 c3181e9) {
        C2597i.m33076j(c3181e9);
        mo30825h();
        m31026i();
        if (m31215X(c3181e9.f8422a, c3181e9.f8424c) == null) {
            if (C3203g9.m31301W(c3181e9.f8424c)) {
                if (m31230I("select count(1) from user_attributes where app_id=? and name not like '!_%' escape '!'", new String[]{c3181e9.f8422a}) >= this.f8410a.m31094z().m31358p(c3181e9.f8422a, C3339t2.f8890H, 25, 100)) {
                    return false;
                }
            } else if (!"_npa".equals(c3181e9.f8424c)) {
                long m31230I = m31230I("select count(1) from user_attributes where app_id=? and origin=? AND name like '!_%' escape '!'", new String[]{c3181e9.f8422a, c3181e9.f8423b});
                this.f8410a.m31094z();
                if (m31230I >= 25) {
                    return false;
                }
            }
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("app_id", c3181e9.f8422a);
        contentValues.put("origin", c3181e9.f8423b);
        contentValues.put("name", c3181e9.f8424c);
        contentValues.put("set_timestamp", Long.valueOf(c3181e9.f8425d));
        m31231H(contentValues, "value", c3181e9.f8426e);
        try {
            if (m31223P().insertWithOnConflict("user_attributes", null, contentValues, 5) == -1) {
                this.f8410a.mo31116d().m31332r().m31397b("Failed to insert/update user property (got -1). appId", C3197g3.m31324z(c3181e9.f8422a));
            }
        } catch (SQLiteException e) {
            this.f8410a.mo31116d().m31332r().m31396c("Error storing user property. appId", C3197g3.m31324z(c3181e9.f8422a), e);
        }
        return true;
    }
}
