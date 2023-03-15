package com.google.android.gms.internal.measurement;

import java.lang.reflect.Field;
import sun.misc.Unsafe;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.0 */
/* renamed from: com.google.android.gms.internal.measurement.ab */
/* loaded from: classes.dex */
public abstract class AbstractC2687ab {

    /* renamed from: a */
    final Unsafe f7647a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AbstractC2687ab(Unsafe unsafe) {
        this.f7647a = unsafe;
    }

    /* renamed from: a */
    public abstract double mo31649a(Object obj, long j);

    /* renamed from: b */
    public abstract float mo31648b(Object obj, long j);

    /* renamed from: c */
    public abstract void mo31647c(Object obj, long j, boolean z);

    /* renamed from: d */
    public abstract void mo31646d(Object obj, long j, byte b);

    /* renamed from: e */
    public abstract void mo31645e(Object obj, long j, double d);

    /* renamed from: f */
    public abstract void mo31644f(Object obj, long j, float f);

    /* renamed from: g */
    public abstract boolean mo31643g(Object obj, long j);

    /* renamed from: h */
    public final int m32913h(Class cls) {
        return this.f7647a.arrayBaseOffset(cls);
    }

    /* renamed from: i */
    public final int m32912i(Class cls) {
        return this.f7647a.arrayIndexScale(cls);
    }

    /* renamed from: j */
    public final int m32911j(Object obj, long j) {
        return this.f7647a.getInt(obj, j);
    }

    /* renamed from: k */
    public final long m32910k(Object obj, long j) {
        return this.f7647a.getLong(obj, j);
    }

    /* renamed from: l */
    public final long m32909l(Field field) {
        return this.f7647a.objectFieldOffset(field);
    }

    /* renamed from: m */
    public final Object m32908m(Object obj, long j) {
        return this.f7647a.getObject(obj, j);
    }

    /* renamed from: n */
    public final void m32907n(Object obj, long j, int i) {
        this.f7647a.putInt(obj, j, i);
    }

    /* renamed from: o */
    public final void m32906o(Object obj, long j, long j2) {
        this.f7647a.putLong(obj, j, j2);
    }

    /* renamed from: p */
    public final void m32905p(Object obj, long j, Object obj2) {
        this.f7647a.putObject(obj, j, obj2);
    }
}
