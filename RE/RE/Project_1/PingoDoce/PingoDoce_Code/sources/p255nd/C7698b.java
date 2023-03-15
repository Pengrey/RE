package p255nd;

import java.util.Random;
import p181jd.Intrinsics;

/* renamed from: nd.b */
/* loaded from: classes2.dex */
public final class C7698b extends AbstractC7697a {

    /* renamed from: y */
    private final C7699a f20298y = new C7699a();

    /* compiled from: PlatformRandom.kt */
    /* renamed from: nd.b$a */
    /* loaded from: classes2.dex */
    public static final class C7699a extends ThreadLocal {
        C7699a() {
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* renamed from: a */
        public Random initialValue() {
            return new Random();
        }
    }

    /* renamed from: c */
    public Random mo17678c() {
        Object obj = this.f20298y.get();
        Intrinsics.checkIfNull(obj, "implStorage.get()");
        return (Random) obj;
    }
}
