package com.google.firebase.components;

import java.util.Arrays;
import java.util.List;
import p177j9.C6378d;

/* loaded from: classes.dex */
public class DependencyCycleException extends DependencyException {

    /* renamed from: w */
    private final List<C6378d<?>> f11414w;

    public DependencyCycleException(List<C6378d<?>> list) {
        super("Dependency cycle detected: " + Arrays.toString(list.toArray()));
        this.f11414w = list;
    }
}
