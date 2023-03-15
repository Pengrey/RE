package androidx.core.p020os;

import androidx.core.util.C1070c;

/* renamed from: androidx.core.os.OperationCanceledException */
/* loaded from: classes.dex */
public class OperationCanceledException extends RuntimeException {
    public OperationCanceledException() {
        this(null);
    }

    public OperationCanceledException(String str) {
        super(C1070c.m38630e(str, "The operation has been canceled."));
    }
}
