package td;

import bd.AbstractC1880b;
import bd.CoroutineContext;
import id.InterfaceC6108l;
import java.io.Closeable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.AbstractC6438m;

/* renamed from: td.i1 */
/* loaded from: classes2.dex */
public abstract class AbstractC10525i1 extends AbstractC10505e0 implements Closeable {

    /* compiled from: Executors.kt */
    /* renamed from: td.i1$a */
    /* loaded from: classes2.dex */
    public static final class C10526a extends AbstractC1880b<AbstractC10505e0, AbstractC10525i1> {

        /* compiled from: Executors.kt */
        /* renamed from: td.i1$a$a */
        /* loaded from: classes2.dex */
        static final class C10527a extends AbstractC6438m implements InterfaceC6108l<CoroutineContext.InterfaceC1891b, AbstractC10525i1> {

            /* renamed from: w */
            public static final C10527a f27243w = new C10527a();

            C10527a() {
                super(1);
            }

            @Override // id.InterfaceC6108l
            /* renamed from: a */
            public final AbstractC10525i1 mo9587d(CoroutineContext.InterfaceC1891b interfaceC1891b) {
                if (interfaceC1891b instanceof AbstractC10525i1) {
                    return (AbstractC10525i1) interfaceC1891b;
                }
                return null;
            }
        }

        private C10526a() {
            super(AbstractC10505e0.f27232x, C10527a.f27243w);
        }

        public /* synthetic */ C10526a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C10526a(null);
    }
}
