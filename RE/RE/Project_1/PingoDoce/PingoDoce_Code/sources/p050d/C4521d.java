package p050d;

import android.content.Context;
import android.content.Intent;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p181jd.Intrinsics;

/* compiled from: ActivityResultContracts.kt */
/* renamed from: d.d */
/* loaded from: classes.dex */
public final class C4521d extends ActivityResultContract {

    /* compiled from: ActivityResultContracts.kt */
    /* renamed from: d.d$a */
    /* loaded from: classes.dex */
    public static final class C4522a {
        private C4522a() {
        }

        public /* synthetic */ C4522a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new C4522a(null);
    }

    /* renamed from: d */
    public Intent mo37402d(Context context, IntentSenderRequest intentSenderRequest) {
        Intrinsics.isThisObjectNull(context, "context");
        Intrinsics.isThisObjectNull(intentSenderRequest, "input");
        Intent putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
        Intrinsics.checkIfNull(putExtra, "Intent(ACTION_INTENT_SEN…NT_SENDER_REQUEST, input)");
        return putExtra;
    }

    /* renamed from: e */
    public ActivityResult mo37401e(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
