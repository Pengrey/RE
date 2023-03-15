package p392v;

import bd.InterfaceC1886d;
import cd.C2116d;
import id.InterfaceC6112p;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.AbstractC6764l;
import kotlin.coroutines.jvm.internal.C6755b;
import kotlin.coroutines.jvm.internal.InterfaceC6759f;
import kotlinx.coroutines.flow.InterfaceC6785c;
import kotlinx.coroutines.flow.InterfaceC6787d;
import p092f0.C5232o1;
import p092f0.Effects;
import p092f0.InterfaceC5179i;
import p092f0.InterfaceC5220m0;
import p092f0.InterfaceC5242r1;
import p181jd.Intrinsics;
import p468yc.C13186n;
import p468yc.C13195u;
import td.InterfaceC10524i0;

/* compiled from: HoverInteraction.kt */
/* renamed from: v.i */
/* loaded from: classes.dex */
public final class C10981i {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: HoverInteraction.kt */
    @InterfaceC6759f(m20197c = "androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1", m20196f = "HoverInteraction.kt", m20195l = {80}, m20194m = "invokeSuspend")
    /* renamed from: v.i$a */
    /* loaded from: classes.dex */
    public static final class C10982a extends AbstractC6764l implements InterfaceC6112p {

        /* renamed from: x */
        int f28283x;

        /* renamed from: y */
        final /* synthetic */ InterfaceC10985k f28284y;

        /* renamed from: z */
        final /* synthetic */ InterfaceC5220m0 f28285z;

        /* compiled from: Collect.kt */
        /* renamed from: v.i$a$a */
        /* loaded from: classes.dex */
        public static final class C10983a implements InterfaceC6787d {

            /* renamed from: w */
            final /* synthetic */ List f28286w;

            /* renamed from: x */
            final /* synthetic */ InterfaceC5220m0 f28287x;

            public C10983a(List list, InterfaceC5220m0 interfaceC5220m0) {
                this.f28286w = list;
                this.f28287x = interfaceC5220m0;
            }

            /* renamed from: a */
            public Object mo4529a(Object obj, InterfaceC1886d interfaceC1886d) {
                InterfaceC10984j interfaceC10984j = (InterfaceC10984j) obj;
                if (interfaceC10984j instanceof C10980g) {
                    this.f28286w.add(interfaceC10984j);
                } else if (interfaceC10984j instanceof HoverInteraction) {
                    this.f28286w.remove(((HoverInteraction) interfaceC10984j).m6677a());
                }
                this.f28287x.setValue(C6755b.m20201a(!this.f28286w.isEmpty()));
                return C13195u.f34156a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10982a(InterfaceC10985k interfaceC10985k, InterfaceC5220m0 interfaceC5220m0, InterfaceC1886d interfaceC1886d) {
            super(2, interfaceC1886d);
            this.f28284y = interfaceC10985k;
            this.f28285z = interfaceC5220m0;
        }

        public final InterfaceC1886d create(Object obj, InterfaceC1886d interfaceC1886d) {
            return new C10982a(this.f28284y, this.f28285z, interfaceC1886d);
        }

        /* renamed from: d */
        public final Object mo39856d(InterfaceC10524i0 interfaceC10524i0, InterfaceC1886d interfaceC1886d) {
            return ((C10982a) create(interfaceC10524i0, interfaceC1886d)).invokeSuspend(C13195u.f34156a);
        }

        public final Object invokeSuspend(Object obj) {
            Object m34636d;
            m34636d = C2116d.m34636d();
            int i = this.f28283x;
            if (i == 0) {
                C13186n.m1453b(obj);
                ArrayList arrayList = new ArrayList();
                InterfaceC6785c<InterfaceC10984j> mo6674c = this.f28284y.mo6674c();
                C10983a c10983a = new C10983a(arrayList, this.f28285z);
                this.f28283x = 1;
                if (mo6674c.mo20086d(c10983a, this) == m34636d) {
                    return m34636d;
                }
            } else if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            } else {
                C13186n.m1453b(obj);
            }
            return C13195u.f34156a;
        }
    }

    /* renamed from: a */
    public static final InterfaceC5242r1 m6676a(InterfaceC10985k interfaceC10985k, InterfaceC5179i interfaceC5179i, int i) {
        Intrinsics.isThisObjectNull(interfaceC10985k, "<this>");
        interfaceC5179i.mo25263g(-942251217);
        interfaceC5179i.mo25263g(-3687241);
        Object mo25262h = interfaceC5179i.mo25262h();
        if (mo25262h == InterfaceC5179i.f14328a.m25243a()) {
            mo25262h = C5232o1.m24962d(Boolean.FALSE, null, 2, null);
            interfaceC5179i.mo25247w(mo25262h);
        }
        interfaceC5179i.mo25282C();
        InterfaceC5220m0 interfaceC5220m0 = (InterfaceC5220m0) mo25262h;
        Effects.m25539c(interfaceC10985k, new C10982a(interfaceC10985k, interfaceC5220m0, null), interfaceC5179i, i & 14);
        interfaceC5179i.mo25282C();
        return interfaceC5220m0;
    }
}
