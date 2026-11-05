package com.jonsuapps.rastro.web

import androidx.compose.ui.ExperimentalComposeUiApi
import androidx.compose.ui.window.ComposeViewport

@OptIn(ExperimentalComposeUiApi::class)
fun main() { ComposeViewport(viewportContainerId = "webApp") { RastroWebPilot() } }
