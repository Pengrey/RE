package androidx.lifecycle;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: androidx.lifecycle.p  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1469p {

    /* renamed from: a */
    AtomicReference<Object> f4347a = new AtomicReference<>();

    /* compiled from: Lifecycle.java */
    /* renamed from: androidx.lifecycle.p$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C1470a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4348a;

        /* renamed from: b */
        static final /* synthetic */ int[] f4349b;

        static {
            int[] iArr = new int[EnumC1471b.values().length];
            f4349b = iArr;
            try {
                iArr[EnumC1471b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4349b[EnumC1471b.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4349b[EnumC1471b.ON_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4349b[EnumC1471b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4349b[EnumC1471b.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4349b[EnumC1471b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4349b[EnumC1471b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[EnumC1472c.values().length];
            f4348a = iArr2;
            try {
                iArr2[EnumC1472c.CREATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f4348a[EnumC1472c.STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f4348a[EnumC1472c.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f4348a[EnumC1472c.DESTROYED.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f4348a[EnumC1472c.INITIALIZED.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    /* compiled from: Lifecycle.java */
    /* renamed from: androidx.lifecycle.p$b */
    /* loaded from: classes.dex */
    public enum EnumC1471b {
        ON_CREATE,
        ON_START,
        ON_RESUME,
        ON_PAUSE,
        ON_STOP,
        ON_DESTROY,
        ON_ANY;

        public static EnumC1471b downFrom(EnumC1472c enumC1472c) {
            int i = C1470a.f4348a[enumC1472c.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return ON_PAUSE;
                }
                return ON_STOP;
            }
            return ON_DESTROY;
        }

        public static EnumC1471b downTo(EnumC1472c enumC1472c) {
            int i = C1470a.f4348a[enumC1472c.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 4) {
                        return null;
                    }
                    return ON_DESTROY;
                }
                return ON_PAUSE;
            }
            return ON_STOP;
        }

        public static EnumC1471b upFrom(EnumC1472c enumC1472c) {
            int i = C1470a.f4348a[enumC1472c.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 5) {
                        return null;
                    }
                    return ON_CREATE;
                }
                return ON_RESUME;
            }
            return ON_START;
        }

        public static EnumC1471b upTo(EnumC1472c enumC1472c) {
            int i = C1470a.f4348a[enumC1472c.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return ON_RESUME;
                }
                return ON_START;
            }
            return ON_CREATE;
        }

        public EnumC1472c getTargetState() {
            switch (C1470a.f4349b[ordinal()]) {
                case 1:
                case 2:
                    return EnumC1472c.CREATED;
                case 3:
                case 4:
                    return EnumC1472c.STARTED;
                case 5:
                    return EnumC1472c.RESUMED;
                case 6:
                    return EnumC1472c.DESTROYED;
                default:
                    throw new IllegalArgumentException(this + " has no target state");
            }
        }
    }

    /* compiled from: Lifecycle.java */
    /* renamed from: androidx.lifecycle.p$c */
    /* loaded from: classes.dex */
    public enum EnumC1472c {
        DESTROYED,
        INITIALIZED,
        CREATED,
        STARTED,
        RESUMED;

        public boolean isAtLeast(EnumC1472c enumC1472c) {
            return compareTo(enumC1472c) >= 0;
        }
    }

    /* renamed from: a */
    public abstract void mo10402a(InterfaceC1489u interfaceC1489u);

    /* renamed from: b */
    public abstract EnumC1472c mo10401b();

    /* renamed from: c */
    public abstract void mo10400c(InterfaceC1489u interfaceC1489u);
}
