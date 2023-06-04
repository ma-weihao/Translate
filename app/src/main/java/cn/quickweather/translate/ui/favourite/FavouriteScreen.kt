package cn.quickweather.translate.ui.favourite

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import cn.quickweather.translate.R

/**
 * Created by maweihao on 6/4/23
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FavouritePage() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { stringResource(R.string.title_favourite) },
            )
        }
    ) { _ ->

    }
}

@Preview(showBackground = true)
@Composable
fun FavouritePagePreview() {
    FavouritePage()
}