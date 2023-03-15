package p050d;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: ActivityResultContracts.kt */
/* renamed from: d.c */
/* loaded from: classes.dex */
public final class C4519c extends ActivityResultContract {

    /* compiled from: ActivityResultContracts.kt */
    /* renamed from: d.c$a */
    /* loaded from: classes.dex */
    public static final class C4520a {
        private C4520a() {
        }

        public /* synthetic */ C4520a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C4520a(null);
    }

    /* renamed from: d */
    public Intent mo37402d(Context context, Intent intent) {
        Intrinsics.isThisObjectNull(context, "context");
        Intrinsics.isThisObjectNull(intent, "input");
        return intent;
    }

    /* renamed from: e */
    public ActivityResult mo37401e(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
