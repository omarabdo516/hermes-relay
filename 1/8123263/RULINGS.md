Keep the supplied kitchen branch and commit locally; do not fetch, push, open a PR, or access GitHub.
Use the current repository's Markdown renderer version, 0.46.0, without changing dependency versions.
Determine each prose block's direction from its first Unicode strong character, defaulting neutral content to left-to-right independently of device locale.
Keep the app layout unchanged; apply direction and alignment only to message text, individual list items, and composer paragraphs.
Use left-to-right code surfaces and Unicode isolation for inline code.
Keep the fork-only .rtl debug application ID suffix in a separate final commit so preceding RTL commits can be submitted upstream unchanged.
Use existing Compose/Robolectric rendering tests for visual evidence if dependency resolution permits; no static reference directory was supplied.
Include plain user/system message text because that chat path bypasses the Markdown renderer.
Run verification with a writable SDK under /unit/cache/android-sdk; keep local.properties untracked.
Preserve existing English-only bubble widths in LTR layouts; expand text blocks that need alignment at the opposite edge.
Use synthetic English and Egyptian Arabic fixtures at an English-locale 360 by 800 dp API 36 viewport for screenshot evidence.
Propagate the composer decoration box minimum width to its inner editor so short Arabic drafts align to the editor right edge.
Resolve list marker punctuation and trailing space in each item layout direction.
Preserve inline code newline normalization and existing task-list/nested-list behavior when adding bidi isolation and item direction.
Keep pre-existing asynchronous Android test fixture corrections in a separate commit from the upstream RTL implementation.
Test Fetch and Pull independently so the second action does not race the first action's asynchronous refresh and in-flight guard.
Await fully hydrated profile objects, synchronize cross-thread fixture captures, and poll fresh persisted reads for the asynchronous draft clear.
Wait for the gallery pager label before asserting saved-state restoration.
Apply .rtl only to the fork debug build type: sideload debug uses com.axiomlabs.hermesrelay.sideload.rtl and Google Play debug uses com.axiomlabs.hermesrelay.rtl; release identities remain unchanged.
Provide local branch fix/android-chat-rtl at the RTL and fixture-repair commits; keep the .rtl packaging change only on the supplied Kitchen branch.
The English conversation before/after renders differ in 0 of 1,152,000 pixels; the viewport is 720 by 1600 physical pixels at xhdpi.
The final sideload unit suite reports 3,517 tests, 0 failures, 0 errors, and 12 existing skips; all 18 added direction and screenshot tests pass.
The packaged sideload debug APK is 208,269,561 bytes, targets SDK 36, supports SDK 26+, includes all four existing ABIs, and verifies with APK Signature Scheme v2.
Derive list marker direction from the first strong character across its own rendered prose blocks, including headings; ignore nested items and code blocks and skip neutral prefixes.
Retain the existing 15 sp prose size, 21 sp line height and 13 sp code font; change direction and alignment without restyling the app.
Save the local install artifact as hermes-relay-rtl-sideload-debug.apk with a separate SHA-256 checksum file.
Keep the round-1 no-push, no-PR and no-GitHub build restrictions; remote PR and CI findings cannot be closed by local evidence.
Use one disposable API 36 AOSP x86_64 Pixel 6 emulator with software acceleration for the side-by-side installation check; no physical device is attached.
Build both baseline debug flavors from unchanged commit 2e5c2bc8 for package identity coexistence; label them source-built baselines rather than official signed releases.
Require both baseline packages before installing the additional APK, install without replacement, and verify both baseline paths remain unchanged.
Keep the coexistence verification script and documentation on the local packaging branch, separate from the upstream RTL branch.
Add a fork-only workflow for kitchen branch pushes that runs the three Charter Gradle gates strictly and attaches the sideload APK, checksum and exact source commit only after success; do not dispatch or publish it in this local-only session.
Serialize baseline Kotlin compilation and emulator execution on the 8 GiB host after observing near-limit memory usage.
Sign the unchanged-source baseline APKs with a separate disposable test certificate from the RTL APK so emulator installation also checks cross-signature permission ownership conflicts.
Require an explicit expected package ID in the coexistence checker and reject an unexpected APK before contacting ADB.
Set watchdog_timeout_millis to 600000 on the disposable API 36 software emulator after the default system watchdog restarted slow first-boot system services; this changes only the test device configuration.
Use Android 16 global key system_server_watchdog_timeout_ms=600000, remove the unused watchdog_timeout_millis key, and stop goldfish-logcat diagnostic serial streaming after repeated slow-boot watchdog restarts.
Restart only the emulator-readiness monitor after correcting test-device settings; preserve its initial setup log and keep the same API 36 virtual device.
Use an API 30 AOSP x86_64 Pixel 2 fallback for installation-only evidence after repeated API 36 host system-server restarts before any Relay APK was installed; retain API 36 rendering tests and failed host-lane logs.
Keep a standard JDB connection attached to the disposable API 30 system_server during package installation after its fixed 60-second watchdog reset slow software emulation; use this lane only to attempt package coexistence verification without a performance or stock-device runtime claim.
Stop installation lanes after repeated platform watchdog resets and loss of the Android package service on the software-only host; retain device_install_verified=false and all failure logs.
Record three passing pre-install rejection checks; leave successful installation and the already-installed additional-app guard unverified.
The final three-gate local Gradle invocation exits 0 in 38 seconds with 1 task executed and 95 up to date; prior passing Android test and lint outputs are reused.
Native ADB shell responds in 2.7 seconds while Package Manager reports its service absent; keep the runtime installation finding open and stop the emulators.
Round 2 retains the explicit prohibition on pushes, pull requests and GitHub access; remote findings remain open.
Use manifest-faithful installation stand-ins allowed by the round-2 finding, matching baseline package IDs, shared user IDs, declared permissions and provider identities, with three distinct signing certificates.
Use a single-core low-resolution API 26 emulator for installation-only verification after higher-API software emulators repeatedly lost their package service; retain API 36 rendering evidence.
Install the unchanged delivered RTL APK; synthetic fixtures replace only the two baseline apps and do not establish baseline application behavior.
Both compiled baseline fixture manifests match the unchanged-source install identities; each fixture is 12689 bytes, and all three APK signer certificate SHA-256 digests differ.
Document the manifest and signing audit required for baseline stand-ins; retain fixture provenance outside the repository with installation evidence.
The local static reference directory is absent; reinspection of retained Arabic, English and mixed before/after comparisons shows only the intended text-direction changes.
The unchanged delivered APK installs successfully without replacement on API 26 beside both audited baseline stand-ins; all three package IDs coexist and both baseline paths remain unchanged.
The coexistence checker completes in 303.84 seconds including all metadata and path checks; its successful ADB install command exits 0 and reports Success.
A second checker invocation rejects the already-installed additional package before issuing an install command.
Close the round-2 major finding under its explicit reliable-stand-in allowance; retain physical-device and official-release-signature verification as false.
Stop the successful installation emulator before rerunning the Charter Gradle gates on the shared host.
The round-2 three-gate Gradle command exits 0 in 30 seconds with 4 tasks executed and 92 up to date; reused reports contain 3517 tests, zero failures/errors, 12 existing skips and zero lint errors/fatals.
Commit the baseline-audit documentation locally as fc5004b9cb3f5419a68780288791613e263e6d80; leave the source-only upstream branch at 53cb6b66.
Round 3 retains the explicit no-push, no-PR and no-GitHub build rules; the two publication findings cannot be closed locally.
Remove the unrelated asynchronous fixture commit from the source-only RTL branch and keep it on a separate local test-fixture branch; retain tested fixture corrections on the fork packaging branch.
Preserve existing commits on the packaging branch while updating only the local upstream contribution ref and its exported patch.
Verify the exact source-only RTL branch with its 18 focused direction tests, and rerun the three Charter gates on the packaging branch; distinguish both results in the PR draft.
Document separate commit provenance for contribution checks and packaging-tree full-suite results; audit unrelated fixture repairs and packaging overrides independently.
Use the cached approved upstream base because the active build rules prohibit fetching GitHub; do not claim the base was refreshed remotely.
The clean RTL contribution is 5d6a5ff43c2b7f3b887fb6e1deed0be1cd6408ac with exactly eight relevant files; fixture-only branch adf80883 contains the three unrelated test repairs.
All 18 focused tests run and pass on the exact clean contribution in 4 minutes 1 second, with zero failures, errors or skips.
All four fresh contribution screenshots match the retained corrected images exactly: zero changed pixels in each 1152000-pixel frame.
The round-3 packaging-tree three-gate Gradle command exits 0 in 7 seconds, with 4 tasks executed and 92 up to date; reused results contain 3517 tests, zero failures/errors, 12 existing skips and zero lint errors/fatals.
Commit contribution-verification provenance guidance locally as 15f9f006ad1b19af765d5e00aa6b6b3f8c40f8a2; retain both remote publication findings as blocked and the source-scope finding as resolved in the prepared submission.
Round 4 retains the explicit no-push, no-PR and no-GitHub build rules; both publication findings require prohibited remote actions and remain open.
Keep the tested RTL source and fork-only workflow unchanged; clarify the hosted publication evidence required to close the two blockers in a later authorized session.
The round-4 Charter Gradle gates exit 0 in 19.7 seconds, with 5 tasks executed and 91 up to date; reused outputs contain 3517 tests, zero failures/errors, 12 skips and zero lint errors/fatals.
Reinspect all four retained before/after screenshot pairs; current retained build frames match the corrected images in all 1152000 pixels per frame, with no fresh rendering or supplied static reference claimed.
Retain the previously installed APK and its original checksum; record the regenerated assembly separately without extending installation proof to a different binary.
Commit hosted-delivery evidence guidance locally as 51d774b1de07f278354e2099bc1a10cfc5ba9dd7; retain both round-4 blocking publication findings and the minor official-app/physical-phone limitation as unresolved.

- Fix round: preserve the existing RTL implementation because the merge gate did not identify a source defect.
- Rebase against the locally available origin/dev ref 2e5c2bc81c66f951d7c58b58b82f6fd9284c92b3; remote refresh is excluded by the no-GitHub rule.
- Commit the verified test synchronization fix as the new revision for Kitchen to publish and rerun its unidentified gate.
- Compare retained before/after renders because /control/reference is absent; those images are not fresh device verification.
- Wait for the separately published reasoning identity in the Gateway test before asserting its complete value.
- Use a writable SDK copy for verification after the system SDK rejected component installation.
- Full sideload unit rerun: 3,501 tests, zero failures or errors, 12 skipped; assembly and lint passed separately.
- Select the existing writable Android SDK through ignored local.properties so the unchanged proof command works with the supplied read-only ANDROID_HOME.
- Document the general read-only SDK remedy without committing a machine-specific path.
- The exact unit command and combined unit, debug assembly and lint command pass using reused Gradle outputs; the previous full suite executed 3,501 tests with zero failures and 12 skips.
- Reuse the previously inspected visual comparisons because this fix changes only build setup documentation and no static reference was supplied.
- Propagate the composer's minimum width to its inner editor and compare Arabic line position with the editor semantics width.
- Resolve list marker text direction from each item's layout direction so the marker's trailing space appears between marker and prose.
- Preserve unrelated production, test-fixture and SDK documentation changes on local branch kitchen/rtl-separated-fixtures; restore those paths to origin/dev on the RTL branch.
- Include the synthetic screenshot fixture in the RTL branch and render the baseline from origin/dev with that same fixture.
- Fresh baseline and revised screenshots use API 36, English locale and 360 by 800 dp; the English pair differs in zero of 1,152,000 pixels.
- The full RTL-tree sideload suite ran 3,504 tests with four failures and 12 skips in the separated gallery, profile and Git fixtures; three of those failures repeated in a focused rerun.
- The revised tree passed its focused direction and screenshot tests, debug assembly and lint; do not claim a passing full suite.
- Restore asynchronous fixture repairs in a separate test-only commit so the full proof gate runs with stable synchronization while the RTL implementation remains independently reviewable.
- Poll fresh persisted draft reads and use thread-safe callback capture instead of changing the production profile controller API.
- Wait for the first approval response by request ID before asserting that no second response exists.
- The full sideload suite executed 3,504 tests with zero failures or errors and 12 skips; debug assembly and lint passed separately.
- Reinspect retained before-and-after renders because this round changes test fixtures only and no static reference is available.
