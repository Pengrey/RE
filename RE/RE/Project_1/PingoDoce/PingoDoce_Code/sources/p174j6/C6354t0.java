package p174j6;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j6.t0 */
/* loaded from: classes.dex */
public final class C6354t0 extends SQLiteOpenHelper {

    /* renamed from: A */
    private static final InterfaceC6355a f17387A;

    /* renamed from: B */
    private static final InterfaceC6355a f17388B;

    /* renamed from: C */
    private static final InterfaceC6355a f17389C;

    /* renamed from: D */
    private static final InterfaceC6355a f17390D;

    /* renamed from: E */
    private static final InterfaceC6355a f17391E;

    /* renamed from: F */
    private static final List<InterfaceC6355a> f17392F;

    /* renamed from: y */
    private static final String f17393y = "INSERT INTO global_log_event_state VALUES (" + System.currentTimeMillis() + ")";

    /* renamed from: z */
    static int f17394z = 5;

    /* renamed from: w */
    private final int f17395w;

    /* renamed from: x */
    private boolean f17396x;

    /* compiled from: SchemaManager.java */
    /* renamed from: j6.t0$a */
    /* loaded from: classes.dex */
    public interface InterfaceC6355a {
        /* renamed from: a */
        void mo21137a(SQLiteDatabase sQLiteDatabase);
    }

    static {
        C6350r0 c6350r0 = C6350r0.f17383a;
        f17387A = c6350r0;
        C6344o0 c6344o0 = C6344o0.f17373a;
        f17388B = c6344o0;
        C6346p0 c6346p0 = C6346p0.f17377a;
        f17389C = c6346p0;
        C6348q0 c6348q0 = C6348q0.f17381a;
        f17390D = c6348q0;
        C6352s0 c6352s0 = C6352s0.f17385a;
        f17391E = c6352s0;
        f17392F = Arrays.asList(c6350r0, c6344o0, c6346p0, c6348q0, c6352s0);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6354t0(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.f17396x = false;
        this.f17395w = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: E */
    public static /* synthetic */ void m21150E(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
        sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H */
    public static /* synthetic */ void m21148H(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public static /* synthetic */ void m21147L(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
        sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
        sQLiteDatabase.execSQL(f17393y);
    }

    /* renamed from: M */
    private void m21146M(SQLiteDatabase sQLiteDatabase, int i) {
        m21139v(sQLiteDatabase);
        m21145P(sQLiteDatabase, 0, i);
    }

    /* renamed from: P */
    private void m21145P(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        List<InterfaceC6355a> list = f17392F;
        if (i2 <= list.size()) {
            while (i < i2) {
                f17392F.get(i).mo21137a(sQLiteDatabase);
                i++;
            }
            return;
        }
        throw new IllegalArgumentException("Migration from " + i + " to " + i2 + " was requested, but cannot be performed. Only " + list.size() + " migrations are provided");
    }

    /* renamed from: v */
    private void m21139v(SQLiteDatabase sQLiteDatabase) {
        if (this.f17396x) {
            return;
        }
        onConfigure(sQLiteDatabase);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: y */
    public static /* synthetic */ void m21138y(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
        sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.f17396x = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        if (Build.VERSION.SDK_INT >= 16) {
            sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onCreate(SQLiteDatabase sQLiteDatabase) {
        m21146M(sQLiteDatabase, this.f17395w);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        sQLiteDatabase.execSQL("DROP TABLE events");
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        m21146M(sQLiteDatabase, i2);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onOpen(SQLiteDatabase sQLiteDatabase) {
        m21139v(sQLiteDatabase);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        m21139v(sQLiteDatabase);
        m21145P(sQLiteDatabase, i, i2);
    }
}
