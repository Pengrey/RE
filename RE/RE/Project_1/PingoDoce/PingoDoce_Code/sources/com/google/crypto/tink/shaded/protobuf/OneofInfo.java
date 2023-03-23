package com.google.crypto.tink.shaded.protobuf;

import java.lang.reflect.Field;

/* loaded from: classes.dex */
final class OneofInfo {
    private final Field caseField;

    /* renamed from: id */
    private final int f11357id;
    private final Field valueField;

    public OneofInfo(int i, Field field, Field field2) {
        this.f11357id = i;
        this.caseField = field;
        this.valueField = field2;
    }

    public Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.f11357id;
    }

    public Field getValueField() {
        return this.valueField;
    }
}