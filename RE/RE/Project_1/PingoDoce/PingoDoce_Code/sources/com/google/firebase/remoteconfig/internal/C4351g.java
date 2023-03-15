package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.firebase.remoteconfig.internal.g */
/* loaded from: classes.dex */
public class C4351g {

    /* renamed from: c */
    private static final Map<String, C4351g> f11813c = new HashMap();

    /* renamed from: a */
    private final Context f11814a;

    /* renamed from: b */
    private final String f11815b;

    private C4351g(Context context, String str) {
        this.f11814a = context;
        this.f11815b = str;
    }

    /* renamed from: b */
    public static synchronized C4351g m27813b(Context context, String str) {
        C4351g c4351g;
        synchronized (C4351g.class) {
            Map<String, C4351g> map = f11813c;
            if (!map.containsKey(str)) {
                map.put(str, new C4351g(context, str));
            }
            c4351g = map.get(str);
        }
        return c4351g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m27814a() {
        return this.f11815b;
    }

    @Nullable
    /* renamed from: c */
    public synchronized C4344c m27812c() throws IOException {
        FileInputStream fileInputStream;
        Throwable th2;
        try {
            fileInputStream = this.f11814a.openFileInput(this.f11815b);
        } catch (FileNotFoundException | JSONException unused) {
            fileInputStream = null;
        } catch (Throwable th3) {
            fileInputStream = null;
            th2 = th3;
        }
        try {
            int available = fileInputStream.available();
            byte[] bArr = new byte[available];
            fileInputStream.read(bArr, 0, available);
            C4344c m27826b = C4344c.m27826b(new JSONObject(new String(bArr, "UTF-8")));
            fileInputStream.close();
            return m27826b;
        } catch (FileNotFoundException | JSONException unused2) {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            return null;
        } catch (Throwable th4) {
            th2 = th4;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            throw th2;
        }
    }
}
