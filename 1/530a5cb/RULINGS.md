Use Unicode first-strong direction with a left-to-right fallback for neutral-only text.
Keep the fork package suffix on the sideload flavor as `.sideload.rtl` in one Gradle line.
Use content-based paragraph direction and start alignment without mirroring the app layout.
Place each Markdown list marker on the leading side of its own item, including nested items.
Isolate inline code left-to-right with Unicode directional isolates while retaining Markdown code styling.
Expand Markdown paragraphs to the available bubble width when the message contains RTL text, preserving English-only bubble sizing.
Use the writable local Android SDK and installed JDK 21 for local Gradle verification.
Verify mixed Arabic and English paragraphs and list items with rendered text layout in both Markdown renderers.
Use the current streaming input to choose paragraph width before the incremental parser publishes its snapshot.
Wait for asynchronous Markdown parsing before asserting rendered text layout.
Wait for the completed Fetch detail refresh before issuing Pull in the Git endpoint test.
Recycle Android unit-test JVMs after 25 classes to bound Robolectric and Compose state while running the complete suite.
Wait for each gallery image load to settle before testing viewer interaction and restoration.
Retain the existing test JVM policy; explicit synchronization addresses the reproduced races.
Join each profile test controller scope before clearing its shared lock and session stores.
Expose completion of the existing asynchronous fresh-draft clear so tests can await and verify its result.
Wait for complete profile metadata before asserting the resolved server-default profile.
Expand RTL-message headings, including both Setext levels, to the bubble width while preserving heading semantics and English sizing.
Check composer typing, code direction, and every Markdown heading level using rendered Compose text layouts.
Use Maven Central for Robolectric dependency resolution during local verification.
Refresh passing test evidence from the complete suite and omit machine identifiers and captured process output.
Rebase the existing fix onto the available origin/dev without changing the preserved commits.
Verify fork and Play package IDs from the assembled debug APK manifests.
Configure the ignored local.properties to select the writable SDK for unmodified Gradle commands.
Record local verification in an empty commit; keep machine-specific SDK paths out of tracked files.
