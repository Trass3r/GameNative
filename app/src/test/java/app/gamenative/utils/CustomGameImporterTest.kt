package app.gamenative.utils

import org.junit.Assert.assertEquals
import org.junit.Test

class CustomGameImporterTest {
    @Test
    fun resolveImportRoot_usesExternalManagedForDefaultDestination() {
        val root = CustomGameImporter.resolveImportRoot(
            destination = CustomGameImporter.Destination.EXTERNAL_MANAGED,
            externalManagedRoot = "/external/CustomGames",
            internalRoot = "/internal/CustomGames",
        )

        assertEquals("/external/CustomGames", root)
    }

    @Test
    fun resolveImportRoot_usesInternalForInternalDestination() {
        val root = CustomGameImporter.resolveImportRoot(
            destination = CustomGameImporter.Destination.INTERNAL_PRIVATE,
            externalManagedRoot = "/external/CustomGames",
            internalRoot = "/internal/CustomGames",
        )

        assertEquals("/internal/CustomGames", root)
    }
}
