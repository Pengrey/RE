package p484z6;

import com.google.android.gms.common.internal.C2597i;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* renamed from: z6.b */
/* loaded from: classes.dex */
public final class C13699b {
    public C13699b(String str) {
        this(str, null);
    }

    public C13699b(String str, String str2) {
        C2597i.m33075k(str, "log tag cannot be null");
        C2597i.m33083c(str.length() <= 23, "tag \"%s\" is longer than the %d character maximum", str, 23);
    }
}
