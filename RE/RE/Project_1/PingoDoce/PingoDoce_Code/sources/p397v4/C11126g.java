package p397v4;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.C2290b;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
import p076e5.CrashShieldHandler;
import p181jd.Intrinsics;
import p489zc._ArraysJvm;
import sd.C10150d;
import sd.C10156i;

/* compiled from: Utils.kt */
/* renamed from: v4.g */
/* loaded from: classes.dex */
public final class C11126g {

    /* renamed from: a */
    public static final C11126g f28556a = new C11126g();

    private C11126g() {
    }

    /* renamed from: a */
    public static final File m6050a() {
        if (CrashShieldHandler.m25963d(C11126g.class)) {
            return null;
        }
        try {
            Context m34110e = C2290b.m34110e();
            Intrinsics.checkIfNull(m34110e, "FacebookSdk.getApplicationContext()");
            File file = new File(m34110e.getFilesDir(), "facebook_ml/");
            if (!file.exists()) {
                if (!file.mkdirs()) {
                    return null;
                }
            }
            return file;
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C11126g.class);
            return null;
        }
    }

    /* renamed from: c */
    public static final Map m6048c(File file) {
        int i;
        if (CrashShieldHandler.m25963d(C11126g.class)) {
            return null;
        }
        try {
            Intrinsics.isThisObjectNull(file, "file");
            try {
                FileInputStream fileInputStream = new FileInputStream(file);
                int available = fileInputStream.available();
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                byte[] bArr = new byte[available];
                dataInputStream.readFully(bArr);
                dataInputStream.close();
                if (available < 4) {
                    return null;
                }
                int i2 = 0;
                ByteBuffer wrap = ByteBuffer.wrap(bArr, 0, 4);
                wrap.order(ByteOrder.LITTLE_ENDIAN);
                Intrinsics.checkIfNull(wrap, "bb");
                int i3 = wrap.getInt();
                int i4 = i3 + 4;
                if (available < i4) {
                    return null;
                }
                JSONObject jSONObject = new JSONObject(new String(bArr, 4, i3, C10150d.f26472b));
                JSONArray names = jSONObject.names();
                int length = names.length();
                String[] strArr = new String[length];
                for (int i5 = 0; i5 < length; i5++) {
                    strArr[i5] = names.getString(i5);
                }
                _ArraysJvm.m302v(strArr);
                HashMap hashMap = new HashMap();
                int i6 = 0;
                while (i6 < length) {
                    String str = strArr[i6];
                    if (str == null) {
                        i = i2;
                    } else {
                        JSONArray jSONArray = jSONObject.getJSONArray(str);
                        int length2 = jSONArray.length();
                        int[] iArr = new int[length2];
                        int i7 = 1;
                        while (i2 < length2) {
                            iArr[i2] = jSONArray.getInt(i2);
                            i7 *= iArr[i2];
                            i2++;
                        }
                        int i8 = i7 * 4;
                        int i9 = i4 + i8;
                        if (i9 > available) {
                            return null;
                        }
                        ByteBuffer wrap2 = ByteBuffer.wrap(bArr, i4, i8);
                        wrap2.order(ByteOrder.LITTLE_ENDIAN);
                        MTensor mTensor = new MTensor(iArr);
                        i = 0;
                        wrap2.asFloatBuffer().get(mTensor.m6107a(), 0, i7);
                        hashMap.put(str, mTensor);
                        i4 = i9;
                    }
                    i6++;
                    i2 = i;
                }
                return hashMap;
            } catch (Exception unused) {
                return null;
            }
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, C11126g.class);
            return null;
        }
    }

    /* renamed from: b */
    public final String m6049b(String str) {
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            Intrinsics.isThisObjectNull(str, "str");
            int length = str.length() - 1;
            int i = 0;
            boolean z = false;
            while (i <= length) {
                boolean z2 = Intrinsics.isLessOrEqual(str.charAt(!z ? i : length), 32) <= 0;
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
            Object[] array = new C10156i("\\s+").m9019f(str.subSequence(i, length + 1).toString(), 0).toArray(new String[0]);
            if (array != null) {
                String join = TextUtils.join(" ", (String[]) array);
                Intrinsics.checkIfNull(join, "TextUtils.join(\" \", strArray)");
                return join;
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }

    /* renamed from: d */
    public final int[] m6047d(String str, int i) {
        if (CrashShieldHandler.m25963d(this)) {
            return null;
        }
        try {
            Intrinsics.isThisObjectNull(str, "texts");
            int[] iArr = new int[i];
            String m6049b = m6049b(str);
            Charset forName = Charset.forName("UTF-8");
            Intrinsics.checkIfNull(forName, "Charset.forName(\"UTF-8\")");
            if (m6049b != null) {
                byte[] bytes = m6049b.getBytes(forName);
                Intrinsics.checkIfNull(bytes, "(this as java.lang.String).getBytes(charset)");
                for (int i2 = 0; i2 < i; i2++) {
                    if (i2 < bytes.length) {
                        iArr[i2] = bytes[i2] & 255;
                    } else {
                        iArr[i2] = 0;
                    }
                }
                return iArr;
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (Throwable th2) {
            CrashShieldHandler.m25965b(th2, this);
            return null;
        }
    }
}
