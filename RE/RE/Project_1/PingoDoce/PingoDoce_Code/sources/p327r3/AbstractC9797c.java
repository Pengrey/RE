package p327r3;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: r3.c */
/* loaded from: classes.dex */
public abstract class AbstractC9797c {

    /* compiled from: Dimension.kt */
    /* renamed from: r3.c$a */
    /* loaded from: classes.dex */
    public static final class C9798a extends AbstractC9797c {

        /* renamed from: a */
        public final int f25738a;

        public C9798a(int i) {
            super(null);
            this.f25738a = i;
            if (!(i > 0)) {
                throw new IllegalArgumentException("px must be > 0.".toString());
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C9798a) && this.f25738a == ((C9798a) obj).f25738a;
        }

        public int hashCode() {
            return this.f25738a;
        }

        public String toString() {
            return String.valueOf(this.f25738a);
        }
    }

    /* compiled from: Dimension.kt */
    /* renamed from: r3.c$b */
    /* loaded from: classes.dex */
    public static final class C9799b extends AbstractC9797c {

        /* renamed from: a */
        public static final C9799b f25739a = new C9799b();

        private C9799b() {
            super(null);
        }

        public String toString() {
            return "Dimension.Undefined";
        }
    }

    private AbstractC9797c() {
    }

    public /* synthetic */ AbstractC9797c(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
