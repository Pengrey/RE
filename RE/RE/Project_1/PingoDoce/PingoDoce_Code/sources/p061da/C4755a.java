package p061da;

import java.lang.annotation.Annotation;
import p061da.InterfaceC4759d;

/* renamed from: da.a */
/* loaded from: classes.dex */
public final class C4755a {

    /* renamed from: a */
    private int f13045a;

    /* renamed from: b */
    private InterfaceC4759d.EnumC4760a f13046b = InterfaceC4759d.EnumC4760a.DEFAULT;

    /* compiled from: AtProtobuf.java */
    /* renamed from: da.a$a */
    /* loaded from: classes.dex */
    private static final class C4756a implements InterfaceC4759d {

        /* renamed from: a */
        private final int f13047a;

        /* renamed from: b */
        private final InterfaceC4759d.EnumC4760a f13048b;

        C4756a(int i, InterfaceC4759d.EnumC4760a enumC4760a) {
            this.f13047a = i;
            this.f13048b = enumC4760a;
        }

        @Override // java.lang.annotation.Annotation
        public Class<? extends Annotation> annotationType() {
            return InterfaceC4759d.class;
        }

        @Override // java.lang.annotation.Annotation
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof InterfaceC4759d) {
                InterfaceC4759d interfaceC4759d = (InterfaceC4759d) obj;
                return this.f13047a == interfaceC4759d.tag() && this.f13048b.equals(interfaceC4759d.intEncoding());
            }
            return false;
        }

        @Override // java.lang.annotation.Annotation
        public int hashCode() {
            return (this.f13047a ^ 14552422) + (this.f13048b.hashCode() ^ 2041407134);
        }

        @Override // p061da.InterfaceC4759d
        public InterfaceC4759d.EnumC4760a intEncoding() {
            return this.f13048b;
        }

        @Override // p061da.InterfaceC4759d
        public int tag() {
            return this.f13047a;
        }

        @Override // java.lang.annotation.Annotation
        public String toString() {
            return "@com.google.firebase.encoders.proto.Protobuf(tag=" + this.f13047a + "intEncoding=" + this.f13048b + ')';
        }
    }

    /* renamed from: b */
    public static C4755a m26692b() {
        return new C4755a();
    }

    /* renamed from: a */
    public InterfaceC4759d m26693a() {
        return new C4756a(this.f13045a, this.f13046b);
    }

    /* renamed from: c */
    public C4755a m26691c(int i) {
        this.f13045a = i;
        return this;
    }
}
