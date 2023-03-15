package com.google.firebase.crashlytics.internal.common;

/* renamed from: com.google.firebase.crashlytics.internal.common.s */
/* loaded from: classes.dex */
public enum EnumC4233s {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);
    

    /* renamed from: id */
    private final int f11541id;

    EnumC4233s(int i) {
        this.f11541id = i;
    }

    public static EnumC4233s determineFrom(String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }

    public int getId() {
        return this.f11541id;
    }

    @Override // java.lang.Enum
    public String toString() {
        return Integer.toString(this.f11541id);
    }
}
