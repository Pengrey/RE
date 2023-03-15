package p156i8;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;
import p293p8.C8449a;

/* renamed from: i8.d */
/* loaded from: classes.dex */
public interface InterfaceC6050d {

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: i8.d$b */
    /* loaded from: classes.dex */
    public static class C6052b implements TypeEvaluator<C6055e> {

        /* renamed from: b */
        public static final TypeEvaluator<C6055e> f16694b = new C6052b();

        /* renamed from: a */
        private final C6055e f16695a = new C6055e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a */
        public C6055e evaluate(float f, C6055e c6055e, C6055e c6055e2) {
            this.f16695a.m22298a(C8449a.m15388c(c6055e.f16698a, c6055e2.f16698a, f), C8449a.m15388c(c6055e.f16699b, c6055e2.f16699b, f), C8449a.m15388c(c6055e.f16700c, c6055e2.f16700c, f));
            return this.f16695a;
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: i8.d$c */
    /* loaded from: classes.dex */
    public static class C6053c extends Property<InterfaceC6050d, C6055e> {

        /* renamed from: a */
        public static final Property<InterfaceC6050d, C6055e> f16696a = new C6053c("circularReveal");

        private C6053c(String str) {
            super(C6055e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public C6055e get(InterfaceC6050d interfaceC6050d) {
            return interfaceC6050d.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(InterfaceC6050d interfaceC6050d, C6055e c6055e) {
            interfaceC6050d.setRevealInfo(c6055e);
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: i8.d$d */
    /* loaded from: classes.dex */
    public static class C6054d extends Property<InterfaceC6050d, Integer> {

        /* renamed from: a */
        public static final Property<InterfaceC6050d, Integer> f16697a = new C6054d("circularRevealScrimColor");

        private C6054d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a */
        public Integer get(InterfaceC6050d interfaceC6050d) {
            return Integer.valueOf(interfaceC6050d.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b */
        public void set(InterfaceC6050d interfaceC6050d, Integer num) {
            interfaceC6050d.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: i8.d$e */
    /* loaded from: classes.dex */
    public static class C6055e {

        /* renamed from: a */
        public float f16698a;

        /* renamed from: b */
        public float f16699b;

        /* renamed from: c */
        public float f16700c;

        /* renamed from: a */
        public void m22298a(float f, float f2, float f3) {
            this.f16698a = f;
            this.f16699b = f2;
            this.f16700c = f3;
        }

        private C6055e() {
        }

        public C6055e(float f, float f2, float f3) {
            this.f16698a = f;
            this.f16699b = f2;
            this.f16700c = f3;
        }
    }

    /* renamed from: a */
    void mo21123a();

    /* renamed from: b */
    void mo21122b();

    int getCircularRevealScrimColor();

    C6055e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i);

    void setRevealInfo(C6055e c6055e);
}
