package p174j6;

import android.database.sqlite.SQLiteDatabase;
import p174j6.C6354t0;

/* renamed from: j6.p0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C6346p0 implements C6354t0.InterfaceC6355a {

    /* renamed from: a */
    public static final /* synthetic */ C6346p0 f17377a = new C6346p0();

    private /* synthetic */ C6346p0() {
    }

    @Override // p174j6.C6354t0.InterfaceC6355a
    /* renamed from: a */
    public final void mo21137a(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
    }
}
