package com.google.zxing;

import java.util.List;

/* renamed from: com.google.zxing.d */
/* loaded from: classes2.dex */
public enum EnumC4399d {
    OTHER(Object.class),
    PURE_BARCODE(Void.class),
    POSSIBLE_FORMATS(List.class),
    TRY_HARDER(Void.class),
    CHARACTER_SET(String.class),
    ALLOWED_LENGTHS(int[].class),
    ASSUME_CODE_39_CHECK_DIGIT(Void.class),
    ASSUME_GS1(Void.class),
    RETURN_CODABAR_START_END(Void.class),
    NEED_RESULT_POINT_CALLBACK(InterfaceC4412p.class),
    ALLOWED_EAN_EXTENSIONS(int[].class);
    
    private final Class<?> valueType;

    EnumC4399d(Class cls) {
        this.valueType = cls;
    }

    public Class<?> getValueType() {
        return this.valueType;
    }
}
