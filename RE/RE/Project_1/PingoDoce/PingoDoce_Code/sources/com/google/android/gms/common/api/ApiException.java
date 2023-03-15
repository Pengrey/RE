package com.google.android.gms.common.api;

/* compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* loaded from: classes.dex */
public class ApiException extends Exception {
    @Deprecated

    /* renamed from: w */
    protected final Status f7150w;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public ApiException(com.google.android.gms.common.api.Status r5) {
        /*
            r4 = this;
            int r0 = r5.m33508t()
            java.lang.String r1 = r5.m33507v()
            if (r1 == 0) goto Lf
            java.lang.String r1 = r5.m33507v()
            goto L11
        Lf:
            java.lang.String r1 = ""
        L11:
            java.lang.String r2 = java.lang.String.valueOf(r1)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 13
            r3.<init>(r2)
            r3.append(r0)
            java.lang.String r0 = ": "
            r3.append(r0)
            r3.append(r1)
            java.lang.String r0 = r3.toString()
            r4.<init>(r0)
            r4.f7150w = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.ApiException.<init>(com.google.android.gms.common.api.Status):void");
    }

    /* renamed from: a */
    public Status m33515a() {
        return this.f7150w;
    }
}
