package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

/* loaded from: classes.dex */
public class FirebaseInstallationsException extends FirebaseException {

    /* renamed from: com.google.firebase.installations.FirebaseInstallationsException$a */
    /* loaded from: classes.dex */
    public enum EnumC4254a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(EnumC4254a enumC4254a) {
    }

    public FirebaseInstallationsException(String str, EnumC4254a enumC4254a) {
        super(str);
    }
}
