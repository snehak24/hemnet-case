object Compose {
     const val composeVersion = "1.3.0"
     const val composeCompilerVersion = "1.3.0"
    const val material = "androidx.compose.material:material:$composeVersion"
    const val ui = "androidx.compose.ui:ui:$composeVersion"
    const val uiToolingPreview = "androidx.compose.ui:ui-tooling-preview:$composeVersion"
    const val runtime = "androidx.compose.runtime:runtime:$composeVersion"
    const val compiler = "androidx.compose.compiler:compiler:$composeCompilerVersion"

    private const val hiltNavigationComposeVersion = "1.0.0"
    const val hiltNavigationCompose = "androidx.hilt:hilt-navigation-compose:$hiltNavigationComposeVersion"

    private const val activityComposeVersion = "1.6.1"
    const val activityCompose = "androidx.activity:activity-compose:$activityComposeVersion"

    private const val lifecycleVersion = "2.6.0-alpha03"
    const val viewModelCompose = "androidx.lifecycle:lifecycle-viewmodel-compose:$lifecycleVersion"
}