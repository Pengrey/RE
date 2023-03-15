package p358t0;

import kotlin.NoWhenBranchMatchedException;

/* renamed from: t0.v */
/* loaded from: classes.dex */
public enum EnumC10353v implements InterfaceC10352u {
    Active,
    ActiveParent,
    Captured,
    Deactivated,
    DeactivatedParent,
    Inactive;

    /* compiled from: FocusState.kt */
    /* renamed from: t0.v$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C10354a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26945a;

        static {
            int[] iArr = new int[EnumC10353v.values().length];
            iArr[EnumC10353v.Captured.ordinal()] = 1;
            iArr[EnumC10353v.Active.ordinal()] = 2;
            iArr[EnumC10353v.ActiveParent.ordinal()] = 3;
            iArr[EnumC10353v.Deactivated.ordinal()] = 4;
            iArr[EnumC10353v.DeactivatedParent.ordinal()] = 5;
            iArr[EnumC10353v.Inactive.ordinal()] = 6;
            f26945a = iArr;
        }
    }

    public boolean getHasFocus() {
        switch (C10354a.f26945a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 5:
                return true;
            case 4:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public boolean isCaptured() {
        switch (C10354a.f26945a[ordinal()]) {
            case 1:
                return true;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isDeactivated() {
        switch (C10354a.f26945a[ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 6:
                return false;
            case 4:
            case 5:
                return true;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    @Override // p358t0.InterfaceC10352u
    public boolean isFocused() {
        switch (C10354a.f26945a[ordinal()]) {
            case 1:
            case 2:
                return true;
            case 3:
            case 4:
            case 5:
            case 6:
                return false;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
