package cn.quickweather.translate.ui.preview

import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.scrollable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.outlined.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Devices.AUTOMOTIVE_1024p
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


/**
 * Created by maweihao on 6/3/23
 */
@Composable
fun FullScreenPreviewPage(

) {

    FullScreenPreviewContent(Modifier.fillMaxSize(), "What's up!")
}

@Composable
fun FullScreenPreviewContent(modifier: Modifier, previewContext: String) {
    Box(
        modifier = modifier.background(MaterialTheme.colorScheme.secondary)
    ) {
        IconButton(onClick = {}, modifier = Modifier.padding(start = 16.dp, top = 16.dp)) {
            Icon(
                imageVector = Icons.Outlined.Close,
                contentDescription = "",
                tint = MaterialTheme.colorScheme.onSecondary.copy(alpha = 0.3f),
                modifier = Modifier.size(48.dp)
            )
        }
        Column(
            modifier = Modifier.fillMaxWidth().padding(horizontal = 72.dp, vertical = 64.dp)
                .verticalScroll(rememberScrollState())
        ) {
            Text(
                text = previewContext,
                style = MaterialTheme.typography.displayLarge,
                color = MaterialTheme.colorScheme.onSecondary,
                modifier = Modifier.fillMaxWidth()
            )
        }
    }
}

@Preview(
    showBackground = true,
    device = AUTOMOTIVE_1024p,
    widthDp = 720,
    heightDp = 360
)
@Composable
fun FullScreenPreview() {
    val landscapeConfig = LocalConfiguration.current.apply {
        orientation = Configuration.ORIENTATION_LANDSCAPE
    }
    CompositionLocalProvider(LocalConfiguration provides landscapeConfig) {
        FullScreenPreviewPage()
    }
}