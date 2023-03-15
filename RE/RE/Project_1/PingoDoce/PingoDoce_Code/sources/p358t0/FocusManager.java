package p358t0;

import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p169j1.ModifiedFocusNode;
import p181jd.Intrinsics;
import p302q0.InterfaceC9570f;
import p358t0.C10325c;
import p479z1.EnumC13618o;

/* renamed from: t0.h */
/* loaded from: classes.dex */
public final class FocusManager implements InterfaceC10331g {

    /* renamed from: a */
    private final FocusModifier f26914a;

    /* renamed from: b */
    public EnumC13618o f26915b;

    /* compiled from: FocusManager.kt */
    /* renamed from: t0.h$a */
    /* loaded from: classes.dex */
    public /* synthetic */ class C10333a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f26916a;

        static {
            int[] iArr = new int[EnumC10353v.values().length];
            iArr[EnumC10353v.Active.ordinal()] = 1;
            iArr[EnumC10353v.ActiveParent.ordinal()] = 2;
            iArr[EnumC10353v.Captured.ordinal()] = 3;
            iArr[EnumC10353v.Deactivated.ordinal()] = 4;
            iArr[EnumC10353v.DeactivatedParent.ordinal()] = 5;
            iArr[EnumC10353v.Inactive.ordinal()] = 6;
            f26916a = iArr;
        }
    }

    public FocusManager(FocusModifier focusModifier) {
        Intrinsics.isThisObjectNull(focusModifier, "focusModifier");
        this.f26914a = focusModifier;
    }

    /* renamed from: a */
    public boolean mo8247a(int i) {
        ModifiedFocusNode m8176a = FocusTraversal.m8176a(this.f26914a.m8233b());
        if (m8176a == null) {
            return false;
        }
        C10349s m8203a = FocusOrderModifier.m8203a(m8176a, i, m8241d());
        if (!Intrinsics.equals(m8203a, C10349s.f26942b.m8188a())) {
            m8203a.m8189c();
            return true;
        }
        ModifiedFocusNode m8174c = FocusTraversal.m8174c(this.f26914a.m8233b(), i, m8241d());
        if (Intrinsics.equals(m8174c, m8176a)) {
            return false;
        }
        if (m8174c == null) {
            if (!this.f26914a.m8232c().getHasFocus() || this.f26914a.m8232c().isFocused()) {
                return false;
            }
            C10325c.C10326a c10326a = C10325c.f26902b;
            if (C10325c.m8268l(i, c10326a.m8261d()) ? true : C10325c.m8268l(i, c10326a.m8259f())) {
                mo8246b(false);
                if (this.f26914a.m8232c().isFocused()) {
                    return mo8247a(i);
                }
                return false;
            }
            return false;
        } else if (m8174c.m21395P0() != null) {
            FocusTransactions.m8179h(m8174c);
            return true;
        } else {
            throw new IllegalStateException("Move focus landed at the root.".toString());
        }
    }

    /* renamed from: b */
    public void mo8246b(boolean z) {
        EnumC10353v enumC10353v;
        EnumC10353v m8232c = this.f26914a.m8232c();
        if (FocusTransactions.m8184c(this.f26914a.m8233b(), z)) {
            FocusModifier focusModifier = this.f26914a;
            switch (C10333a.f26916a[m8232c.ordinal()]) {
                case 1:
                case 2:
                case 3:
                    enumC10353v = EnumC10353v.Active;
                    break;
                case 4:
                case 5:
                    enumC10353v = EnumC10353v.Deactivated;
                    break;
                case 6:
                    enumC10353v = EnumC10353v.Inactive;
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
            focusModifier.m8227h(enumC10353v);
        }
    }

    /* renamed from: c */
    public final void m8242c() {
        C10334i.m8235b(this.f26914a.m8233b());
    }

    /* renamed from: d */
    public final EnumC13618o m8241d() {
        EnumC13618o enumC13618o = this.f26915b;
        if (enumC13618o != null) {
            return enumC13618o;
        }
        Intrinsics.throwUninitPropException("layoutDirection");
        return null;
    }

    /* renamed from: e */
    public final InterfaceC9570f m8240e() {
        return C10335k.m8222b(InterfaceC9570f.f25164r, this.f26914a);
    }

    /* renamed from: f */
    public final void m8239f() {
        FocusTransactions.m8184c(this.f26914a.m8233b(), true);
    }

    /* renamed from: g */
    public final void m8238g(EnumC13618o enumC13618o) {
        Intrinsics.isThisObjectNull(enumC13618o, "<set-?>");
        this.f26915b = enumC13618o;
    }

    /* renamed from: h */
    public final void m8237h() {
        if (this.f26914a.m8232c() == EnumC10353v.Inactive) {
            this.f26914a.m8227h(EnumC10353v.Active);
        }
    }

    public /* synthetic */ FocusManager(FocusModifier focusModifier, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new FocusModifier(EnumC10353v.Inactive, null, 2, null) : focusModifier);
    }
}
