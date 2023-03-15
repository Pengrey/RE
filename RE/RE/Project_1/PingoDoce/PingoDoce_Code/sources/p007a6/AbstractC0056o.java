package p007a6;

import android.util.Base64;
import com.github.aachartmodel.aainfographics.BuildConfig;
import com.google.auto.value.AutoValue;
import p007a6.C0037d;
import p461y5.EnumC13113d;

@AutoValue
/* renamed from: a6.o */
/* loaded from: classes.dex */
public abstract class AbstractC0056o {

    /* compiled from: TransportContext.java */
    @AutoValue.Builder
    /* renamed from: a6.o$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC0057a {
        /* renamed from: a */
        public abstract AbstractC0056o mo42039a();

        /* renamed from: b */
        public abstract AbstractC0057a mo42038b(String str);

        /* renamed from: c */
        public abstract AbstractC0057a mo42037c(byte[] bArr);

        /* renamed from: d */
        public abstract AbstractC0057a mo42036d(EnumC13113d enumC13113d);
    }

    /* renamed from: a */
    public static AbstractC0057a m42045a() {
        return new C0037d.C0039b().mo42036d(EnumC13113d.DEFAULT);
    }

    /* renamed from: b */
    public abstract String mo42044b();

    /* renamed from: c */
    public abstract byte[] mo42043c();

    /* renamed from: d */
    public abstract EnumC13113d mo42042d();

    /* renamed from: e */
    public boolean m42041e() {
        return mo42043c() != null;
    }

    /* renamed from: f */
    public AbstractC0056o m42040f(EnumC13113d enumC13113d) {
        return m42045a().mo42038b(mo42044b()).mo42036d(enumC13113d).mo42037c(mo42043c()).mo42039a();
    }

    public final String toString() {
        Object[] objArr = new Object[3];
        objArr[0] = mo42044b();
        objArr[1] = mo42042d();
        objArr[2] = mo42043c() == null ? BuildConfig.VERSION_NAME : Base64.encodeToString(mo42043c(), 2);
        return String.format("TransportContext(%s, %s, %s)", objArr);
    }
}
