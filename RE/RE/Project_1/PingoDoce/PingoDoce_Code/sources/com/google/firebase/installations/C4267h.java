package com.google.firebase.installations;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import ma.C7153b;
import ma.InterfaceC7152a;
import p200ka.AbstractC6621d;

/* renamed from: com.google.firebase.installations.h */
/* loaded from: classes.dex */
public final class C4267h {

    /* renamed from: b */
    public static final long f11600b = TimeUnit.HOURS.toSeconds(1);

    /* renamed from: c */
    private static final Pattern f11601c = Pattern.compile("\\AA[\\w-]{38}\\z");

    /* renamed from: d */
    private static C4267h f11602d;

    /* renamed from: a */
    private final InterfaceC7152a f11603a;

    private C4267h(InterfaceC7152a interfaceC7152a) {
        this.f11603a = interfaceC7152a;
    }

    /* renamed from: c */
    public static C4267h m28135c() {
        return m28134d(C7153b.m19083b());
    }

    /* renamed from: d */
    public static C4267h m28134d(InterfaceC7152a interfaceC7152a) {
        if (f11602d == null) {
            f11602d = new C4267h(interfaceC7152a);
        }
        return f11602d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public static boolean m28131g(String str) {
        return f11601c.matcher(str).matches();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public static boolean m28130h(String str) {
        return str.contains(":");
    }

    /* renamed from: a */
    public long m28137a() {
        return this.f11603a.mo19084a();
    }

    /* renamed from: b */
    public long m28136b() {
        return TimeUnit.MILLISECONDS.toSeconds(m28137a());
    }

    /* renamed from: e */
    public long m28133e() {
        return (long) (Math.random() * 1000.0d);
    }

    /* renamed from: f */
    public boolean m28132f(AbstractC6621d abstractC6621d) {
        return TextUtils.isEmpty(abstractC6621d.mo20470b()) || abstractC6621d.mo20464h() + abstractC6621d.mo20469c() < m28136b() + f11600b;
    }
}
