package androidx.compose.foundation.gestures;

import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: androidx.compose.foundation.gestures.GestureCancellationException */
/* loaded from: classes.dex */
public final class ForEachGesture extends CancellationException {
    public ForEachGesture() {
        this(null, 1, null);
    }

    public ForEachGesture(String str) {
        super(str);
    }

    public /* synthetic */ ForEachGesture(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
