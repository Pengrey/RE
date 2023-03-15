package org.threeten.p283bp.format;

/* renamed from: org.threeten.bp.format.k */
/* loaded from: classes2.dex */
public enum EnumC8259k {
    FULL,
    FULL_STANDALONE,
    SHORT,
    SHORT_STANDALONE,
    NARROW,
    NARROW_STANDALONE;

    public EnumC8259k asNormal() {
        return values()[ordinal() & (-2)];
    }

    public EnumC8259k asStandalone() {
        return values()[ordinal() | 1];
    }

    public boolean isStandalone() {
        return (ordinal() & 1) == 1;
    }
}
