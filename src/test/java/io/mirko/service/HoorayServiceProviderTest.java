package io.mirko.service;

import org.junit.Test;

import java.util.Collection;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class HoorayServiceProviderTest {
    @Test
    public void getServices() {
        final Map<Class, String> expected = Map.of(
                HelloHoorayService.class, "Hello!",
                HolaHoorayService.class, "Hola!",
                CiaoHoorayService.class, "Ciao!"
        );
        final Collection<HoorayService> services = HoorayServiceProvider.instances();
        assertEquals(3, services.size());
        services.forEach(hoorayService -> assertEquals(expected.get(hoorayService.getClass()), hoorayService.hooray()));
    }
}
