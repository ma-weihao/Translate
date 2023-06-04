package cn.quickweather.translate.ui.translate

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
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
            TranslateResult(Modifier.padding(top = 8.dp))
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
    Surface(
        modifier = modifier.fillMaxWidth().height(70.dp).padding(horizontal = 4.dp),
        color = MaterialTheme.colorScheme.primaryContainer,
        shape = MaterialTheme.shapes.medium
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.fillMaxHeight().weight(1f)
            ) {
                Text("英语-美国", style = MaterialTheme.typography.titleLarge, color = MaterialTheme.colorScheme.onPrimaryContainer)
            }
            Spacer(
                modifier = Modifier.width(1.dp).fillMaxHeight().background(MaterialTheme.colorScheme.surface)
            )
            IconButton(modifier = Modifier.width(35.dp).fillMaxHeight(), onClick = {}) {
                Icon(
                    imageVector = Icons.Filled.ArrowDropDown,
                    contentDescription = "",
                    tint = MaterialTheme.colorScheme.primary
                )
            }
        }
    }
}

@Composable
fun TranslateResult(modifier: Modifier) {
    Surface(
        modifier = modifier.fillMaxWidth().padding(horizontal = 16.dp),
        shape = MaterialTheme.shapes.large,
        color = MaterialTheme.colorScheme.surface
    ) {
        Column {
            Text(
                text = "英语（美国）",
                style = MaterialTheme.typography.titleSmall,
                color = MaterialTheme.colorScheme.onSurface
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun TranslatePagePreview() {
    TranslatePage()
}

