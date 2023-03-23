package com.google.crypto.tink.proto;

import com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder;

/* loaded from: classes.dex */
public interface AesCmacKeyFormatOrBuilder extends MessageLiteOrBuilder {
    int getKeySize();

    AesCmacParams getParams();

    boolean hasParams();
}