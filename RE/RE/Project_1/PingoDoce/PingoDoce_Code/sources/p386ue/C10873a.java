package p386ue;

import p107ff.Response;

/* renamed from: ue.a */
/* loaded from: classes2.dex */
public final class C10873a {
    /* renamed from: a */
    public static final boolean m6809a(Response response, int i) {
        int i2 = 1;
        while (response != null) {
            response = response.m24207R();
            i2++;
        }
        return i2 > i;
    }
}
