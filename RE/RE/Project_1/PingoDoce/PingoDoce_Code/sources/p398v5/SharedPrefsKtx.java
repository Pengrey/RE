package p398v5;

import android.content.SharedPreferences;
import com.squareup.moshi.C4496p;
import com.squareup.moshi.JsonDataException;
import java.lang.reflect.Type;
import jm.C6537a;
import p139hd.JvmClassMapping;
import p181jd.Intrinsics;
import p296pc.C8604b;
import p314qd.InterfaceC9717b;

/* renamed from: v5.a */
/* loaded from: classes.dex */
public final class SharedPrefsKtx {
    /* renamed from: a */
    public static final Object m6046a(SharedPreferences sharedPreferences, String str, Type type, Object obj, C4496p c4496p) {
        Intrinsics.isThisObjectNull(sharedPreferences, "$this$get");
        Intrinsics.isThisObjectNull(str, "key");
        Intrinsics.isThisObjectNull(type, "type");
        Intrinsics.isThisObjectNull(obj, "default");
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        return m6042e(sharedPreferences, str, type, obj, c4496p);
    }

    /* renamed from: b */
    public static final Object m6045b(SharedPreferences sharedPreferences, String str, InterfaceC9717b interfaceC9717b, Object obj, C4496p c4496p) {
        Intrinsics.isThisObjectNull(sharedPreferences, "$this$get");
        Intrinsics.isThisObjectNull(str, "key");
        Intrinsics.isThisObjectNull(interfaceC9717b, "klass");
        Intrinsics.isThisObjectNull(obj, "default");
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        return m6042e(sharedPreferences, str, C8604b.m15039a(JvmClassMapping.m22766b(interfaceC9717b)), obj, c4496p);
    }

    /* renamed from: c */
    public static /* synthetic */ Object m6044c(SharedPreferences sharedPreferences, String str, Type type, Object obj, C4496p c4496p, int i, Object obj2) {
        if ((i & 8) != 0) {
            c4496p = new C4496p.C4497a().m27364a();
            Intrinsics.checkIfNull(c4496p, "Moshi.Builder().build()");
        }
        return m6046a(sharedPreferences, str, type, obj, c4496p);
    }

    /* renamed from: d */
    public static /* synthetic */ Object m6043d(SharedPreferences sharedPreferences, String str, InterfaceC9717b interfaceC9717b, Object obj, C4496p c4496p, int i, Object obj2) {
        if ((i & 8) != 0) {
            c4496p = new C4496p.C4497a().m27364a();
            Intrinsics.checkIfNull(c4496p, "Moshi.Builder().build()");
        }
        return m6045b(sharedPreferences, str, interfaceC9717b, obj, c4496p);
    }

    /* renamed from: e */
    private static final Object m6042e(SharedPreferences sharedPreferences, String str, Type type, Object obj, C4496p c4496p) {
        if (str.length() == 0) {
            C6537a.m20673f("> getObject, key must not be empty, returning defaultValue", new Object[0]);
            return obj;
        }
        String string = sharedPreferences.getString(str, null);
        if (string == null) {
            C6537a.m20673f("> getObject, json is null for Key " + str + ", returning defaultValue", new Object[0]);
        } else {
            try {
                obj = c4496p.m27368d(type).m27476c(string);
                Intrinsics.ifNullDoSomething(obj);
                Intrinsics.checkIfNull(obj, "try {\n            moshi.…        throw e\n        }");
            } catch (JsonDataException e) {
                C6537a.m20677b("> getObject, Object stored with Key " + str + " not able to instance to " + type, new Object[0]);
                throw e;
            }
        }
        return obj;
    }

    /* renamed from: f */
    public static final boolean m6041f(SharedPreferences sharedPreferences, String str, Object obj, C4496p c4496p) {
        Intrinsics.isThisObjectNull(sharedPreferences, "$this$put");
        Intrinsics.isThisObjectNull(str, "key");
        Intrinsics.isThisObjectNull(obj, "value");
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        return m6040g(sharedPreferences, str, obj, obj.getClass(), c4496p);
    }

    /* renamed from: g */
    public static final boolean m6040g(SharedPreferences sharedPreferences, String str, Object obj, Type type, C4496p c4496p) {
        Intrinsics.isThisObjectNull(sharedPreferences, "$this$put");
        Intrinsics.isThisObjectNull(str, "key");
        Intrinsics.isThisObjectNull(obj, "value");
        Intrinsics.isThisObjectNull(type, "type");
        Intrinsics.isThisObjectNull(c4496p, "moshi");
        if (str.length() > 0) {
            String m27472h = c4496p.m27368d(type).m27472h(obj);
            C6537a.m20675d("> putObject, storing " + m27472h + " with key " + str, new Object[0]);
            return sharedPreferences.edit().putString(str, m27472h).commit();
        }
        throw new IllegalArgumentException("Key must not be empty".toString());
    }

    /* renamed from: h */
    public static /* synthetic */ boolean m6039h(SharedPreferences sharedPreferences, String str, Object obj, C4496p c4496p, int i, Object obj2) {
        if ((i & 4) != 0) {
            c4496p = new C4496p.C4497a().m27364a();
            Intrinsics.checkIfNull(c4496p, "Moshi.Builder().build()");
        }
        return m6041f(sharedPreferences, str, obj, c4496p);
    }

    /* renamed from: i */
    public static /* synthetic */ boolean m6038i(SharedPreferences sharedPreferences, String str, Object obj, Type type, C4496p c4496p, int i, Object obj2) {
        if ((i & 8) != 0) {
            c4496p = new C4496p.C4497a().m27364a();
            Intrinsics.checkIfNull(c4496p, "Moshi.Builder().build()");
        }
        return m6040g(sharedPreferences, str, obj, type, c4496p);
    }
}
