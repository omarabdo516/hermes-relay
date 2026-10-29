package com.hermesandroid.relay.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.semantics.SemanticsActions
import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onAllNodesWithText
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performSemanticsAction
import androidx.compose.ui.text.TextLayoutResult
import androidx.compose.ui.text.style.ResolvedTextDirection
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.annotation.Config
import org.robolectric.annotation.GraphicsMode

@RunWith(AndroidJUnit4::class)
@GraphicsMode(GraphicsMode.Mode.NATIVE)
@Config(qualifiers = "w400dp-h800dp-xhdpi")
class MarkdownDirectionTest {
    @get:Rule val compose = createComposeRule()

    @Test
    fun mixedParagraphsAndListItemsFollowTheirOwnTextInBothRenderers() {
        val streaming = mutableStateOf(false)
        val content = "مرحبا بالعالم\n\nHello world\n\n- عنصر عربي\n- English item"
        compose.setContent {
            // Exercise the neutral fallback independently of the device layout direction.
            CompositionLocalProvider(LocalLayoutDirection provides LayoutDirection.Rtl) {
                MaterialTheme {
                    Column(Modifier.width(300.dp)) {
                        if (streaming.value) {
                            StreamingMarkdownContent(content, Color.Black)
                        } else {
                            MarkdownContent(content, Color.Black)
                        }
                    }
                }
            }
        }

        repeat(2) { pass ->
            if (pass == 1) compose.runOnIdle { streaming.value = true }
            compose.waitForIdle()
            assertDirection("مرحبا بالعالم", ResolvedTextDirection.Rtl)
            assertDirection("Hello world", ResolvedTextDirection.Ltr)
            assertDirection("عنصر عربي", ResolvedTextDirection.Rtl)
            assertDirection("English item", ResolvedTextDirection.Ltr)
        }
    }

    private fun assertDirection(text: String, direction: ResolvedTextDirection) {
        compose.waitUntil(timeoutMillis = 10_000) {
            compose.onAllNodesWithText(text, useUnmergedTree = true).fetchSemanticsNodes().isNotEmpty()
        }
        val layouts = mutableListOf<TextLayoutResult>()
        compose.onNodeWithText(text, useUnmergedTree = true)
            .performSemanticsAction(SemanticsActions.GetTextLayoutResult) { it(layouts) }
        val layout = layouts.single()
        assertEquals(text, direction, layout.getParagraphDirection(0))
        if (direction == ResolvedTextDirection.Rtl) {
            assertEquals(text, layout.size.width.toFloat(), layout.getLineRight(0), 1f)
        } else {
            assertEquals(text, 0f, layout.getLineLeft(0), 1f)
        }
    }
}
