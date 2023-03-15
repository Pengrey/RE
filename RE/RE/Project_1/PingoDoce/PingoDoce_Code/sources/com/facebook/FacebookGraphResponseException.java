package com.facebook;

import kotlin.Metadata;
import p181jd.Intrinsics;

/* compiled from: FacebookGraphResponseException.kt */
@Metadata(m20209bv = {1, 0, 3}, m20208d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, m20207d2 = {"Lcom/facebook/FacebookGraphResponseException;", "Lcom/facebook/FacebookException;", "facebook-core_release"}, m20206k = 1, m20205mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class FacebookGraphResponseException extends FacebookException {

    /* renamed from: w */
    private final GraphResponse f6585w;

    public String toString() {
        GraphResponse graphResponse = this.f6585w;
        FacebookRequestError m34083b = graphResponse != null ? graphResponse.m34083b() : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("{FacebookGraphResponseException: ");
        Intrinsics.checkIfNull(sb2, "StringBuilder().append(\"…raphResponseException: \")");
        String message = getMessage();
        if (message != null) {
            sb2.append(message);
            sb2.append(" ");
        }
        if (m34083b != null) {
            sb2.append("httpResponseCode: ");
            sb2.append(m34083b.m34223f());
            sb2.append(", facebookErrorCode: ");
            sb2.append(m34083b.m34227b());
            sb2.append(", facebookErrorType: ");
            sb2.append(m34083b.m34225d());
            sb2.append(", message: ");
            sb2.append(m34083b.m34226c());
            sb2.append("}");
        }
        String sb3 = sb2.toString();
        Intrinsics.checkIfNull(sb3, "errorStringBuilder.toString()");
        return sb3;
    }
}
