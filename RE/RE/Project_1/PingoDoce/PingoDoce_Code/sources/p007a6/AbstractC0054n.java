package p007a6;

import com.google.auto.value.AutoValue;
import p007a6.C0034c;
import p461y5.AbstractC13112c;
import p461y5.C13111b;
import p461y5.InterfaceC13114e;

/* JADX INFO: Access modifiers changed from: package-private */
@AutoValue
/* renamed from: a6.n */
/* loaded from: classes.dex */
public abstract class AbstractC0054n {

    /* compiled from: SendRequest.java */
    @AutoValue.Builder
    /* renamed from: a6.n$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0055a {
        /* renamed from: a */
        public abstract AbstractC0054n mo42051a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: b */
        public abstract AbstractC0055a mo42050b(C13111b c13111b);

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: c */
        public abstract AbstractC0055a mo42049c(AbstractC13112c<?> abstractC13112c);

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: d */
        public abstract AbstractC0055a mo42048d(InterfaceC13114e<?, byte[]> interfaceC13114e);

        /* renamed from: e */
        public abstract AbstractC0055a mo42047e(AbstractC0056o abstractC0056o);

        /* renamed from: f */
        public abstract AbstractC0055a mo42046f(String str);
    }

    /* renamed from: a */
    public static AbstractC0055a m42058a() {
        return new C0034c.C0036b();
    }

    /* renamed from: b */
    public abstract C13111b mo42057b();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public abstract AbstractC13112c<?> mo42056c();

    /* renamed from: d */
    public byte[] m42055d() {
        return mo42054e().mo1578a(mo42056c().mo1582b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public abstract InterfaceC13114e<?, byte[]> mo42054e();

    /* renamed from: f */
    public abstract AbstractC0056o mo42053f();

    /* renamed from: g */
    public abstract String mo42052g();
}
