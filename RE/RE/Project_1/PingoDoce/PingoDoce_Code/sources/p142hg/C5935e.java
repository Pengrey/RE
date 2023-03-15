package p142hg;

import android.content.SharedPreferences;
import com.squareup.moshi.C4496p;
import com.squareup.moshi.JsonDataException;
import java.lang.reflect.Type;
import jm.C6537a;
import p181jd.Intrinsics;

/* compiled from: ValueLocalDataProvider.kt */
/* renamed from: hg.e */
/* loaded from: classes2.dex */
public final class C5935e {
    /* renamed from: a */
    public static final Object m22649a(SharedPreferences sharedPreferences, String str, Type type, Object obj) {
        Intrinsics.isThisObjectNull(sharedPreferences, "<this>");
        Intrinsics.isThisObjectNull(str, "key");
        Intrinsics.isThisObjectNull(type, "type");
        return m22648b(sharedPreferences, str, type, obj);
    }

    /* renamed from: b */
    private static final Object m22648b(SharedPreferences sharedPreferences, String str, Type type, Object obj) {
        if (str.length() == 0) {
            C6537a.m20673f("> getObject, key must not be empty, returning defaultValue", new Object[0]);
            return obj;
        }
        String string = sharedPreferences.getString(str, null);
        if (string == null) {
            C6537a.m20673f("> getObject, json is null for Key " + str + ", returning defaultValue", new Object[0]);
            return obj;
        }
        try {
            Object m27476c = new C4496p.C4497a().m27364a().m27368d(type).m27476c(string);
            Intrinsics.ifNullDoSomething(m27476c);
            return m27476c;
        } catch (JsonDataException e) {
            C6537a.m20677b("> getObject, Object stored with Key " + str + " not able to instance to " + type, new Object[0]);
            throw e;
        }
    }
}
