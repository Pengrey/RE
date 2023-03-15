package p396v3;

import com.google.crypto.tink.shaded.protobuf.Reader;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p327r3.AbstractC9797c;
import p327r3.C9805i;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: v3.p */
/* loaded from: classes.dex */
public final class C11106p extends AbstractC11103m {

    /* renamed from: a */
    private final InterfaceC11108q f28505a;

    /* compiled from: HardwareBitmaps.kt */
    /* renamed from: v3.p$a */
    /* loaded from: classes.dex */
    public static final class C11107a {
        private C11107a() {
        }

        public /* synthetic */ C11107a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C11107a(null);
    }

    public C11106p(InterfaceC11108q interfaceC11108q) {
        super(null);
        this.f28505a = interfaceC11108q;
    }

    @Override // p396v3.AbstractC11103m
    /* renamed from: a */
    public boolean mo6118a(C9805i c9805i) {
        AbstractC9797c m9942d = c9805i.m9942d();
        boolean z = m9942d instanceof AbstractC9797c.C9798a;
        int i = Reader.READ_DONE;
        if ((z ? ((AbstractC9797c.C9798a) m9942d).f25738a : Integer.MAX_VALUE) > 100) {
            AbstractC9797c m9943c = c9805i.m9943c();
            if (m9943c instanceof AbstractC9797c.C9798a) {
                i = ((AbstractC9797c.C9798a) m9943c).f25738a;
            }
            if (i > 100) {
                return true;
            }
        }
        return false;
    }

    @Override // p396v3.AbstractC11103m
    /* renamed from: b */
    public boolean mo6117b() {
        return C11102l.f28494a.m6124b(this.f28505a);
    }
}
