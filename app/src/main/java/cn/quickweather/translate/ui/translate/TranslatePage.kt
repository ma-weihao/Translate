package cn.quickweather.translate.ui.translate

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * Created by maweihao on 6/3/23
 */
@Composable
fun TranslatePage() {
    Surface(
        color = MaterialTheme.colorScheme.background,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            ChooseLanguage()
        }
    }
}

@Composable
private fun ChooseLanguage() {
    Surface(
        color = MaterialTheme.colorScheme.surface,
        modifier = Modifier.fillMaxWidth()
    ) {
        Row {
            LanguageCell(Modifier.weight(1f))
            LanguageCell(Modifier.weight(1f))
        }
    }
}

@Composable
private fun LanguageCell(modifier: Modifier) {
    Surface(modifier = modifier.fillMaxWidth().height(70.dp).padding(horizontal = 8.dp),
        color = MaterialTheme.colorScheme.onSurface,
        shape = RoundedCornerShape(size = 16.dp)
    ) {

    }
}

@Preview(showBackground = true)
@Composable
fun TranslatePagePreview() {
    TranslatePage()
}

