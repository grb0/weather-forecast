package ba.grbo.weatherforecast.ui.composables

import android.content.res.Configuration
import androidx.compose.material.ContentAlpha
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import ba.grbo.weatherforecast.ui.theme.WeatherForecastTheme

@Composable
fun UpButton(
    modifier: Modifier = Modifier,
    isEnabled: Boolean,
    onClick: () -> Unit
) {
    IconButton(
        modifier = modifier,
        onClick = onClick,
    ) {
        Icon(
            imageVector = Icons.Default.ArrowBack,
            contentDescription = "ArrowBack",
            tint = MaterialTheme.colors.onSurface.copy(
                alpha = if (isEnabled) TextFieldDefaults.IconOpacity
                else ContentAlpha.disabled
            )
        )
    }
}

@Preview(
    name = "Light-Enabled",
    showBackground = true
)
@Preview(
    name = "Dark-Enabled",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
private fun UpButtonEnabledPreview() {
    WeatherForecastTheme {
        UpButton(
            isEnabled = true,
            onClick = {}
        )
    }
}

@Preview(
    name = "Light-Disabled",
    showBackground = true
)
@Preview(
    name = "Dark-Disabled",
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
private fun UpButtonDisabledPreview() {
    WeatherForecastTheme {
        UpButton(
            isEnabled = false,
            onClick = {}
        )
    }
}