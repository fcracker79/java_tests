package io.mirko.service;

import java.util.*;

public final class HoorayServiceProvider {
    private HoorayServiceProvider() {}

    public static Collection<HoorayService> instances() {
        final List<HoorayService> result = new ArrayList<>();
        ServiceLoader.load(HoorayService.class).forEach(result::add);
        return result;
    }
}
