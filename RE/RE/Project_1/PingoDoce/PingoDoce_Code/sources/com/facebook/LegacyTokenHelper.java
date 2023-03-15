package com.facebook;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p181jd.Intrinsics;
import p482z4.Logger;

/* renamed from: com.facebook.e */
/* loaded from: classes.dex */
public final class LegacyTokenHelper {

    /* renamed from: c */
    private static final String f6672c;

    /* renamed from: d */
    public static final C2304a f6673d = new C2304a(null);

    /* renamed from: a */
    private final String f6674a;

    /* renamed from: b */
    private final SharedPreferences f6675b;

    /* compiled from: LegacyTokenHelper.kt */
    /* renamed from: com.facebook.e$a */
    /* loaded from: classes.dex */
    public static final class C2304a {
        private C2304a() {
        }

        /* renamed from: b */
        private final Date m34069b(Bundle bundle, String str) {
            if (bundle == null) {
                return null;
            }
            long j = bundle.getLong(str, Long.MIN_VALUE);
            if (j == Long.MIN_VALUE) {
                return null;
            }
            return new Date(j);
        }

        /* renamed from: a */
        public final String m34070a(Bundle bundle) {
            Intrinsics.isThisObjectNull(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
        }

        /* renamed from: c */
        public final Date m34068c(Bundle bundle) {
            Intrinsics.isThisObjectNull(bundle, "bundle");
            return m34069b(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
        }

        /* renamed from: d */
        public final Date m34067d(Bundle bundle) {
            Intrinsics.isThisObjectNull(bundle, "bundle");
            return m34069b(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate");
        }

        /* renamed from: e */
        public final EnumC2289a m34066e(Bundle bundle) {
            Intrinsics.isThisObjectNull(bundle, "bundle");
            if (bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
                return (EnumC2289a) bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
            }
            return bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO") ? EnumC2289a.FACEBOOK_APPLICATION_WEB : EnumC2289a.WEB_VIEW;
        }

        /* renamed from: f */
        public final String m34065f(Bundle bundle) {
            Intrinsics.isThisObjectNull(bundle, "bundle");
            return bundle.getString("com.facebook.TokenCachingStrategy.Token");
        }

        /* renamed from: g */
        public final boolean m34064g(Bundle bundle) {
            String string;
            if (bundle == null || (string = bundle.getString("com.facebook.TokenCachingStrategy.Token")) == null) {
                return false;
            }
            return ((string.length() == 0) || bundle.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) == 0) ? false : true;
        }

        public /* synthetic */ C2304a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        String simpleName = LegacyTokenHelper.class.getSimpleName();
        Intrinsics.checkIfNull(simpleName, "LegacyTokenHelper::class.java.simpleName");
        f6672c = simpleName;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
        if ((r4.length() == 0) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public LegacyTokenHelper(android.content.Context r3, java.lang.String r4) {
        /*
            r2 = this;
            java.lang.String r0 = "context"
            p181jd.Intrinsics.isThisObjectNull(r3, r0)
            r2.<init>()
            r0 = 0
            if (r4 == 0) goto L16
            int r1 = r4.length()
            if (r1 != 0) goto L13
            r1 = 1
            goto L14
        L13:
            r1 = r0
        L14:
            if (r1 == 0) goto L18
        L16:
            java.lang.String r4 = "com.facebook.SharedPreferencesTokenCachingStrategy.DEFAULT_KEY"
        L18:
            r2.f6674a = r4
            android.content.Context r1 = r3.getApplicationContext()
            if (r1 == 0) goto L21
            r3 = r1
        L21:
            android.content.SharedPreferences r3 = r3.getSharedPreferences(r4, r0)
            java.lang.String r4 = "context.getSharedPrefere…ey, Context.MODE_PRIVATE)"
            p181jd.Intrinsics.checkIfNull(r3, r4)
            r2.f6675b = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.LegacyTokenHelper.<init>(android.content.Context, java.lang.String):void");
    }

    /* renamed from: b */
    private final void m34072b(String str, Bundle bundle) throws JSONException {
        String str2;
        String string = this.f6675b.getString(str, "{}");
        if (string != null) {
            JSONObject jSONObject = new JSONObject(string);
            String string2 = jSONObject.getString("valueType");
            if (Intrinsics.equals(string2, "bool")) {
                bundle.putBoolean(str, jSONObject.getBoolean("value"));
                return;
            }
            int i = 0;
            if (Intrinsics.equals(string2, "bool[]")) {
                JSONArray jSONArray = jSONObject.getJSONArray("value");
                int length = jSONArray.length();
                boolean[] zArr = new boolean[length];
                while (i < length) {
                    zArr[i] = jSONArray.getBoolean(i);
                    i++;
                }
                bundle.putBooleanArray(str, zArr);
                return;
            } else if (Intrinsics.equals(string2, "byte")) {
                bundle.putByte(str, (byte) jSONObject.getInt("value"));
                return;
            } else if (Intrinsics.equals(string2, "byte[]")) {
                JSONArray jSONArray2 = jSONObject.getJSONArray("value");
                int length2 = jSONArray2.length();
                byte[] bArr = new byte[length2];
                while (i < length2) {
                    bArr[i] = (byte) jSONArray2.getInt(i);
                    i++;
                }
                bundle.putByteArray(str, bArr);
                return;
            } else if (Intrinsics.equals(string2, "short")) {
                bundle.putShort(str, (short) jSONObject.getInt("value"));
                return;
            } else if (Intrinsics.equals(string2, "short[]")) {
                JSONArray jSONArray3 = jSONObject.getJSONArray("value");
                int length3 = jSONArray3.length();
                short[] sArr = new short[length3];
                while (i < length3) {
                    sArr[i] = (short) jSONArray3.getInt(i);
                    i++;
                }
                bundle.putShortArray(str, sArr);
                return;
            } else if (Intrinsics.equals(string2, "int")) {
                bundle.putInt(str, jSONObject.getInt("value"));
                return;
            } else if (Intrinsics.equals(string2, "int[]")) {
                JSONArray jSONArray4 = jSONObject.getJSONArray("value");
                int length4 = jSONArray4.length();
                int[] iArr = new int[length4];
                while (i < length4) {
                    iArr[i] = jSONArray4.getInt(i);
                    i++;
                }
                bundle.putIntArray(str, iArr);
                return;
            } else if (Intrinsics.equals(string2, "long")) {
                bundle.putLong(str, jSONObject.getLong("value"));
                return;
            } else if (Intrinsics.equals(string2, "long[]")) {
                JSONArray jSONArray5 = jSONObject.getJSONArray("value");
                int length5 = jSONArray5.length();
                long[] jArr = new long[length5];
                while (i < length5) {
                    jArr[i] = jSONArray5.getLong(i);
                    i++;
                }
                bundle.putLongArray(str, jArr);
                return;
            } else if (Intrinsics.equals(string2, "float")) {
                bundle.putFloat(str, (float) jSONObject.getDouble("value"));
                return;
            } else if (Intrinsics.equals(string2, "float[]")) {
                JSONArray jSONArray6 = jSONObject.getJSONArray("value");
                int length6 = jSONArray6.length();
                float[] fArr = new float[length6];
                while (i < length6) {
                    fArr[i] = (float) jSONArray6.getDouble(i);
                    i++;
                }
                bundle.putFloatArray(str, fArr);
                return;
            } else if (Intrinsics.equals(string2, "double")) {
                bundle.putDouble(str, jSONObject.getDouble("value"));
                return;
            } else if (Intrinsics.equals(string2, "double[]")) {
                JSONArray jSONArray7 = jSONObject.getJSONArray("value");
                int length7 = jSONArray7.length();
                double[] dArr = new double[length7];
                while (i < length7) {
                    dArr[i] = jSONArray7.getDouble(i);
                    i++;
                }
                bundle.putDoubleArray(str, dArr);
                return;
            } else if (Intrinsics.equals(string2, "char")) {
                String string3 = jSONObject.getString("value");
                if (string3 == null || string3.length() != 1) {
                    return;
                }
                bundle.putChar(str, string3.charAt(0));
                return;
            } else if (Intrinsics.equals(string2, "char[]")) {
                JSONArray jSONArray8 = jSONObject.getJSONArray("value");
                int length8 = jSONArray8.length();
                char[] cArr = new char[length8];
                for (int i2 = 0; i2 < length8; i2++) {
                    String string4 = jSONArray8.getString(i2);
                    if (string4 != null && string4.length() == 1) {
                        cArr[i2] = string4.charAt(0);
                    }
                }
                bundle.putCharArray(str, cArr);
                return;
            } else if (Intrinsics.equals(string2, "string")) {
                bundle.putString(str, jSONObject.getString("value"));
                return;
            } else if (Intrinsics.equals(string2, "stringList")) {
                JSONArray jSONArray9 = jSONObject.getJSONArray("value");
                int length9 = jSONArray9.length();
                ArrayList<String> arrayList = new ArrayList<>(length9);
                while (i < length9) {
                    Object obj = jSONArray9.get(i);
                    if (obj == JSONObject.NULL) {
                        str2 = null;
                    } else {
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                        str2 = (String) obj;
                    }
                    arrayList.add(i, str2);
                    i++;
                }
                bundle.putStringArrayList(str, arrayList);
                return;
            } else if (Intrinsics.equals(string2, "enum")) {
                try {
                    bundle.putSerializable(str, Enum.valueOf(Class.forName(jSONObject.getString("enumType")), jSONObject.getString("value")));
                    return;
                } catch (ClassNotFoundException | IllegalArgumentException unused) {
                    return;
                }
            } else {
                return;
            }
        }
        throw new IllegalStateException("Required value was null.".toString());
    }

    /* renamed from: a */
    public final void m34073a() {
        this.f6675b.edit().clear().apply();
    }

    /* renamed from: c */
    public final Bundle m34071c() {
        Bundle bundle = new Bundle();
        for (String str : this.f6675b.getAll().keySet()) {
            try {
                Intrinsics.checkIfNull(str, "key");
                m34072b(str, bundle);
            } catch (JSONException e) {
                Logger.C13648a c13648a = Logger.f34697f;
                EnumC2305f enumC2305f = EnumC2305f.CACHE;
                String str2 = f6672c;
                c13648a.m704a(enumC2305f, 5, str2, "Error reading cached value for key: '" + str + "' -- " + e);
                return null;
            }
        }
        return bundle;
    }

    public /* synthetic */ LegacyTokenHelper(Context context, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : str);
    }
}
