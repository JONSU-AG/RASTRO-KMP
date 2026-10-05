package com.jonsuapps.rastro.android.navigation

import org.junit.Assert.*
import org.junit.Test

class RastroAppLinksTest {
    @Test fun profilePublicationAndLegacyLinksReachTheSameDestination() {
        assertEquals("usuario/abc", RastroAppLinks.routeFromUrl("https://rumbo-jonsu.web.app/usuario/abc"))
        assertEquals("usuario/abc?pubId=post%201", RastroAppLinks.routeFromUrl("https://rumbo-jonsu.web.app/usuario/abc?pubId=post%201"))
        assertEquals("usuario/abc?pubId=post1", RastroAppLinks.routeFromUrl("https://rumbo-jonsu.web.app/#/usuario/abc?pubId=post1"))
    }
    @Test fun unrelatedMalformedAndIncompleteLinksCannotNavigate() {
        listOf("https://example.com/usuario/abc", "http://rumbo-jonsu.web.app/usuario/abc",
            "https://rumbo-jonsu.web.app/usuario/", "https://rumbo-jonsu.web.app/usuario/%XX",
            "https://rumbo-jonsu.web.app/admin", "https://rumbo-jonsu.web.app/usuario/abc/extra",
            "https://user@rumbo-jonsu.web.app/usuario/abc").forEach {
                assertNull(it, RastroAppLinks.routeFromUrl(it))
            }
    }
}
