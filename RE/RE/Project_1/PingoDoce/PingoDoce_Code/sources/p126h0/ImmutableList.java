package p126h0;

import java.util.List;
import p181jd.Intrinsics;
import p203kd.InterfaceC6650a;
import p210l0.C6959d;
import p489zc.AbstractList;

/* renamed from: h0.c */
/* loaded from: classes.dex */
public interface ImmutableList<E> extends List, InterfaceC5733b, InterfaceC6650a {

    /* compiled from: ImmutableList.kt */
    /* renamed from: h0.c$a */
    /* loaded from: classes.dex */
    public static final class C5734a {
        /* renamed from: a */
        public static ImmutableList m23208a(ImmutableList immutableList, int i, int i2) {
            Intrinsics.isThisObjectNull(immutableList, "this");
            return new C5735b(immutableList, i, i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ImmutableList.kt */
    /* renamed from: h0.c$b */
    /* loaded from: classes.dex */
    public static final class C5735b<E> extends AbstractList implements ImmutableList {

        /* renamed from: A */
        private int f16050A;

        /* renamed from: x */
        private final ImmutableList f16051x;

        /* renamed from: y */
        private final int f16052y;

        /* renamed from: z */
        private final int f16053z;

        public C5735b(ImmutableList immutableList, int i, int i2) {
            Intrinsics.isThisObjectNull(immutableList, "source");
            this.f16051x = immutableList;
            this.f16052y = i;
            this.f16053z = i2;
            C6959d.m19701c(i, i2, immutableList.size());
            this.f16050A = i2 - i;
        }

        /* renamed from: b */
        public int m23207b() {
            return this.f16050A;
        }

        /* renamed from: f */
        public ImmutableList mo22469f(int i, int i2) {
            C6959d.m19701c(i, i2, this.f16050A);
            ImmutableList immutableList = this.f16051x;
            int i3 = this.f16052y;
            return new C5735b(immutableList, i + i3, i3 + i2);
        }

        public Object get(int i) {
            C6959d.m19703a(i, this.f16050A);
            return this.f16051x.get(this.f16052y + i);
        }
    }
}
