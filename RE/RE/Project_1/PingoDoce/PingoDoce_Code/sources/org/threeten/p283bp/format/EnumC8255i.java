package org.threeten.p283bp.format;

/* renamed from: org.threeten.bp.format.i */
/* loaded from: classes2.dex */
public enum EnumC8255i {
    NORMAL,
    ALWAYS,
    NEVER,
    NOT_NEGATIVE,
    EXCEEDS_PAD;

    boolean parse(boolean z, boolean z2, boolean z3) {
        int ordinal = ordinal();
        if (ordinal == 0) {
            return (z && z2) ? false : true;
        } else if (ordinal == 1 || ordinal == 4) {
            return true;
        } else {
            return (z2 || z3) ? false : true;
        }
    }
}
