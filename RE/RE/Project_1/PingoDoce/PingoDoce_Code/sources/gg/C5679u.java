package gg;

import com.squareup.moshi.C4516s;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p142hg.ValueLocalDataProvider;
import p181jd.Intrinsics;
import pt.pingodoce.app.data.remote.models.response.Store;

/* renamed from: gg.u */
/* loaded from: classes2.dex */
public final class C5679u extends ValueLocalDataProvider {

    /* compiled from: StoresLocalDataProvider.kt */
    /* renamed from: gg.u$a */
    /* loaded from: classes2.dex */
    public static final class C5680a {
        private C5680a() {
        }

        public /* synthetic */ C5680a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C5680a(null);
    }

    /* renamed from: p */
    public String mo23352p() {
        return "KEY_FOR_STORE_LIST";
    }

    /* renamed from: w */
    protected Type mo23350w() {
        ParameterizedType m27327j = C4516s.m27327j(List.class, Store.class);
        Intrinsics.checkIfNull(m27327j, "newParameterizedType(\n  …ore::class.java\n        )");
        return m27327j;
    }
}
