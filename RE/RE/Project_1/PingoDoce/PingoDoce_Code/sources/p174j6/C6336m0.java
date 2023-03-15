package p174j6;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p007a6.AbstractC0046i;
import p007a6.AbstractC0056o;
import p007a6.C0045h;
import p042c6.InterfaceC2092a;
import p077e6.C4987a;
import p077e6.C4989b;
import p077e6.C4991c;
import p077e6.C4994d;
import p077e6.C4996e;
import p077e6.C4998f;
import p098f6.C5414a;
import p196k6.InterfaceC6601a;
import p216l6.InterfaceC6984a;
import p235m6.C7133a;
import p461y5.C13111b;

/* renamed from: j6.m0 */
/* loaded from: classes.dex */
public class C6336m0 implements InterfaceC6313d, InterfaceC6601a, InterfaceC6311c {

    /* renamed from: B */
    private static final C13111b f17353B = C13111b.m1584b("proto");

    /* renamed from: A */
    private final InterfaceC2092a<String> f17354A;

    /* renamed from: w */
    private final C6354t0 f17355w;

    /* renamed from: x */
    private final InterfaceC6984a f17356x;

    /* renamed from: y */
    private final InterfaceC6984a f17357y;

    /* renamed from: z */
    private final AbstractC6315e f17358z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SQLiteEventStore.java */
    /* renamed from: j6.m0$b */
    /* loaded from: classes.dex */
    public interface InterfaceC6338b<T, U> {
        /* renamed from: a */
        U mo21133a(T t);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SQLiteEventStore.java */
    /* renamed from: j6.m0$c */
    /* loaded from: classes.dex */
    public static class C6339c {

        /* renamed from: a */
        final String f17359a;

        /* renamed from: b */
        final String f17360b;

        private C6339c(String str, String str2) {
            this.f17359a = str;
            this.f17360b = str2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SQLiteEventStore.java */
    /* renamed from: j6.m0$d */
    /* loaded from: classes.dex */
    public interface InterfaceC6340d<T> {
        /* renamed from: a */
        T mo21154a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6336m0(InterfaceC6984a interfaceC6984a, InterfaceC6984a interfaceC6984a2, AbstractC6315e abstractC6315e, C6354t0 c6354t0, InterfaceC2092a<String> interfaceC2092a) {
        this.f17355w = c6354t0;
        this.f17356x = interfaceC6984a;
        this.f17357y = interfaceC6984a2;
        this.f17358z = abstractC6315e;
        this.f17354A = interfaceC2092a;
    }

    /* renamed from: D0 */
    private C4991c.EnumC4993b m21237D0(int i) {
        C4991c.EnumC4993b enumC4993b = C4991c.EnumC4993b.REASON_UNKNOWN;
        if (i == enumC4993b.getNumber()) {
            return enumC4993b;
        }
        C4991c.EnumC4993b enumC4993b2 = C4991c.EnumC4993b.MESSAGE_TOO_OLD;
        if (i == enumC4993b2.getNumber()) {
            return enumC4993b2;
        }
        C4991c.EnumC4993b enumC4993b3 = C4991c.EnumC4993b.CACHE_FULL;
        if (i == enumC4993b3.getNumber()) {
            return enumC4993b3;
        }
        C4991c.EnumC4993b enumC4993b4 = C4991c.EnumC4993b.PAYLOAD_TOO_BIG;
        if (i == enumC4993b4.getNumber()) {
            return enumC4993b4;
        }
        C4991c.EnumC4993b enumC4993b5 = C4991c.EnumC4993b.MAX_RETRIES_REACHED;
        if (i == enumC4993b5.getNumber()) {
            return enumC4993b5;
        }
        C4991c.EnumC4993b enumC4993b6 = C4991c.EnumC4993b.INVALID_PAYLOD;
        if (i == enumC4993b6.getNumber()) {
            return enumC4993b6;
        }
        C4991c.EnumC4993b enumC4993b7 = C4991c.EnumC4993b.SERVER_ERROR;
        if (i == enumC4993b7.getNumber()) {
            return enumC4993b7;
        }
        C5414a.m24382a("SQLiteEventStore", "%n is not valid. No matched LogEventDropped-Reason found. Treated it as REASON_UNKNOWN", Integer.valueOf(i));
        return enumC4993b;
    }

    /* renamed from: E0 */
    private void m21235E0(final SQLiteDatabase sQLiteDatabase) {
        m21162u1(new InterfaceC6340d() { // from class: j6.c0
            @Override // p174j6.C6336m0.InterfaceC6340d
            /* renamed from: a */
            public final Object mo21154a() {
                Object beginTransaction;
                beginTransaction = sQLiteDatabase.beginTransaction();
                return beginTransaction;
            }
        }, C6310b0.f17327a);
    }

    /* renamed from: F0 */
    private long m21233F0(SQLiteDatabase sQLiteDatabase, AbstractC0056o abstractC0056o) {
        Long m21222M0 = m21222M0(sQLiteDatabase, abstractC0056o);
        if (m21222M0 != null) {
            return m21222M0.longValue();
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("backend_name", abstractC0056o.mo42044b());
        contentValues.put("priority", Integer.valueOf(C7133a.m19105a(abstractC0056o.mo42042d())));
        contentValues.put("next_request_ms", (Integer) 0);
        if (abstractC0056o.mo42043c() != null) {
            contentValues.put("extras", Base64.encodeToString(abstractC0056o.mo42043c(), 0));
        }
        return sQLiteDatabase.insert("transport_contexts", null, contentValues);
    }

    /* renamed from: I0 */
    private C4989b m21228I0() {
        return C4989b.m25949b().m25947b(C4996e.m25932c().m25930b(m21231G0()).m25929c(AbstractC6315e.f17330a.mo21268f()).m25931a()).m25948a();
    }

    /* renamed from: J0 */
    private long m21227J0() {
        return m21229H0().compileStatement("PRAGMA page_count").simpleQueryForLong();
    }

    /* renamed from: K0 */
    private long m21226K0() {
        return m21229H0().compileStatement("PRAGMA page_size").simpleQueryForLong();
    }

    /* renamed from: L0 */
    private C4998f m21224L0() {
        final long mo19644a = this.f17356x.mo19644a();
        return (C4998f) m21220N0(new InterfaceC6338b() { // from class: j6.w
            @Override // p174j6.C6336m0.InterfaceC6338b
            /* renamed from: a */
            public final Object mo21133a(Object obj) {
                C4998f m21206X0;
                m21206X0 = C6336m0.m21206X0(mo19644a, (SQLiteDatabase) obj);
                return m21206X0;
            }
        });
    }

    /* renamed from: M0 */
    private Long m21222M0(SQLiteDatabase sQLiteDatabase, AbstractC0056o abstractC0056o) {
        StringBuilder sb2 = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(abstractC0056o.mo42044b(), String.valueOf(C7133a.m19105a(abstractC0056o.mo42042d()))));
        if (abstractC0056o.mo42043c() != null) {
            sb2.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(abstractC0056o.mo42043c(), 0));
        } else {
            sb2.append(" and extras is null");
        }
        return (Long) m21156x1(sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb2.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null), C6358v.f17401a);
    }

    /* renamed from: O0 */
    private boolean m21219O0() {
        return m21227J0() * m21226K0() >= this.f17358z.mo21268f();
    }

    /* renamed from: P0 */
    private List<AbstractC6331k> m21217P0(List<AbstractC6331k> list, Map<Long, Set<C6339c>> map) {
        ListIterator<AbstractC6331k> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            AbstractC6331k next = listIterator.next();
            if (map.containsKey(Long.valueOf(next.mo21240c()))) {
                AbstractC0046i.AbstractC0047a m42077l = next.mo21241b().m42077l();
                for (C6339c c6339c : map.get(Long.valueOf(next.mo21240c()))) {
                    m42077l.m42074c(c6339c.f17359a, c6339c.f17360b);
                }
                listIterator.set(AbstractC6331k.m21242a(next.mo21240c(), next.mo21239d(), m42077l.mo42073d()));
            }
        }
        return list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Q0 */
    public /* synthetic */ Object m21216Q0(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo21197c(i, C4991c.EnumC4993b.MESSAGE_TOO_OLD, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: R0 */
    public /* synthetic */ Integer m21214R0(long j, SQLiteDatabase sQLiteDatabase) {
        String[] strArr = {String.valueOf(j)};
        m21156x1(sQLiteDatabase.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE timestamp_ms < ? GROUP BY transport_name", strArr), new InterfaceC6338b() { // from class: j6.f0
            @Override // p174j6.C6336m0.InterfaceC6338b
            /* renamed from: a */
            public final Object mo21133a(Object obj) {
                Object m21216Q0;
                m21216Q0 = C6336m0.this.m21216Q0((Cursor) obj);
                return m21216Q0;
            }
        });
        return Integer.valueOf(sQLiteDatabase.delete("events", "timestamp_ms < ?", strArr));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: T0 */
    public static /* synthetic */ Object m21212T0(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to acquire the lock.", th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: U0 */
    public static /* synthetic */ SQLiteDatabase m21211U0(Throwable th2) {
        throw new SynchronizationException("Timed out while trying to open db.", th2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: V0 */
    public static /* synthetic */ Long m21210V0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: W0 */
    public static /* synthetic */ C4998f m21208W0(long j, Cursor cursor) {
        cursor.moveToNext();
        return C4998f.m25926c().m25923c(cursor.getLong(0)).m25924b(j).m25925a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: X0 */
    public static /* synthetic */ C4998f m21206X0(final long j, SQLiteDatabase sQLiteDatabase) {
        return (C4998f) m21156x1(sQLiteDatabase.rawQuery("SELECT last_metrics_upload_ms FROM global_log_event_state LIMIT 1", new String[0]), new InterfaceC6338b() { // from class: j6.l
            @Override // p174j6.C6336m0.InterfaceC6338b
            /* renamed from: a */
            public final Object mo21133a(Object obj) {
                C4998f m21208W0;
                m21208W0 = C6336m0.m21208W0(j, (Cursor) obj);
                return m21208W0;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Y0 */
    public static /* synthetic */ Long m21204Y0(Cursor cursor) {
        if (cursor.moveToNext()) {
            return Long.valueOf(cursor.getLong(0));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Z0 */
    public /* synthetic */ Boolean m21203Z0(AbstractC0056o abstractC0056o, SQLiteDatabase sQLiteDatabase) {
        Long m21222M0 = m21222M0(sQLiteDatabase, abstractC0056o);
        if (m21222M0 == null) {
            return Boolean.FALSE;
        }
        return (Boolean) m21156x1(m21229H0().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{m21222M0.toString()}), C6361y.f17404a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a1 */
    public static /* synthetic */ List m21200a1(SQLiteDatabase sQLiteDatabase) {
        return (List) m21156x1(sQLiteDatabase.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]), C6353t.f17386a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b1 */
    public static /* synthetic */ List m21198b1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(AbstractC0056o.m42045a().mo42038b(cursor.getString(1)).mo42036d(C7133a.m19104b(cursor.getInt(2))).mo42037c(m21167r1(cursor.getString(3))).mo42039a());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c1 */
    public /* synthetic */ List m21196c1(AbstractC0056o abstractC0056o, SQLiteDatabase sQLiteDatabase) {
        List<AbstractC6331k> m21170p1 = m21170p1(sQLiteDatabase, abstractC0056o);
        return m21217P0(m21170p1, m21168q1(sQLiteDatabase, m21170p1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d1 */
    public /* synthetic */ C4987a m21194d1(Map map, C4987a.C4988a c4988a, Cursor cursor) {
        while (cursor.moveToNext()) {
            String string = cursor.getString(0);
            C4991c.EnumC4993b m21237D0 = m21237D0(cursor.getInt(1));
            long j = cursor.getLong(2);
            if (!map.containsKey(string)) {
                map.put(string, new ArrayList());
            }
            ((List) map.get(string)).add(C4991c.m25944c().m25941c(m21237D0).m25942b(j).m25943a());
        }
        m21166s1(c4988a, map);
        c4988a.m25951e(m21224L0());
        c4988a.m25952d(m21228I0());
        c4988a.m25953c(this.f17354A.get());
        return c4988a.m25954b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e1 */
    public /* synthetic */ C4987a m21191e1(String str, final Map map, final C4987a.C4988a c4988a, SQLiteDatabase sQLiteDatabase) {
        return (C4987a) m21156x1(sQLiteDatabase.rawQuery(str, new String[0]), new InterfaceC6338b() { // from class: j6.p
            @Override // p174j6.C6336m0.InterfaceC6338b
            /* renamed from: a */
            public final Object mo21133a(Object obj) {
                C4987a m21194d1;
                m21194d1 = C6336m0.this.m21194d1(map, c4988a, (Cursor) obj);
                return m21194d1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f1 */
    public /* synthetic */ Object m21189f1(List list, AbstractC0056o abstractC0056o, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            boolean z = cursor.getInt(7) != 0;
            AbstractC0046i.AbstractC0047a mo42066k = AbstractC0046i.m42088a().mo42067j(cursor.getString(1)).mo42068i(cursor.getLong(2)).mo42066k(cursor.getLong(3));
            if (z) {
                mo42066k.mo42069h(new C0045h(m21159v1(cursor.getString(4)), cursor.getBlob(5)));
            } else {
                mo42066k.mo42069h(new C0045h(m21159v1(cursor.getString(4)), m21163t1(j)));
            }
            if (!cursor.isNull(6)) {
                mo42066k.mo42070g(Integer.valueOf(cursor.getInt(6)));
            }
            list.add(AbstractC6331k.m21242a(j, abstractC0056o, mo42066k.mo42073d()));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g1 */
    public static /* synthetic */ Object m21188g1(Map map, Cursor cursor) {
        while (cursor.moveToNext()) {
            long j = cursor.getLong(0);
            Set set = (Set) map.get(Long.valueOf(j));
            if (set == null) {
                set = new HashSet();
                map.put(Long.valueOf(j), set);
            }
            set.add(new C6339c(cursor.getString(1), cursor.getString(2)));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h1 */
    public /* synthetic */ Long m21187h1(AbstractC0046i abstractC0046i, AbstractC0056o abstractC0056o, SQLiteDatabase sQLiteDatabase) {
        if (m21219O0()) {
            mo21197c(1L, C4991c.EnumC4993b.CACHE_FULL, abstractC0046i.mo42079j());
            return -1L;
        }
        long m21233F0 = m21233F0(sQLiteDatabase, abstractC0056o);
        int mo21269e = this.f17358z.mo21269e();
        byte[] m42090a = abstractC0046i.mo42084e().m42090a();
        boolean z = m42090a.length <= mo21269e;
        ContentValues contentValues = new ContentValues();
        contentValues.put("context_id", Long.valueOf(m21233F0));
        contentValues.put("transport_name", abstractC0046i.mo42079j());
        contentValues.put("timestamp_ms", Long.valueOf(abstractC0046i.mo42083f()));
        contentValues.put("uptime_ms", Long.valueOf(abstractC0046i.mo42078k()));
        contentValues.put("payload_encoding", abstractC0046i.mo42084e().m42089b().m1585a());
        contentValues.put("code", abstractC0046i.mo42085d());
        contentValues.put("num_attempts", (Integer) 0);
        contentValues.put("inline", Boolean.valueOf(z));
        contentValues.put("payload", z ? m42090a : new byte[0]);
        long insert = sQLiteDatabase.insert("events", null, contentValues);
        if (!z) {
            int ceil = (int) Math.ceil(m42090a.length / mo21269e);
            for (int i = 1; i <= ceil; i++) {
                byte[] copyOfRange = Arrays.copyOfRange(m42090a, (i - 1) * mo21269e, Math.min(i * mo21269e, m42090a.length));
                ContentValues contentValues2 = new ContentValues();
                contentValues2.put("event_id", Long.valueOf(insert));
                contentValues2.put("sequence_num", Integer.valueOf(i));
                contentValues2.put("bytes", copyOfRange);
                sQLiteDatabase.insert("event_payloads", null, contentValues2);
            }
        }
        for (Map.Entry<String, String> entry : abstractC0046i.m42080i().entrySet()) {
            ContentValues contentValues3 = new ContentValues();
            contentValues3.put("event_id", Long.valueOf(insert));
            contentValues3.put("name", entry.getKey());
            contentValues3.put("value", entry.getValue());
            sQLiteDatabase.insert("event_metadata", null, contentValues3);
        }
        return Long.valueOf(insert);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: i1 */
    public static /* synthetic */ byte[] m21184i1(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (cursor.moveToNext()) {
            byte[] blob = cursor.getBlob(0);
            arrayList.add(blob);
            i += blob.length;
        }
        byte[] bArr = new byte[i];
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            byte[] bArr2 = (byte[]) arrayList.get(i3);
            System.arraycopy(bArr2, 0, bArr, i2, bArr2.length);
            i2 += bArr2.length;
        }
        return bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j1 */
    public /* synthetic */ Object m21182j1(Cursor cursor) {
        while (cursor.moveToNext()) {
            int i = cursor.getInt(0);
            mo21197c(i, C4991c.EnumC4993b.MAX_RETRIES_REACHED, cursor.getString(1));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k1 */
    public /* synthetic */ Object m21181k1(String str, String str2, SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement(str).execute();
        m21156x1(sQLiteDatabase.rawQuery(str2, null), new InterfaceC6338b() { // from class: j6.g0
            @Override // p174j6.C6336m0.InterfaceC6338b
            /* renamed from: a */
            public final Object mo21133a(Object obj) {
                Object m21182j1;
                m21182j1 = C6336m0.this.m21182j1((Cursor) obj);
                return m21182j1;
            }
        });
        sQLiteDatabase.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: l1 */
    public static /* synthetic */ Boolean m21179l1(Cursor cursor) {
        return Boolean.valueOf(cursor.getCount() > 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m1 */
    public static /* synthetic */ Object m21176m1(String str, C4991c.EnumC4993b enumC4993b, long j, SQLiteDatabase sQLiteDatabase) {
        if (!((Boolean) m21156x1(sQLiteDatabase.rawQuery("SELECT 1 FROM log_event_dropped WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(enumC4993b.getNumber())}), C6360x.f17403a)).booleanValue()) {
            ContentValues contentValues = new ContentValues();
            contentValues.put("log_source", str);
            contentValues.put("reason", Integer.valueOf(enumC4993b.getNumber()));
            contentValues.put("events_dropped_count", Long.valueOf(j));
            sQLiteDatabase.insert("log_event_dropped", null, contentValues);
        } else {
            sQLiteDatabase.execSQL("UPDATE log_event_dropped SET events_dropped_count = events_dropped_count + " + j + " WHERE log_source = ? AND reason = ?", new String[]{str, Integer.toString(enumC4993b.getNumber())});
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n1 */
    public static /* synthetic */ Object m21174n1(long j, AbstractC0056o abstractC0056o, SQLiteDatabase sQLiteDatabase) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(j));
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{abstractC0056o.mo42044b(), String.valueOf(C7133a.m19105a(abstractC0056o.mo42042d()))}) < 1) {
            contentValues.put("backend_name", abstractC0056o.mo42044b());
            contentValues.put("priority", Integer.valueOf(C7133a.m19105a(abstractC0056o.mo42042d())));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: o1 */
    public /* synthetic */ Object m21172o1(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.compileStatement("DELETE FROM log_event_dropped").execute();
        sQLiteDatabase.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + this.f17356x.mo19644a()).execute();
        return null;
    }

    /* renamed from: p1 */
    private List<AbstractC6331k> m21170p1(SQLiteDatabase sQLiteDatabase, final AbstractC0056o abstractC0056o) {
        final ArrayList arrayList = new ArrayList();
        Long m21222M0 = m21222M0(sQLiteDatabase, abstractC0056o);
        if (m21222M0 == null) {
            return arrayList;
        }
        m21156x1(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", "payload", "code", "inline"}, "context_id = ?", new String[]{m21222M0.toString()}, null, null, null, String.valueOf(this.f17358z.mo21270d())), new InterfaceC6338b() { // from class: j6.o
            @Override // p174j6.C6336m0.InterfaceC6338b
            /* renamed from: a */
            public final Object mo21133a(Object obj) {
                Object m21189f1;
                m21189f1 = C6336m0.this.m21189f1(arrayList, abstractC0056o, (Cursor) obj);
                return m21189f1;
            }
        });
        return arrayList;
    }

    /* renamed from: q1 */
    private Map<Long, Set<C6339c>> m21168q1(SQLiteDatabase sQLiteDatabase, List<AbstractC6331k> list) {
        final HashMap hashMap = new HashMap();
        StringBuilder sb2 = new StringBuilder("event_id IN (");
        for (int i = 0; i < list.size(); i++) {
            sb2.append(list.get(i).mo21240c());
            if (i < list.size() - 1) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        m21156x1(sQLiteDatabase.query("event_metadata", new String[]{"event_id", "name", "value"}, sb2.toString(), null, null, null, null), new InterfaceC6338b() { // from class: j6.r
            @Override // p174j6.C6336m0.InterfaceC6338b
            /* renamed from: a */
            public final Object mo21133a(Object obj) {
                Object m21188g1;
                m21188g1 = C6336m0.m21188g1(hashMap, (Cursor) obj);
                return m21188g1;
            }
        });
        return hashMap;
    }

    /* renamed from: r1 */
    private static byte[] m21167r1(String str) {
        if (str == null) {
            return null;
        }
        return Base64.decode(str, 0);
    }

    /* renamed from: s1 */
    private void m21166s1(C4987a.C4988a c4988a, Map<String, List<C4991c>> map) {
        for (Map.Entry<String, List<C4991c>> entry : map.entrySet()) {
            c4988a.m25955a(C4994d.m25938c().m25935c(entry.getKey()).m25936b(entry.getValue()).m25937a());
        }
    }

    /* renamed from: t1 */
    private byte[] m21163t1(long j) {
        return (byte[]) m21156x1(m21229H0().query("event_payloads", new String[]{"bytes"}, "event_id = ?", new String[]{String.valueOf(j)}, null, null, "sequence_num"), C6351s.f17384a);
    }

    /* renamed from: u1 */
    private <T> T m21162u1(InterfaceC6340d<T> interfaceC6340d, InterfaceC6338b<Throwable, T> interfaceC6338b) {
        long mo19644a = this.f17357y.mo19644a();
        while (true) {
            try {
                return interfaceC6340d.mo21154a();
            } catch (SQLiteDatabaseLockedException e) {
                if (this.f17357y.mo19644a() >= this.f17358z.mo21272b() + mo19644a) {
                    return interfaceC6338b.mo21133a(e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    /* renamed from: v1 */
    private static C13111b m21159v1(String str) {
        if (str == null) {
            return f17353B;
        }
        return C13111b.m1584b(str);
    }

    /* renamed from: w1 */
    private static String m21158w1(Iterable<AbstractC6331k> iterable) {
        StringBuilder sb2 = new StringBuilder("(");
        Iterator<AbstractC6331k> it = iterable.iterator();
        while (it.hasNext()) {
            sb2.append(it.next().mo21240c());
            if (it.hasNext()) {
                sb2.append(',');
            }
        }
        sb2.append(')');
        return sb2.toString();
    }

    /* renamed from: x1 */
    static <T> T m21156x1(Cursor cursor, InterfaceC6338b<Cursor, T> interfaceC6338b) {
        try {
            return interfaceC6338b.mo21133a(cursor);
        } finally {
            cursor.close();
        }
    }

    @Override // p174j6.InterfaceC6313d
    /* renamed from: G */
    public Iterable<AbstractC6331k> mo21232G(final AbstractC0056o abstractC0056o) {
        return (Iterable) m21220N0(new InterfaceC6338b() { // from class: j6.k0
            @Override // p174j6.C6336m0.InterfaceC6338b
            /* renamed from: a */
            public final Object mo21133a(Object obj) {
                List m21196c1;
                m21196c1 = C6336m0.this.m21196c1(abstractC0056o, (SQLiteDatabase) obj);
                return m21196c1;
            }
        });
    }

    /* renamed from: G0 */
    long m21231G0() {
        return m21227J0() * m21226K0();
    }

    /* renamed from: H0 */
    SQLiteDatabase m21229H0() {
        final C6354t0 c6354t0 = this.f17355w;
        Objects.requireNonNull(c6354t0);
        return (SQLiteDatabase) m21162u1(new InterfaceC6340d() { // from class: j6.d0
            @Override // p174j6.C6336m0.InterfaceC6340d
            /* renamed from: a */
            public final Object mo21154a() {
                return C6354t0.this.getWritableDatabase();
            }
        }, C6308a0.f17323a);
    }

    @Override // p174j6.InterfaceC6313d
    /* renamed from: N */
    public AbstractC6331k mo21221N(final AbstractC0056o abstractC0056o, final AbstractC0046i abstractC0046i) {
        C5414a.m24381b("SQLiteEventStore", "Storing event with priority=%s, name=%s for destination %s", abstractC0056o.mo42042d(), abstractC0046i.mo42079j(), abstractC0056o.mo42044b());
        long longValue = ((Long) m21220N0(new InterfaceC6338b() { // from class: j6.j0
            @Override // p174j6.C6336m0.InterfaceC6338b
            /* renamed from: a */
            public final Object mo21133a(Object obj) {
                Long m21187h1;
                m21187h1 = C6336m0.this.m21187h1(abstractC0046i, abstractC0056o, (SQLiteDatabase) obj);
                return m21187h1;
            }
        })).longValue();
        if (longValue < 1) {
            return null;
        }
        return AbstractC6331k.m21242a(longValue, abstractC0056o, abstractC0046i);
    }

    /* renamed from: N0 */
    <T> T m21220N0(InterfaceC6338b<SQLiteDatabase, T> interfaceC6338b) {
        SQLiteDatabase m21229H0 = m21229H0();
        m21229H0.beginTransaction();
        try {
            T mo21133a = interfaceC6338b.mo21133a(m21229H0);
            m21229H0.setTransactionSuccessful();
            return mo21133a;
        } finally {
            m21229H0.endTransaction();
        }
    }

    @Override // p174j6.InterfaceC6313d
    /* renamed from: Y */
    public Iterable<AbstractC0056o> mo21205Y() {
        return (Iterable) m21220N0(C6362z.f17405a);
    }

    @Override // p174j6.InterfaceC6311c
    /* renamed from: a */
    public C4987a mo21202a() {
        final C4987a.C4988a m25957e = C4987a.m25957e();
        final HashMap hashMap = new HashMap();
        return (C4987a) m21220N0(new InterfaceC6338b() { // from class: j6.n
            @Override // p174j6.C6336m0.InterfaceC6338b
            /* renamed from: a */
            public final Object mo21133a(Object obj) {
                C4987a m21191e1;
                m21191e1 = C6336m0.this.m21191e1(r2, hashMap, m25957e, (SQLiteDatabase) obj);
                return m21191e1;
            }
        });
    }

    @Override // p174j6.InterfaceC6311c
    /* renamed from: c */
    public void mo21197c(final long j, final C4991c.EnumC4993b enumC4993b, final String str) {
        m21220N0(new InterfaceC6338b() { // from class: j6.q
            @Override // p174j6.C6336m0.InterfaceC6338b
            /* renamed from: a */
            public final Object mo21133a(Object obj) {
                Object m21176m1;
                m21176m1 = C6336m0.m21176m1(str, enumC4993b, j, (SQLiteDatabase) obj);
                return m21176m1;
            }
        });
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f17355w.close();
    }

    @Override // p174j6.InterfaceC6311c
    /* renamed from: e */
    public void mo21193e() {
        m21220N0(new InterfaceC6338b() { // from class: j6.h0
            @Override // p174j6.C6336m0.InterfaceC6338b
            /* renamed from: a */
            public final Object mo21133a(Object obj) {
                Object m21172o1;
                m21172o1 = C6336m0.this.m21172o1((SQLiteDatabase) obj);
                return m21172o1;
            }
        });
    }

    @Override // p196k6.InterfaceC6601a
    /* renamed from: h */
    public <T> T mo20509h(InterfaceC6601a.InterfaceC6602a<T> interfaceC6602a) {
        SQLiteDatabase m21229H0 = m21229H0();
        m21235E0(m21229H0);
        try {
            T execute = interfaceC6602a.execute();
            m21229H0.setTransactionSuccessful();
            return execute;
        } finally {
            m21229H0.endTransaction();
        }
    }

    @Override // p174j6.InterfaceC6313d
    /* renamed from: i */
    public int mo21186i() {
        final long mo19644a = this.f17356x.mo19644a() - this.f17358z.mo21271c();
        return ((Integer) m21220N0(new InterfaceC6338b() { // from class: j6.i0
            @Override // p174j6.C6336m0.InterfaceC6338b
            /* renamed from: a */
            public final Object mo21133a(Object obj) {
                Integer m21214R0;
                m21214R0 = C6336m0.this.m21214R0(mo19644a, (SQLiteDatabase) obj);
                return m21214R0;
            }
        })).intValue();
    }

    @Override // p174j6.InterfaceC6313d
    /* renamed from: i0 */
    public long mo21185i0(AbstractC0056o abstractC0056o) {
        return ((Long) m21156x1(m21229H0().rawQuery("SELECT next_request_ms FROM transport_contexts WHERE backend_name = ? and priority = ?", new String[]{abstractC0056o.mo42044b(), String.valueOf(C7133a.m19105a(abstractC0056o.mo42042d()))}), C6356u.f17397a)).longValue();
    }

    @Override // p174j6.InterfaceC6313d
    /* renamed from: m */
    public void mo21178m(final AbstractC0056o abstractC0056o, final long j) {
        m21220N0(new InterfaceC6338b() { // from class: j6.e0
            @Override // p174j6.C6336m0.InterfaceC6338b
            /* renamed from: a */
            public final Object mo21133a(Object obj) {
                Object m21174n1;
                m21174n1 = C6336m0.m21174n1(j, abstractC0056o, (SQLiteDatabase) obj);
                return m21174n1;
            }
        });
    }

    @Override // p174j6.InterfaceC6313d
    /* renamed from: m0 */
    public boolean mo21177m0(final AbstractC0056o abstractC0056o) {
        return ((Boolean) m21220N0(new InterfaceC6338b() { // from class: j6.l0
            @Override // p174j6.C6336m0.InterfaceC6338b
            /* renamed from: a */
            public final Object mo21133a(Object obj) {
                Boolean m21203Z0;
                m21203Z0 = C6336m0.this.m21203Z0(abstractC0056o, (SQLiteDatabase) obj);
                return m21203Z0;
            }
        })).booleanValue();
    }

    @Override // p174j6.InterfaceC6313d
    /* renamed from: n */
    public void mo21175n(Iterable<AbstractC6331k> iterable) {
        if (iterable.iterator().hasNext()) {
            m21229H0().compileStatement("DELETE FROM events WHERE _id in " + m21158w1(iterable)).execute();
        }
    }

    @Override // p174j6.InterfaceC6313d
    /* renamed from: p0 */
    public void mo21171p0(Iterable<AbstractC6331k> iterable) {
        if (iterable.iterator().hasNext()) {
            final String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + m21158w1(iterable);
            m21220N0(new InterfaceC6338b() { // from class: j6.m
                @Override // p174j6.C6336m0.InterfaceC6338b
                /* renamed from: a */
                public final Object mo21133a(Object obj) {
                    Object m21181k1;
                    m21181k1 = C6336m0.this.m21181k1(str, r3, (SQLiteDatabase) obj);
                    return m21181k1;
                }
            });
        }
    }
}
