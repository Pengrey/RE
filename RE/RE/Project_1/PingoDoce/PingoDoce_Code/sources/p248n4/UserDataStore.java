package p248n4;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.util.Log;
import android.util.Patterns;
import com.facebook.C2290b;
import com.facebook.internal.Utility;
import com.github.aachartmodel.aainfographics.BuildConfig;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import p076e5.CrashShieldHandler;
import p181jd.Intrinsics;
import p264o4.MetadataRule;
import p489zc.C13778q0;
import sd.C10156i;

/* renamed from: n4.p */
/* loaded from: classes.dex */
public final class UserDataStore {

    /* renamed from: a */
    private static final String f20261a;

    /* renamed from: b */
    private static SharedPreferences f20262b;

    /* renamed from: c */
    private static final AtomicBoolean f20263c;

    /* renamed from: d */
    private static final ConcurrentHashMap f20264d;

    /* renamed from: e */
    private static final ConcurrentHashMap f20265e;

    /* renamed from: f */
    public static final UserDataStore f20266f = new UserDataStore();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: UserDataStore.kt */
    /* renamed from: n4.p$a */
    /* loaded from: classes.dex */
    public static final class RunnableC7678a implements Runnable {

        /* renamed from: w */
        final /* synthetic */ String f20267w;

        /* renamed from: x */
        final /* synthetic */ String f20268x;

        RunnableC7678a(String str, String str2) {
            this.f20267w = str;
            this.f20268x = str2;
        }

        public final void run() {
            if (CrashShieldHandler.m25963d(this)) {
                return;
            }
            try {
                UserDataStore userDataStore = UserDataStore.f20266f;
                if (!UserDataStore.m17742a(userDataStore).get()) {
                    UserDataStore.m17740c(userDataStore);
                }
                UserDataStore.m17741b(userDataStore).edit().putString(this.f20267w, this.f20268x).apply();
            } catch (Throwable th2) {
                CrashShieldHandler.m25965b(th2, this);
            }
        }
    }

    static {
        String simpleName = UserDataStore.class.getSimpleName();
        Intrinsics.checkIfNull(simpleName, "UserDataStore::class.java.simpleName");
        f20261a = simpleName;
        f20263c = new AtomicBoolean(false);
        f20264d = new ConcurrentHashMap();
        f20265e = new ConcurrentHashMap();
    }

    private UserDataStore() {
    }

    /* renamed from: a */
    public static final /* synthetic */ AtomicBoolean m17742a(UserDataStore userDataStore) {
        if (CrashShieldHandler.m25963d(UserDataStore.class)) {
            return null;
        }
        try {
            return f20263c;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, UserDataStore.class);
            return null;
        }
    }

    /* renamed from: b */
    public static final /* synthetic */ SharedPreferences m17741b(UserDataStore userDataStore) {
        if (CrashShieldHandler.m25963d(UserDataStore.class)) {
            return null;
        }
        try {
            SharedPreferences sharedPreferences = f20262b;
            if (sharedPreferences == null) {
                Intrinsics.throwUninitPropException("sharedPreferences");
            }
            return sharedPreferences;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, UserDataStore.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m17740c(UserDataStore userDataStore) {
        if (CrashShieldHandler.m25963d(UserDataStore.class)) {
            return;
        }
        try {
            userDataStore.m17737f();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, UserDataStore.class);
        }
    }

    /* renamed from: d */
    public static final String m17739d() {
        if (CrashShieldHandler.m25963d(UserDataStore.class)) {
            return null;
        }
        try {
            if (!f20263c.get()) {
                f20266f.m17737f();
            }
            HashMap hashMap = new HashMap();
            hashMap.putAll(f20264d);
            hashMap.putAll(f20266f.m17738e());
            return Utility.m33972L(hashMap);
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, UserDataStore.class);
            return null;
        }
    }

    /* renamed from: e */
    private final Map m17738e() {
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            HashMap hashMap = new HashMap();
            Set m17154b = MetadataRule.f20744e.m17154b();
            for (String str : f20265e.keySet()) {
                if (m17154b.contains(str)) {
                    hashMap.put(str, f20265e.get(str));
                }
            }
            return hashMap;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    /* renamed from: f */
    private final synchronized void m17737f() {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        AtomicBoolean atomicBoolean = f20263c;
        if (atomicBoolean.get()) {
            return;
        }
        SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(C2290b.m34110e());
        Intrinsics.checkIfNull(defaultSharedPreferences, "PreferenceManager.getDef….getApplicationContext())");
        f20262b = defaultSharedPreferences;
        if (defaultSharedPreferences == null) {
            Intrinsics.throwUninitPropException("sharedPreferences");
        }
        String string = defaultSharedPreferences.getString("com.facebook.appevents.UserDataStore.userData", BuildConfig.VERSION_NAME);
        if (string == null) {
            string = BuildConfig.VERSION_NAME;
        }
        Intrinsics.checkIfNull(string, "sharedPreferences.getStr…(USER_DATA_KEY, \"\") ?: \"\"");
        SharedPreferences sharedPreferences = f20262b;
        if (sharedPreferences == null) {
            Intrinsics.throwUninitPropException("sharedPreferences");
        }
        String string2 = sharedPreferences.getString("com.facebook.appevents.UserDataStore.internalUserData", BuildConfig.VERSION_NAME);
        if (string2 == null) {
            string2 = BuildConfig.VERSION_NAME;
        }
        Intrinsics.checkIfNull(string2, "sharedPreferences.getStr…_USER_DATA_KEY, \"\") ?: \"\"");
        f20264d.putAll(Utility.m33975I(string));
        f20265e.putAll(Utility.m33975I(string2));
        atomicBoolean.set(true);
    }

    /* renamed from: g */
    public static final void m17736g() {
        if (CrashShieldHandler.m25963d(UserDataStore.class)) {
            return;
        }
        try {
            if (f20263c.get()) {
                return;
            }
            f20266f.m17737f();
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, UserDataStore.class);
        }
    }

    /* renamed from: h */
    private final String m17735h(String str, String str2) {
        String str3;
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            int length = str2.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.isLessOrEqual(str2.charAt(!z ? i : length), 32) <= 0;
                if (z) {
                    if (!z2) {
                        break;
                    }
                    length--;
                } else if (z2) {
                    i++;
                } else {
                    z = true;
                }
            }
            String obj = str2.subSequence(i, length + 1).toString();
            if (obj != null) {
                String lowerCase = obj.toLowerCase();
                Intrinsics.checkIfNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                if (Intrinsics.equals("em", str)) {
                    if (Patterns.EMAIL_ADDRESS.matcher(lowerCase).matches()) {
                        return lowerCase;
                    }
                    Log.e(f20261a, "Setting email failure: this is not a valid email address");
                    return BuildConfig.VERSION_NAME;
                } else if (Intrinsics.equals("ph", str)) {
                    return new C10156i("[^0-9]").m9020e(lowerCase, BuildConfig.VERSION_NAME);
                } else {
                    if (Intrinsics.equals("ge", str)) {
                        if (!(lowerCase.length() > 0)) {
                            str3 = BuildConfig.VERSION_NAME;
                        } else if (lowerCase == null) {
                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                        } else {
                            str3 = lowerCase.substring(0, 1);
                            Intrinsics.checkIfNull(str3, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        }
                        if (!Intrinsics.equals("f", str3) && !Intrinsics.equals("m", str3)) {
                            Log.e(f20261a, "Setting gender failure: the supported value for gender is f or m");
                            return BuildConfig.VERSION_NAME;
                        }
                        return str3;
                    }
                    return lowerCase;
                }
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    /* renamed from: i */
    public static final void m17734i(Map map) {
        String[] strArr;
        Set m206d;
        List m9019f;
        if (CrashShieldHandler.m25963d(UserDataStore.class)) {
            return;
        }
        try {
            Intrinsics.isThisObjectNull(map, "ud");
            if (!f20263c.get()) {
                f20266f.m17737f();
            }
            for (Map.Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                String str2 = (String) entry.getValue();
                UserDataStore userDataStore = f20266f;
                int length = str2.length() - 1;
                int i = 0;
                boolean z = false;
                while (i <= length) {
                    boolean z2 = Intrinsics.isLessOrEqual(str2.charAt(!z ? i : length), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length--;
                    } else if (z2) {
                        i++;
                    } else {
                        z = true;
                    }
                }
                String m33959Y = Utility.m33959Y(userDataStore.m17735h(str, str2.subSequence(i, length + 1).toString()));
                ConcurrentHashMap concurrentHashMap = f20265e;
                if (concurrentHashMap.containsKey(str)) {
                    String str3 = (String) concurrentHashMap.get(str);
                    if (str3 == null || (m9019f = new C10156i(",").m9019f(str3, 0)) == null) {
                        strArr = new String[0];
                    } else {
                        Object[] array = m9019f.toArray(new String[0]);
                        if (array == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        strArr = (String[]) array;
                    }
                    m206d = C13778q0.m206d((String[]) Arrays.copyOf(strArr, strArr.length));
                    if (m206d.contains(m33959Y)) {
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder();
                    if (strArr.length == 0) {
                        sb2.append(m33959Y);
                        Intrinsics.checkIfNull(sb2, "sb.append(value)");
                    } else if (strArr.length < 5) {
                        sb2.append(str3);
                        sb2.append(",");
                        sb2.append(m33959Y);
                        Intrinsics.checkIfNull(sb2, "sb.append(originalVal).a…_SEPARATOR).append(value)");
                    } else {
                        for (int i2 = 1; i2 < 5; i2++) {
                            sb2.append(strArr[i2]);
                            sb2.append(",");
                        }
                        sb2.append(m33959Y);
                        m206d.remove(strArr[0]);
                    }
                    f20265e.put(str, sb2.toString());
                } else {
                    concurrentHashMap.put(str, m33959Y);
                }
            }
            f20266f.m17733j("com.facebook.appevents.UserDataStore.internalUserData", Utility.m33972L(f20265e));
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, UserDataStore.class);
        }
    }

    /* renamed from: j */
    private final void m17733j(String str, String str2) {
        if (CrashShieldHandler.m25963d(this)) {
            return;
        }
        try {
            C2290b.m34103l().execute(new RunnableC7678a(str, str2));
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
        }
    }
}
