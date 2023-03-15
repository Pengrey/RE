package p093f1;

import androidx.compose.p018ui.input.pointer.EnumC0662a;
import androidx.compose.p018ui.platform.ViewConfiguration;
import bd.InterfaceC1886d;
import id.InterfaceC6112p;
import p479z1.Density;

/* renamed from: f1.c */
/* loaded from: classes.dex */
public interface InterfaceC5274c extends Density {

    /* compiled from: SuspendingPointerInputFilter.kt */
    /* renamed from: f1.c$a */
    /* loaded from: classes.dex */
    public static final class C5275a {
        /* renamed from: a */
        public static /* synthetic */ Object m24821a(InterfaceC5274c interfaceC5274c, EnumC0662a enumC0662a, InterfaceC1886d interfaceC1886d, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    enumC0662a = EnumC0662a.Main;
                }
                return interfaceC5274c.mo24823b0(enumC0662a, interfaceC1886d);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: awaitPointerEvent");
        }
    }

    /* renamed from: G */
    long mo24827G();

    /* renamed from: J */
    <T> Object mo24826J(long j, InterfaceC6112p<? super InterfaceC5274c, ? super InterfaceC1886d<? super T>, ? extends Object> interfaceC6112p, InterfaceC1886d<? super T> interfaceC1886d);

    /* renamed from: T */
    <T> Object mo24825T(long j, InterfaceC6112p<? super InterfaceC5274c, ? super InterfaceC1886d<? super T>, ? extends Object> interfaceC6112p, InterfaceC1886d<? super T> interfaceC1886d);

    /* renamed from: b */
    long mo24824b();

    /* renamed from: b0 */
    Object mo24823b0(EnumC0662a enumC0662a, InterfaceC1886d<? super C5306m> interfaceC1886d);

    ViewConfiguration getViewConfiguration();

    /* renamed from: w */
    C5306m mo24822w();
}
