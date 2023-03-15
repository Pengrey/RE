package p297pd;

import kotlin.jvm.internal.DefaultConstructorMarker;
import p064dd.C4785c;
import p203kd.InterfaceC6650a;
import p489zc.AbstractC13762g0;

/* renamed from: pd.d */
/* loaded from: classes2.dex */
public class C8608d implements Iterable<Integer>, InterfaceC6650a {

    /* renamed from: z */
    public static final C8609a f22221z = new C8609a(null);

    /* renamed from: w */
    private final int f22222w;

    /* renamed from: x */
    private final int f22223x;

    /* renamed from: y */
    private final int f22224y;

    /* compiled from: Progressions.kt */
    /* renamed from: pd.d$a */
    /* loaded from: classes2.dex */
    public static final class C8609a {
        private C8609a() {
        }

        public /* synthetic */ C8609a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C8608d m15030a(int i, int i2, int i3) {
            return new C8608d(i, i2, i3);
        }
    }

    public C8608d(int i, int i2, int i3) {
        if (i3 == 0) {
            throw new IllegalArgumentException("Step must be non-zero.");
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f22222w = i;
            this.f22223x = C4785c.m26610b(i, i2, i3);
            this.f22224y = i3;
            return;
        }
        throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
    }

    public boolean equals(Object obj) {
        if (obj instanceof C8608d) {
            if (!isEmpty() || !((C8608d) obj).isEmpty()) {
                C8608d c8608d = (C8608d) obj;
                if (this.f22222w != c8608d.f22222w || this.f22223x != c8608d.f22223x || this.f22224y != c8608d.f22224y) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m15034f() {
        return this.f22222w;
    }

    /* renamed from: h */
    public final int m15033h() {
        return this.f22223x;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f22222w * 31) + this.f22223x) * 31) + this.f22224y;
    }

    public boolean isEmpty() {
        if (this.f22224y > 0) {
            if (this.f22222w > this.f22223x) {
                return true;
            }
        } else if (this.f22222w < this.f22223x) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final int m15032l() {
        return this.f22224y;
    }

    @Override // java.lang.Iterable
    /* renamed from: o */
    public AbstractC13762g0 mo15031o() {
        return new C8610e(this.f22222w, this.f22223x, this.f22224y);
    }

    public String toString() {
        StringBuilder sb2;
        int i;
        if (this.f22224y > 0) {
            sb2 = new StringBuilder();
            sb2.append(this.f22222w);
            sb2.append("..");
            sb2.append(this.f22223x);
            sb2.append(" step ");
            i = this.f22224y;
        } else {
            sb2 = new StringBuilder();
            sb2.append(this.f22222w);
            sb2.append(" downTo ");
            sb2.append(this.f22223x);
            sb2.append(" step ");
            i = -this.f22224y;
        }
        sb2.append(i);
        return sb2.toString();
    }
}
