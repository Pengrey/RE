package p483z5;

import com.google.auto.value.AutoValue;
import p483z5.C13670e;

@AutoValue
/* renamed from: z5.k */
/* loaded from: classes.dex */
public abstract class AbstractC13684k {

    /* compiled from: ClientInfo.java */
    @AutoValue.Builder
    /* renamed from: z5.k$a */
    /* loaded from: classes.dex */
    public static abstract class AbstractC13685a {
        /* renamed from: a */
        public abstract AbstractC13684k mo628a();

        /* renamed from: b */
        public abstract AbstractC13685a mo627b(AbstractC13657a abstractC13657a);

        /* renamed from: c */
        public abstract AbstractC13685a mo626c(EnumC13686b enumC13686b);
    }

    /* compiled from: ClientInfo.java */
    /* renamed from: z5.k$b */
    /* loaded from: classes.dex */
    public enum EnumC13686b {
        UNKNOWN(0),
        ANDROID_FIREBASE(23);
        
        private final int value;

        EnumC13686b(int i) {
            this.value = i;
        }
    }

    /* renamed from: a */
    public static AbstractC13685a m631a() {
        return new C13670e.C13672b();
    }

    /* renamed from: b */
    public abstract AbstractC13657a mo630b();

    /* renamed from: c */
    public abstract EnumC13686b mo629c();
}
