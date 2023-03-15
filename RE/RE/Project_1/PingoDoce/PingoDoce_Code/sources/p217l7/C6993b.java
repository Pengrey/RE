package p217l7;

import android.util.Base64;
import java.util.Random;

/* compiled from: com.google.android.gms:play-services-auth@@19.2.0 */
/* renamed from: l7.b */
/* loaded from: classes.dex */
public final class C6993b {

    /* renamed from: a */
    private static final Random f18606a = new Random();

    /* renamed from: a */
    public static String m19641a() {
        byte[] bArr = new byte[16];
        f18606a.nextBytes(bArr);
        return Base64.encodeToString(bArr, 11);
    }
}
