package com.google.android.play.core.assetpacks;

import com.google.android.play.core.tasks.AbstractC3971j;
import p486z8.C13732a;

/* loaded from: classes.dex */
public class AssetPackException extends AbstractC3971j {
    /* JADX INFO: Access modifiers changed from: package-private */
    public AssetPackException(int i) {
        super(String.format("Asset Pack Download Error(%d): %s", Integer.valueOf(i), C13732a.m544a(i)));
        if (i == 0) {
            throw new IllegalArgumentException("errorCode should not be 0.");
        }
    }
}
