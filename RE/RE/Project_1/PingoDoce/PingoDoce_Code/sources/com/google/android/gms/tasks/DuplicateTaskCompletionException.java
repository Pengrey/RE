package com.google.android.gms.tasks;

/* compiled from: com.google.android.gms:play-services-tasks@@18.0.1 */
/* loaded from: classes.dex */
public final class DuplicateTaskCompletionException extends IllegalStateException {
    private DuplicateTaskCompletionException(String str, Throwable th2) {
        super(str, th2);
    }

    /* renamed from: a */
    public static IllegalStateException m30807a(AbstractC3419d<?> abstractC3419d) {
        String str;
        if (!abstractC3419d.mo30781o()) {
            return new IllegalStateException("DuplicateTaskCompletionException can only be created from completed Task.");
        }
        Exception mo30785k = abstractC3419d.mo30785k();
        if (mo30785k != null) {
            str = "failure";
        } else if (abstractC3419d.mo30780p()) {
            str = "result ".concat(String.valueOf(abstractC3419d.mo30784l()));
        } else {
            str = abstractC3419d.mo30782n() ? "cancellation" : "unknown issue";
        }
        return new DuplicateTaskCompletionException(str.length() != 0 ? "Complete with: ".concat(str) : new String("Complete with: "), mo30785k);
    }
}
