package p078e7;

import android.util.Base64;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: e7.b */
/* loaded from: classes.dex */
public final class C5001b {
    /* renamed from: a */
    public static String m25919a(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        return Base64.encodeToString(bArr, 11);
    }
}
