package com.homebody.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomSheetDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.SheetState
import androidx.compose.material3.SheetValue
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.homebody.R
import com.homebody.ui.theme.bottomSheetBackgroundColors
import com.homebody.ui.theme.roundedTopBorder
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CustomBottomSheet(
    modifier: Modifier = Modifier,
    sheetState: SheetState = rememberModalBottomSheetState(skipPartiallyExpanded = true),
    containerColor: Color = MaterialTheme.colorScheme.bottomSheetBackgroundColors,
    scrimColor: Color = BottomSheetDefaults.ScrimColor,
    shape: Shape = MaterialTheme.shapes.roundedTopBorder,
    onDismissAction: () -> Unit = {},
    content: @Composable () -> Unit
) {
    val scope = rememberCoroutineScope()
    val maxHeight = LocalConfiguration.current.screenHeightDp * 0.8
    val animateToDismiss: () -> Unit = {
        if (sheetState.currentValue == SheetValue.Expanded) {
            scope.launch { sheetState.hide() }.invokeOnCompletion {
                if (!sheetState.isVisible) {
                    onDismissAction()
                }
            }
        }
    }

    ModalBottomSheet(modifier = modifier.heightIn(max = maxHeight.dp),
        sheetState = sheetState,
        containerColor = containerColor,
        scrimColor = scrimColor,
        onDismissRequest = onDismissAction,
        shape = shape,
        dragHandle = {}) {
        Column(
            modifier
                .fillMaxWidth()
                .padding(end = 24.dp, start = 24.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.End,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 24.dp)
            ) {
                Box(modifier = Modifier.clickable { animateToDismiss() }) {
                    Image(
                        painterResource(id = R.drawable.close),
                        colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.onBackground),
                        contentDescription = null,
                    )
                }
            }
            content()
        }
    }
}