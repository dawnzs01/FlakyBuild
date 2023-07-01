/*
 * This file is part of Neo Launcher
 * Copyright (c) 202   Neo Launcher Team
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.saggitt.omega.compose.components

import androidx.compose.runtime.Composable
import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.onSizeChanged
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp

class LazyGridLayout(
    val minWidth: Dp,
    private val gapWidth: Dp,
    private val density: Density
) {
    private val _numColumns = mutableStateOf(0)
    val numColumns: State<Int> = _numColumns

    @Composable
    fun onSizeChanged() = Modifier.onSizeChanged {
        with(density) {
            val minWidth = minWidth.roundToPx()
            val gapWidth = gapWidth.roundToPx()
            val availableWidth = (it.width - minWidth).coerceAtLeast(0)
            val additionalCols = availableWidth / (minWidth + gapWidth)
            _numColumns.value = 1 + additionalCols
        }
    }
}