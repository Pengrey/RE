package androidx.compose.p018ui.input.pointer;

import java.util.concurrent.CancellationException;

/* renamed from: androidx.compose.ui.input.pointer.PointerEventTimeoutCancellationException */
/* loaded from: classes.dex */
public final class SuspendingPointerInputFilter extends CancellationException {
    public SuspendingPointerInputFilter(long j) {
        super("Timed out waiting for " + j + " ms");
    }
}
