package androidx.core.text;

import java.util.Locale;

/* renamed from: androidx.core.text.f */
/* loaded from: classes.dex */
public final class C1059f {

    /* renamed from: a */
    public static final InterfaceC1058e f3395a = new C1064e(null, false);

    /* renamed from: b */
    public static final InterfaceC1058e f3396b = new C1064e(null, true);

    /* renamed from: c */
    public static final InterfaceC1058e f3397c;

    /* renamed from: d */
    public static final InterfaceC1058e f3398d;

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: androidx.core.text.f$a */
    /* loaded from: classes.dex */
    private static class C1060a implements InterfaceC1062c {

        /* renamed from: b */
        static final C1060a f3399b = new C1060a(true);

        /* renamed from: a */
        private final boolean f3400a;

        private C1060a(boolean z) {
            this.f3400a = z;
        }

        @Override // androidx.core.text.C1059f.InterfaceC1062c
        /* renamed from: a */
        public int mo38642a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int m38644a = C1059f.m38644a(Character.getDirectionality(charSequence.charAt(i)));
                if (m38644a != 0) {
                    if (m38644a != 1) {
                        continue;
                        i++;
                        z = z;
                    } else if (!this.f3400a) {
                        return 1;
                    }
                } else if (this.f3400a) {
                    return 0;
                }
                z = true;
                i++;
                z = z;
            }
            if (z) {
                return this.f3400a ? 1 : 0;
            }
            return 2;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: androidx.core.text.f$b */
    /* loaded from: classes.dex */
    private static class C1061b implements InterfaceC1062c {

        /* renamed from: a */
        static final C1061b f3401a = new C1061b();

        private C1061b() {
        }

        @Override // androidx.core.text.C1059f.InterfaceC1062c
        /* renamed from: a */
        public int mo38642a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C1059f.m38643b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: androidx.core.text.f$c */
    /* loaded from: classes.dex */
    public interface InterfaceC1062c {
        /* renamed from: a */
        int mo38642a(CharSequence charSequence, int i, int i2);
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: androidx.core.text.f$d */
    /* loaded from: classes.dex */
    private static abstract class AbstractC1063d implements InterfaceC1058e {

        /* renamed from: a */
        private final InterfaceC1062c f3402a;

        AbstractC1063d(InterfaceC1062c interfaceC1062c) {
            this.f3402a = interfaceC1062c;
        }

        /* renamed from: c */
        private boolean m38640c(CharSequence charSequence, int i, int i2) {
            int mo38642a = this.f3402a.mo38642a(charSequence, i, i2);
            if (mo38642a != 0) {
                if (mo38642a != 1) {
                    return mo38639b();
                }
                return false;
            }
            return true;
        }

        @Override // androidx.core.text.InterfaceC1058e
        /* renamed from: a */
        public boolean mo38641a(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                if (this.f3402a == null) {
                    return mo38639b();
                }
                return m38640c(charSequence, i, i2);
            }
            throw new IllegalArgumentException();
        }

        /* renamed from: b */
        protected abstract boolean mo38639b();
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: androidx.core.text.f$e */
    /* loaded from: classes.dex */
    private static class C1064e extends AbstractC1063d {

        /* renamed from: b */
        private final boolean f3403b;

        C1064e(InterfaceC1062c interfaceC1062c, boolean z) {
            super(interfaceC1062c);
            this.f3403b = z;
        }

        @Override // androidx.core.text.C1059f.AbstractC1063d
        /* renamed from: b */
        protected boolean mo38639b() {
            return this.f3403b;
        }
    }

    /* compiled from: TextDirectionHeuristicsCompat.java */
    /* renamed from: androidx.core.text.f$f */
    /* loaded from: classes.dex */
    private static class C1065f extends AbstractC1063d {

        /* renamed from: b */
        static final C1065f f3404b = new C1065f();

        C1065f() {
            super(null);
        }

        @Override // androidx.core.text.C1059f.AbstractC1063d
        /* renamed from: b */
        protected boolean mo38639b() {
            return C1066g.m38637b(Locale.getDefault()) == 1;
        }
    }

    static {
        C1061b c1061b = C1061b.f3401a;
        f3397c = new C1064e(c1061b, false);
        f3398d = new C1064e(c1061b, true);
        new C1064e(C1060a.f3399b, false);
        C1065f c1065f = C1065f.f3404b;
    }

    /* renamed from: a */
    static int m38644a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m38643b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
