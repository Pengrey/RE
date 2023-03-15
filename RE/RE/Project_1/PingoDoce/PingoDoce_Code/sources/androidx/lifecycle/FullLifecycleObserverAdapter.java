package androidx.lifecycle;

import androidx.lifecycle.AbstractC1469p;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class FullLifecycleObserverAdapter implements InterfaceC1485s {

    /* renamed from: w */
    private final InterfaceC1462m f4215w;

    /* renamed from: x */
    private final InterfaceC1485s f4216x;

    /* renamed from: androidx.lifecycle.FullLifecycleObserverAdapter$a */
    /* loaded from: classes.dex */
    static /* synthetic */ class C1416a {

        /* renamed from: a */
        static final /* synthetic */ int[] f4217a;

        static {
            int[] iArr = new int[AbstractC1469p.EnumC1471b.values().length];
            f4217a = iArr;
            try {
                iArr[AbstractC1469p.EnumC1471b.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f4217a[AbstractC1469p.EnumC1471b.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f4217a[AbstractC1469p.EnumC1471b.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f4217a[AbstractC1469p.EnumC1471b.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f4217a[AbstractC1469p.EnumC1471b.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f4217a[AbstractC1469p.EnumC1471b.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f4217a[AbstractC1469p.EnumC1471b.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public FullLifecycleObserverAdapter(InterfaceC1462m interfaceC1462m, InterfaceC1485s interfaceC1485s) {
        this.f4215w = interfaceC1462m;
        this.f4216x = interfaceC1485s;
    }

    @Override // androidx.lifecycle.InterfaceC1485s
    /* renamed from: n */
    public void mo33846n(InterfaceC1491v interfaceC1491v, AbstractC1469p.EnumC1471b enumC1471b) {
        switch (C1416a.f4217a[enumC1471b.ordinal()]) {
            case 1:
                this.f4215w.mo36997d(interfaceC1491v);
                break;
            case 2:
                this.f4215w.mo34464f(interfaceC1491v);
                break;
            case 3:
                this.f4215w.mo36998a(interfaceC1491v);
                break;
            case 4:
                this.f4215w.mo36996e(interfaceC1491v);
                break;
            case 5:
                this.f4215w.mo34472g(interfaceC1491v);
                break;
            case 6:
                this.f4215w.mo34476c(interfaceC1491v);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
        }
        InterfaceC1485s interfaceC1485s = this.f4216x;
        if (interfaceC1485s != null) {
            interfaceC1485s.mo33846n(interfaceC1491v, enumC1471b);
        }
    }
}
