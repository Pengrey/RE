package com.google.android.play.core.assetpacks;

import android.os.ParcelFileDescriptor;
import com.google.android.play.core.tasks.C3963b;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;
import p031b9.InterfaceC1864u;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.play.core.assetpacks.g0 */
/* loaded from: classes.dex */
public final class C3849g0 {

    /* renamed from: a */
    private final InterfaceC1864u<InterfaceC3833c3> f10959a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3849g0(InterfaceC1864u<InterfaceC3833c3> interfaceC1864u) {
        this.f10959a = interfaceC1864u;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final InputStream m28746a(int i, String str, String str2, int i2) {
        try {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) C3963b.m28512e(this.f10959a.m35248c().mo28655E(i, str, str2, i2));
            if (parcelFileDescriptor == null || parcelFileDescriptor.getFileDescriptor() == null) {
                throw new C3893r0(String.format("Corrupted ParcelFileDescriptor, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i), str, str2, Integer.valueOf(i2)), i);
            }
            return new ParcelFileDescriptor.AutoCloseInputStream(parcelFileDescriptor);
        } catch (InterruptedException e) {
            throw new C3893r0("Extractor was interrupted while waiting for chunk file.", e, i);
        } catch (ExecutionException e2) {
            throw new C3893r0(String.format("Error opening chunk file, session %s packName %s sliceId %s, chunkNumber %s", Integer.valueOf(i), str, str2, Integer.valueOf(i2)), e2, i);
        }
    }
}
